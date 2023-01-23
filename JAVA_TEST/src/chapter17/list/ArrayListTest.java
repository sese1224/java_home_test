package chapter17.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static <E> void main(String[] args) {
		
		List<String> list = new  ArrayList<String>();
		
		list.add("자바");
		list.add("오라클");
		list.add("서블릿");
		list.add(2,"스프링");
		list.add("파이썬");
		
		int size = list.size();
		System.out.println("총 객체수:"+size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2번방:"+skill);
		System.out.println();
		
		for(int i =0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
		
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("파이썬");
		
		 
		for(int i =0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
