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


public class Test {
    
    public static void main(String[] args) throws InterruptedException {
        
        Tortuga t = new Tortuga(1);
        t.setTipo("Tortuga");
        t.setNombre("Squirtle");
        
        Liebre c = new Liebre(2);
        c.setTipo("Conejo");
        c.setNombre("Bugs Bunny");
        
        Carrera car = new Carrera(c, t, 100);
        car.empezar();
       
       
        
    }
    
}
