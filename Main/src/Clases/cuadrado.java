package Clases;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ERROR 404
 */
public class cuadrado {
    public coord c; 
    public int lado;

    public void Traslacion(coord t) {  // Complete los parámetros requeridos
        c.setX(t.getX()+c.getX()); //t.getX(): translacion en las coordenadas x ///(tx)
        c.setY(t.getY()+c.getY()); //t.getY(): translacion en las coordenadas Y ///(ty)
        
    }
    public void Escalado(int s) {  // Complete los parámetros requeridos
        lado = (int)(lado*(1+s/100.0f));
    }
    public void Rotacion(coord t, int angulo) {  // Complete los parámetros requeridos
        c.setX((int) (t.getX()*cos(angulo)-t.getY()*sin(angulo))); 
        c.setY((int) (t.getY()*cos(angulo)+t.getX()*sin(angulo))); 
    }

    public cuadrado(coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }

    public coord getC() {
        return c;
    }

    public int getLado() {
        return lado;
    }

    public void setC(coord c) {
        this.c = c;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
