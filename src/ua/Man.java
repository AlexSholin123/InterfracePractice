package ua;


public class Man implements Human {

    private String name;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void getInfo() {
        System.out.println(getName() + " is " + getAge());
    }

}
