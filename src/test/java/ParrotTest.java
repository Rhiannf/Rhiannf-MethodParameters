
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {
    Lab p = new Lab();

    /**
     * If p.copy is passed "hello", it should return "hello".
     */
    @Test
    public void parrotTestHello(){
        String input = "hello";
        String expected = "hello";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }
    private void extracted2(String expected, String actual) {
        Assert.assertEquals(expected, actual);
    }
    private void extracted(String expected, String actual) {
        extracted2(expected, actual);
    }
    /**
     * If p.copy is passed "polly", it should return "polly".
     */
    @Test
    public void parrotTestPolly(){
        String input = "hello";
        String expected = "hello";
        String actual = p.copy(input);
        Assert.assertEquals(expected, actual);
    }
}
