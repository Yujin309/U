package str;

public class ToStringTest {

	private String name; 
	private int age;
	public ToStringTest() {
		
	}
	public ToStringTest(String name,int age) {
		this.name=name;
				this.age=age;
	}
	@Override
	public String toString() {
		return "ToStringTest [name=" + name + ", age=" + age + "]";
	}
}
