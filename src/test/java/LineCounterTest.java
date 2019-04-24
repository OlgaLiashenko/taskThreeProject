import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import wordCount.counters.LineCounter;

import static org.testng.Assert.*;

public class LineCounterTest {
   private LineCounter counter;

    @BeforeMethod
    public void createObjectLineCounter(){
        //given
        counter = new LineCounter();
    }

    @Test
    public void OneLine() {
        //when
        counter.readLine("1");
        //then
        assertEquals(1, counter.getResult());
    }


    @Test
    public void OneEmptyLine() {
        //when
        counter.readLine("");
        //then
        assertEquals(1, counter.getResult());
    }


    @Test
    public void firstEmptyLine() {
        //given
        String[] inputLines = {"", "12", "h  g"};
        //when
        for (String line : inputLines) {
            counter.readLine(line);
        }
        //then
        assertEquals(3, counter.getResult());
    }

    @Test
    public void checkNull() {
        //when
        counter.readLine(null);
        //then
        assertEquals(0, counter.getResult());
    }

    @Test
    public void checkEmptyStringInMiddle() {
        //given
        String[] inputLines = {"1", "", "3", "4"};
        //when
        for (String line : inputLines) {
            counter.readLine(line);
        }
        //then
        assertEquals(4, counter.getResult());
    }

    @Test
    public void checkEmptyStringInEnd() {
        //given
        String[] inputLines = {"1", "2", "3", "",""};
        //when
        for(String line : inputLines){
            counter.readLine(line);
        }
        //then
        assertEquals(5, counter.getResult());
    }
}
