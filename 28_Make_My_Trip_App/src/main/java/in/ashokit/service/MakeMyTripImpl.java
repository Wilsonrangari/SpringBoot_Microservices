package in.ashokit.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.ashokit.request.Passenger;
import in.ashokit.response.Ticket;

@Service
public class MakeMyTripImpl implements MakeMyTripService {

	private String BOOK_TICKET_URL = "http://13.48.138.2:8080/ticket";

	private String GET_TICKET_URL = "http://13.48.138.2:8080/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {

		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> postForEntity = 
				rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);

		Ticket ticket = postForEntity.getBody();

		return ticket;
	}

	@Override
	public Ticket getTicketByNum(Integer ticketNumber) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> forEntity = 
				rt.getForEntity(GET_TICKET_URL, Ticket.class,ticketNumber);
		
		Ticket ticket = forEntity.getBody();

		return ticket;
	}

}
