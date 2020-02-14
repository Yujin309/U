package 배열;

public class 원시자료형2차원Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] datas1 = new int[2][];
		int[][] datas2 = new int[2][3];// 행2개 (아파트층2개) 각각의 행이 3개씩 잡혀있음-
		// int [] [] datas3=new int [3] ;//오류 발생: 안에 몇갠지 중요하지 않음
		int[][] datas4 = {};
		// int [] [] datas5= { 4,5,1,2 };//에러 발생: 데이터 3와 같은 이유 인식을 못하는 것 {} 안에 데이터가없으니
		// 행과 열로 만들고 끝
		int[][] datas6 = { { 4, 9, 1, 2, } };// 몇개할지만 들어가면됨 하지만 data5는 한 열이 있는데 (열이1개) 행이 존재하지 않아서
		int[][] datas7 = { { 4, 9, 1, 2 }, { 8, 7 } }; // 행은 한개 열도 한개 로 인식

		// 데이타1의 행의 길이는? 2개
		System.out.println(datas1.length);// 1은 4바이트 임. int형 이니까
		/**
		 * 메소드+ 랭스의 공간,+ 행 열 까지 필요하다. int[12][]라고 하면 12층의 아파트 (행) 아직 각각 층에 대한 값은 없음
		 */

		// 데이타2의 각행의 사이즈는? 열이 몇개인지: 열 2
		System.out.println(datas2.length);
		for (int rowIndex = 0; rowIndex < datas2.length; rowIndex++)
			System.out.println("datas2[" + rowIndex + "]행이 가지고있는 열의수 " + datas2[rowIndex].length);
		// 데이타4의 행의 길이는?

		System.out.println("datas4.length===>" + datas4.length);

		// 데이타6의 행의 길이와 각 행의 열의 길이 ?
		for (int rowIndex = 0; rowIndex < datas6.length; rowIndex++)
			System.out.println("datas6[" + rowIndex + "]행이 가지고있는 열의수 " + datas6[rowIndex].length);

		// 데이터6의 데이터 출력해보기
		for (int r = 0; r < datas6.length; r++) {
			for (int c = 0; c < datas7[r].length; c++) {
				System.out.println("datas6[" + r + "]" + c + datas6.length);
			}
		}
		// 데이터7 설정
		for (int r = 0; r < datas6.length; r++) {
			for (int c = 0; c < datas7[r].length; c++) {
				System.out.println("datas7[" + r + "][" + c + datas7[r][c]);
			}
		}
		// datas4 = new int{ {} {} {} };
		System.out.println("datas4.length===>" + datas4.length);
		for (int r = 0; r < datas4.length; r++) {
			System.out.println("datas4[" + r + "]행이 가지고있는 열의 수 길인" + datas4[r].length);
		}
		/**
		 * 7 8 9 3행 3열 4 5 6 1 2 3
		 */
		int[][] datas9 = { { 7, 8, 9 }, { 4, 5, 6 }, { 1, 2, 3 } };
		for (int k = 0; k < datas9.length; k++) {
			System.out.println();
			for (int j = 0; j < datas9.length; j++) {
				System.out.print(datas9[k][j]);
			}
		}

	}

}
