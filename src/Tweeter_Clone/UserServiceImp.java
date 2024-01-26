package Tweeter_Clone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserServiceImp implements IUserProcess {
	
	String loginUser=null;
	HashSet<String> userNameList=new HashSet<>();
	List<Tweet> tweetList=new ArrayList<>();
	List<Comment> commentList=new ArrayList<>();
	List<Address> addresList = new ArrayList<>();
	List<Profile> profileList = new ArrayList<>();
	List<Message> messageList = new ArrayList<>();
	List<Followers> followersList = new ArrayList<>();
		
	@Override
	public void register() {
		
		String userName=Util.getStringValue("Kullanıcı adınızı oluşturunuz:");
		
		if(userNameList.contains(userName)) {
			System.out.println("Girdiğiniz kullanıcı adı kullanılıyor. Lütfen başka bir kullanıcı adı deneyiniz. ");
			return;
		}else 
			System.out.println("Kullanıcı adınız oluşturulmuştur.");
		
		String password="";
		boolean b1=true;
		while(b1) {
			password=Util.getStringValue("Şifrenizi oluşturunuz:");
			String rePassword=Util.getStringValue("Şifrenizi tekrar giriniz:");
		
			if(password.equals(rePassword)) {
				System.out.println("Şifreniz oluşturulmuştur.");
				b1=false;
			}else {
				System.out.println("Girdiğiniz şifreler uyuşmuyor. Lütfen tekrar deneyiniz.");
			}
		}
		
		String phone="";
		boolean b2=true;
		while(b2) {
			phone=Util.getStringValue("Başında 0 olmadan telefon numaranızı giriniz:");
				if(phone.length()!=10) {
					System.out.println("Telefon numaranız 10 haneli değildir yanlış girdiniz. Lütfen tekrar deneyiniz.");
				}else
					b2=false;
		}
		
		userNameList.add(userName);
		User user=new User(userName, password, phone);
		Main.admin.getUserList().add(user);
		
		String photo=null;
		String city = Util.getStringValue("Bulunduğunuz şehiri giriniz");
		String country = Util.getStringValue("Ülke adını giriniz");
		String street = Util.getStringValue("Sokak adını giriniz");
		String postalCode = Util.getStringValue("Posta numarasını giriniz");
		Address address = new Address(city, country, street, postalCode, loginUser);
		address.setUserName(userName);
		addresList.add(address);
		
		profileList.add(new Profile(photo + ".png", loginUser + " user's bio", address, userName));
			
		System.out.println("Kaydınız başarıyla oluşturulmuştur. Twitter'a hoşgeldin." + userName);
	}

	@Override
	public void login() {
		
		String userName=Util.getStringValue("Kullanıcı adınızı giriniz:");
		String password=Util.getStringValue("Şifrenizi giriniz:");
		
		for (User user : Main.admin.getUserList()) {
			boolean b=true;
			while(b) {
				if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
	            System.out.println("Giriş başarılı. Hoş geldiniz, " + userName + "!");
	            loginUser=userName;
	            	b=false;
				}else {
					System.out.println("Kullanıcı adı veya şifre hatalı. Lütfen tekrar deneyiniz.");
					userName=Util.getStringValue("Kullanıcı adınızı giriniz:");
					password = Util.getStringValue("Şifrenizi giriniz:");
				}
			}
	    }	
	}

	@Override
	public void tweeting() {
		
		String tweet=Util.getStringValue("Girmek istediğiniz tweeti yazınız.");
		Tweet tweetObject=new Tweet(loginUser, LocalDateTime.now(), tweet, 0, 0, EHashTag.ATATURK);
		tweetList.add(tweetObject);
	}

	@Override
	public void commentTweet() {
		System.out.println(tweetList);
		String tweetID=Util.getStringValue("Yorum atmak istediğiniz tweetin ID'sini giriniz.");
		
		Optional<Tweet> tweetsOptional = tweetList.stream().filter(tweet -> tweet.getId().equals(tweetID)).findFirst();
		if(tweetsOptional.isPresent()) {
			System.out.println(tweetsOptional);
			String comment=Util.getStringValue("Tweete atmak istediğiniz yorumu yazınız.");
			Comment commentObject=new Comment(comment, LocalDateTime.now(), 0, tweetID);
			commentList.add(commentObject);
		}
		if(tweetsOptional.isEmpty()) {
			System.out.println("Tweet bulunamadı.");
		}
	}

	@Override
	public void deleteTweet() {
		
		System.out.println(tweetList.stream().filter(p -> p.getOwner().equals(loginUser)).toList());
		String deleteTweet = Util.getStringValue("Silmek istediğiniz tweetin ID'sini giriniz:");

		Iterator<Tweet> iterator = tweetList.iterator();
		while (iterator.hasNext()) {
			Tweet tweet = iterator.next();
			if (tweet.getId().equals(deleteTweet)) {
				iterator.remove();
				System.out.println("Tweet silinmiştir.");
			}
		}
	}
	
	@Override
	public void listTweets() {
		System.out.println(tweetList);
	}
	
	@Override
	public void sendMessage() {
		String receiverUserName = Util.getStringValue("Mesaj göndermek istediğiniz kullanıcının adını giriniz:");
		String text = Util.getStringValue("Mesajınızı giriniz:");
		Message message = new Message(loginUser, receiverUserName, text);
		messageList.add(message);
	}

	@Override
	public void checkMessage() {
		List<Message> myMessageList = messageList.stream().filter(p -> p.getMessageReceiver().equals(loginUser))
				.collect(Collectors.toList());
		System.out.println(myMessageList);

		for (Message mymessage : messageList) {
			mymessage.getMessageReceiver().equals(loginUser);
			myMessageList.add(mymessage);
		}
	}

	@Override
	public void viewProfile() {
		Long tweetCount = tweetList.stream().filter(p -> p.getOwner().equals(loginUser)).count();
		Address userAddress = addresList.stream().filter(p -> p.getUserName().equals(loginUser)).findFirst().orElseThrow();
		Profile ourProfile = profileList.stream().filter(p -> p.getUserName().equals(loginUser)).findFirst().orElseThrow();
		List<Message> myMessages = messageList.stream().filter(p -> p.getMessageReceiver().equals(loginUser) | p.getMessageSender().equals(loginUser)).toList();
		List<Tweet> myTweets = tweetList.stream().filter(p -> p.getOwner().equals(loginUser)).toList();
		long followersCount = followersList.stream().filter(p -> p.getFollowedUsername().equals(loginUser)).count();
		long followingCount = followersList.stream().filter(p -> p.getFollowingUsername().equals(loginUser)).count();
		ourProfile.setAddress(userAddress);
		ourProfile.setTweetCount(tweetCount);
		ourProfile.setFollowers(Integer.valueOf((int) followersCount));
		ourProfile.setFollowing(Integer.valueOf((int) followingCount));
		ourProfile.setMessage(myMessages);
		ourProfile.setTweets(myTweets);
		System.out.println(ourProfile);
	}

	
	@Override
	public void blockUser() {
	}

}
