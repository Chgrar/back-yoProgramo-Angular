package com.chgrar.chg.controller;

import com.chgrar.chg.entity.Trabajo;
import com.chgrar.chg.service.STrabajo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Trabajo")
@CrossOrigin(origins = "http://localhost:4200")

public class CTrabajo {
  @Autowired
    STrabajo trabServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Trabajo> verTrabajo(){
        return trabServ.verTrabajo();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Trabajo verTrabajo(@PathVariable int id){
        return trabServ.buscarTrabajo(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarTrabajo (@RequestBody Trabajo trab){
        trabServ.crearTrabajo(trab);
        return "El Trabajo fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/(id)")
    public String eliminarTrabajo(@PathVariable int id){
        trabServ.borraTrabajo(id);
        return "El Trabajo fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateTrabajo(@RequestBody Trabajo trab){
        trabServ.editarTrabajo(trab);
    }  
}
