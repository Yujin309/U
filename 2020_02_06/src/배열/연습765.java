package �迭;

public class ����765 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 7;
		int[] datas[] = new int[3][2];
		int datasLengh = datas.length;
		for (int r = 0; r < datasLengh; r++) {
			for (int c = 0; c < datas[r].length; c++) {
				datas[r][c] = s + c;
			}
			// ������ ������
			s -= datas[r].length;
		}
		for (int r = 0; r < datasLengh; r++) {
			for (int c = 0; c < datas[r].length; c++) {
				System.out.print(datas[r][c] + "");
				System.out.println();

			}
			System.out.println(datas[2][1]);
		}
	}
}
