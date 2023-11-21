package in.ashokit.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.ashokit.binding.Country;

@Configuration
public class RedisConfiguration {
	
	
	@Bean
	public JedisConnectionFactory jedisConn() {
		
		JedisConnectionFactory jedis= new JedisConnectionFactory();
		
		//set redis server properties here as we are running app in same machine
		return jedis;
		
	}
	
	@Bean
	public RedisTemplate<String, Country> redisTemplate(){
		
		RedisTemplate<String, Country>  rt = new RedisTemplate<>();
		
		rt.setConnectionFactory(jedisConn()); //in the redis template i have injected jedis connection
		
		return rt;
		
		
	}

}
