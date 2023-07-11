import java.util.ArrayList;
import java.util.HashMap;

public class Employee {
    private String name;
    private int age;

    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    HashMap<String,Employee> stringEmployeeHashMap = new HashMap<>();

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
