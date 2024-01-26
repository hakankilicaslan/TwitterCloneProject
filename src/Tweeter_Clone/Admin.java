package Tweeter_Clone;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User{

	private List<User> userList=new ArrayList<>();
	private List<Profile> profileList=new ArrayList<>();
	
	public Admin() {
		super();
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<Profile> getProfileList() {
		return profileList;
	}

	public void setProfileList(List<Profile> profileList) {
		this.profileList = profileList;
	}

	@Override
	public String toString() {
		return "Admin [userList=" + userList + ", profileList=" + profileList + "]";
	}
	
}
