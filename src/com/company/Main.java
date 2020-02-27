package com.company;

import java.util.Scanner;
import java.io.*;
import static java.lang.Double.isNaN;
import static java.lang.Double.isFinite;

/**
 * Hoja de trabajo 4
 * Archivo main
 * @author Daniela Batz
 * @author Jose Ramos
 * Algoritmos y estructuras de datos
*/

public class Main {
	 private static Main instancia = new Main();
	 
    	/**
    	 * Se instancia la calculadora desde su clase
    	 */
	 private Main() {}
	 
	 /**
	  * 
	  * @return instancia de singlenton
	  */
	 public static Main getInstance() {
	        return instancia;
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Ingrese el nombre del archivo");
	        
	        /***
	         * Guarda el nombre de txtfile
	         */
	        String fn = scan.nextLine();
	     
	        /**
	         * Se intancia el Stack
	         */
	        iStack<String> stack = new Stack<String>();
	     
	        FileReader fr = new FileReader(fn);
	        BufferedReader br = new BufferedReader(fr);
	        String r = br.readLine();
	        String[] texto = r.split(" ");
	        // Guardar el texto en el stack
	        for (int i = texto.length-1; i >= 0; i--) {
	            stack.push(texto[i]);
	         }
	        /**
	         * Opera el Stack con la calculadora
	         */
	        try{
	        while(stack.size() >= 3) {
	        	double a = Double.parseDouble(stack.pop());
	        	double b = Double.parseDouble(stack.pop());
	        	double res = 0;
	        	String operacion = stack.pop();
	        	switch(operacion) {
	        		case "+": res = calc.suma(a, b); break;
	        		case "-": res = calc.resta(a, b); break;
	        		case "*": res = calc.multiplicacion(a, b); break;
	        		case "/": res = calc.division(a, b); break;
	        		default : System.out.println("El texto ingresado no es valido\n");
				        		return instancia; 
		        }
	        	stack.push(String.valueOf(res));
	        }
	        /**
	         * Imprimir el resultado
	         */
	        System.out.println("Respuesta: "+stack.pop());
	        }catch(Exception e){
	            System.out.println("Hubo un error en su texto");
	        }
	        scan.close();
	    }
       
}
