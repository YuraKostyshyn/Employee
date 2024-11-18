public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor("Юрій", "Михайлович", "Факультет комп'ютерних наук", false, 57760);
        Administrator administrator = new Administrator("Юлія", "Сергіївна", "Адміністрація", true, 160);

        System.out.println(professor.firstName + " " + professor.lastName + " заробітна плата: " + professor.calculateSalary() + " грн");
        System.out.println(administrator.firstName + " " + administrator.lastName + " заробітна плата: " + administrator.calculateSalary() + " грн");

        System.out.println(professor.firstName + " обов'язки: " + professor.performDuties());
        System.out.println(administrator.firstName + " обов'язки: " + administrator.performDuties());

        System.out.println(professor.firstName + " може заступати в наряд: " + professor.isDuty());
        System.out.println(administrator.firstName + " може заступати в наряд: " + administrator.isDuty());
    }
}
