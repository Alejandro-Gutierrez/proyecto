
package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Num;
        char ascii ;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite un numero");
        Num = leer.nextInt();
        ascii= (char)Num;
        
        System.out.println("El numero " +Num+" = " +ascii);
    }
    
}
