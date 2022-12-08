package alex;

interface salary {
    void insertSalary(int salary);
}


class SDE1 implements salary {
    int salary;
    @Override public void insertSalary(int salary)
    {
        this.salary = salary;
    }
    void printSalary() { System.out.println(this.salary); }
}

class SDE2 implements salary {
    int salary;
    @Override public void insertSalary(int salary)
    {
        this.salary = salary;
    }
    void printSalary() {
        System.out.println("xxx");
        System.out.println(this.salary);
        System.out.println("bbb");
        System.out.println("привет");
    }
}

public class GFG {

    public static void main(String[] args)
    {
        SDE1 ob = new SDE1();
        // Insert different salaries
        ob.insertSalary(100000);
        ob.printSalary();
        SDE2 ob1 = new SDE2();

        ob1.insertSalary(200000);
        ob1.printSalary();
    }
}
