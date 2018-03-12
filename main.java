/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Cabanillas
 */
public class main {
    final static Scanner TECLADO=new Scanner(System.in);
    
    public static void main(String []args){
        double num1,num2;
        System.out.println("Indique el numero 1 ");
        num1=TECLADO.nextDouble();
        System.out.println("Indique num 2 ");
        num2=TECLADO.nextDouble();
        System.out.println("Indica Operacion: ");

        Calculadora c=new Calculadora();

        c.ponNum1(num1);
        c.ponNum2(num2);

        try {
            c.ponOperacion(TECLADO.next());
            c.opera();
            System.out.println("Resultado: " + c.dameResultado());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }


    }
    
}
