package software.ulpgc.Kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NameHistogramCalculator implements HistogramCalculator{

    private final List<Starbucks> starbucks;

    public NameHistogramCalculator(List<Starbucks> starbucks) {
        this.starbucks = starbucks;
    }

    @Override
    public HashMap<String, Integer> calculate() {

        HashMap<String, Integer> result = new HashMap<>();
        Iterator<Starbucks> var2 = this.starbucks.iterator();

        while (var2.hasNext()) {

            Starbucks starbucks1 = var2.next();
            result.put(starbucks1.getName(), result.getOrDefault(starbucks1.getName(), 0) + 1);

        }

        return result;

    }
}
