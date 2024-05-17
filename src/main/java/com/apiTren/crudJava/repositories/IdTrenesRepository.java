package com.apiTren.crudJava.repositories;

import com.apiTren.crudJava.models.TrenesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdTrenesRepository extends JpaRepository<TrenesModel, Long> {
}
