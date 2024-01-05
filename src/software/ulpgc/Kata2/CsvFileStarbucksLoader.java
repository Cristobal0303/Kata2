package software.ulpgc.Kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CsvFileStarbucksLoader implements StarbucksLoader {

    private final File file;

    public CsvFileStarbucksLoader(File file) {
        this.file = file;
    }

    public static StarbucksLoader with(String file) {
        return new CsvFileStarbucksLoader(new File(file));
    }

    @Override
    public List<Starbucks> load() {

        try {

            BufferedReader reader = new BufferedReader(new FileReader(this.file));
            List var2;

            try {

                var2 = this.load(reader);

            } catch (Throwable var5) {

                try {

                    reader.close();

                } catch (Throwable var4) {

                    var5.addSuppressed(var4);

                }

                throw var5;

            }

            reader.close();
            return var2;

        } catch (IOException e) {

            return Collections.emptyList();

        }

    }

    private List load(BufferedReader reader) {
        return reader.lines().skip(1L).map(this::toStarbucks).collect(Collectors.toList());
    }

    private Object toStarbucks(String line) {
        return this.toStarbucks(line.split(","));
    }

    private Object toStarbucks(String[] field) {
        return  new Starbucks(field[0], field[1], field[2], field[3]);
    }
}
