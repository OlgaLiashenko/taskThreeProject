package wordCount.counters;

public class CounterFactory {
    public static Counter createCounter(String flag){

        Counter counter;

        switch (flag) {
            case "-w":
                counter = new WordCounter();
                break;
            case "-l":
                counter = new LineCounter();
                break;
            case "-c":
                counter = new CharacterCounter();
                break;
            default:
                throw new IllegalArgumentException("No valid flag");
        }

        return counter;
    }
}
