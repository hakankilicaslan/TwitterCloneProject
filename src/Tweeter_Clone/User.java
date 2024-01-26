package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {

	private String userName;
	private String password;
	private String phone;
	private Profile profile;
	private String id;
	private LocalDateTime createDateTime;
		
	public User() {
		super();
	}

	public User(String userName, String password, String phone) {
		super();
		this.userName = userName;
		this.password = password;
		this.phone = phone;
		this.createDateTime = LocalDateTime.now();	
		this.id=UUID.randomUUID().toString();
	}

	public String getId() {
		return id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	
	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", phone=" + phone + ", profile=" + profile + ", createDateTime=" + createDateTime + "]";
	}
	
}
