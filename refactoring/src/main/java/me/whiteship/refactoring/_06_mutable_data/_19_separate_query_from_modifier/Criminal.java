package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {

    // don, john을 찾아냄.
    public void alertForMiscreant(List<Person> people) {
        // query (조회) -> modifier로 refactoring
        // for문 중복되는 것은 나중에 '알고리즘을 교체한다'에서 방법 나옴.

        /*
        똑같은 일을 하는데 다음과 같이 고칠 수 있다.
        is blank가 아니면 끄라고.
        if (!findMiscreant(people).isBlank()){
            setOffAlarms();
        }
         */
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                // modifier (출력)
                setOffAlarms();
            }

            if (p.getName().equals("John")) {
                setOffAlarms();
            }
        }
    }

    // query 함수로 분리시킴 (조회기능만)
    public String findMiscreant(List<Person> people) {
        // query (조회)
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
