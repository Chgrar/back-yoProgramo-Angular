package com.chgrar.chg.service;

import com.chgrar.chg.entity.Lenguaje;
import com.chgrar.chg.repository.RLenguaje;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SLenguaje {
    @Autowired
    private RLenguaje lenguaRepo;
    
 public List<Lenguaje> verLenguaje(){
     List<Lenguaje> listaLenguaje= lenguaRepo.findAll();
     return listaLenguaje;
 }

  public Lenguaje buscarLenguaje(int id) {
  Lenguaje lengua = lenguaRepo.findById(id).orElse(null);
  return lengua;
  }
 
 public void crearLenguaje(Lenguaje lengua){
     lenguaRepo.save(lengua);
 }
 
 public void borraLenguaje(int id){
     lenguaRepo.deleteById(id);
 }
 
 public void editarLenguaje(Lenguaje lengua){
     lenguaRepo.save(lengua);
 }
}
