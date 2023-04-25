package com.chgrar.chg.service;

import com.chgrar.chg.entity.Trabajo;
import com.chgrar.chg.repository.RTrabajo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class STrabajo {
  @Autowired
    private RTrabajo trabRepo;
    
 public List<Trabajo> verTrabajo(){
     List<Trabajo> listaTrabajo= trabRepo.findAll();
     return listaTrabajo;
 }

  public Trabajo buscarTrabajo(int id) {
  Trabajo trab = trabRepo.findById(id).orElse(null);
  return trab;
  }
 
 public void crearTrabajo(Trabajo trab){
     trabRepo.save(trab);
 }
 
 public void borraTrabajo(int id){
     trabRepo.deleteById(id);
 }
 
 public void editarTrabajo(Trabajo trab){
     trabRepo.save(trab);
 }  
}
