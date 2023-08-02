import java.util.Arrays;
import java.util.Objects;

public class EmployeeBook {
    private final Employee[] employees = new Employee[10];
    private int size;

    @Override
    public String toString() {
        return Arrays.toString(employees);
    }

    public void addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Нельзя добавить сотрудника, закончилось место");
            return;
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                size++;
                break;
            }
        }
    }

    public void removeEmployee(int idEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == idEmployee) {
                System.arraycopy(employees, i + 1, employees, i, size - i - 1);
                employees[size - 1] = null;
                size--;
                return;
            }
        }
    }

    public void printBookContact() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public int getSalaries() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public Employee getMinimum() {
        int salarieMinimum = Integer.MAX_VALUE;
        Employee employeeSalaryMinimum = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < salarieMinimum) {
                salarieMinimum = employees[i].getSalary();
                employeeSalaryMinimum = employees[i];
            }
        }
        return employeeSalaryMinimum;
    }

    public Employee getMaximum() {
        int salarieMaximum = Integer.MIN_VALUE;
        Employee employeeSalaryMaximum = employees[0];
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() > salarieMaximum) {
                salarieMaximum = employees[i].getSalary();
                employeeSalaryMaximum = employees[i];
            }
        }
        return employeeSalaryMaximum;
    }

    public double getAverageSalary() {
        double averageSalary = getSalaries() / size;
        return averageSalary;
    }

    public String getFullname() {
        String listFullname = "";
        for (int i = 0; i < size; i++) {
            listFullname += employees[i].getFullName();
            if (i < size - 1) {
                listFullname += ", ";
            }
        }
        return listFullname;
    }

    public void getIndexingSalaries(int indexing) {
        int newSalary = 0;
        for (int i = 0; i < size; i++) {
            newSalary = employees[i].getSalary() + employees[i].getSalary() * indexing / 100;
            employees[i].setSalary(newSalary);
        }
    }

    public Employee getMinimumSalaryInDepartment(int department) {
        Employee minSalariesEmployee = null;

        for (int i = 0; i < size; i++) {

            if (employees[i].getDepartment() == department) {

                if (minSalariesEmployee == null || employees[i].getSalary() < minSalariesEmployee.getSalary()) {

                    minSalariesEmployee = employees[i];

                }

            }
        }
        return minSalariesEmployee;
    }

    public Employee getMaximumSalaryInDepartment(int department) {
        Employee maxSalariesEmployee = null;

        for (int i = 0; i < size; i++) {

            if (employees[i].getDepartment() == department) {

                if (maxSalariesEmployee == null || employees[i].getSalary() < maxSalariesEmployee.getSalary()) {

                    maxSalariesEmployee = employees[i];

                }

            }
        }
        return maxSalariesEmployee;
    }

    public int getSumSalaryInDepartment(int department) {
        int sumSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumSalary += employees[i].getSalary();
            }
        }
        return sumSalary;
    }

    public double getAverageSalaryInDepartment(int department) {
        double sumSalary = 0;
        double emloyeeeInDeparment = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                sumSalary += employees[i].getSalary();
                emloyeeeInDeparment++;
            }
        }
        double averageSalary = sumSalary / emloyeeeInDeparment;
        return averageSalary;
    }

    public int getIndexingSalariesInDepartment(int department, int index) {
        int newSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                newSalary = employees[i].getSalary() + employees[i].getSalary() * index / 100;
                employees[i].setSalary(newSalary);
            }
        }
        return newSalary;
    }

    public void printBookContactInDepartment(int department) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getDepartment() == department) {
                System.out.println(employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    public void compareSalaryLessNumber(int numberCompare) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() < numberCompare) {
                System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    public void compareSalaryMoreNumber(int numberCompare) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() >= numberCompare) {
                System.out.println(employees[i].getId() + " " + employees[i].getFullName() + " " + employees[i].getSalary());
            }
        }
    }

    public void changeEmployee(String fullName, int salary, int department) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(fullName, employees[i].getFullName())) {
                employees[i].setSalary(salary);
                employees[i].setDepartment(department);
            }
        }
    }

    public void printListAllEmployeesByDepartament() {
        for (int departament = 1; departament <= 5; departament++) {
            for (int j = 0; j < size; j++) {
                if (employees[j].getDepartment() == departament)
                    System.out.println(employees[j].getDepartment() + " " + employees[j].getFullName());
            }
        }
    }
}