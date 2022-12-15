/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.demopc.service;


import com.portfolio.demopc.Entity.Educacion;
import com.portfolio.demopc.repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class Seducacion {
     @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
    return rEducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
    return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByTitulo(String titulo){
    return rEducacion.findByTitulo(titulo);
    
    }
    public void save(Educacion educacion){
    rEducacion.save(educacion);
    }
    public void delete(int id){
    rEducacion.deleteById(id);
    
    }
    public boolean existById(int id){
    return rEducacion.existsById(id);
    }
    
    public boolean existsByTitulo(String titulo){
    return rEducacion.existsByTitulo(titulo);
    }

}
