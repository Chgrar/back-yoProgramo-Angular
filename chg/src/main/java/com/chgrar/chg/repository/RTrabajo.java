package com.chgrar.chg.repository;

import com.chgrar.chg.entity.Trabajo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RTrabajo extends JpaRepository <Trabajo, Integer>{
    
}
