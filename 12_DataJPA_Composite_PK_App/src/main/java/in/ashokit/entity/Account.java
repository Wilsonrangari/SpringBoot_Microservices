package in.ashokit.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Account {
	
	private String holderName;
	
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPk;
	

}
