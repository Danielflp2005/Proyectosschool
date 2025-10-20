/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ProjectJava1 {

    public static void main(String[] args) {   
        Scanner teclado = new Scanner(in);
        incrementaEn5(100);
        int n = incrementaEn5(205);
        System.out.println("El valor es " + n);
        System.out.println(incrementaEn5(4));
        double res = Math.sqrt(4);

   
        double celcius = temperatura(100);
        System.out.println("La temperatura en celcius es : " + celcius);

      
        int perimetro = perimetrorect(8, 4);
        System.out.println("El perimetro del rectangulo es : "  + perimetro);

        int area = arearec(8, 4);
        System.out.println("El area de el rectangulo es de : " + area);
         
     
    
        System.out.println(cifras(103));
        System.out.println(cifras(-256));

        double sueldo = salario(500,7 );
        double sueldo1= salario(500,7 );
        double sueldo2= salario(500,7 );
        System.out.println("Su nuevo sueldo es de: " + sueldo1);
        System.out.println("Su nuevo sueldo es de: " + sueldo2);
        System.out.println("Su sueldo seguira siendo de: " + sueldo);
    
    }

    public static int  incrementaEn5(int numero) {
        int resultado = numero + 5;
        return resultado;
    }

        public static double  temperatura(double tempf){
            double celcius = (((tempf -32)*5)/9);
           return celcius;
        }

        public static int perimetrorect(int costadogrande, int costadopequeño) {
            
            return  costadogrande * 2 + costadopequeño * 2; 
          
        }

        public static int arearec(int costadogrande, int costadopequeño) {
            
         return costadogrande * costadopequeño;
        
    }


    public static int cifras(int N) {
  
   int i=0;
   while (N>0){
        N= N/10;
        i++;
   }
   return i;
}

         public static double salario ( double sueldo, double antiguedad ) {
           
    
         if( sueldo < 500 && antiguedad >= 10){
             double sueldo1 = sueldo * 20 / 100 + sueldo;
             }
          if(sueldo < 500 && antiguedad < 10){
             double sueldo2 = sueldo * 5 / 100 + sueldo;
             }
             if (sueldo >= 500)
        
        System.out.println("Su sueldo seguira siendo de: " + sueldo);
    
    
    return sueldo;
}

}

    



