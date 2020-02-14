package staticTest;

public class Test2 {
public static int  staticVariable;
 public       int nonStaticVariable;
 /** 
  * 1.은 static 하게 
  * 2.는 nonstatic
  */
public void output() {
	System.out.println(staticVariable + " "+ nonStaticVariable);
	/** staticVariable (4바이트) 만들어준다.(공통된 데이터 )  
	 * 인스턴스가 만들어 진 후  그 다음것들 실행 가능 
	 * 그다음  Ref라는 것이 만들어짐=> 이것이 참조할 것은, 영역이 잡히고 나서 Test2 타입으로 가서 
	 * nonStatic mathod (output) 등이 생성자로 , nonStaticVariable이 된다.
	 * StaticVariable은 test2의 것. 그리고 Ref가 생성됨 -> 참조하려 할때 nonStaticVariable가 들어가고 
	 * 생성자 output의 주소가 들어가짐/ 
	 * static한것은 메모리상에 인스턴스 하기 전에 먼저 선점됨. 
	 *  인스턴스가 만들어져야지 nonstatic이 만들어긴다.
	 *  멤버들 끼리위치 상관 없음, 멤버 변수들의 공간 할당해 주고 -> 어느 메소드가 있는지, 시작주소가 어딘지 메소드 블럭
	 *  호출 안했는데 잡혀있는것 => static한 것. 
	 *  static한 멤버 변수는 통장에서의 이자 이율과 같은것이다. 이율은 staticVariable
	 *  주민번호 같은건 nonstatic 으로 만들어줌 
	 *  main method는  
	 */
}
}
