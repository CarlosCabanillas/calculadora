

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The test class CalculadoraTest.
 *
 * @author  (Cabanillas)
 * @version (5.0)
 */
public class CalculadoraTest {
    Calculadora calculadora;

    Double TOLERANCIA = 0.01;

    /**
     * Sets up the test fixture.
     * <p>
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test()
    public void testSUMANormal() {
        calculadora.ponNum1(5);
        calculadora.ponNum2(6);

        calculadora.ponOperacion("SUMA");
        calculadora.opera();
        assertEquals(11, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testSUMAMAX1() {
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();

        assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testSUMAMIN() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("SUMA");
        calculadora.opera();

        assertEquals(-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testRESTANormal() {
        calculadora.ponNum1(5);
        calculadora.ponNum2(6);

        calculadora.ponOperacion("RESTA");
        calculadora.opera();
        assertEquals(-1, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testRESTAMAX() {
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();

        assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }
    @Test()
    public void testRESTAMAX2() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();

        assertEquals(Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testRESTAMIN() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("RESTA");
        calculadora.opera();

        assertEquals(-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }
    @Test()
    public void testMULTIPLICA() {
        calculadora.ponNum1(3);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();

        assertEquals(6, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testMULTIPLICAMAX() {
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();

        assertEquals(6*Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testMULTIPLICAMIN() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();

        assertEquals(6*-Double.MAX_VALUE, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testMULTIPLICAnegativos() {
        calculadora.ponNum1(-2);
        calculadora.ponNum2(-6);

        calculadora.ponOperacion("MULTIPLICA");
        calculadora.opera();
        assertEquals(12, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testDIVIDE() {
        calculadora.ponNum1(12);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();

        assertEquals(2, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testDIVIDEMAX() {
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();

        assertEquals(2.9961552247705263E307, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testDIVIDEMIN() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();

        assertEquals(0, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testDIVIDEnegativo() {
        calculadora.ponNum1(-12);
        calculadora.ponNum2(-6);
        calculadora.ponOperacion("DIVIDE");
        calculadora.opera();

        assertEquals(2, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testPOTENCIA() {
        calculadora.ponNum1(2);
        calculadora.ponNum2(3);

        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();
        assertEquals(8, calculadora.dameResultado(), TOLERANCIA);
    }
    @Test()
    public void testPOTENCIAMAX() {
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponNum2(6);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();

        assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testPOTENCIAMIN() {
        calculadora.ponNum1(1.0);
        calculadora.ponNum2(-Double.MAX_VALUE);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();

        assertEquals(1.0, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testPOTENCIAnegativa() {
        calculadora.ponNum1(-3);
        calculadora.ponNum2(2);
        calculadora.ponOperacion("POTENCIA");
        calculadora.opera();

        assertEquals(9, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testRAIZ() {
        calculadora.ponNum1(8);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();

        assertEquals(2.82, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testRAIZMAX() {
        calculadora.ponNum1(Double.MAX_VALUE);
        calculadora.ponOperacion("RAIZ");
        calculadora.opera();

        assertEquals(1.3407807929942596E154, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test
    public void testRAIZnegativa() {
        calculadora.ponOperacion("RAIZ");
        calculadora.ponNum1(-4);
        calculadora.opera();

        assertEquals(Double.NaN, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testLOGARITMO() {
        calculadora.ponNum1(2);
        calculadora.ponNum2(4);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();

        assertEquals(2, calculadora.dameResultado(), TOLERANCIA);
    }

    @Test()
    public void testLOGARITMOMAX() {
        calculadora.ponNum1(6);
        calculadora.ponNum2(Double.MAX_VALUE);
        calculadora.ponOperacion("LOGARITMO");
        calculadora.opera();

        assertEquals(396.13, calculadora.dameResultado(), TOLERANCIA);
    }

        @Test()
        public void testLOGARITMOMINIMO() {
            calculadora.ponNum1(Double.MAX_VALUE);
            calculadora.ponNum2(6);
            calculadora.ponOperacion("LOGARITMO");
            calculadora.opera();

            assertEquals(0, calculadora.dameResultado(), TOLERANCIA);

        }

    @Test()
    public void testFACTORIAL() {
        calculadora.ponNum1(3);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();

        assertEquals(6, calculadora.dameResultado(), TOLERANCIA);

    }

    @Test(expected = StackOverflowError.class)
    public void testFACTORIALnegativo() {
        calculadora.ponNum1(-3);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();
    }

    @Test()
    public void testFACTORIALMAX() {
        calculadora.ponNum1(333);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();

        assertEquals(Double.POSITIVE_INFINITY, calculadora.dameResultado(), TOLERANCIA);

    }

    @Test(expected = StackOverflowError.class)
    public void testFACTORIALMIN() {
        calculadora.ponNum1(-333);
        calculadora.ponOperacion("FACTORIAL");
        calculadora.opera();

    }

}