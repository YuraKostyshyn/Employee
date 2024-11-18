
    public class Administrator extends Employee {
        private int hoursWorked;

        public Administrator(String firstName, String lastName, String department, boolean isMilitary, int hoursWorked) {
            super(firstName, lastName, department, isMilitary);
            this.hoursWorked = hoursWorked;
        }

        @Override
        public double calculateSalary() {
            return hoursWorked * 50; // 50 - ставка за годину
        }

        @Override
        public String performDuties() {
            return "Керувати адміністративними завданнями";
        }
    }


