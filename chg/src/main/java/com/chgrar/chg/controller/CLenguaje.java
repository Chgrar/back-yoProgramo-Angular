package com.chgrar.chg.controller;

import com.chgrar.chg.entity.Lenguaje;
import com.chgrar.chg.service.SLenguaje;
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
@RequestMapping("Lenguaje")
@CrossOrigin(origins = "http://localhost:4200")

public class CLenguaje {
    @Autowired
    SLenguaje lenguaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Lenguaje> verLenguaje(){
        return lenguaServ.verLenguaje();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Lenguaje verLenguaje(@PathVariable int id){
        return lenguaServ.buscarLenguaje(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarLenguaje (@RequestBody Lenguaje lengua){
        lenguaServ.crearLenguaje(lengua);
        return "El lenguaje fue creado correctamente";
    }
    
    @DeleteMapping ("/borrar/(id)")
    public String eliminarLenguaje(@PathVariable int id){
        lenguaServ.borraLenguaje(id);
        return "El lenguaje fue borrado correctamente";
    }
    
    @PutMapping("/editar")
    public void updateLenguaje(@RequestBody Lenguaje lengua){
        lenguaServ.editarLenguaje(lengua);
    }
}
