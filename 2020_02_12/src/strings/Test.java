package strings;

import java.util.List;
import java.util.ArrayList;

public class Test {



 public static void main(String[] args) {
  // TODO Auto-generated method stub
  List<String> list= new ArrayList<String>();
 
  list.add("서울시 강남구 역삼동 456-777");
  list.add("수원시 장안구 이목동 123-444");
  list.add("서울시 동작구 방배동 515-555");
  list.add("대전시 북구 아프동 918-333");
  list.add("대전시 북구 아프동 918-333");
  list.add("제천시 청전동 뭐엿동 412-455");
    
 /* for (int i = 0; i < list.size();i++) {
   if(list.get(i).contains("역삼동")) {
    System.out.println((i+1)+"번째"+list.get(i));
  */ 
  for (int i = 0; i < list.size();i++) {
   if(list.get(i).startsWith("서울")) {
    System.out.println((i+1)+"번째"+list.get(i));}
   
  }
  System.out.println("/////////////////");
  for (int i = 0; i < list.size();i++) {
   if(list.get(i).endsWith("7")) {
    System.out.println((i+1)+"번째"+list.get(i));}
   
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
  //문서로 부터 입력받을때 띄어쓰기 없애기 . 
 
 }
 }