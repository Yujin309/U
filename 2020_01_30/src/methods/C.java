package methods;
//call by reference
public class C {

	
	public void method1(StringBuffer sb) { 
		System.out.println(sb);
		sb.replace(2, 3, "!#");
		
		/**start and extends to the characterat index end - 1 �̴� 3�̶�� ���� 2���� �ٲ�
		 * attend: �ǳ��� �־��/ insert: �߰��� ���� ������ �ִ�./���ڿ��� �ٲٰ� ������ : replace.
		 */
	}
}
