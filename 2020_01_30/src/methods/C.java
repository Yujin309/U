package methods;
//call by reference
public class C {

	
	public void method1(StringBuffer sb) { 
		System.out.println(sb);
		sb.replace(2, 3, "!#");
		
		/**start and extends to the characterat index end - 1 이니 3이라고 쓰면 2번이 바뀜
		 * attend: 맨끝에 넣어라/ insert: 중간에 끼어 넣을수 있다./문자열을 바꾸고 싶으면 : replace.
		 */
	}
}
