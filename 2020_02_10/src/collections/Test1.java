package collections;


import java.util.ArrayList;

import java.util.Date;

import java.util.List;



public class Test1 {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String a = "kim malja";
		String b = "Sung malja";
		String c = "Park malja";

		String [] strs = {"kim malja", "Sung malja","Park malja"};
		String [] ss= {a,b,c};

		String [] xx= new String[3];

		xx[0]="kim malja";

		xx[1]="Sung malja";

		xx[2]="Park malja";

		xx[0]=a;

		xx[1]=b;

		xx[2]=c;

		//xx[3]="dfhddh";

		/* List<Date> strings=new ArrayList<Date>() ; */

		List<String> strings=new ArrayList<String>() ;

		strings.add("kim malja");

		strings.add("Park malja");

		strings.add("sung malja");

		strings.add("lee malja");

		strings.add("go malja");

		strings.add("cho malja");

		System.out.println(strings.size());

		for(  String  str     : strings  ) {

			System.out.println(str);

		}

		for(  int i=0; i< strings.size() ; i ++ ) {

			System.out.println(strings.get(i));

		}
//계열과 스트링 클래스에 랭스가 존재 , 스트링은 메소드로 나옴. 여기서하나씩 spr한테 줌...
		//		

	}



}






















	
	
	
