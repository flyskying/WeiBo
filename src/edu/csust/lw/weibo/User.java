package edu.csust.lw.weibo;

import java.util.ArrayList;

/**
 * 
 * @author lwiii
 *
 */
public class User {
	/**
	 * 用户名
	 */
	private String name;
	/**
	 * 状态
	 */
	private ArrayList<Message> messages = new ArrayList<>();
	/**
	 * 关注
	 */
	private ArrayList<User> following = new ArrayList<>();
	/**
	 * 粉丝
	 */
	private ArrayList<User> followers = new ArrayList<>();

	/**
	 * 构造方法
	 * 
	 * @param name
	 *            用户名
	 */
	public User(String name) {
		this.name = name;
	}

	public ArrayList<Message> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	public ArrayList<User> getFollowing() {
		return following;
	}

	public void setFollowing(ArrayList<User> following) {
		this.following = following;
	}

	public ArrayList<User> getFollowers() {
		return followers;
	}

	public void setFollowers(ArrayList<User> followers) {
		this.followers = followers;
	}

	public String getName() {
		return name;
	}

	// 方法的重写（子类覆盖父类中的同名方法）
	@Override
	public String toString() {
		return "[name=" + name + "]";
	}

	/**
	 * 关注一个用户
	 * 
	 * @param user
	 *            被关注对象
	 */
	public void addFollowing(User user) {
		// 你关注参数对象
		following.add(user);
		// 你成了参数对象的粉丝
		user.followers.add(this);
	}

	/**
	 * 取消关注
	 * 
	 * @param user
	 */
	public void removeFollowing(User user) {
		following.remove(user);
		user.followers.remove(this);
	}

	/**
	 * 获得关注的人数
	 * 
	 * @return
	 */
	public int getFollowingSize() {
		return following.size();
	}

	/**
	 * 粉丝人数
	 * 
	 * @return
	 */
	public int getFollowerSize() {
		return followers.size();
	}

	/**
	 * 显示用户信息
	 */
	public void showInfo() {
		System.out.println(name);
		System.out.println("---------------------------");
		System.out.printf("关注%d\t%s\n", following.size(), following);
		System.out.printf("粉丝%d\t%s\n", followers.size(), followers);
		System.out.println("---------------------------");
	}
}
