package model;

public class Human {
    private String name; // Для защиты данных
    private int age;
    private String gender;
    private PassportData data;
    //alt+insert
    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
