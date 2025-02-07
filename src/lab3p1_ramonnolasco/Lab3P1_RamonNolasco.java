/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_ramonnolasco;

import java.util.Scanner;

/**
 *
 * @author ramon
 */
public class Lab3P1_RamonNolasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        boolean menu = true;
        do{
            System.out.println("----------MENU-----------");
            System.out.println("1) Ejercicio 1: Corbatin");
            System.out.println("2) Ejercicio 2: Permutaciones");
            System.out.println("3) Ejercicio 3: Trapecio hueco");
            System.out.println("4) Salir");
            System.out.println("Ingrese una opcion: ");
            
            int opcion = input.nextInt();
            
            while (opcion > 4 || opcion < 1){
                System.out.println("Ingrese una opcion valida: ");
                opcion = input.nextInt();
            }
            
            switch (opcion){
                
                case 1: 
                    
                    System.out.println("Ingrese el tamaño de su cuadrado: ");
                    int tamaño = input.nextInt();
                    
                    while (tamaño % 2 == 0 || tamaño < 5){
                        System.out.println("Debe ingresar un numero impar mayor a 5");
                        tamaño = input.nextInt();
                    }
                    
                    for (int i = 0; i < tamaño; i++){
                        for (int j = 0; j < tamaño; j++){
                            if (j == 0 || j == tamaño - 1 || i == j || j == tamaño - 1 - i){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println("");
                    }
                    
                    break;
                    
                    
                case 2:     
                    
                    System.out.println("Ingrese su valor n: ");
                    int n = input.nextInt();
                    System.out.println("Ingrese su valor r: ");
                    int r = input.nextInt();
                    
                    while (r > n){
                        System.out.println("r debe ser igual o menor que n");
                        r = input.nextInt();
                    }
                    
                    int nFactorial = n;
                                       
                    if (n == 0){
                        nFactorial = 1;
                    } else {  
                        for (int i = n - 1; i >= 1; i--) {
                            nFactorial *= i;
                        }
                    }
                    int nMr = n - r;
                    int nMrFactorial = nMr;
                    
                    if (nMr == 0){
                        nMrFactorial = 1;
                    } else {
                        for (int j = nMr - 1; j >= 1; j--){
                            nMrFactorial *= j;
                        }
                    }
                    
                    int nPr = nFactorial / nMrFactorial;
                    
                    System.out.println("Permutaciones posibles con n = " + n + " y r = " + r + " es: " + nPr);
                                      
                    break;
                    
                case 3: 
                    
                    System.out.println("Ingrese la cantidad de filas de su trapecio: ");
                    int filas = input.nextInt();
                    
                    while (filas < 5){
                        System.out.println("Tamaño del trapecio tiene que ser mayor o igual a 5 ");
                        System.out.println("Ingrese la cantidad de filas de su trapecio: ");
                        filas = input.nextInt();
                    }
                    
                    //PRIMERA FILA
                    for (int i = 0; i < filas - 1; i++){
                        System.out.print(" ");
                    }
                    for (int j = 0; j < filas; j++){
                        System.out.print("*");
                    }
                    for (int k = 0; k < filas - 1; k++){
                        System.out.print(" ");
                    }       
                    System.out.println("");
                    
                    //CUERPO DEL TRAPECIO
                    int nEsp = 2;
                    int nEspDentro = filas;
                    for (int i = 0; i < filas - 2; i++){
                        
                        for (int j = 0; j < filas - nEsp; j++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        for (int k = 0; k < nEspDentro; k++){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        for (int j = 0; j < filas - nEsp; j++){
                            System.out.print(" ");
                        }
                        nEsp += 1;
                        nEspDentro += 2;
                        System.out.println("");
                    }
                    
                    //ULTIMA FILA
                    for (int i = 0; i < (filas * 3)-2 ; i++){
                        System.out.print("*");
                    } 
                    
                    
                    
                    
                    
                    break;
                    
                case 4:
                    menu = false;
                    break;
        
            }
            
            
            
            
        }while(menu == true);
        
        
    }
    
}
