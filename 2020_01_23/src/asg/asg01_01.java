package asg;

public class asg01_01 {
/*1 ����, ����, ���� ����  0~100 
   ����, ���
   ���    	 A 90 ~ 100  
	 B 80 ~ 90
	 C 70 ~ 80
	 D 60 ~ 70
	 F 0 ~ 60
	 * 0 ~ 100 �ƴ� �� 

  �̸�    ����  ���� ���� ����  ���    ��� 
 �̸���   90  100   90  280 93.33   A
 1-1) if 
 */
	public static void main(String[] args) {
		int korean = 90;
		int english = 100;
		int math = 90;
		String name = "�踻��";
		
		int sum = korean+english+math;
		double average = sum/3.0;
		char grade = ' ';
				
		if(average>=90) {
			grade ='A';
		}
		else if(average>=80) {
			grade ='B';
		}
		else if(average>=70) {
			grade ='C';
		}
		else if(average>=60) {
			grade ='D';
		}
		else if(average>0) {
			grade ='F';
		}
		else {
			grade =' ' ;
		}
	
		System.out.print("�̸�: "+name+", ����: "+korean+", ����: "+english+ 
				", ����: "+sum+", ���: "+average+", ���: "+grade);

		//sum�� �Ҽ��� ���ڸ�������?
	} //main
		

} //class
