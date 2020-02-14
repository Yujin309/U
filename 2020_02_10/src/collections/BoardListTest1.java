package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class BoardListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FreeBoard> boardList = new  ArrayList<FreeBoard>();
		boardList.add(new FreeBoard(
				1, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				2,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));

		// 내용을 보고 싶다.  ==> 전체적으로 
		for(int i =0; i<boardList.size();i++ ) {
			System.out.println(boardList.get(i).getContents());
		}
		// 작성 년도와 제목
		for(int i =0; i<boardList.size();i++ ) {
			System.out.print(boardList.get(i).getDataCreate().get(Calendar.YEAR)+",");
			System.out.println(boardList.get(i).getTitle());
		}
		for( FreeBoard  board : boardList ) {
			System.out.print(board.getDataCreate().get(Calendar.YEAR)+",");
			System.out.println(board.getTitle());
		}
	}

}