package sef.FinalActivity;

public class Employee extends Person {

    private int Salary;
    private String jobTitle;
    private String companyTitle;

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyTitle() {
        return companyTitle;
    }

    public void setCompanyTitle(String companyTitle) {
        this.companyTitle = companyTitle;
    }
        public void introduceEmployee() {
          System.out.println("My name is " + this.getName() + " and I am " + this.getAge() + " years old. I work as " + jobTitle + " in " + companyTitle);
    }

}