package javabook.ch3;


public class Ch3Ex2 {

public static void main(String[] args) { //args도 변수 main local 
	byte num1 = 'A' ;  // A-> 65 
	System.out.println(num1); 
	num1 = 'B'; //대입됨. byte(-128~127) 범위 내에 속하기 때문에
				//num1=900;
	int alpha ='A';
	System.out.println(alpha);
	System.out.printf("데이터 : %c, %d\n",alpha,alpha);
	alpha = alpha + 10;  //오른쪽부터 읽어야
	char ch =(char)alpha; // int저를 char로 써서 에러, (char) : 명시적 형변환, 강제 형변환 
	char ch2 = 'A'+ 10; // 'A'=문자, 75가 char 범위에 있기때문에 가능
	char ch3;
		ch3='A' +10; //초창기 버전에서는 에러, 문자 + 정수기 때문에 정수형을 int저로 바꿔서 계산하기 때문에 
					 //범위 내에 속하기 때문에 에러x
		
//printf = print format 
	
}
}
