package ATS.atquiz.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document
public class User implements Serializable{

	private static final long serialVersionUID = 1827185422867016710L;

	@Id
	private String id;
	
	@Indexed(unique = true)
	private String username;
	
	private String password;
	
	private String role;
	
	private String name;
	
	private String surname;
	
	private String email;
	
	private String DNI;
	
	private boolean nonExpiredAccount;
	
	private boolean nonLocked;
	
	private boolean nonExpiredCredentials;
	
	private boolean enabled;
	
	
}
