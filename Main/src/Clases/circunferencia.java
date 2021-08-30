/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;
/**
 *
 * @author ERROR 404
 */
public class circunferencia {
    public coord c;
    public float radio;
    
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
    
     public void Traslacion(coord t) {  // Complete los parámetros requeridos
        c.setX(t.getX()+c.getX()); //t.getX(): translacion en las coordenadas x ///(tx)
        c.setY(t.getY()+c.getY()); //t.getY(): translacion en las coordenadas Y ///(ty)
        
    }
    public void Escalado(int s) {  // Complete los parámetros requeridos
        radio = (int)(radio*(1+s/100.0f));
    }
    public void Rotacion(coord t, int angulo) {  // Complete los parámetros requeridos
        c.setX((int) (t.getX()*cos(angulo)-t.getY()*sin(angulo))); 
        c.setY((int) (t.getY()*cos(angulo)+t.getX()*sin(angulo))); 
    }
    public circunferencia(coord c, int radio) {
        this.c = c;
        this.radio = radio;
    }
    

    public coord getC() {
        return c;
    }

    public float getRadio() {
        return radio;
    }

    public void setC(coord c) {
        this.c = c;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
}
