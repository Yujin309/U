package asg;
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
1-2) switch ~ case  
*/
public class asg01_02 {

	public static void main(String[] args) {
		int korean = 90;
		int english = 100;
		int math = 90;
		String name = "�踻��";
		
		int sum = korean+english+math;
		double average = sum/3.0;
		char grade = ' ';
	
		
		switch((int)average/10) {
		case 9 : 
			grade ='A';
			break;
		case 8 : 
			grade ='B';
			break;
		case 7 : 
			grade ='C';
			break;
		case 6 : 
			grade ='D';
			break;
		default : 
			grade ='F';
			
		}
		System.out.println("�̸�       ����   ����    ����      ����           ���        ��� ");
		System.out.println("������   "+korean+"  "+english+"  "+math +"  "+ sum+ "   "+ average +"    " + grade);
	
		
	}

}
