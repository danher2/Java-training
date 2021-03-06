package org.aguzman.optional.ejemplo.models;

import java.util.Optional;

public class Computador {
	
    private String nombre;
    private String modelo;
    private Procesador procesador;

    //consttuctor
    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    
//    getter&setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
   
    public Optional<Procesador> getProcesador() {
        return Optional.ofNullable(procesador);
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    // en caso que queramos imprimir el objeto
    @Override
    public String toString() {
        return nombre + ", " + modelo;
    }
}
