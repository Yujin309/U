package loop;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1~10까지 for문과 while문
		int a =1;
		for(  ; a<=10; a++ ) {
			System.out.print(a+"");
			
		}
		System.out.println("\n for 종료 후 a:"+a);//a가 에러인 이유는 for문 벗어나서 사용 불가 
		//while은 사용 가능  규칙적인것은for문 불규칙적인것은 whlie문
		System.out.println("/////");
		int b=1;
		while(b <=10) {
		System.out.print(b +" ");//b가 계속 무한 반복일것 
		b++;
		
		
	}
		System.out.println("while 종료 후 b:"+b);
		
	}
}
