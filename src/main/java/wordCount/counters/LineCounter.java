package wordCount.counters;

public class LineCounter implements Counter {
    private int result = 0;

    @Override
    public void readLine(String line) {
        if (line != null) {
            result = result + 1;
        }
    }

    @Override
    public int getResult() {
        return result;
    }
}
