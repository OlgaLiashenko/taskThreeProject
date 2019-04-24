import org.testng.Assert;
import org.testng.annotations.Test;
import wordCount.counters.*;

public class CounterFactoryTest {

    @Test
    public void checkCaseW() {
        Counter counter = CounterFactory.createCounter("-w");
        Assert.assertTrue(counter instanceof WordCounter);
    }

    @Test
    public void checkCaseL(){
        Counter counter = CounterFactory.createCounter("-l");
        Assert.assertTrue(counter instanceof LineCounter);
    }

    @Test
    public void checkCaseC(){
        Counter counter = CounterFactory.createCounter("-c");
        Assert.assertTrue(counter instanceof CharacterCounter);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkDefaultForException() {
        Counter counter = CounterFactory.createCounter("u");
        Assert.assertTrue(counter instanceof IllegalArgumentException);
    }

}
