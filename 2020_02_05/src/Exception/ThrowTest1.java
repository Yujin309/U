package Exception;

public class ThrowTest1 {
	private int a;
	private int b;
	private int c;

	public ThrowTest1(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int calc(int a, int b) throws Exception, ArithmeticException {
		// 런타임 exception unchecked
		if (a == 0) {// 외부에서도 호출해서 처리할수있음!

			throw new Exception("0이 아닌 수를 입력하세요.");
			// exception 던져버리는것 exception checked
		}
		return a / b;
	}

	public void init() {// 메인 메소드에서 사용할것이므로 메인 메소드까지 이셉션 처리해야함.
		try {
			c = calc(a, b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

//호출 문장
	public void output() { // 출력만 할 것.
		System.out.println(a + "/" + b + "=" + c);
	}

}
