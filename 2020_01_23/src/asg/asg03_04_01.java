package asg;

public class asg03_04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A char
		// ABCDEF
		// 123456 개행
		// G ~~~
		// 1    6 개행
		// YZ
		// 12
		int count = 0;
		for(char alpha ='A'; alpha <= 'z' ; alpha++) {
			System.out.print(alpha);
			count++;
			if(count == 6)  {//6의 배수로 개행? -> if(count%6==0) System.out.println(); 
				//18,19행 줄이기 : if(++count ==6)
				System.out.println();
				count= 0; 
			}//%6으로 개행하면 이 문장은 없어도 됨.
			if(alpha =='Z'){
				count=0;
				System.out.println();
				alpha='a'-1;
			}
			
			//for문 벗어나 쓸건지, 안에서만 쓸건지 결정. 
			//안에서 쓸 때 : count = 0 삽입   == int a,b;
		}
	}

}
