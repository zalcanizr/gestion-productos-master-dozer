package com.cice.gestionproductos.feign;


import com.cice.gestionproductos.web.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("gestion-usuarios")
public interface UsuariosFeign {

    @RequestMapping(method = RequestMethod.GET, path="/usuarios")
    List<UsuarioDTO> getUsuarios();

    @RequestMapping(method=RequestMethod.GET, path="/usuarios/íd")
    UsuarioDTO getUsuarioById(@PathVariable(name="id") Long idUsuario);


}
