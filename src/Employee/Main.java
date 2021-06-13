package Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Masha", 5400L);
        Employee employee2 = new Employee("Sasha", 7000L);
        Employee employee3 = new Employee("Pasha", 9000L);
        Employee employee4 = new Employee("Serezha", 12000L);
        Employee employee5 = new Employee("Anna", 15000L);
        Employee employee6 = new Employee("Lena", 4000L);
        Employee employee7 = new Employee("Misha", 2500L);
        Employee employee8 = new Employee("Vlad", 7700L);
        List<Employee> departmentList1 = Arrays.asList(employee1, employee2);
        List<Employee> departmentList2 = Arrays.asList(employee3, employee4);
        List<Employee> departmentList3 = Arrays.asList(employee5, employee6);
        List<Employee> departmentList4 = Arrays.asList(employee7, employee8);

        Department department1 = new Department("dep1", "111-2345", departmentList1);
        Department department2 = new Department("dep2", "222-2345", departmentList2);
        Department department3 = new Department("dep3", "333-2345", departmentList3);
        Department department4 = new Department("dep3", "111-6654", departmentList4);

        List<Department> departments = Arrays.asList(department1, department2, department3, department4);
        int threshold = 5000;
        System.out.println(calcNumberOfEmployees(departments, threshold));

    }

    public static int calcNumberOfEmployees(List<Department> departments, long threshold) {
         return (int) departments.stream()
                .filter(department -> department.getCode().startsWith("111"))
                .flatMap(department -> department.getEmployees().stream())
                .filter(employee -> employee.getSalary()>threshold)
                .count();
        }
    }

