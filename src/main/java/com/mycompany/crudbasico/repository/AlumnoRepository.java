package com.mycompany.crudbasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.crudbasico.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno,Long>{
    
}
