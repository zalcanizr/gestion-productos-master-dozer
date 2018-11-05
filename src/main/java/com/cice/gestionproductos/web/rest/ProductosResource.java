package com.cice.gestionproductos.web.rest;

import com.cice.gestionproductos.feign.UsuariosFeign;
import com.cice.gestionproductos.web.dto.UsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/productos")

public class ProductosResource {
    
    @Autowired
    UsuariosFeign usuariosFeign;
    
    @RequestMapping(method = RequestMethod.GET)
    public String findAllProducts(){
        List<UsuarioDTO> usuarios=usuariosFeign.getUsuarios();
        return"No existen productos de la cantidad de usuarios "+ usuarios.size();
        
    }
    @RequestMapping(method=RequestMethod.GET,path="/usuario/{id}")
    public String getUSuarioById(@PathVariable(name="id") Long id){
        return usuariosFeign.getUsuarioById(id).getNombre();
    }
}
