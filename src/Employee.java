public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String department;
    protected boolean isMilitary;

    public Employee(String firstName, String lastName, String department, boolean isMilitary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.isMilitary = isMilitary;
    }

    public abstract double calculateSalary();

    public abstract String performDuties();

    public boolean isDuty() {
        return isMilitary;
    }
}
