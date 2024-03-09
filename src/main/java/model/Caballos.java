package model;

import java.util.Random;


public class Caballos implements Runnable {

    private static final Object lock = new Object();
    private static int contador = 0;
    
    private String nombre;
    private String raza;
    private String color;
    private Random random;

    public Caballos(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.random = new Random();
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void run() {
        
        synchronized (lock) {
            int distanciaRecorrida = 0;
            while (distanciaRecorrida < 1000) {
                distanciaRecorrida += random.nextInt(101); // Avance aleatorio entre 0 y 100
                System.out.println(nombre + " ha recorrido " + distanciaRecorrida + " metros.");
            }

            if (contador == 0) {
                contador++;
                System.out.println(nombre + " ha ganado la carrera!");
               
            }
        }
    }
    
    
   
}
