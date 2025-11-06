public class ExitGate {
private ParkingLot parkingLot;
public ExitGate(ParkingLot parkingLot) {
this.parkingLot = parkingLot;
}
public Payment processExit(Ticket ticket) {
ticket.closeTicket();
double fee = Tariff.calculateFee(ticket.getVehicle().getType(), ticket.getDuration());
Payment payment = new Payment(ticket, fee);
// Release spot
ticket.getSpot().removeVehicle();
// Remove ticket from active tickets
parkingLot.removeTicket(ticket);
return payment;
}
}
