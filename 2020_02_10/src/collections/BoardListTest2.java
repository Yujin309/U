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
				1, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				2,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				3, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				4,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				5, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				6,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				7, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				8,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));

		boardList.add(new FreeBoard(
				9, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				10,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));
		boardList.add(new FreeBoard(
				11, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				12,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));
		
		System.out.println("capacity::"+boardList.capacity());
		System.out.println("size::" + boardList.size()	);
		boardList.trimToSize();
		System.out.println("capacity::"+boardList.capacity());
		System.out.println("size::" + boardList.size()	);
	}
	}

