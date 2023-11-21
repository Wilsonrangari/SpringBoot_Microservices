package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Order;
import in.ashokit.constants.AppConstants;

@Service
public class OrderService {
	
	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;

	public String addMsg(Order order) {

		// publish msg to kafka topic
		kafkaTemplate.send(AppConstants.TOPIC_NAME, order); //key-TOPIC_NAME and value- Order

		return "Msg Published To Kafka Topic";
	}

}
