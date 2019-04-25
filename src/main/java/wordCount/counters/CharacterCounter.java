package wordCount.counters;

public class CharacterCounter implements Counter {

    private int result = 0;

    @Override
    public void readLine(String line) {
        if (line == null || line.equals("")) {
            return;
        } else {
            String lineNoSpaces = line.replaceAll("\\s+", "");
            result += lineNoSpaces.length();
        }
    }

    @Override
    public int getResult() {
        return result;
    }
}
