import java.time.LocalDateTime;
public class Payment {
private Ticket ticket;
private double amount;
private LocalDateTime paymentTime;
public Payment(Ticket ticket, double amount) {
this.ticket = ticket;
this.amount = amount;
this.paymentTime = LocalDateTime.now();
}
@Override
public String toString() {
return "Payment Receipt:\nTicket #" + ticket.getTicketId() + "\nAmount Paid: $" +
String.format("%.2f", amount)
+ "\nPayment Time: " + paymentTime;
}
}
