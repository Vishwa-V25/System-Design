package RailwayTicketReservationSystem;
public class Main {

    public static void main(String[] args) {

        ReservationSystem rs = new ReservationSystem();

        Passenger p1 = new Passenger(1, "Arun", 25);
        Passenger p2 = new Passenger(2, "Bala", 30);
        Passenger p3 = new Passenger(3, "Kumar", 40);
        Passenger p4 = new Passenger(4, "Vijay", 35);
        Passenger p5 = new Passenger(5, "Ajay", 28);

        rs.bookTicket(p1);
        rs.bookTicket(p2);
        rs.bookTicket(p3);
        rs.bookTicket(p4);
        rs.bookTicket(p5);

        rs.displayTickets();

        System.out.println();

        System.out.println("Cancel Passenger 2");

        rs.cancelTicket(2);

        System.out.println();

        rs.displayTickets();

    }
}