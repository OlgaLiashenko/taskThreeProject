import org.testng.Assert;
import org.testng.annotations.Test;
import wordCount.counters.*;

import static org.testng.Assert.*;

public class CounterFactoryTest {

    @Test
    public void checkCaseW() {
        Counter counter = CounterFactory.createCounter("-w");
        assertTrue(counter instanceof WordCounter);
    }

    @Test
    public void checkCaseL(){
        Counter counter = CounterFactory.createCounter("-l");
        assertTrue(counter instanceof LineCounter);
    }

    @Test
    public void checkCaseC(){
        Counter counter = CounterFactory.createCounter("-c");
        assertTrue(counter instanceof CharacterCounter);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void checkDefaultForException() {
        Counter counter = CounterFactory.createCounter("u");
    }

}
