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
public class Carrera {

    private String nombre;
    private int distanciaTotal;
    private Liebre c;
    private Tortuga t;
    private Random r;

    public Carrera(Liebre c, Tortuga t, int d) {
        this.c = c;
        this.t = t;
        this.distanciaTotal = d;
        this.r = new Random();
    }

    public void empezar() throws InterruptedException {

        while (t.getDistancia() < distanciaTotal && c.getDistancia() < distanciaTotal) {
            int d = r.nextInt(20);
            System.out.println("\n\nNueva distancia: " + d);

            if (d>5) {
                t.avanzar(d);

                if (t.getDistancia() >= 100) {
                    System.out.println(t.getTipo() + " " + t.getNombre() + " ganó");
                    break;
                } else{
                    System.out.println(c.getTipo() + " " + c.getNombre() + " se durmió");
                    System.out.println(t.getTipo() + " " + t.getNombre() + " avanzó " + d + " metros y lleva " + t.getDistancia() + " metros");
                }

            } else {
                t.avanzar(d);
                c.avanzar(d);
                if (t.getDistancia() >= 100) {
                    System.out.println(t.getTipo() + " " + t.getNombre() + " ganó");
                    break;
                } else if(c.getDistancia()>=100){
                System.out.println(c.getTipo() + " " + c.getNombre() + " ganó");
                break;
                } else {
                    System.out.println(c.getTipo() + " " + c.getNombre() + " avanzó " + d*c.getMultipicador() + " metros y lleva " + c.getDistancia() + " metros");
                    System.out.println(t.getTipo() + " " + t.getNombre() + " avanzó " + d + " metros y lleva " + t.getDistancia() + " metros");
                }

            }

            Thread.sleep(500);

        }

    }

}
