package �迭;

public class �����ڷ���2����Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] datas1 = new int[2][];
		int[][] datas2 = new int[2][3];// ��2�� (����Ʈ��2��) ������ ���� 3���� ��������-
		// int [] [] datas3=new int [3] ;//���� �߻�: �ȿ� ��� �߿����� ����
		int[][] datas4 = {};
		// int [] [] datas5= { 4,5,1,2 };//���� �߻�: ������ 3�� ���� ���� �ν��� ���ϴ� �� {} �ȿ� �����Ͱ�������
		// ��� ���� ����� ��
		int[][] datas6 = { { 4, 9, 1, 2, } };// ������� ����� ������ data5�� �� ���� �ִµ� (����1��) ���� �������� �ʾƼ�
		int[][] datas7 = { { 4, 9, 1, 2 }, { 8, 7 } }; // ���� �Ѱ� ���� �Ѱ� �� �ν�

		// ����Ÿ1�� ���� ���̴�? 2��
		System.out.println(datas1.length);// 1�� 4����Ʈ ��. int�� �̴ϱ�
		/**
		 * �޼ҵ�+ ������ ����,+ �� �� ���� �ʿ��ϴ�. int[12][]��� �ϸ� 12���� ����Ʈ (��) ���� ���� ���� ���� ���� ����
		 */

		// ����Ÿ2�� ������ �������? ���� �����: �� 2
		System.out.println(datas2.length);
		for (int rowIndex = 0; rowIndex < datas2.length; rowIndex++)
			System.out.println("datas2[" + rowIndex + "]���� �������ִ� ���Ǽ� " + datas2[rowIndex].length);
		// ����Ÿ4�� ���� ���̴�?

		System.out.println("datas4.length===>" + datas4.length);

		// ����Ÿ6�� ���� ���̿� �� ���� ���� ���� ?
		for (int rowIndex = 0; rowIndex < datas6.length; rowIndex++)
			System.out.println("datas6[" + rowIndex + "]���� �������ִ� ���Ǽ� " + datas6[rowIndex].length);

		// ������6�� ������ ����غ���
		for (int r = 0; r < datas6.length; r++) {
			for (int c = 0; c < datas7[r].length; c++) {
				System.out.println("datas6[" + r + "]" + c + datas6.length);
			}
		}
		// ������7 ����
		for (int r = 0; r < datas6.length; r++) {
			for (int c = 0; c < datas7[r].length; c++) {
				System.out.println("datas7[" + r + "][" + c + datas7[r][c]);
			}
		}
		// datas4 = new int{ {} {} {} };
		System.out.println("datas4.length===>" + datas4.length);
		for (int r = 0; r < datas4.length; r++) {
			System.out.println("datas4[" + r + "]���� �������ִ� ���� �� ����" + datas4[r].length);
		}
		/**
		 * 7 8 9 3�� 3�� 4 5 6 1 2 3
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
