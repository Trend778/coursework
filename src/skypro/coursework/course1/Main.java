package skypro.coursework.course1;

public class Main {
    public static void printSeparator() {
        System.out.println("****************************************************************************************************************************");
    }

    public static void main(String[] args) {  //Массив данных сотрудников
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Ivanov Ivan Jovanovich", 65_280, 1);
        employee[1] = new Employee("Stepanov Stepan Stepanov", 34_700, 2);
        employee[2] = new Employee("Dmitriev Dmitriy Dmitrievich", 192_874, 3);
        employee[3] = new Employee("Potter Harry Natanovich", 124_978, 4);
        employee[4] = new Employee("Yovanovitch Jardani Batkovich", 57_809, 5);
        employee[5] = new Employee("Begins Bilbo Borisovich", 1_234_987, 4);
        employee[6] = new Employee("Show Dekard Papovich", 298_674, 3);
        employee[7] = new Employee("Show Owen Mamovich", 349_678, 2);
        employee[8] = new Employee("Maximoff Vanda Letyashaya", 234_879, 1);
        employee[9] = new Employee("Hardy Thomas Edward", 684_323, 2);

        allStaff(employee);  //Список всех сотрудников
        printSeparator();

        minSalaryStaff(employee);  //Минимальная зп
        printSeparator();

        maxSalaryStaff(employee);  //Максимальная зп
        printSeparator();

        allStaffSalary(employee);  //Общая сумма затрат на зарплаты
        printSeparator();

        averageSalary(employee);  //Среднee значение зарплат за месяц
        printSeparator();

        printStaffNames(employee); //Печать ФИО персонала
        printSeparator();
    }

    public static void allStaff(Employee[] employees) {  //Список всех сотруников
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static void minSalaryStaff(Employee[] employees) {  //Минимальная зп
        if (employees.length > 0) {
            Employee minEmp = employees[0];
            for (Employee employee : employees) {
                if (minEmp.getSalaryStaff() > employee.getSalaryStaff()) {
                    minEmp = employee;
                }
            }
            System.out.println("Сотрудник с минимальной зарплатой: " + minEmp.getStaff() + " / Зарплата: " + minEmp.getSalaryStaff() + " / Идентификационный номер: " + minEmp.getId());
        } else {
            System.out.println("Массив пустой");
        }
    }

    public static void maxSalaryStaff(Employee[] employees) {  //Максимальная зп
        Employee maxEmp = employees[0];
        if (employees.length > 0) {
            for (Employee employee : employees) {
                if (maxEmp.getSalaryStaff() < employee.getSalaryStaff()) {
                    maxEmp = employee;
                }
            }
            System.out.println("Сотрудник с максимальной зарплатой: " + maxEmp.getStaff() + " / Зарплата: " + maxEmp.getSalaryStaff() + " / Идентификационный номер: " + maxEmp.getId());
        } else {
            System.out.println("Массив пустой");
        }
    }

    public static int allStaffSalary(Employee[] employees) {  //Общая сумма затрат на зарплаты
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты за месяц: " + sum);
        return sum;
    }

    public static void averageSalary(Employee[] employees) {  //Среднee значение зарплат за месяц
        int sum = allStaffSalary(employees);
        int averageSalary = sum / employees.length;
        System.out.println("Среднее значение всех зарплат за месяц: " + averageSalary);
    }

    public static void printStaffNames(Employee[] employees) {  //Печать ФИО персонала
        int count = 1;
        for (Employee employee : employees) {
            System.out.println("ФИО сотрудника №" + count + ": " + employee.getStaff());
            count++;
        }
    }
}