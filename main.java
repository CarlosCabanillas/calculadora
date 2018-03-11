/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import Calculadora.*;
import java.util.Scanner;
/**
 *
 * @author Cabanillas
 */
public class main {
    final static Scanner TECLADO=new Scanner(System.in);
    
    public static void main(String []args){
        int num1,num2;
        System.out.println("Indique el numero 1 ");
        num1=TECLADO.nextInt();
        System.out.println("Indique num 2 ");
        num2=TECLADO.nextInt();
        Calculadora c=new Calculadora(num1,num2);
        c.muestraTodosResultados();
    }
    
}
