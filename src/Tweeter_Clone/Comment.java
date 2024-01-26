package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Comment {

	private String content;
	private LocalDateTime commentTime;
	private int likeCount;
	private List<User> likers;
	private String tweetId;
	private String id;
	
	public Comment(String content, LocalDateTime commentTime, int likeCount, String tweetId) {
		super();
		this.content = content;
		this.commentTime = commentTime;
		this.likeCount = likeCount;
		this.tweetId=tweetId;
		this.id=UUID.randomUUID().toString();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCommentTime() {
		return commentTime;
	}

	public void setCommentTime(LocalDateTime commentTime) {
		this.commentTime = commentTime;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public List<User> getLikers() {
		return likers;
	}

	public void setLikers(List<User> likers) {
		this.likers = likers;
	}

	public String getTweetId() {
		return tweetId;
	}

	public void setTweetId(String tweetId) {
		this.tweetId = tweetId;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Comment [content=" + content + ", commentTime=" + commentTime + ", likeCount=" + likeCount + ", likers=" + likers + "]";
	}
		
}
