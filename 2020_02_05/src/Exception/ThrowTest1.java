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
		// ��Ÿ�� exception unchecked
		if (a == 0) {// �ܺο����� ȣ���ؼ� ó���Ҽ�����!

			throw new Exception("0�� �ƴ� ���� �Է��ϼ���.");
			// exception ���������°� exception checked
		}
		return a / b;
	}

	public void init() {// ���� �޼ҵ忡�� ����Ұ��̹Ƿ� ���� �޼ҵ���� �̼��� ó���ؾ���.
		try {
			c = calc(a, b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

//ȣ�� ����
	public void output() { // ��¸� �� ��.
		System.out.println(a + "/" + b + "=" + c);
	}

}
