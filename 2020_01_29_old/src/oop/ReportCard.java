package oop;

//석차 구하는 메소드 


import java.util.Scanner;

public class ReportCard {

	/** @author bitcamp
	 * 
	 *   //     /*    /** 해석할 필요없음 
	 *   이 목적외에도 Docs를 만들때 사용 
	 * 1인데이터 
	 * 번호 int num
	 * 이름 String name
	 * 과목 kor int kor
	 *     eng 
	 *     math
	 * 총점 int total
	 * 출력하는 처리자 0 
	 * 
	 */
//member중에 field 변수 속성 
	// member method, 처리자 
	private int num;
	private String name; 
	private int kor;
	private int eng; 
	private int math;
	private int total;
	private double average;
	private char grade;
	private int rank;
		public ReportCard() {
			
		}	
	//public void //정확하게 모르면 void 작성 
	public void output() {
		
		System.out.printf("%6d %14s %4d %4d %4d %6d %8.2f %3c %d", num , name, kor, eng, math, total, average, grade,rank);
	//""안에 들어가 있는건 실행하는 시점에서 체크되어짐. 
		//알파벳갯수= 한글 갯수. %.2f소수점 2자리 까지 표현 
		//%총몇자리.소수점자리 f
	}
	
	/**
	 *입력메소드 만들기, public void / 리턴할 것이 없으면 void생략
	 *메소드명:inputSubjectScore 
	 */
	public void inputSubjectScore( ) {
		//국어점수70 
		//영어점수 80
		//수학점수 90
		//
	Scanner scan = new Scanner(System.in );
	//중복된 것: overloading
	
	System.out.print("국어?");
	kor =scan.nextInt();
// = : 연산자의 오른쪽  데이터를 =를 통해 왼쪽으로 넘겨준다 
	System.out.print("영어?");
	eng =scan.nextInt();
	System.out.print("수학?");
	math =scan.nextInt();
	
	      calc();
	}
	 public void calc() {
		total=kor+eng+math;
	average=total/3;
	switch ((int) average/10) {
	case 10:
	case 9 :grade='A';
	break;
	case 8: grade='B';
		break;
	case 7: grade='C';
		break;
	case 6: grade='D';
	break;	
	}
	 }
	 
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public int getTotal() {
		return total;
	}
	public double getAverage() {
		return average;
	}
	public char getGrade() {
		return grade;
	}
	public int getRank() {
		return rank;
	}
	
	
	
//	public ReportCard () { 
		//멤버 데이터 중 바뀌면 안되는것 private total~math 까지 Setter 필요없다
		//번호와 이름 갱신하게 해주려면 setter필요 
		//상관없는것은 
	}

		
	
	
	


