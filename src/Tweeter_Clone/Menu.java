package Tweeter_Clone;

public class Menu {

	UserServiceImp dBUser = new UserServiceImp();

	void tweetMenu() {
		while (true) {
			System.out.println("1- Tweet at"+"\n2- Yorum yap"+"\n3- Tweet sil"+"\n4- Tweetlerimi göster"+"\n5- Mesaj gönder"+"\n6- Mesajları kontrol et"+"\n7- Profil görüntüle"+"\n8- Kullanıcı engelle"+"\n0- Sistemi Kapat");
			
			int secim = Util.getIntegerValue("Yapmak istediğiniz işlemi seçiniz.");

			switch (secim) {
			case 1:
				dBUser.tweeting();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 2:
				dBUser.commentTweet();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 3:
				dBUser.deleteTweet();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 4:
				dBUser.listTweets();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 5:
				dBUser.sendMessage();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 6:
				dBUser.checkMessage();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 7:
				dBUser.viewProfile();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 8:
				dBUser.blockUser();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

	void userMenu() {
		while (true) {
			System.out.println("1- Kaydol"+"\n2- Giriş Yap"+"\n0- Sistemi Kapat");

			int secim = Util.getIntegerValue("Yapmak istediğiniz işlemi seçiniz.");

			switch (secim) {
			case 1:
				dBUser.register();
				Util.anaMenu("Ana menüye dönmek için Enter'a basınız.");
				break;
			case 2:
				dBUser.login();
				tweetMenu();
				break;
			case 0:
				System.out.println("Sistem kapandı");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}

}
