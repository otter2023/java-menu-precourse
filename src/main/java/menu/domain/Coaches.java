package menu.domain;

import java.util.Iterator;
import java.util.List;

public class Coaches implements Iterable<Coach> {
    List<Coach> coaches;

    public Coaches(List<Coach> coachList) {
        this.coaches = coachList;
    }

    @Override
    public Iterator<Coach> iterator() {
        return coaches.iterator();
    }

    public void validateCoachesCount() {
        if (coaches.size() < 2 || coaches.size() > 5) {
            throw new IllegalArgumentException("[ERROR] 코치는 최소 2명 이상 5명 이하입니다.");
        }
    }
}
