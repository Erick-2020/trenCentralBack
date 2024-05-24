package com.apiTren.crudJava.controllers;

import com.apiTren.crudJava.models.UsersModel;
import com.apiTren.crudJava.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@AllArgsConstructor()
@CrossOrigin
@RestController
@RequestMapping("/usuarios")
public class UserController {
    //definimos las peticiones htttp y las rutas
    // esto cuando ya se han creado los servicios

    //injectamos dependencias

    private final UserService userService;

    // 1ra ruta, peticion get
    @GetMapping
    public ArrayList<UsersModel> getUsers() {
        return  this.userService.getUsers();
    }

    // el requestbody es para hacer referencia de que se va a pasar algo a trabes de este ejemplo por el BODY
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UsersModel saveUser(@RequestBody UsersModel user){
        return this.userService.saveUser(user);
    }

    // se colocaln las llabes para especificar que la ruta puede ser cualquier cosa que yo coloque
    @GetMapping(path = "/{id}")
    public Optional<UsersModel> getUserById(@PathVariable Long id) {
        return this.userService.getById(id);
    }

    //PARA EL METOOD UPDATE
    @PutMapping(path = "/{id}")
    public UsersModel updateUserById(@RequestBody UsersModel request, @PathVariable("id") Long id) {
        return this.userService.updateById(request, id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "/{id}")
    public String deleteUserById(@PathVariable("id") Long id) {
        boolean ok = this.userService.deleteUser(id);
        if(ok) {
            return "User con el ID " + id + " ha sido eleiminado";
        } else{
            return "User con el ID " + id + " no ha sido eleiminado  ERROR!!!!";
        }
    }


}
