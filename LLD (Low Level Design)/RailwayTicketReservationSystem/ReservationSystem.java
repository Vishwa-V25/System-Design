package RailwayTicketReservationSystem;

public class ReservationSystem {

    private Train train = new Train();
    private int ticketId = 1;

    public void bookTicket(Passenger p) {

        if (train.lowerAvailable()) {

            p.setAllotted("Lower");
            train.decreaseLower();

            Ticket t = new Ticket(ticketId++, p);
            train.confirmed.add(t);

            System.out.println("Lower Berth Allotted");

        } else if (train.middleAvailable()) {

            p.setAllotted("Middle");
            train.decreaseMiddle();

            Ticket t = new Ticket(ticketId++, p);
            train.confirmed.add(t);

            System.out.println("Middle Berth Allotted");

        } else if (train.upperAvailable()) {

            p.setAllotted("Upper");
            train.decreaseUpper();

            Ticket t = new Ticket(ticketId++, p);
            train.confirmed.add(t);

            System.out.println("Upper Berth Allotted");

        } else if (train.racAvailable()) {

            p.setAllotted("RAC");
            train.decreaseRAC();

            Ticket t = new Ticket(ticketId++, p);
            train.racList.add(t);

            System.out.println("RAC Ticket");

        } else if (train.waitingAvailable()) {

            p.setAllotted("Waiting");
            train.decreaseWaiting();

            Ticket t = new Ticket(ticketId++, p);
            train.waitingList.add(t);

            System.out.println("Waiting List");

        } else {

            System.out.println("No Tickets Available");

        }

    }

    public void cancelTicket(int passengerId) {

        Ticket removeTicket = null;

        for (Ticket t : train.confirmed) {

            if (t.getPassengerId() == passengerId) {

                removeTicket = t;
                break;

            }
        }

        if (removeTicket == null) {

            System.out.println("Passenger Not Found");
            return;

        }

        String berth = removeTicket.getBerth();

        train.confirmed.remove(removeTicket);

        if (berth.equals("Lower"))
            train.increaseLower();

        else if (berth.equals("Middle"))
            train.increaseMiddle();

        else
            train.increaseUpper();

        System.out.println("Ticket Cancelled");

        if (!train.racList.isEmpty()) {

            Ticket racPassenger = train.racList.remove(0);

            train.increaseRAC();

            if (train.lowerAvailable()) {

                racPassenger.getPassenger().setAllotted("Lower");
                train.decreaseLower();

            } else if (train.middleAvailable()) {

                racPassenger.getPassenger().setAllotted("Middle");
                train.decreaseMiddle();

            } else {

                racPassenger.getPassenger().setAllotted("Upper");
                train.decreaseUpper();

            }

            train.confirmed.add(racPassenger);

            System.out.println("RAC Passenger Confirmed");

            if (!train.waitingList.isEmpty()) {

                Ticket waitingPassenger = train.waitingList.remove(0);

                waitingPassenger.getPassenger().setAllotted("RAC");

                train.decreaseRAC();
                train.increaseWaiting();

                train.racList.add(waitingPassenger);

                System.out.println("Waiting Passenger moved to RAC");
            }
        }
    }

    public void displayTickets() {

        System.out.println();

        System.out.println("Confirmed Tickets");

        System.out.println("TicketId\tPassengerId\tName\tBerth");

        for (Ticket t : train.confirmed) {

            System.out.println(
                    t.getTicketId() + "\t\t"
                            + t.getPassengerId() + "\t\t"
                            + t.getPassengerName() + "\t"
                            + t.getBerth());

        }

        System.out.println();

        System.out.println("RAC");

        for (Ticket t : train.racList) {

            System.out.println(
                    t.getPassengerId() + " "
                            + t.getPassengerName());

        }

        System.out.println();

        System.out.println("Waiting");

        for (Ticket t : train.waitingList) {

            System.out.println(
                    t.getPassengerId() + " "
                            + t.getPassengerName());

        }

    }
}