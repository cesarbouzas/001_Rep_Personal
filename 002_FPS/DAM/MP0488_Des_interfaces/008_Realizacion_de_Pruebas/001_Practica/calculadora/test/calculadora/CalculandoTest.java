
package calculadora;
import junit.framework.TestCase;
/**
 * @author cesar
 */
public class CalculandoTest extends TestCase {
    public CalculandoTest(String testName) {
        super(testName);
    }
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    /**
     * Test of add method, of class Calculando.
     */
    public void testAdd() {
        System.out.println("add");
        double number1 = 2.0;
        double number2 = 3.0;
        Calculando instance = new Calculando();
        double expResult = 5.0;
        double result = instance.add(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of subtract method, of class Calculando.
     */
    public void testSubtract() {
        System.out.println("subtract");
        double number1 = 3.0;
        double number2 = 1.0;
        Calculando instance = new Calculando();
        double expResult = 2.0;
        double result = instance.subtract(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of multiply method, of class Calculando.
     */
    public void testMultiply() {
        System.out.println("multiply");
        double number1 = 3.0;
        double number2 = 3.0;
        Calculando instance = new Calculando();
        double expResult = 9.0;
        double result = instance.multiply(number1, number2);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Test of divide method, of class Calculando.
     */
    public void testDivide() {
        System.out.println("divide");
        double number1 = 10.0;
        double number2 = 2.0;
        Calculando instance = new Calculando();
        double expResult = 5.0;
        double result = instance.divide(number1, number2);
        assertEquals(expResult, result, 0.0);
    }

}
