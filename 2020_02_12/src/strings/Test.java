package strings;

import java.util.List;
import java.util.ArrayList;

public class Test {



 public static void main(String[] args) {
  // TODO Auto-generated method stub
  List<String> list= new ArrayList<String>();
 
  list.add("����� ������ ���ﵿ 456-777");
  list.add("������ ��ȱ� �̸� 123-444");
  list.add("����� ���۱� ��赿 515-555");
  list.add("������ �ϱ� ������ 918-333");
  list.add("������ �ϱ� ������ 918-333");
  list.add("��õ�� û���� ������ 412-455");
    
 /* for (int i = 0; i < list.size();i++) {
   if(list.get(i).contains("���ﵿ")) {
    System.out.println((i+1)+"��°"+list.get(i));
  */ 
  for (int i = 0; i < list.size();i++) {
   if(list.get(i).startsWith("����")) {
    System.out.println((i+1)+"��°"+list.get(i));}
   
  }
  System.out.println("/////////////////");
  for (int i = 0; i < list.size();i++) {
   if(list.get(i).endsWith("7")) {
    System.out.println((i+1)+"��°"+list.get(i));}
   
  }
  System.out.println("//////////////");
  String str2 = "Lee,Park,Kim";
 String[]spliStr= str2.split("");
  for(String s: spliStr) {
	  System.out.println(s);
  }
  
  System.out.println("////////////////");
  String str3="      kim";
  String str4="kim";
  System.out.println(str3==str4);
  System.out.println(str3.equals(str4));
  System.out.println(str3.trim().equals(str4));
  //������ ���� �Է¹����� ���� ���ֱ� . 
 
 }
 }