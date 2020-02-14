package collections;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

public class BoardListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<FreeBoard> boardList = new Vector <FreeBoard>();
		boardList.add(new FreeBoard(
				1, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				2,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				3, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				4,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				5, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				6,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				7, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				8,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				9, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				10,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));
		boardList.add(new FreeBoard(
				11, "감자", "돼지감자", "감자 다이어트", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				12,"방탄커피","커피","원두커피+목초버터+MCT오일",
				new GregorianCalendar(1999,2, 22) ));
		
		System.out.println("capacity::"+boardList.capacity());
		System.out.println("size::" + boardList.size()	);
		boardList.trimToSize();
		System.out.println("capacity::"+boardList.capacity());
		System.out.println("size::" + boardList.size()	);
	}
	}

