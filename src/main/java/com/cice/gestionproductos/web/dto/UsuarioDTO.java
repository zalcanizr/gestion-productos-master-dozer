package com.cice.gestionproductos.web.dto;

public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String user;
    private String pass;
    private String email;

    public UsuarioDTO(Long id, String nombre, String user, String pass, String email) {
        this.id = id;
        this.nombre = nombre;
        this.user = user;
        this.pass = pass;
        this.email = email;
    }

    public UsuarioDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
