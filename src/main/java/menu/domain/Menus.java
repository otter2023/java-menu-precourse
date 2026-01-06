package menu.domain;

import java.util.Iterator;
import java.util.List;

public class Menus implements Iterable<Menu> {
    private List<Menu> menus;

    public List<Menu> getMenus() {
        return menus;
    }

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

}
