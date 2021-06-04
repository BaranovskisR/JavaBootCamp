package sef.FinalActivity;

import java.util.Arrays;

public class FirstActivity {
    public static void main(String[] args) {

        Person d = new Person();
        Students j = new Students();
        Employee a = new Employee();
        Employee b = new Employee();
        Employee c = new Employee();

        Employee employee[] = new Employee[3];

        employee[0] = a;
        employee[0].setAge(31);
        employee[0].setName("Rolands");
        employee[0].setSalary(50000);
        employee[0].setCompanyTitle("test");
        employee[0].setJobTitle("test");

        employee[1] = b;
        employee[1].setAge(20);
        employee[1].setName("Jhonny");
        employee[1].setSalary(25000);
        employee[1].setCompanyTitle("test1");
        employee[1].setJobTitle("test1");

        employee[2] = c;
        employee[2].setAge(45);
        employee[2].setName("John");
        employee[2].setSalary(35000);
        employee[2].setCompanyTitle("test2");
        employee[2].setJobTitle("test2");

        d.setName("Rolands");
        d.setAge(31);

        j.setSchoolName("BVK");

        d.introducePerson();
        j.introduceStudent();

        a.introduceEmployee();
        b.introduceEmployee();
        c.introduceEmployee();

        Arrays.sort(employee, new SalaryComparator());
        for(int i=0; i < employee.length; i++){
            System.out.println( "Employee " + (i+1) + " name :: " + employee[i].getName() + ", Salary :: " + employee[i].getSalary());
        }
    }
}
