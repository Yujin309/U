package a;
public class Test3 {
static private int max;
static public final int MIN=13;
static private final int FIRST; 
//static은 생성자 나오기 전에 자리를 잡아주는것이다. 
private final double rate;
static {

	System.out.println("Static 블럭");
FIRST=MIN/3;
//s한 멤버를 초기화 하고 싶다= 생성자에서 불가능, 
}
//바로 생성자에서 값이 나옴=> 파이널에 대한 변수만들땐, 생성자 자리에서 연산식에 의해 결과를 넣어줘도 됨. 에러가 안뜸. 

public Test3(){
	max=677;
System.out.println("생성자");
//파이널이나 일반적인 인스턴스변수는 여기서 초기화 시켜준다. 	
	rate=MIN*9.9;
}
//FIRST=1;//final은 생성자에서 하지 말라  
	
	static public void method() {
	System.out.println("Static한 method");
	
	
}
public static void main(String[] args) {//Start
		// TODO Auto-generated method stub
	//System.out.println("main()	method");
max=90;
	}//end

}
