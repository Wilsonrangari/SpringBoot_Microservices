package in.ashokit.service;

import org.springframework.stereotype.Service;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;


@Service
public interface MakeMyTripService {
	
	public Ticket bookTicket(Passenger passenger );
	
	public Ticket getTicketByNum(Integer ticketNumber);
}
