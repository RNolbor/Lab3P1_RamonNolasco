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
        Scanner scanner = new Scanner(System.in);
        boolean programa = true;
        while (programa){
            
            System.out.println("--------------------MENU---------------------");
            System.out.println("1) Reloj de Arena");
            System.out.println("2) Calculadora de Combinaciones");
            System.out.println("3) Sandwich");
            System.out.println("4) Salir");
            System.out.println("Ingrese una opcion:");
            int eleccion;
            eleccion = scanner.nextInt();
            while (eleccion != 1 && eleccion != 2 && eleccion != 3 && eleccion != 4){
                System.out.println("Ingrese una opcion valida!");
                eleccion = scanner.nextInt();
            }
            
            switch (eleccion){
                
                case 1: // EJERCICIO 1 ----------------------------------------------------------------------------------------------------------------------------------------
                    
                    
                    
                    
                case 2: // EJERCICIO 2 ----------------------------------------------------------------------------------------------------------------------------------------
                    
                    System.out.println("Ingrese el valor de n: ");
                    int n = scanner.nextInt();
                    
                    System.out.println("Ingrese el valor de r: ");
                    int r = scanner.nextInt();
                    while (r > n){
                        System.out.println("r no puede ser mayor que n, ingrese el valor nuevamente: ");
                        r = scanner.nextInt();
                    }
                    long ncr;
                    long nfactorial = n;
                    long rfactorial = r;
                    int n2 = n - 1;
                    int r2 = r - 1;
                    int nmenosr = n - r;
                    long nmenosrfactorial = nmenosr;
                    int nmr2 = nmenosr - 1;
                    
                    for (int i = n2 ; i > 0 ; i -= 1 ){
                        nfactorial *= n2;
                        n2 -= 1;
                    }    
                    for (int o = r2 ; o > 0 ; o -= 1){
                        rfactorial *= r2;
                        r2 -= 1;
                    }   
                    for (int p = nmr2 ; p > 0 ; p -= 1){
                        nmenosrfactorial *= nmr2;
                        nmr2 -= 1;
                    }   
                    
                    if (nfactorial == 0){
                        nfactorial = 1;
                    }
                    else if (rfactorial == 0){
                        rfactorial = 1;
                    }
                    else if (nmenosrfactorial == 0){
                        nmenosrfactorial = 1;
                    }
                    
                    ncr = ( nfactorial / ( nmenosrfactorial * rfactorial ));                           
                    System.out.println("Combinaciones posibles con n = " + n + " y r = " + r + " son: " + ncr);
                    
                    continue;
                    
                case 3: // EJERCICIO 3 ----------------------------------------------------------------------------------------------------------------------------------------
                    
                    System.out.println("Ingrese un limite: ");
                    int medida = scanner.nextInt();
                    
                    while (medida % 2 == 0 || medida < 7){
                        System.out.println("Ingrese un numero impar mayor o igual a 7");
                        medida = scanner.nextInt();
                    }
                    
                    for (int i = medida ; i > 0 ; i -= 1){
                        
                    }
                    
                
                    
                    continue;
                    
                case 4: // SALIR DEL PROGRAMA 
                    programa = false;
                            
                    
                    
            }
 
        }
        
    }
    
}
