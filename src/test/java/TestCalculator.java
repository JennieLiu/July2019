import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {
    @Test
    public void TestSum(){
        System.out.println("test sum:");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 30;
        Integer result = Calculator.sum(x, y);
        assertEquals(expResult, result);
        assertEquals(null, Calculator.sum(15, null));
        assertEquals(null, Calculator.sum(null, 15));
        assertEquals(null, Calculator.sum(null, null));
    }
}
