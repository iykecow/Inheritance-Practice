public class College_Student extends Student {
    private String myMajor;
    private int myYear;


    public College_Student(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
     
        myMajor = major;
        myYear = year;

    }
        public String getMajor(){
            return myMajor;
          }
        
          public int getYear(){
            return myYear;
          }
        
          public void setMajor(String major){
            myMajor = major;
          }
        
          public void setYear(int year) {
            myYear = year;
          }
        
          // overrides the toString method in the parent class
          public String toString(){
            return super.toString() + ", year: " + myYear + ", major: " + myMajor;
          }
}