package in.ashokit.service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;


public interface BookingService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer ticketNumber);

}
