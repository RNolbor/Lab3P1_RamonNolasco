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
        
        while (true){
            
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
                case 1:
                    
                    
                    
                    
                case 2:
                    
                    System.out.println("Ingrese el valor de n: ");
                    int n = scanner.nextInt();
                    
                    System.out.println("Ingrese el valor de r: ");
                    int r = scanner.nextInt();
                    while (r > n){
                        System.out.println("r no puede ser mayor que n, ingrese el valor nuevamente: ");
                        r = scanner.nextInt();
                    }
                    long ncr;
                    for (int i = n; i > (n - r)! ; i--){
                        
                    }
                    System.out.println("Combinaciones posibles con n = " + n + " y r = " + r + "son: " + ncr);
                    
                    
                case 3:
                    
                    
                    
                    
                    
                case 4:
                    break;
                    
                    
                    
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
