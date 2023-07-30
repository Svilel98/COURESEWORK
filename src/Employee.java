public class Employee {
    private String name;
    private String surname;
    private String lastname;
    private int department;
    private int salary;
    private String fullName;
    public static int keyCounter = 0;
    private int id;

    public Employee(String name, String surname, String lastname, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        fullName = surname + " " + name + " " + lastname;
        this.department = department;
        this.salary = salary;
        keyCounter++;
        this.id = keyCounter;
    }

    @Override
    public String toString() {
        return fullName +
                " " + department +
                " " + salary;
    }

    public String getfullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}