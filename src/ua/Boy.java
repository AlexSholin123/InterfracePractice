package ua;

public class Boy implements Human {

    private String name;
    private int age;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void getInfo() {

    }

    public void setAge(int age) {
        this.age = age;
    }
}
