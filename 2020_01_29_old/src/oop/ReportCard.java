package oop;

//���� ���ϴ� �޼ҵ� 


import java.util.Scanner;

public class ReportCard {

	/** @author bitcamp
	 * 
	 *   //     /*    /** �ؼ��� �ʿ���� 
	 *   �� �����ܿ��� Docs�� ���鶧 ��� 
	 * 1�ε����� 
	 * ��ȣ int num
	 * �̸� String name
	 * ���� kor int kor
	 *     eng 
	 *     math
	 * ���� int total
	 * ����ϴ� ó���� 0 
	 * 
	 */
//member�߿� field ���� �Ӽ� 
	// member method, ó���� 
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
	//public void //��Ȯ�ϰ� �𸣸� void �ۼ� 
	public void output() {
		
		System.out.printf("%6d %14s %4d %4d %4d %6d %8.2f %3c %d", num , name, kor, eng, math, total, average, grade,rank);
	//""�ȿ� �� �ִ°� �����ϴ� �������� üũ�Ǿ���. 
		//���ĺ�����= �ѱ� ����. %.2f�Ҽ��� 2�ڸ� ���� ǥ�� 
		//%�Ѹ��ڸ�.�Ҽ����ڸ� f
	}
	
	/**
	 *�Է¸޼ҵ� �����, public void / ������ ���� ������ void����
	 *�޼ҵ��:inputSubjectScore 
	 */
	public void inputSubjectScore( ) {
		//��������70 
		//�������� 80
		//�������� 90
		//
	Scanner scan = new Scanner(System.in );
	//�ߺ��� ��: overloading
	
	System.out.print("����?");
	kor =scan.nextInt();
// = : �������� ������  �����͸� =�� ���� �������� �Ѱ��ش� 
	System.out.print("����?");
	eng =scan.nextInt();
	System.out.print("����?");
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
		//��� ������ �� �ٲ�� �ȵǴ°� private total~math ���� Setter �ʿ����
		//��ȣ�� �̸� �����ϰ� ���ַ��� setter�ʿ� 
		//������°��� 
	}

		
	
	
	


