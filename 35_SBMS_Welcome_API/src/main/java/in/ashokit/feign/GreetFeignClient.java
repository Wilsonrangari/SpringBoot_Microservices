package in.ashokit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="GREET-API") // jo nam eureka server me dikht ahai vo
public interface GreetFeignClient {
	
	@GetMapping("/greet")
	public String invokeGreetApi();

}
