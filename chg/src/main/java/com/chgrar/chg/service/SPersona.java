
package com.chgrar.chg.service;


import com.chgrar.chg.entity.Persona;
import com.chgrar.chg.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona {
@Autowired
private RPersona persoRepo;
    
public List<Persona> verPersona(){
     List<Persona> listaPersona= persoRepo.findAll();
     return listaPersona;
 }

public Persona buscarPersona(int id) {
  Persona persona = persoRepo.findById(id).orElse(null);
  return persona;
  }
 
public void crearPersona(Persona persona){
     persoRepo.save(persona);
 }
 
public void borraPersona(int id){
     persoRepo.deleteById(id);
 }
 
public void editarPersona(Persona persona){
     persoRepo.save(persona);
 }
}
