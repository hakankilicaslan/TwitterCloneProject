package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Tweet {

	private LocalDateTime creationTime;
	private String owner;
	private String content;
	private int likeCount;
	private int commentCount;
	private String id;
	private List<User> likers;
	private List<User> retweeters;
	private EHashTag hashTag;
	
	public Tweet(String owner, LocalDateTime creationTime, String content, int likeCount, int commentCount, EHashTag hashTag) {
		super();
		this.owner=owner;
		this.creationTime = creationTime;
		this.content = content;
		this.likeCount = likeCount;
		this.commentCount = commentCount;
		this.hashTag = hashTag;
		this.id = UUID.randomUUID().toString();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public LocalDateTime getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(LocalDateTime creationTime) {
		this.creationTime = creationTime;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public List<User> getLikers() {
		return likers;
	}

	public void setLikers(List<User> likers) {
		this.likers = likers;
	}

	public List<User> getRetweeters() {
		return retweeters;
	}

	public void setRetweeters(List<User> retweeters) {
		this.retweeters = retweeters;
	}

	public EHashTag getHashTag() {
		return hashTag;
	}

	public void setHashTag(EHashTag hashTag) {
		this.hashTag = hashTag;
	}

	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Tweet [creationTime=" + creationTime + ", owner=" + owner + ", content=" + content + ", likeCount=" + likeCount + ", commentCount=" 
				+ commentCount + ", id=" + id + ", likers=" + likers + ", retweeters=" + retweeters + ", hashTag=" + hashTag + "]";
	}
	
}
