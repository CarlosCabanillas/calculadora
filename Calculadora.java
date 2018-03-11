package calculadora;
/**
 * Write a description of class Calculadora here.
 * 
 * @author Cabanillas 
 * @version (a version number or a date)
 */
import java.math.*;
import java.util.Scanner;

public class Calculadora
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;
    private double rdo;
   // private Operacion op;
    final Scanner TECLADO=new Scanner(System.in);
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora(int num ,int num2)
    {
        // initialise instance variables
        this.num1 = num;
        this.num2 = num2;
        //op=op.SUMA;
        
    }
    
    public void ponNum1(int n1)
    {
        // put your code here
        this.num1=n1;
    }
    
    public void ponNum2(int n2)
    {
        // put your code here
        this.num2=n2;
    }

    public void opera()
    {
        
        System.out.println("Introduzca un numero por operacion:n1:Suma\2:resta\n3:Multipplicar\n4:Dividir\n5:Potencia\n6:Raiz\n7:Logaritmo\n8:Factorial");
        int op;
        op=TECLADO.nextInt();
        switch(op){
            case 1:
                rdo=num1+num2;
                break;
            case 2:
                rdo=num1-num2;
                break;
            case 3:
                rdo=num1*num2;
                break;
            case 4:
                rdo=num1/num2;
                break;
            case 5:
                rdo=num1^num2;
                break;
            case 6:
                rdo=Math.sqrt(num1);
                break;
            case 7:
                rdo=Math.log10(num1);
                break;
            case 8:
                rdo=factorial(num1);
                break;
            case 9:
            	rdo=matriz(num1);
            	break;
            
             
        }
    }
     public void ponOperacion(String opera){
        switch(opera){
        
        case "SUMA":
            op=op.SUMA;
            break;
        case "RESTA":
            op=op.RESTA;
            break;
        case "MULTIPLICA":
            op=op.MULTIPLICA;
            break;
        case "DIVIDE":
            op=op.DIVIDE;
            break;
        case "POTENCIA":
            op=op.POTENCIA;
        case "RAIZ":
            op=op.RAIZ;
        case "LOGARITMO":
            op=op.LOGARITMO;
        case "FACTORIAL":
            op=op.FACTORIAL;
        case "MATRIZ":
        	op=op.MATRIZ;
        }
    }*/
    public double dameResultado()
    {
        // put your code here
        return rdo;
    }
    
    public void muestraTodosResultados(){
        System.out.println("Num1="+Integer.toString(num1)+" Num2=" + Integer.toString(num2));
        System.out.println("Suma :" + Integer.toString(num1+num2));
        System.out.println("Resta :"+ Integer.toString(num1-num2));
        System.out.println("Multiplica :" + Integer.toString(num1*num2));
        System.out.println("Divide :"+ Integer.toString(num1/num2));
        System.out.println("Potencia :"+ Integer.toString(num1^num2));
        System.out.println("Raiz : "+Double.toString(Math.sqrt(num1)));
        System.out.println("Potencia : "+Double.toString(Math.log10(num1)));
        System.out.println("Factorial : "+Integer.toString(factorial(num1)));
    }
    //Metodo para calcular el factorial de un numero
    public static int factorial(int n) {
        int sol = 1;
        for (int i = 1; i <= n; i++) {
            sol = sol * i;
        }
        return sol;
    }
    
    //Matrices
    public int[][] CrearMatriz(int x,int y){
        int numero;
        int [][] matriz=new int [x][y] ;
            for (int i=0;i<y;i++)
                for (int j=0;j<x;j++){
                    numero =TECLADO.nextInt();
                    matriz[i][j]=numero;
                            }
        
        return matriz;
        
    }
    
    public double Logaritmo(int base,double num){
        return (Math.log(num)/Math.log(base));
    }
    
}
