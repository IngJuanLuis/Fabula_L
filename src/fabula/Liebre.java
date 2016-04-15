/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fabula;

/**
 *
 * @author Zotrick
 */
public class Liebre  extends Animal  {
    private String nombre;
    private String tipo;
    private int multiplicador;
    private int distancia;

    
    public Liebre(int mult){
        this.multiplicador = mult;
        this.distancia = 0;
    }
    public void avanzar(int d){
        this.distancia+=d*multiplicador;
    }
    
    @Override
    void setNombre(String nombre ) {
        this.nombre = nombre;
        
    }

    @Override
    void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getDistancia() {
        return distancia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getMultipicador() {
        return this.multiplicador;
    }
    
    
}
