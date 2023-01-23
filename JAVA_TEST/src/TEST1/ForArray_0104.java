package TEST1;

public class ForArray_0104 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0;
		int total = 0;
		int count = 0;
		int alltotal = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];// 각행의합
				count++;// 각행의 데이터수가 누적되어 전체 데이터수를 받아올수있음
			}
			avg = total / (double) (array[i].length);
			System.out.println("총합:" + total);
			System.out.println("평균" + avg);
			System.out.println("---------------------");
			// 쓰레기값 초기화//밖이 for문으로 감싸져 있어서 다음 배열로 넘어가기 위한 초기화 초기화가 안돼면 값이 쌓여있다. 
			alltotal += total;
			total = 0;
			avg = 0;
		}

	}

}
