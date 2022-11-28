package me.whiteship.refactoring._03_long_function._09_preserve_whole_object;

import java.util.HashMap;
import java.util.Map;

public record Participant(String username, Map<Integer, Boolean> homework) {
    public Participant(String username) {
        this(username, new HashMap<>());
    }

    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }


    // 1. preserve whole object 후 고려해야 할 것이 각각의 메서드가 과연 participant에 의존하는것이 맞는가. Hashmap을 보고 있는것이 맞는가. 한번쯤 고려해봐야함.
    // 2. 과연 이 메서드는 이 위치가 적절한가. totalNumberOfEvents을 parameter로 전달해서 getRate를 구할수 있을지 않을까. (Participant로 이동)
    double getRate(int totalNumberOfEvents) {
        long count = homework().values().stream()
                .filter(v -> v == true)
                .count();
        return (double) (count * 100 / totalNumberOfEvents);
    }
}
