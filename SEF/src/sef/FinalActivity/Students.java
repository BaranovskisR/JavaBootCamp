package sef.FinalActivity;

public class Students extends Person {

    private String schoolName;

    public Students() {
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void introduceStudent(){
        System.out.println("I study in the " + schoolName + " university.");

    }

}