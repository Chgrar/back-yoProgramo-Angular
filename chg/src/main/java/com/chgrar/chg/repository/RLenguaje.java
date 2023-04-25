package com.chgrar.chg.repository;

import com.chgrar.chg.entity.Lenguaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RLenguaje extends JpaRepository <Lenguaje, Integer>{
    
}
