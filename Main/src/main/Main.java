/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
public class Main
{
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
		
	}
}

class Coord {
    private int x, y;
}

class Cuadrado {
    private Coord c;
    private int lado;
    public Cuadrado(Coord c, int lado) {
        this.c = c;
        this.lado = lado;
    }
    public void Traslacion() {  // Complete los parámetros requeridos
        
    }
    public void Escalado() {  // Complete los parámetros requeridos
        
    }
    public void Rotacion() {  // Complete los parámetros requeridos
        
    }
}

class Circunferencia {
    Coord c;
    float radio;
    // Implementar los métodos Traslacion, Escalado y Rotacion para ésta clase
}
