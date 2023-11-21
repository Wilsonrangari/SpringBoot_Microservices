package in.ashokit.rest;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Country;

@RestController
public class CountryRestController {
	
	private HashOperations<String, Integer, Country> opsForHash = null;
	
	
	//we are crating constructor
	@Autowired
	public CountryRestController(RedisTemplate<String, Country> rt) {
		
		this.opsForHash = rt.opsForHash();
		
		
	}
	@PostMapping("/country")
	public String addCountry(@RequestBody Country country) {
		opsForHash.put("COUNTRIES", country.getSno(), country); //here countries is table name0 assume what type of data we are stoaring
		return "Country Added";
	}
	@GetMapping("/countries")
	public Collection<Country> getCountry() {
		Map<Integer, Country> entries = opsForHash.entries("COUNTRIES");
		
		Collection<Country> values = entries.values();
		return values;
	}
	
	


}
