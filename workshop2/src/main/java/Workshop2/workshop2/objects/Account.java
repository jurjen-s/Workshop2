package Workshop2.workshop2.objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")

public class Account {
	
	@Id @GeneratedValue
	int Id;
	String userName;
	String password;
	@Embedded
	UserRole userRole;
	
	
	public Account() {
		this(null,null,null);
	}

	public Account(String userName, String password, UserRole userRole) {
		this.userName = userName;
		this.password = password;
		this.userRole = userRole;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRole getUserRole() {
		return userRole;
	}
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}
