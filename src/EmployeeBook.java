import java.util.Arrays;

public class EmployeeBook {
    private final static Employee[] employees = new Employee[10];
    private static int size;

    @Override
    public String toString() {
        return Arrays.toString(employees);
    }

    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
            return;
        }
        employees[size++] = employee;
    }

    public void printBookContact() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int getSalaries() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static int getMinimum() {
        int salarieMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salarieMinimum) {
                salarieMinimum = employees[i].getSalary();
            }
        }
        return salarieMinimum;
    }

    public static int getMaximum() {
        int salarieMaximum = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salarieMaximum) {
                salarieMaximum = employees[i].getSalary();
            }
        }
        return salarieMaximum;
    }

    public static int getAverageSalary() {
        int averageSalary = getSalaries() / size;
        return averageSalary;
    }

    public static String getFullname() {
        String listFullname = "";
        for (int i = 0; i < size; i++) {
            listFullname += employees[i].getfullName();
        }
        return listFullname;
    }

    public static int setIndexingSalaries(int indexing) {
        int newSalary = 0;
        for (int i = 0; i < size; i++) {
            newSalary = employees[i].getSalary() + employees[i].getSalary() * indexing / 100;
            employees[i].setSalary(newSalary);
        }
        return newSalary;
    }

    public static int setMinimumSalaryInDepartment(int department) {
        int minSalaries = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < minSalaries) {
                    minSalaries = employees[i].getSalary();
                }
            }
        }
        return minSalaries;
    }

    public static int setMaximumSalaryInDepartment(int department) {
        int maxSalaries = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > maxSalaries) {
                    maxSalaries = employees[i].getSalary();
                }
            }
        }
        return maxSalaries;
    }

    public static int setSumSalaryInDepartment(int department) {
        int sumSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumSalary += employees[i].getSalary();
            }
        }
        return sumSalary;
    }

    public static int setAverageSalaryInDepartment(int department) {
        int sumSalary = 0;
        int emloyeeeInDeparment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumSalary += employees[i].getSalary();
                emloyeeeInDeparment++;
            }
        }
        int averageSalary = sumSalary / emloyeeeInDeparment;
        return averageSalary;
    }

    public static int setIndexingSalariesInDepartment(int department, int index) {
        int newSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                newSalary = employees[i].getSalary() + employees[i].getSalary() * index / 100;
                employees[i].setSalary(newSalary);
            }
        }
        return newSalary;
    }

    public static void printBookContactInDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getfullName() + " " + employees[i].getSalary());
            }
        }
    }
    public static void compareSalaryLessNumber(int numberCompare){
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < numberCompare){
                System.out.println(employees[i].getId() + " " + employees[i].getfullName() + " " + employees[i].getSalary());
            }
        }
    }public static void compareSalaryMoreNumber(int numberCompare){
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= numberCompare){
                System.out.println(employees[i].getId() + " " + employees[i].getfullName() + " " + employees[i].getSalary());
            }
        }
    }
}