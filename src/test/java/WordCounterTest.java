import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import wordCount.counters.WordCounter;

import static org.testng.Assert.*;

public class WordCounterTest {
   private WordCounter counter;

    @BeforeMethod
    //given
    public void createObject() {
        counter = new WordCounter();
    }

    @Test
    public void oneWord() {
        //when
        counter.readLine("one");
        //then
        assertEquals(1, counter.getResult());
    }

    @Test
    public void emptyString() {
        //when
        counter.readLine("");
        //then
        assertEquals(0, counter.getResult());
    }

    @Test
    public void checkNull() {
        //when
        counter.readLine(null);
        //then
        assertEquals(0, counter.getResult());
    }

    @Test
    public void multipleWhiteSpaces() {
        //when
        counter.readLine("   one *  plus _    ==    ");
        //then
        assertEquals(5, counter.getResult());
    }
}
