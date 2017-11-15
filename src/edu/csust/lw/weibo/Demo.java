package edu.csust.lw.weibo;

import java.util.ArrayList;
import java.util.Arrays;


public class Demo {

	public static void main(String[] args) {
		
		//集合类（标准库封装好的类）
		//长度自动增长的数组
		//<>元素的类型,只能是引用类型，不能是基本类型
		
		ArrayList<User> list=new ArrayList<>();
		User u2=new User("ADS");
		list.add(u2);
		list.add(u2);
		list.add(u2);
		list.add(u2);
		list.add(new User("BON"));
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
//		ArrayList<Integer> list=new ArrayList<>();
//		list.add(2);
//		list.add(12);
//		list.add(8);
//		list.add(12);
//		System.out.println(list.size());
//		System.out.println(list);
//		list.remove(1);
//		System.out.println(list.size());
//		System.out.println(list);
		
		//数组的大小固定
		//GC 垃圾回收
		User[] users=new User[9];
//		User[] followers=null;//=new User[0];
//		System.out.println(followers);
		User u1=new User("Alice");
		users[0]=u1;
		users[1]=u1;
		users[8]=new User("Bob");
		//扩展数组
		User[] t=new User[13];
		for (int i = 0; i < users.length; i++) {
			t[i]=users[i];
		}
		users=t;
		
		users[9]=new User("rose");
		System.out.println(Arrays.toString(users));
	}
}
