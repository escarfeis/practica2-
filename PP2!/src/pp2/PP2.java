/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2;

import java.util.Scanner;

/**
 *
 * @author leonardo
 */
public class PP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       
       System.out.println("Cadena: ");
        
       Scanner sc = new Scanner(System.in);
       System.out.print("Escriba una palabra"+" ");
       String s=sc.nextLine();
       s=s.replace(" ", " ");
       s=s.replace(" "," ");
       s=s.replace(" ", " ");
       System.out.print(s);
       int fin = s.length()-1;
       int ini = 0;
       boolean espalin = true;
       
       while(ini<fin){
           if(s.charAt(ini)!=s.charAt(fin)){
               espalin = false;
           
           ini++;
           fin--;
           }
           if(espalin)
               System.out.print(" "+"es un palindromo");
           else
               System.out.print(" "+"no es un palindromo");
       }
       
        
    }
    
}
