package com.mycompany.crudbasico.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.crudbasico.entity.Alumno;
import com.mycompany.crudbasico.service.AlumnoService;

@RestController
@RequestMapping(path = "api/v1/alumnos")
public class AlumnoController {
    
    @Autowired
    private AlumnoService alumnoService;
    
    @GetMapping
    public List<Alumno> getAll(){
        return alumnoService.listarAlumnos();
    }

    @GetMapping("/{alumnoId}")
    public Optional<Alumno> getById(@PathVariable("alumnoId") Long alumnoId){
        return alumnoService.listarAlumno(alumnoId);
    }

    @PostMapping
    public Alumno saveUpdate(@RequestBody Alumno alumno){
        alumnoService.guardarOActulizar(alumno);
        return alumno;
    }

    @DeleteMapping("/{alumnoId}")
    public void delete(@PathVariable("alumnoId") Long alumnoId){
        alumnoService.borrarAlumno(alumnoId);
    }
}
