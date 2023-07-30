public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(
                new Employee("Андрей", "Круглов", "Отчестович", 1, 1500
                ));
        employeeBook.addEmployee(
                new Employee("Артем", "Секретарев", "Вячеславовичч", 1, 11000
                ));
        employeeBook.addEmployee(new Employee("Олег", "Гришаев", "Владимирович", 2, 30000
        ));
        employeeBook.addEmployee(new Employee(
                "Иван", "Феофанов", "Сергеевич", 1, 10000
        ));
        employeeBook.addEmployee(
                new Employee("Максим", "Трапезников", "Сергеевич", 5, 1000000
                ));
        employeeBook.addEmployee(
                new Employee("Степан", "Борисов", "Батькович", 1, 17000
                ));
        employeeBook.addEmployee(
                new Employee("Данил", "Викторов", "Отецович", 1, 19000
                ));
        employeeBook.addEmployee(
                new Employee("Андрей", "Бутурлакин", "Александрович", 1, 54000
                ));
        employeeBook.addEmployee(
                new Employee("Михаил", "Глаголев", "Денисов", 5, 5000
                ));
        employeeBook.addEmployee(
                new Employee("Александр", "Гердт", "Александрович", 2, 20000
        ));
        employeeBook.printBookContact();
        System.out.println(EmployeeBook.getSalaries());
        System.out.println(EmployeeBook.getMinimum());
        System.out.println(EmployeeBook.getMaximum());
        System.out.println(EmployeeBook.getAverageSalary());
        System.out.println(EmployeeBook.getFullname());
        EmployeeBook.setIndexingSalaries(6);
        employeeBook.printBookContact();
        System.out.println(EmployeeBook.setMinimumSalaryInDepartment(2));
        System.out.println(EmployeeBook.setMaximumSalaryInDepartment(2));
        System.out.println(EmployeeBook.setSumSalaryInDepartment(2));
        System.out.println(EmployeeBook.setAverageSalaryInDepartment(2));
        EmployeeBook.setIndexingSalariesInDepartment(2, 10);
        employeeBook.printBookContact();
        System.out.println();
        employeeBook.printBookContactInDepartment(1);
        System.out.println();
        employeeBook.compareSalaryLessNumber(25000);
        System.out.println();
        employeeBook.compareSalaryMoreNumber(34981);
    }
}