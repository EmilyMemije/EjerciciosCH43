package org.generation.codigo6;

public class Codigo6 {
		  public static void main (String[] args) { //Se agrega clase main
			
	    int[] n = new int[20]; //Se quita int y se cambian corchetes por llaves

	    for (int i = 0; i < 20; i++) { //se agrega un + 
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //Se agrega .out
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //Se corrige error ortográfico println
	    System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    int opcion = Integer.parseInt(System.console().readLine()); //Se cierra paréntesis

	    int multiplo = (opcion == 1) ? 5 : 7; //Se cambia orden de signos, primero ?, luego :

	    for (int e : n) {
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] "); //Se cierra llave
	      }else {
	        System.out.print(e + " "); //Se cambia System.in por System.out
	      }
	    }
	  
	}
}
