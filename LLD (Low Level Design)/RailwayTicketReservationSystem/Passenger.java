package RailwayTicketReservationSystem;
public class Passenger {

    private int passengerId;
    private String name;
    private int age;
    private String allotted;

    Passenger(int id, String name, int age) {
        this.passengerId = id;
        this.name = name;
        this.age = age;
        allotted = "";
    }

    public int getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAllotted() {
        return allotted;
    }

    public void setAllotted(String allotted) {
        this.allotted = allotted;
    }
}
