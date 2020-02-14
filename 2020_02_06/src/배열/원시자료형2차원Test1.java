package 배열;

public class 원시자료형2차원Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] datas1=new int [2 ][] ;
		int [] [] datas2=new int [2 ][3] ;
		//int [] [] datas3=new int [3] ;//오류 발생: 안에 몇갠지 중요하지 않음 
		int [] [] datas4= {    };
		//int [] [] datas5= { 4,5,1,2 };//에러 발생: 데이터 3와 같은 이유 인식을 못하는 것  {} 안에 데이터가없으니 행과 열로 만들고 끝 
		// 몇개할지만 들어가면됨 하지만 data5는 한 열이 있는데 (열이1개) 행이 존재하지 않아서 
		int [] [] datas7= {{4,9,1,2},{8,7}  }; //행은 한개 열도 한개 로 인식 

	
	}

}
