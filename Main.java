import java.util.Scanner;
import java.io.*;
import static java.lang.Double.isNaN;
import static java.lang.Double.isFinite;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//iPila<String> stack = new Pila<String>();
		iCalculadora calc = new Calculadora();
		Scanner input = new Scanner(System.in);
		// Obtener el texto postfix
		System.out.println("Por favor ingrese el texto");
        //String[] texto = input.nextLine().split(" ");
        
        //Se abre el archivo y se crea el BufferReader para poder leerlo. Cambiar la direccion en caso
        //que se quiera abrir un archivo diferente al seleccionado
        String nomb = input.nextLine();
        FileReader fr = new FileReader(nomb);
        BufferedReader br = new BufferedReader (fr);
        String r = br.readLine();
        String[] texto = r.split(" ");

        System.out.println("¿Desea usar un Vector, una Lista o un ArrayList? (Escriba solo el numero) \n1. Vector \n2. ArrayList \n3. Lista");
        String entryStack = input.nextLine();
        String entryLista = "";
        switch(entryStack)   
        { 
            case "1":  
                entryStack = "Vector";    
                break;
            case "2": 
                entryStack = "ArrayList";  
                break; 
            case "3":   
                entryStack = "Lista";  
                System.out.println("¿Desea usar una lista doblemente encadenada, simplemente encadenada o circular? (Escriba solo el numero) \n1. Doblemente encadenada \n2. Simplemente encadenada \n3. Lista Circular");   
                entryLista = input.nextLine();  
                switch (entryLista) 
                {  
                    case "1":  
                        entryLista = "Simplemente encadenada";   
                        break; 
                    case "2":  
                        entryLista = "Doblemente encadenada";   
                        break;
                    case "3":   
                        entryLista = "Lista Circular";    
                        break;   
                }  
        }
        //Se realiza el Factory
        Factory fac = new Factory();
        Object imp = fac.getStack(entryStack, entryLista);
        double respuesta = 0;
        
        if (imp instanceof StackList)
        {
            //AbstractList stack = (AbstractList)imp;
            if (entryLista.equals("Lista Circular"))
            {
                CircularLinkedList stack = new CircularLinkedList<String>();
                for (int i = texto.length-1; i >= 0; i--) {
                    stack.addLast(texto[i]);
                }        
                try{
                    while(stack.size() >= 3) {
                        Double a = Double.parseDouble((String)(stack.removeLast()));
                        Double b = Double.parseDouble((String)(stack.removeLast()));
                        double awnser = 0;
                        String operacion = (String)stack.removeLast();
                        switch(operacion) {
                            case "+": awnser = calc.sumar(a, b); break;
        		
                            case "-": awnser = calc.restar(a, b); break;
        		
                            case "*": awnser = calc.multiplicar(a, b); break;
        		
                            case "/": awnser = calc.dividir(a, b); break;
        		
                            default : System.out.println("El texto ingresado no es valido\n");
			        		
                            return; 
                        }
                        stack.addLast(String.valueOf(awnser));
                    }
                    System.out.println("Respuesta: "+stack.removeLast());
                }catch(Exception e){
                    System.out.println("Hubo un error en su texto");
                }    
            }
            else if(entryLista.equals("Simplemente encadenada"))
            {
                SinglyLinkedList stack = new SinglyLinkedList<>();
                for (int i = texto.length-1; i >= 0; i--) {
                    stack.addFirst(texto[i]);
                }        
                try{
                    while(stack.size() >= 3) {
                        Double a = Double.parseDouble((String)(stack.removeFirst()));
                        Double b = Double.parseDouble((String)(stack.removeFirst()));
                        double awnser = 0;
                        String operacion = (String)stack.removeFirst();
                        switch(operacion) {
                            case "+": awnser = calc.sumar(a, b); break;
        		
                            case "-": awnser = calc.restar(a, b); break;
        		
                            case "*": awnser = calc.multiplicar(a, b); break;
        		
                            case "/": awnser = calc.dividir(a, b); break;
        		
                            default : System.out.println("El texto ingresado no es valido\n");
			        		
                            return; 
                        }
                        stack.addFirst(String.valueOf(awnser));
                    }
                    System.out.println("Respuesta: "+stack.removeFirst());
                }catch(Exception e){
                    System.out.println("Hubo un error en su texto");
                }
            }
            else
            {
                DoublyLinkedList stack = new DoublyLinkedList<>();
                for (int i = texto.length-1; i >= 0; i--) {
                    stack.addFirst(texto[i]);
                }        
                try{
                    while(stack.size() >= 3) {
                        Double a = Double.parseDouble((String)(stack.removeFirst()));
                        Double b = Double.parseDouble((String)(stack.removeFirst()));
                        double awnser = 0;
                        String operacion = (String)stack.removeFirst();
                        switch(operacion) {
                            case "+": awnser = calc.sumar(a, b); break;
        		
                            case "-": awnser = calc.restar(a, b); break;
        		
                            case "*": awnser = calc.multiplicar(a, b); break;
        		
                            case "/": awnser = calc.dividir(a, b); break;
        		
                            default : System.out.println("El texto ingresado no es valido\n");
			        		
                            return; 
                        }
                        stack.addFirst(String.valueOf(awnser));
                    }
                    System.out.println("Respuesta: "+stack.removeFirst());
                }catch(Exception e){
                    System.out.println("Hubo un error en su texto");
                } 
            }
                
        }
        else if(imp instanceof AbstractStack)
        {
            AbstractStack stack = (AbstractStack)imp;
            if (stack instanceof StackVector)
            {
                stack = ((StackVector) stack);
                for (int i = texto.length-1; i >= 0; i--) {
                    stack.push(texto[i]);
                }        
                try{
                    while(stack.size() >= 3) {
                        Double a = Double.parseDouble((String)(stack.pop()));
                        Double b = Double.parseDouble((String)(stack.pop()));
                        double awnser = 0;
                        String operacion = (String)stack.pop();
                        switch(operacion) {
                            case "+": awnser = calc.sumar(a, b); break;
        		
                            case "-": awnser = calc.restar(a, b); break;
        		
                            case "*": awnser = calc.multiplicar(a, b); break;
        		
                            case "/": awnser = calc.dividir(a, b); break;
        		
                            default : System.out.println("El texto ingresado no es valido\n");
			        		
                            return; 
                        }
                        stack.push(String.valueOf(awnser));
                    }
                    System.out.println("Respuesta: "+stack.pop());
                }catch(Exception e){
                    System.out.println("Hubo un error en su texto");
                }
            }
            else if (imp instanceof StackArrayList)
            {
                stack = ((StackArrayList) imp);
                for (int i = texto.length-1; i >= 0; i--) {
                    stack.push(texto[i]);
                }        
                try{
                    while(stack.size() >= 3) {
                        Double a = Double.parseDouble((String)(stack.pop()));
                        Double b = Double.parseDouble((String)(stack.pop()));
                        double awnser = 0;
                        String operacion = (String)stack.pop();
                        switch(operacion) {
                            case "+": awnser = calc.sumar(a, b); break;
        		
                            case "-": awnser = calc.restar(a, b); break;
        		
                            case "*": awnser = calc.multiplicar(a, b); break;
        		
                            case "/": awnser = calc.dividir(a, b); break;
        		
                            default : System.out.println("El texto ingresado no es valido\n");
			        		
                            return; 
                        }
                        stack.push(String.valueOf(awnser));
                    }
                    System.out.println("Respuesta: "+stack.pop());
                }catch(Exception e){
                    System.out.println("Hubo un error en su texto");
                }
            }
        }
        
        input.close();
	}
}
