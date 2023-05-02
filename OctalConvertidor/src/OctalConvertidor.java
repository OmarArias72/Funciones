/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
import java.util.Scanner;

public class OctalConvertidor {
    
    static void Convertir(int numero){
       int rem;

        // For storing result
        String str = "";

        // Digits in Octal number system
        char dig[] = {'0', '1', '2', '3', '4', '5', '6', '7'};

        while (numero > 0) {
            rem = numero % 8;
            str = dig[rem] + str;
            numero = numero / 8;
        }
        System.out.println("Decimal a octal: " + str);
    } 
    
        
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduca un numero decimal : ");
        int n = input.nextInt();
        Convertir(n);
    }

}
        

