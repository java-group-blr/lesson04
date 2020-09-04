import com.company.Strings;
import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

    @Test
    public void testFindLongestString() {
        String testString = "Java is the best language in the world";
        String expected = "language 8";
        String actual = Strings.findLongestString(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestStringMoreThanOneTheSame() {
        String testString = "Live without regrets";
        String expected = "regrets 7";
        String actual = Strings.findLongestString(testString);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestStringOneWord() {
        String testString = "Success";
        String expected = "SUCCESS 7";
        String actual = Strings.findLongestString(testString);
        Assert.assertEquals(expected, actual);
    }
}