/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
import Clases.coord;
import Clases.circunferencia;
import Clases.cuadrado;
public class Main {
	public static void main(String[] args) {
		// Defina y asigne dos objetos, un Cadrado y una Circunferencia
		// Solicite al usuario ingresar el valor de un vector de traslación 
		// Aplique el vector de traslación anterior a cada uno de los objetos referidos
		// Muestre las posiciones originales y finales de cada uno de los objetos referidos
            Scanner entrada = new Scanner(System.in);
            double D1 = 0, D2 = 0;
            int respuesta = 0;
        
            //de polar a cartesiana2D
            System.out.println("Digite 1 para crear un cuadrado");
            System.out.println("Digite 2 para crear un circulo");
            respuesta = entrada.nextInt();
            
            
            
            ////////////////////////////////////////////////////////////////////Cuadrado
            if (respuesta == 1){
                System.out.println("Digite 1 para Traslacion");
                System.out.println("Digite 2 para Rotacion");
                System.out.println("Digite 3 para Escalado");
                D1 = entrada.nextFloat();
                
                
                if(D1 == 1){////////////////////////////////////////////////////Traslacion
                    ////////////////////////////////////////////////////////////Input
                    coord tt = new coord();
                    cuadrado a = new cuadrado(tt,0);
                    
                    System.out.print("Digite la coordenada en X: ");
                    tt.setX(entrada.nextInt());
                    a.c.setX(tt.getX());
                    System.out.println();

                    System.out.print("Digite la coordenada en Y: ");
                    tt.setY(entrada.nextInt());
                    a.c.setY(tt.getY());
                    System.out.println();
                    
                    //a.Traslacion(tt); <--- ejecutar 

                    System.out.print("diguite la longitud de una cara: ");
                    a.setLado(entrada.nextInt());
                    System.out.println();
                    
                    ////////////////////////////////////////////////////////////Output
                    System.out.println("la coordenada en x es "+ a.c.getX()+" la coordenada en y es "+ a.c.getY());
                    System.out.println("las dimenciones de sus caras es de: " + a.getLado()+ " x " + a.getLado()+ " x " + a.getLado()+ " x " + a.getLado());

                } else if (D1 == 2){////////////////////////////////////////////Rotacion
                    ////////////////////////////////////////////////////////////Input
                    coord tt = new coord();
                    cuadrado a = new cuadrado(tt,0);
                    System.out.print("la coordenada en X: ");
                    tt.setX(entrada.nextInt());
                    System.out.println();
                    System.out.print("la coordenada en Y: ");
                    tt.setY(entrada.nextInt());
                    System.out.println();
                    
                    System.out.print("Digite el angulo: ");
                    a.Rotacion(tt, entrada.nextInt());
                    System.out.println();
                    ////////////////////////////////////////////////////////////Output
                    System.out.println("Las nuevas Coordenadas son: " + a.getC().getX() + "," + a.getC().getY());
                    
                    
                    
                } else if (D1 == 3){////////////////////////////////////////////Escalado
                    ////////////////////////////////////////////////////////////Input
                    coord tt = new coord();
                    cuadrado a = new cuadrado(tt,0);
                    System.out.print("diguite la longitud de una cara: ");
                    a.setLado(entrada.nextInt());
                    System.out.println();
                    
                    
                    System.out.print("Digite el escalado: ");
                    a.Escalado(entrada.nextInt());
                    System.out.println();
                    ////////////////////////////////////////////////////////////Output
                    System.out.println("las dimenciones de sus caras es de: " + a.getLado()+ " x " + a.getLado()+ " x " + a.getLado()+ " x " + a.getLado());
                }
            }
            
            
            
            
            ////////////////////////////////////////////////////////////////////Circulo
            if(respuesta == 2){
                System.out.println("Digite 1 para Traslacion");
                System.out.println("Digite 2 para Rotacion");
                System.out.println("Digite 3 para Escalado");
                D2 = entrada.nextFloat(); 
                
                if(D2 == 1){////////////////////////////////////////////////////Traslacion
                    ////////////////////////////////////////////////////////////Input
                    coord tt = new coord();
                    circunferencia a = new circunferencia(tt,0);
                    
                    System.out.print("Digite la coordenada en X: ");
                    tt.setX(entrada.nextInt());
                    
                    a.c.setX(tt.getX());
                    System.out.println();

                    System.out.print("Digite la coordenada en Y: ");
                    tt.setY(entrada.nextInt());
                    a.c.setY(tt.getY());
                    System.out.println();
                    
                    //a.Traslacion(tt);<---- Ejecutar

                    System.out.print("diguite la longitud del radio: ");
                    a.setRadio(entrada.nextInt());
                    System.out.println();
                    
                    ////////////////////////////////////////////////////////////Output
                    System.out.println("la coordenada en x es "+ a.c.getX()+" la coordenada en y es "+ a.c.getY());
                    System.out.println("las la longitud del radio es de: "+ a.getRadio());

                } else if (D2 == 2){////////////////////////////////////////////Rotacion
                    ////////////////////////////////////////////////////////////Input
                    coord tt = new coord();
                    circunferencia a = new circunferencia(tt,0);
                    System.out.print("la coordenada en X: ");
                    tt.setX(entrada.nextInt());
                    System.out.println();
                    System.out.print("la coordenada en Y: ");
                    tt.setY(entrada.nextInt());
                    System.out.println();
                    
                    System.out.print("Digite el angulo: ");
                    a.Rotacion(tt, entrada.nextInt());
                    System.out.println();
                    ////////////////////////////////////////////////////////////Output
                    System.out.println("Las nuevas Coordenadas son: " + a.getC().getX() + "," + a.getC().getY());
                    
                    
                    
                } else if (D2 == 3){////////////////////////////////////////////Escalado
                    ////////////////////////////////////////////////////////////Input
                    coord tt = new coord();
                    circunferencia a = new circunferencia(tt,0);
                    System.out.print("diguite el readio: ");
                    a.setRadio(entrada.nextInt());
                    System.out.println();
                    
                    
                    System.out.print("Digite el escalado: ");
                    a.Escalado(entrada.nextInt());
                    System.out.println();
                    ////////////////////////////////////////////////////////////Output
                    System.out.println("las dimension de su radio es de: "+ a.getRadio());
                }
                
            }
        
            //punto.polar_cartesiana2D(D1,D2);
        
	}
}