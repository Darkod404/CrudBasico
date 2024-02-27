package com.mycompany.crudbasico.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.crudbasico.entity.Alumno;
import com.mycompany.crudbasico.repository.AlumnoRepository;

@Service
@SuppressWarnings("null")
public class AlumnoService {
    
    @Autowired
    AlumnoRepository alumnoRepository;

    
    public List<Alumno> listarAlumnos(){
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> listarAlumno(Long id){
        return alumnoRepository.findById(id);
    }
    
    public void guardarOActulizar(Alumno alumno){
        alumnoRepository.save(alumno);
    }

    public void borrarAlumno(Long id){
        alumnoRepository.deleteById(id);
    }
}
