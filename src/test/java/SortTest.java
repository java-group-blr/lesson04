import com.company.Sort;
import org.junit.Assert;
import org.junit.Test;

public class SortTest {

    @Test
    public void testSortArray() {
        int[] array = {1, 3, 34, 12, 3};
        int[] expected = {1, 12, 3, 3, 34};
        int[] actual = Sort.sortArray(array);
        Assert.assertArrayEquals(expected, actual);
    }

}