/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import javax.swing.text.View;

/**
 *
 * @author Aprendiente
 * @param <T>
 */
public abstract class Controller<T> {
    protected View vista;
    protected T modelo;

    public Controller(View vista, T modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    // Métodos abstractos que deben ser implementados por los controladores específicos
    public abstract void agregar();
    public abstract void mostrarInformacion();
    
}
