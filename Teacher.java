public class Teacher extends Person {
    private String mySubject;
    private int mySalary;

    public Teacher(String name, int age, String gender, String subject, int salary){
       super(name, age, gender);
    
       mySubject = subject;
       mySalary = salary;
    }

    public String getSubject(){
    return mySubject;
    }

    public int getSalary(){
        return mySalary;
    }

    public void setSubject(String Subject){
        mySubject = Subject;
    }

    public void setSalary(int Salary) {
        mySalary = Salary;
    }

    public String toString(){
        return super.toString() + ", Salary: " + mySalary + ", Subject: " + mySubject;
    }

}
