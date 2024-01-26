package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.List;

public class Profile {

	private Long tweetCount;
	private String userName;
	private String photo;
	private String bio;
	private LocalDateTime registrationDate;
	private Address address;
	private Integer followers;
	private Integer following;
	private List<Tweet> tweets;
	private List<Message> message;
	
	public Profile(String photo, String bio, Address address, String userName) {
		super();
		this.tweetCount = Long.valueOf(0);
		this.photo = photo;
		this.bio = bio;
		this.registrationDate = LocalDateTime.now();
		this.address = address;
		this.followers = Integer.valueOf(0);
		this.following = Integer.valueOf(0);
		this.userName = userName;
	}

	public Long getTweetCount() {
		return tweetCount;
	}

	public void setTweetCount(Long tweetCount) {
		this.tweetCount = tweetCount;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Integer getFollowers() {
		return followers;
	}

	public void setFollowers(Integer followers) {
		this.followers = followers;
	}

	public Integer getFollowing() {
		return following;
	}

	public void setFollowing(Integer following) {
		this.following = following;
	}

	public List<Tweet> getTweets() {
		return tweets;
	}

	public void setTweets(List<Tweet> tweets) {
		this.tweets = tweets;
	}

	public List<Message> getMessage() {
		return message;
	}

	public void setMessage(List<Message> message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Profile [tweetCount=" + tweetCount + ", userName=" + userName + ", photo=" + photo + ", bio=" + bio + ", registrationDate=" + registrationDate 
				+ ", address=" + address + ", followers=" + followers + ", following=" + following + ", tweets=" + tweets + ", message=" + message + "]";
	}
	
}
