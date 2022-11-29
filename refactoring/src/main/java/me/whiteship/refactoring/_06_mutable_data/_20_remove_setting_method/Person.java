package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method;

public class Person {

    private String name;

    // 변경 될 일이 없기에 setter가 필요 없음. 변경되길 원하지 않음 -> 생성자 통해 넘김
    private int id;

    public Person(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }
}
