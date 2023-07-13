public class Staff extends Employee {
    private StaffRole staffRole;

    public Staff(String name, int age, StaffRole staffRole) {
        super( name, age );
        this.staffRole = staffRole;
    }

    public StaffRole getStaffRole() {
        return staffRole;
    }

    public String toString() {

        return "Name: %s, age: %s, Staff role: %s \n".formatted( getName(), getAge(), getStaffRole() ).toUpperCase();
    }
}
