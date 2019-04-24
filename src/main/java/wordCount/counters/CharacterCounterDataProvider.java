package wordCount.counters;

import org.testng.annotations.DataProvider;

public class CharacterCounterDataProvider {

    @DataProvider(name = "methodDataProvider")
    public static Object[][] methodDataProvider() {
        return new Object[][]{{"1", 1}, {null, 0}, {" ", 0}, {"", 0}, {" ? i % / 2., ", 7}};
    }
}
