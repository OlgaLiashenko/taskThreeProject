package wordCount;
//Read about Maven and how it works: `pom.xml` file, dependencies, lifecycle, plugins.
//Create a pom file for your word count project, configure build goal that will create a .jar file.
//Import TestNG as a Maven dependency and refactor the tests using this library. Also try to use `@Before` methods to
// initialize objects and `@DataProvider` to do some ‘Data Driven Testing’. Create tests for CounterFactory class.
import wordCount.counters.Counter;
import wordCount.counters.CounterFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordCount {
    public static void main(String[] args) {
        String flag = args[0];
        String filename = args[1];
        Counter counter = CounterFactory.createCounter(flag);
        int lineNum = 1;
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(filename))) {
            String line = reader.readLine();
         //   System.out.println(lineNum++ + "|" + line);

            while (line != null) {
                counter.readLine(line);
                line = reader.readLine();
        //        System.out.println(lineNum++ + "|" + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getResult());
    }
}
