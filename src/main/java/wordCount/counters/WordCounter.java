package wordCount.counters;

public class WordCounter implements Counter {
    private int result = 0;

    @Override
    public void readLine(String line) {
        if (line == null || line.equals("")) {
            return;
        } else {
            line = line.trim();
            String[] array = line.split("\\s+");
            result += array.length;
        }
    }


    @Override
    public int getResult() {
        return result;
    }
}
