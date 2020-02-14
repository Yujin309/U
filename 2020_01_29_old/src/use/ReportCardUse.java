package use;
import oop.ReportCard;
public class ReportCardUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//프로그램의 시작과 끝을 담당한다 main 
		ReportCard firstStudent;
		firstStudent=new ReportCard();
		//퍼블릭 레포트 카드가 실행됨 
		//firstStudent. :.을 통해 들어가서 작동함 / 메소드를 가지고  
		
		firstStudent.inputSubjectScore();
	
		firstStudent.output();

		firstStudent.setKor(90);
		firstStudent.output();
		
	}

}
