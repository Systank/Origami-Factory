package la.factory.origami.factory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue
	private Long id; 
	@Column(name="username")
	@NotEmpty(message = "Le nom username est obligatoire")
	private String username; 
	@Column(name="password")
	@NotEmpty(message = "Le mot de passe est obligatoire")
	private String password;
	
	
	public Admin() {
		super();
	}


	public Admin( String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
