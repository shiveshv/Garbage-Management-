import java.time.Duration;
import java.time.LocalDateTime;
public class Ticket {
private static int ticketCounter = 1;
private int ticketId;
private Vehicle vehicle;
private ParkingSpot spot;
private LocalDateTime entryTime;
private LocalDateTime exitTime;
public Ticket(Vehicle vehicle, ParkingSpot spot) {
this.ticketId = ticketCounter++;
this.vehicle = vehicle;
this.spot = spot;
this.entryTime = LocalDateTime.now();
this.exitTime = null;
}
public void closeTicket() {
this.exitTime = LocalDateTime.now();
}
public Duration getDuration() {
if (exitTime != null) {
return Duration.between(entryTime, exitTime);
} else {
return Duration.between(entryTime, LocalDateTime.now());
