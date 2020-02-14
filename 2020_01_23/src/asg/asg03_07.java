package asg;
/**
 * 3-7) 구구단을 출력하세요 
    2단               3단         
2 x 1 = 2     3 x 1 = 3   
    ~
    ~
2 x 9 = 18   3 x 9 = 27 
~
    8단               9단         
9 x 1 = 8     9 x 1 = 9
    ~
    ~
8 x 9 = 72   9 x 9 = 81 

9단 까지 표현

 */
public class asg03_07 {

	public static void main(String[] args) {
	int k=0;
	for(int i=2; i<10; i++) {
		k=i+1;
		System.out.println(i+"단"+"\t"+k+"단");
		for(int j=1; j<10 ; j++) {
			System.out.println(""+i+"x"+j+"="+ (i*j)+
					"\t"+k+"x"+j+"="+ k*j);
		}
		i++;
	}
	
	} //main

} //asg
