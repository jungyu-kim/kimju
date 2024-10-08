package chap06;

public class Book {
	//필드
	private String title;
	private String bnum;
	private int price;
	//생성자
	Book(String title, String bnum, int price){
		this.title = title; //필드 초기화
		this.bnum = bnum;
		this.price = price;
		
	}
	//메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBnum() {
		return bnum;
	}
	public void setBnum(String bnum) {
		this.bnum = bnum;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
