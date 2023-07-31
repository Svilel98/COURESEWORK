public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(
                new Employee("Андрей", "Круглов", "Отчестович", 1, 1500
                ));
        employeeBook.addEmployee(
                new Employee("Артем", "Секретарев", "Вячеславовичч", 1, 11000
                ));
        employeeBook.addEmployee(new Employee("Олег", "Гришаев", "Владимирович", 2, 125
        ));
        employeeBook.addEmployee(new Employee(
                "Иван", "Феофанов", "Сергеевич", 3, 10000
        ));
        employeeBook.addEmployee(
                new Employee("Максим", "Трапезников", "Сергеевич", 5, 1000000
                ));
        employeeBook.addEmployee(
                new Employee("Степан", "Борисов", "Батькович", 1, 17000
                ));
        employeeBook.addEmployee(
                new Employee("Даниил", "Викторов", "Алексеевич", 1, 30000
                ));
        employeeBook.addEmployee(
                new Employee("Андрей", "Бутурлакин", "Александрович", 2, 14
                ));
        employeeBook.addEmployee(
                new Employee("Михаил", "Глаголев", "Денисович", 5, 111
                ));
        employeeBook.addEmployee(
                new Employee("Александр", "Гердт", "Александрович", 2, 111
                ));
        employeeBook.printBookContact();
        System.out.println("Сумма зарплат");
        System.out.println(employeeBook.getSalaries());
        System.out.println();
        System.out.println("Минимальная зарплата");
        System.out.println(employeeBook.getMinimum());
        System.out.println();
        System.out.println("Максимальная зарплата");
        System.out.println(employeeBook.getMaximum());
        System.out.println();
        System.out.println("Средняя зарплата");
        System.out.println(employeeBook.getAverageSalary());
        System.out.println();
        System.out.println("Получить Ф. И. О. всех сотрудников");
        System.out.println(employeeBook.getFullname());
        System.out.println();
        System.out.println("Зарплата после индексациии");
        employeeBook.getIndexingSalaries(6);
        employeeBook.printBookContact();
        System.out.println();
        System.out.println("Минимальная зарплата в отделе");
        System.out.println(employeeBook.getMinimumSalaryInDepartment(2));
        System.out.println();
        System.out.println("Максимальная зарплата в отделе");
        System.out.println(employeeBook.getMaximumSalaryInDepartment(2));
        System.out.println();
        System.out.println("Сумма зарплат в отделе");
        System.out.println(employeeBook.getSumSalaryInDepartment(2));
        System.out.println();
        System.out.println("Средняя зарплата в отделе");
        System.out.println(employeeBook.getAverageSalaryInDepartment(2));
        System.out.println();
        System.out.println("Зарплата после индексации в отделе");
        employeeBook.getIndexingSalariesInDepartment(2, 10);
        employeeBook.printBookContact();
        System.out.println();
        System.out.println("Печать контактов в отделе");
        employeeBook.printBookContactInDepartment(1);
        System.out.println();
        System.out.println("Сравнение зарплаты в отделе в меньшую сторону");
        employeeBook.compareSalaryLessNumber(25000);
        System.out.println();
        System.out.println("Сравнение зарплаты в отделе в большую сторону");
        employeeBook.compareSalaryMoreNumber(34981);
        System.out.println();
        System.out.println("Удаление сотрудника");
        employeeBook.removeEmployee(2);
        employeeBook.printBookContact();
        System.out.println();
        System.out.println("Добавление сотрудника");
        employeeBook.addEmployee(
                new Employee("Иван", "Хлопачев", "Максимович", 1, 1000000
                ));
        employeeBook.printBookContact();
        System.out.println();
        System.out.println("Изменить зарплату и департамент у сотрудника");
        employeeBook.changeEmployee("Хлопачев Иван Максимович", 1, 5);
        employeeBook.printBookContact();
        System.out.println();
        employeeBook.printListAllEmployeesByDepartament();
    }
}