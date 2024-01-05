package software.ulpgc.Kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {

        List<Starbucks> starbucks = CsvFileStarbucksLoader.with("dataset.csv").load();
        HashMap<String, Integer> histogram = new NameHistogramCalculator(starbucks).calculate();
        Iterator<String> var3 = histogram.keySet().stream().sorted().toList().iterator();

        while (var3.hasNext()) {

            String key = var3.next();
            System.out.println(key + "--->" + histogram.get(key));

        }

    }
}
