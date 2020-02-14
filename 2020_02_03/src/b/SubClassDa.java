package b;

public class SubClassDa extends SuperClassDa{
	private String name="기본값";
	
	private int age=10;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void output() {
		System.out.println("나이:"+age);
		System.out.println("기초의 age:"+super.getAge());
		//getAge로 썼지만, 부모 클래스이기 때문에 가져오지 못함. 기초클래스가 가진 age를 
		//가져와야함. 그래서 아웃풋을 호출한 인스턴스가 서브클래스 인스턴스이다. 그래서 서브클래스의 것을 가져올수있다. 
		
		System.out.println("주소:"+ getAddr());
		System.out.println("성별:"+gender);
		//addr이 private하기 때문이다. 
		//자식클래스에서도 접근하지 못하게 하려면 private
		//protect하게 아니면 getter setter로 접근, 
	}

//서브 클래스 임 

}
