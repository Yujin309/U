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
				1, "����", "��������", "���� ���̾�Ʈ", new GregorianCalendar()));
		boardList.add(new FreeBoard(
				2,"��źĿ��","Ŀ��","����Ŀ��+���ʹ���+MCT����",
				new GregorianCalendar(1999,2, 22) ));

		// ������ ���� �ʹ�.  ==> ��ü������ 
		for(int i =0; i<boardList.size();i++ ) {
			System.out.println(boardList.get(i).getContents());
		}
		// �ۼ� �⵵�� ����
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