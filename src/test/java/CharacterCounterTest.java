import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import wordCount.counters.CharacterCounter;

import static org.testng.Assert.*;


public class CharacterCounterTest {

    private CharacterCounter counter;

    @DataProvider(name = "methodDataProvider")
    public static Object[][] methodDataProvider() {
        return new Object[][]{{"1", 1}, {null, 0}, {" ", 0}, {"", 0}, {" ? i % / 2., ", 7}};
    }

    @BeforeMethod
    public void createObjectCharacterCounter() {
        //given
        counter = new CharacterCounter();
    }

    @Test(dataProvider = "methodDataProvider")
    public void charCounterDataProvider(String input, int result) {
        //when
        counter.readLine(input);
        //then
        assertEquals(result, counter.getResult());
    }

    /*

    @Test
    public void oneCharCounter() {
        //when
        counter.readLine("1");
        //then
        Assert.assertEquals(1, counter.getResult());
    }

    @Test
    public void checkNull() {
        //when
        counter.readLine(null);
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void checkWhiteSpace() {
        //when
        counter.readLine(" ");
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void checkEmptyStringe() {
        //when
        counter.readLine("");
        //then
        Assert.assertEquals(0, counter.getResult());
    }

    @Test
    public void specialCharacters() {
        //when
        counter.readLine(" ? i % / 2., ");
        //then
        Assert.assertEquals(7, counter.getResult());
    }
     */
}
