package �迭;

public class �����ڷ���Test2 {

	public static void main(String[] args) {

		int size = 5;

		int[] datas = new int[size];
		int da;

		for (int i = 0; i < size; i++) {
			da = datas[i];// �ڹٴ� �δ㽺������. �迭�� ����
			System.out.println(i + ":" + datas[i] + ":" + da);
		} // �ε��� ��ȣ�� ���϶� ���.

		for (int data : datas) {
			// for(�����ϰ� �ִ� ������ Ÿ�� :�迭��, �迭�� �����ϰ� �ִ� ������ ) {
			System.out.println(data);// d�ε��� ��ȣ�� �ʿ� ������
		}

	}
}
