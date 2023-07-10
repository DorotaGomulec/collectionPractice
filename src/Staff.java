public class Staff extends Employee{
    StaffRole staffRole;

    public Staff(String name, int age, StaffRole staffRole) {
        super( name, age);
        this.staffRole = staffRole;
    }
}
