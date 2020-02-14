package 배열;

public class 원시자료형Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size=5;
	//	System.out.println(0+':');
		int [] datas= new int [size]; //5번째 

		for(int i=0; i< size; i++) {
			System.out.println(i+":"+ datas[i]);
	//랭스에 5가 잡혀있음, 
		}
		int k= 89;
	//k. 불가 데이타스가 참조하는게 인스턴스라는것, 이것이 참조하는곳에 객체가 있다. 
	System.out.println(datas.length);//배열의 길이 .을 사용해서 왼쪽은 객체 자료형.객체의 멤버들 호출
	System.out.println(datas.toString());
	System.out.println(datas.getClass().getName());
	
	}
	

}
