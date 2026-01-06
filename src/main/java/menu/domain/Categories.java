package menu.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Categories implements Iterable<Category> {
    private List<Category> categories = new ArrayList<>();

    public List<Category> getCategories() {
        return categories;
    }

    public void add(Category category) {
        this.categories.add(category);
    }

    @Override
    public Iterator<Category> iterator() {
        return categories.iterator();
    }
}
