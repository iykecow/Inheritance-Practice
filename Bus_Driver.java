public class Bus_Driver extends Person {
    private String myBus;
    private String myRoute;

    public Bus_Driver(String name, int age, String gender, String Bus, String Route){
       super(name, age, gender);
    
       myBus = Bus;
       myRoute = Route;
    }

    public String getBus(){
    return myBus;
    }

    public String getRoute(){
        return myRoute;
    }

    public void setBus(String Bus){
        myBus = Bus;
    }

    public void setRoute(String Route) {
        myRoute = Route;
    }

    public String toString(){
        return super.toString() + ", Route: " + myRoute + ", Bus: " + myBus;
    }

}
