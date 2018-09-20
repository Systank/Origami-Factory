package la.factory.origami.factory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue
	private Long id; 
	
	private String username; 
	private String password;
	

}
