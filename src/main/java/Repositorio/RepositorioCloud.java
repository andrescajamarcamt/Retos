/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

import java.util.List;
import java.util.Optional;

import Modelo.Cloud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Interfaces.InterfaceCloud;

/**
 *
 * @author USUARIO
 */
@Repository
public class RepositorioCloud {
     @Autowired
    private InterfaceCloud crud;
    

    public List<Cloud> getAll(){
        return (List<Cloud>) crud.findAll();
    }
    
    public Optional <Cloud> getCloud(int id){
        return crud.findById(id);
    }
    
    public Cloud save(Cloud cloud){
        return crud.save(cloud);
    }
      public void delete(Cloud cloud){
        crud.delete(cloud);
    }
    
    
}
