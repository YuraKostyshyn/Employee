public class Professor extends Employee {
    private int lectures;

    public Professor(String firstName, String lastName, String department, boolean isMilitary, int lectures) {
        super(firstName, lastName, department, isMilitary);
        this.lectures = lectures;
    }

    @Override
    public double calculateSalary() {
        return lectures * 100; // 100 - скіку за лекцію
    }

    @Override
    public String performDuties() {
        return "Навчати студентів";
    }
}
