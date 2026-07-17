package RailwayTicketReservationSystem;
import java.util.ArrayList;
import java.util.List;

public class Train {

    private int lower = 1;
    private int middle = 1;
    private int upper = 1;
    private int rac = 1;
    private int waiting = 1;

    List<Ticket> confirmed = new ArrayList<>();
    List<Ticket> racList = new ArrayList<>();
    List<Ticket> waitingList = new ArrayList<>();

    public boolean lowerAvailable() {
        return lower > 0;
    }

    public boolean middleAvailable() {
        return middle > 0;
    }

    public boolean upperAvailable() {
        return upper > 0;
    }

    public boolean racAvailable() {
        return rac > 0;
    }

    public boolean waitingAvailable() {
        return waiting > 0;
    }

    public void decreaseLower() {
        lower--;
    }

    public void decreaseMiddle() {
        middle--;
    }

    public void decreaseUpper() {
        upper--;
    }

    public void decreaseRAC() {
        rac--;
    }

    public void decreaseWaiting() {
        waiting--;
    }

    public void increaseLower() {
        lower++;
    }

    public void increaseMiddle() {
        middle++;
    }

    public void increaseUpper() {
        upper++;
    }

    public void increaseRAC() {
        rac++;
    }

    public void increaseWaiting() {
        waiting++;
    }
}