package use;
import oop.ReportCard;
public class ReportCardUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//���α׷��� ���۰� ���� ����Ѵ� main 
		ReportCard firstStudent;
		firstStudent=new ReportCard();
		//�ۺ� ����Ʈ ī�尡 ����� 
		//firstStudent. :.�� ���� ���� �۵��� / �޼ҵ带 ������  
		
		firstStudent.inputSubjectScore();
	
		firstStudent.output();

		firstStudent.setKor(90);
		firstStudent.output();
		
	}

}
