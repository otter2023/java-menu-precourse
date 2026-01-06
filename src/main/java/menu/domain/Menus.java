package menu.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menus implements Iterable<Menu> {
    private List<Menu> menus = new ArrayList<>();

    public boolean contains(Menu menu){
        return menus.contains(menu);
    }

    @Override
    public Iterator<Menu> iterator() {
        return menus.iterator();
    }

    public void add(Menu menu) {
        this.menus.add(menu);
    }

    public int size() {
        return menus.size();
    }

    public List<String> getMenuNames() {
        List<String> names = new ArrayList<>();
        for (Menu menu : menus) {
            names.add(menu.getKoreanName());
        }
        return names;
    }
}
