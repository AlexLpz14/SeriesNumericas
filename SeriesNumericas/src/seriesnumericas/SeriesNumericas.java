package seriesnumericas;
import java.util.InputMismatchException;
import java.util.Scanner;
public class SeriesNumericas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        boolean repeat = false, r=false;
        int opcion; //Guardaremos la opcion del usuario
        double limite = 0;
        while (!salir) {
 
            try {
 
                System.out.println("Ingrese opcion:\n1: Fibonacci\t2: Padovan\t3: Pascal\t4: Salir");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese cantidad\nFibonacci no mayor a 100. ");
                        while(!repeat){
                            do{
                                try{
                                    limite = sc.nextDouble();
                                    if(limite <=0){
                                        System.out.println("Cantidades mayor a 0");
                                        sc.next();
                                    }
                                    r=true;
                                }catch(InputMismatchException ime){
                                    System.out.println("¡Cuidado! Solo puedes insertar números menores o iguales a 100.");
                                    sc.next();
                                }                                
                            }while(!r);
                            r=false;                   
                            
                            if(limite>100){
                                System.out.println("Cantidad menor igual a 100");
                            }else{
                                repeat=true;
                            }

                        }
                        Fibonacci(limite);
                        repeat=false;
                        break;
                    case 2:
                        System.out.println("Ingrese cantidad\nPadovan no mayor a 100. ");
                        while(!repeat){
                            do{
                                try{
                                    limite = sc.nextDouble();
                                    if(limite <=0){
                                        System.out.println("Cantidades mayor a 0");
                                        sc.next();
                                    }
                                    r=true;
                                }catch(InputMismatchException ime){
                                    System.out.println("¡Cuidado! Solo puedes insertar números menores o iguales a 100.");
                                    sc.next();
                                }                                
                            }while(!r);
                            r=false; 
                            
                            if(limite>100){
                                System.out.println("Cantidad menor igual a 100");
                            }else{
                                repeat=true;
                            }

                        }
                        Padovan(limite);
                        repeat=false;
                        break;
                    case 3:
                        System.out.println("Ingrese cantidad\nPascal no mayor a 50.");
                        while(!repeat){
                    
                            do{
                                try{
                                    limite = sc.nextDouble();
                                    if(limite <=0){
                                        System.out.println("Cantidades mayor a 0");
                                        sc.next();
                                    }
                                    r=true;
                                }catch(InputMismatchException ime){
                                    System.out.println("¡Cuidado! Solo puedes insertar números menores o iguales a 50.");
                                    sc.next();
                                }                                
                            }while(!r);
                            r=false; 
                            if(limite>50){
                                System.out.println("Cantidad menor igual a 50");
                            }else{
                                repeat=true;
                            }

                        }
                        Pascal(limite);
                        repeat=false;
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo se aceptan las opciones dadas");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar una de las opciones");
                sc.next();
            }
        }

        
    }
    
    public static void Fibonacci(double limit){
        int num1 = 0, num2 = 1, suma = 1;
        System.out.println(num1);
         
        for (double i = 1; i < limit; i++) {
             
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
             
             
        }
    }
    

    public static void Padovan(double limit){

        int pPrevPrev = 1, pPrev = 1, 
            pCurr = 1, pNext = 1; 
            System.out.println(pPrevPrev+" \n"+pPrev+"\n"+pCurr);
        for (double i = 3; i <= limit; i++) { 
            pNext = pPrevPrev + pPrev; 
            System.out.println(pNext);
            pPrevPrev = pPrev; 
            pPrev = pCurr; 
            pCurr = pNext; 
        } 
    }

    public static void Pascal(double rows){
        for(double i =0;i<rows;i++) {

            double number = 1;

            System.out.format("%"+(rows-i)*2+"s","");
            for(double j=0;j<=i;j++) {
                System.out.print(number+" ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

