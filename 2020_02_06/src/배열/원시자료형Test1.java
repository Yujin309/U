package �迭;

public class �����ڷ���Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size=5;
	//	System.out.println(0+':');
		int [] datas= new int [size]; //5��° 

		for(int i=0; i< size; i++) {
			System.out.println(i+":"+ datas[i]);
	//������ 5�� ��������, 
		}
		int k= 89;
	//k. �Ұ� ����Ÿ���� �����ϴ°� �ν��Ͻ���°�, �̰��� �����ϴ°��� ��ü�� �ִ�. 
	System.out.println(datas.length);//�迭�� ���� .�� ����ؼ� ������ ��ü �ڷ���.��ü�� ����� ȣ��
	System.out.println(datas.toString());
	System.out.println(datas.getClass().getName());
	
	}
	

}
