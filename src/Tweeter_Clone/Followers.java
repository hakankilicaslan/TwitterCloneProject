package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.UUID;

public class Followers {

	private String id;
	private String followingUsername;
	private String followedUsername;
	private LocalDateTime followeDateTime;
	
	public Followers(String followingUsername, String followedUsername) {
		this.id = UUID.randomUUID().toString();
		this.followingUsername = followingUsername;
		this.followedUsername = followedUsername;
		this.followeDateTime = LocalDateTime.now();
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFollowingUsername() {
		return followingUsername;
	}
	
	public void setFollowingUsername(String followingUsername) {
		this.followingUsername = followingUsername;
	}
	
	public String getFollowedUsername() {
		return followedUsername;
	}
	
	public void setFollowedUsername(String followedUsername) {
		this.followedUsername = followedUsername;
	}
	
	public LocalDateTime getFolloweDateTime() {
		return followeDateTime;
	}
	
	public void setFolloweDateTime(LocalDateTime followeDateTime) {
		this.followeDateTime = followeDateTime;
	}

	@Override
	public String toString() {
		return "Followers [id=" + id + ", followingUsername=" + followingUsername + ", followedUsername=" + followedUsername + ", followeDateTime=" + followeDateTime + "]";
	}	
	
}
