package chapter17.list;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
	
		
		int iArray[] = {50,40,30,20,10};
		String sArray [] = new String[5];
		//Array 클래스는 항목 정렬, 항목검색, 항목비교에 관한 메서드를 사용하기 위함
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray);
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Good");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City = Arrays.asList("서울","인천","부산","제주","대전");
		for(int i=0;i<City.size();i++) {
			System.out.println(City.get(i).toString());
		}
	}

}
