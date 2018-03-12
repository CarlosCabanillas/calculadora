 
/**
 * Write a description of class Calculadora here.
 * 
 * @author Cabanillas 
 * @version (a version number or a date)
 */

public class Calculadora
{
    // instance variables - replace the example below with your own
    private double num1;
    private double num2;
    private double rdo;

    private Operacion op;
    
    public void ponNum1(double n1)
    {
        // put your code here
        this.num1=n1;
    }
    
    public void ponNum2(double n2)
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
                rdo=Math.pow(num1,num2);
                break;
            case RAIZ:
                rdo=Math.sqrt(num1);
                break;
            case LOGARITMO:
                rdo=Logaritmo(num1,num2);
                break;
            case FACTORIAL:
                rdo=factorial(num1);
                break;

        }
    }




    /**
     * @param opera
     * @throws IllegalArgumentException
     */
    public void ponOperacion(String opera) throws IllegalArgumentException {
        switch(opera) {

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
        default:
            throw new IllegalArgumentException("Esa operacion no existe");
        }
    }
    public double dameResultado()
    {
        // put your code here
        return rdo;
    }

    //Metodo para calcular el factorial de un numero
    public double factorial (double numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);
    }


    public double Logaritmo(double base,double num){
        return (Math.log(num)/Math.log(base));
    }

}
