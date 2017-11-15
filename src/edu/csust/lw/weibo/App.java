package edu.csust.lw.weibo;

public class App {

	public static void main(String[] args) {
		
		User user1 = new User("Alice");
		User user2 = new User("Bob");
		User user3 = new User("Crian");
		User user4 = new User("Dak");
		User user5 = new User("Elo");
		
		user1.addFollowing(user2);
		user1.addFollowing(user4);
		user3.addFollowing(user2);
		user4.addFollowing(user2);
		user5.addFollowing(user2);
		user2.addFollowing(user1);
//		user1.removeFollowing(user2);
		
		user1.showInfo();
		user2.showInfo();
		user3.showInfo();
		user4.showInfo();
		user5.showInfo();
	}
}
