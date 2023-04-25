package com.chgrar.chg.service;

import com.chgrar.chg.entity.Proyecto;
import com.chgrar.chg.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
  @Autowired
    private RProyecto proyRepo;
    
 public List<Proyecto> verProyecto(){
     List<Proyecto> listaProyecto= proyRepo.findAll();
     return listaProyecto;
 }

  public Proyecto buscarProyecto(int id) {
  Proyecto proy = proyRepo.findById(id).orElse(null);
  return proy;
  }
 
 public void crearProyecto(Proyecto proy){
     proyRepo.save(proy);
 }
 
 public void borraProyecto(int id){
     proyRepo.deleteById(id);
 }
 
 public void editarProyecto(Proyecto proy){
     proyRepo.save(proy);
 }  
}
