package asg;

public class asg03_04_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A char
		// ABCDEF
		// 123456 ����
		// G ~~~
		// 1    6 ����
		// YZ
		// 12
		int count = 0;
		for(char alpha ='A'; alpha <= 'z' ; alpha++) {
			System.out.print(alpha);
			count++;
			if(count == 6)  {//6�� ����� ����? -> if(count%6==0) System.out.println(); 
				//18,19�� ���̱� : if(++count ==6)
				System.out.println();
				count= 0; 
			}//%6���� �����ϸ� �� ������ ��� ��.
			if(alpha =='Z'){
				count=0;
				System.out.println();
				alpha='a'-1;
			}
			
			//for�� ��� ������, �ȿ����� ������ ����. 
			//�ȿ��� �� �� : count = 0 ����   == int a,b;
		}
	}

}
