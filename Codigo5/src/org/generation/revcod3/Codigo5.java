package org.generation.revcod3;

import java.util.Scanner; //Se importó el Scanner

public class Codigo5 {
	public static void main(String[]args) { //Se agregó la clase main
    Scanner s = new Scanner(System.in); //Se agregó System.in
    
    System.out.println("Introduzca un número: "); //Se arreglaron las comillas ' > ". Y se agregó ln a print
    
    int ni = s.nextInt(); //Se cambió el tipo de variable de String a int
    int c = ni;
    
    int afo = 0;
    int noAfo = 0;
    
    
    while (ni > 0) {
	  int digito = (int) (ni % 10);
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
	  
	  ni /= 10;
    }
     
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado."); //Se arregló el error ortográfico en println
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
      break; //Se incluyó el break
    }
    }
    s.close(); //Se cerró el scanner
	}
}
 //Se cerró corchete
