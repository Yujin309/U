package staticTest;

public class Test3 {
static private double rate=3.7;  //클래스 변수 
private String name; //인스턴스 변수

public void method() {  //인스턴스가 만들어여지 호출되는 것
	System.out.println(rate+ " " +name);
	}
//nonStatic에서는 static한 멤버를 사용할수있다. 

static public void method2() {  //클래스에 의해 호출되어지는 변수임
	//System.out.println(rate+ " " +name);
/**System.out.println(rate+ " " +name);
 * 에러가 나오는 이유: 스테틱한 메소드에서는 nonStatic한 변수를 사용할수 없다. 
 */
}

}
