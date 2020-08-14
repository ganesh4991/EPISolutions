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
}