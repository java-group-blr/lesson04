import com.company.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ArraysTest {

    @Test
    public void testFindAverage() {
        int[] array = {1, 3, 34, 12, 3};
        double expected = 10.6;
        double actual = Arrays.findAverage();
        Assert.assertEquals(expected, actual, 0.0000001);
    }

}