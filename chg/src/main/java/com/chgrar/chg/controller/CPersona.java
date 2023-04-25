
package com.chgrar.chg.controller;

import com.chgrar.chg.entity.Persona;
import com.chgrar.chg.service.SPersona;
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
@RequestMapping("persona")
@CrossOrigin(origins = "http://localhost:4200")

public class CPersona {
    @Autowired
    SPersona persoServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Persona> verPersona(){
        return persoServ.verPersona();
    }
    
    @GetMapping ("/ver/(id)")
    @ResponseBody
    public Persona verPersona(@PathVariable int id){
        return persoServ.buscarPersona(id);
    }
    
    
    @PostMapping("/crear")
    public String agregarPersona (@RequestBody Persona persona){
        persoServ.crearPersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping ("/borrar/(id)")
    public String eliminarPersona(@PathVariable int id){
        persoServ.borraPersona(id);
        return "La persona fue borrada correctamente";
    }
    
    @PutMapping("/editar")
    public void updatePersona(@RequestBody Persona persona){
        persoServ.editarPersona(persona);
    }
}
