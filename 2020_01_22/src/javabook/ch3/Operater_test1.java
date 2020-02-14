package javabook.ch3;

public class Operater_test1 {
	public static void main(String[] args) {
		System.out.println(4./5.);
		System.out.println(4/(double)5); // 캐스팅 연산자 double 써서 실수로 만들수 있지만, 
		System.out.println(4%5); 

		
		int a=4;
		int b=5;
		System.out.println(a/(double)b); // 변수를 double형화 , b는 그대로 int 
		System.out.println(4/5); //상수를 실수로 만들 때는 .찍는 것이 편하고 빠름
		System.out.println(4>>1);
		System.out.println(4<<1);
		// 비트 논리 
		int cc= 4 & 5;
		System.out.println(cc);
		int dd= 4 | 5;
		System.out.println(dd);
		int ee= 4 ^ 5;
		System.out.println(ee);
		
		System.out.println(80 >= 90);
		//not 연산자 사용시?
		System.out.println("!!!!"+! (80 >= 90));

		
		System.out.println("80" instanceof String ); //"80" 문자열이 String의 instance 인가? 타입 확인 , 원시자료형 X 
		// System.out.println(80 instanceof Integer ); 
		
		
		int Num1 = 30;
		int Num2 = 14;
		System.out.printf("%d\n", Num1++ ); //30 나오는 이유? , () 연산자가 우선순위가 더 높아서 
		System.out.printf("%d\n", --Num1);
		
		int x1=30; long y1=4;
		double z1= x1/y1; 
		//double z1= (double)x1/(double)y1;
		double z2= (double)x1/(double)y1;
		System.out.println(30/4);
		System.out.println("30/4="+z1);  //7.5라고 나오지 않는이유? 정수는 무조건 절삭, double형이라 .0으로 출력
		
		System.out.println("30/4="+z1+","+z2);
		

	}
}
