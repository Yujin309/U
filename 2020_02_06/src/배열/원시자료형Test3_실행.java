package 배열;

public class 원시자료형Test3_실행 {

	public static void main(String[] args) {

		int size = 5;
		int[] datas = new int[size];

		datas[2] = 9;
		int[] kors = {};
		System.out.println(kors.length);
		int[] maths;
		// System.out.println(maths.length);//아무것도 참조하지 않아서 잡을수 없다.
		int engs[] = null;
		System.out.println(engs.length);

	}
}
