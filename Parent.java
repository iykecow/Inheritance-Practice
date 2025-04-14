public class Parent extends Person {
    private String myJob;
    private int myKids;

    public Parent(String name, int age, String gender, String Job, int Kids){
       super(name, age, gender);
    
       myJob = Job;
       myKids = Kids;
    }

    public String getJob(){
    return myJob;
    }

    public int getKids(){
        return myKids;
    }

    public void setJob(String Job){
        myJob = Job;
    }

    public void setKids(int Kids) {
        myKids = Kids;
    }

    public String toString(){
        return super.toString() + ", Kids: " + myKids + ", Job: " + myJob;
    }

}
