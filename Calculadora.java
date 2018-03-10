
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.*;


public class Calculadora
{
    // instance variables - replace the example below with your own
    private int num1;
    private int num2;
    private double rdo;
    private Operacion op;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        // initialise instance variables
        num1 = 0;
        num2 = 0;
        op=op.SUMA;
        
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
        switch(op){
            case SUMA:
                rdo=num1+num2;
                break;
            case RESTA:
                rdo=num1-num2;
                break;
            case MULTIPLICA:
                rdo=num1*num2;
                break;
            case DIVIDE:
                rdo=num1/num2;
                break;
            case POTENCIA:
                rdo=num1^num2;
                break;
            case RAIZ:
                rdo=Math.sqrt(num1);
                break;
            case LOGARITMO:
                rdo=Math.log10(num1);
                break;
            case FACTORIAL:
                rdo=factorial(num1);
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
            break;
        case "RAIZ":
            op=op.RAIZ;
            break;
        case "LOGARITMO":
            op=op.LOGARITMO;
            break;
        case "FACTORIAL":
            op=op.FACTORIAL;
            break;
        }
    }
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
    
   
}
