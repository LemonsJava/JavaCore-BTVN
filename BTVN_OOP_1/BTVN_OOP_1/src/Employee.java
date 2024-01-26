import java.util.Scanner;

public class Employee extends Person {
    private double exp;


    public Employee(int id, String name, int age) {
        super(id, name, age);
    }
    public Employee(int id, String name, int age, double exp) {
        super(id, name, age);
        this.exp = exp;
    }

    public double getExp() {
        return exp;
    }

    public Employee setExp(double exp) {
        this.exp = exp;
        return this;
    }


    @Override
    public String toString() {
        return "Nhan vien {" +
                "id=" + id +
                ", ten='" + name + '\'' +
                ", tuoi=" + age +
                ", kinh ngiem=" + exp +
                '}';
    }
}
