import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import com.epi.arrays.*;

public class ArrayTests {

    @Test
    public void testDNF() {
        List<Integer> input = Arrays.asList(0,1,2,0,2,1,1);
        List<Integer> expectedOutput = Arrays.asList(0,0,1,1,1,2,2);
        DNF dnf = new DNF();
        Assert.assertEquals(expectedOutput, dnf.solve(input, 1));
    }

    @Test
    public void testIncrementNumber() {
        List<Integer> input = Arrays.asList(9,9,9);
        List<Integer> output = Arrays.asList(1,0,0,0);
        IncrementNumber in = new IncrementNumber();
        Assert.assertEquals(output, in.solve(input));
    }

    @Test
    public void testMultiplyBigIntegers() {
        List<Integer> a = Arrays.asList(1,9,3,7,0,7,7,2,1);
        List<Integer> b = Arrays.asList(-7,6,1,8,3,8,2,5,7,2,8,7);
        List<Integer> output = Arrays.asList(-1,4,7,5,7,3,9,5,2,5,8,9,6,7,6,4,1,2,9,2,7);
        MultiplyBigIntegers mul = new MultiplyBigIntegers();
        Assert.assertEquals(output, mul.solve(a, b));
    }
}