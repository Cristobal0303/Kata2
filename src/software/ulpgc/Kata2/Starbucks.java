package software.ulpgc.Kata2;

import java.util.Objects;

public class Starbucks {

    private final String name;
    private final String category;
    private final String category_prep;
    private final String calories;

    public Starbucks(String name, String category, String category_prep, String calories) {
        this.name = name;
        this.category = category;
        this.category_prep = category_prep;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getCategory_prep() {
        return category_prep;
    }

    public String getCalories() {
        return calories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Starbucks starbucks = (Starbucks) o;
        return Objects.equals(name, starbucks.name) && Objects.equals(category, starbucks.category) && Objects.equals(category_prep, starbucks.category_prep) && Objects.equals(calories, starbucks.calories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category, category_prep, calories);
    }

    @Override
    public String toString() {
        return "Starbucks{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", category_prep='" + category_prep + '\'' +
                ", calories='" + calories + '\'' +
                '}';
    }

}
