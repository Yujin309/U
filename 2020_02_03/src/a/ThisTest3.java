package a;

public class ThisTest3 {
private String name;
private int age;

public ThisTest3() {
	System.out.println("만약에");
	System.out.println("모든 생성자에서 공통으로 처리할 문장을");
	System.out.println("가지고 있다면");
	System.out.println("////////////////////");

	
}

public ThisTest3(String name, int age) {
	this(); 
	//this(name);
	
	this.name = name;
	this.age = age;
//소스-generate using~~으로 생성 가능 

}

public ThisTest3(String name) {
	this();
	this.name = name;
}

public ThisTest3(int age) {
this();

	this.age = age;

}

}
