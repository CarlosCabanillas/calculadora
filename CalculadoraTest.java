

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CalculadoraTest.
 *
 * @author  (Cabanillas)
 * @version (5.0)
 */
public class CalculadoraTest
{
    Calculadora calculadora;

    Double TOLERANCIA = 0.0001;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumaNormal(){
        calculadora.ponNum1(5);
        calculadora.ponNum2(6);

        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        Assert.assertEquals(11, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testSumaMAX1(){
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();

        Assert.assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }
}
