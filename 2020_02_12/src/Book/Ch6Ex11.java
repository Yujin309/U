package Book;

import java.awt.List;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;

public class Ch6Ex11 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
String msg="{0,date}�� {0,time}�� {1}���� {2}�� ������� �ߴ�";
Object[ ] objs= {new Date(),"����","ȫ�浿"};
Object[ ] objs2= {new Date(),"����","�̱浿"};

ArrayList list=new ArrayList();
list.add(objs);
list.add(objs2);

MessageFormat mf= new MessageFormat(msg);
for(Object o: list) {
	System.out.println(mf.format(o));
}
System.out.println(mf.format(objs));

String from= "ȫ�浿";
String to= "��浿";
final int CHAT_SEND=1;
		String location = "HOME";
		String chatMsg="{0}|{1}|{2}-{3}|{4}";
	
	System.out.println(MessageFormat.format(chatMsg, CHAT_SEND,new Date(),from,to,location));
	}
	
	}


