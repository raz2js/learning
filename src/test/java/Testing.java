import org.junit.Assert;
import org.junit.Test;
import trash.FactorialFinder;

public class Testing {

    @Test
    public void test() {
        FactorialFinder factorialFinder = new FactorialFinder();
        Assert.assertEquals(120, factorialFinder.findFactorial(5));

    }


}
