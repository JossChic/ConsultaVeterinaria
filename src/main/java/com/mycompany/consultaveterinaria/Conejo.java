/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consultaveterinaria;

/**
 *
 * @author José Chic
 */
public class Conejo extends Mascota implements AtencionEspecial {
    @Override
    public void hacerSonido() {
        System.out.println("El conejo hace un chillido suave.");
    }

    @Override
    public void recibirAtencionEspecial() {
        System.out.println("El conejo está recibiendo atención especial: limpieza dental.");
    }
}