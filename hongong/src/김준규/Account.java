package 김준규;

public class Account {
	//필드
	private String ano;
	private String owner;
	private int balence;
	private final static int MIN_BALANCE = 0;
	private final static int MAX_BALANCE = 1000000;
	//생성자
	Account(String ano, String owner, int balence){
		this.ano = ano;
		this.owner = owner;
		this.balence = balence;
	}
	//메소드
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalence() {
		return balence;
	}
	public void setBalence(int balence) {
		this.balence = balence;
	}
	
}
