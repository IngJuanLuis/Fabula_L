/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabula;

import java.util.Random;

/**
 *
 * @author Zotrick
 */
public class Tortuga extends Animal {

    private String nombre;
    private String tipo;
    private int distancia;
    private int multiplicador;

    public Tortuga(int multi) {
        this.multiplicador = multi;
        this.distancia = 0;
    }
    
    
    public void avanzar(int d){
        this.distancia+=d*multiplicador;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDistancia() {
        return distancia;
    }

    public String getTipo() {
        return tipo;
    }
    
    

}
