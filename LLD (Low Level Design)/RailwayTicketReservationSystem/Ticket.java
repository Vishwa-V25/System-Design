package RailwayTicketReservationSystem;

public class Ticket {

    private int ticketId;
    private Passenger passenger;

    Ticket(int ticketId, Passenger passenger) {
        this.ticketId = ticketId;
        this.passenger = passenger;
    }

    public int getTicketId() {
        return ticketId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public int getPassengerId() {
        return passenger.getPassengerId();
    }

    public String getPassengerName() {
        return passenger.getName();
    }

    public String getBerth() {
        return passenger.getAllotted();
    }
}
