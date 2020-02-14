package collections;

import java.util.GregorianCalendar;

public class FreeBoard {
private int no; 
private String title;
private String writer;
private String contents;
private GregorianCalendar dataCreate;








public FreeBoard(int no, String title, String writer, String contents, GregorianCalendar dataCreate) {
	super();
	this.no = no;
	this.title = title;
	this.writer = writer;
	this.contents = contents;
	this.dataCreate = dataCreate;
}
@Override
public String toString() {
	return "FreeBoard [no=" + no + ", title=" + title + ", writer=" + writer + ", contents=" + contents
			+ ", dataCreate=" + dataCreate + "]";
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getContents() {
	return contents;
}
public void setContents(String contents) {
	this.contents = contents;
}
public GregorianCalendar getDataCreate() {
	return dataCreate;
}
public void setDataCreate(GregorianCalendar dataCreate) {
	this.dataCreate = dataCreate;
}

}
