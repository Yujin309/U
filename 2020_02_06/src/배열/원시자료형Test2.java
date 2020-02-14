package 배열;

public class 원시자료형Test2 {

	public static void main(String[] args) {

		int size = 5;

		int[] datas = new int[size];
		int da;

		for (int i = 0; i < size; i++) {
			da = datas[i];// 자바다 부담스러워함. 배열에 대해
			System.out.println(i + ":" + datas[i] + ":" + da);
		} // 인덱스 번호가 쓰일때 사용.

		for (int data : datas) {
			// for(구성하고 있는 데이터 타입 :배열명, 배열을 참고하고 있는 변수명 ) {
			System.out.println(data);// d인덱스 번호가 필요 없을때
		}

	}
}
