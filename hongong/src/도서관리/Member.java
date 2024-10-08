package 도서관리;

// 두단어 조합 member_id / memberId
public class Member {
	private String memberID;
	private String passwrod;
	private String membername;
	private String phone;
	private String responsibility;
	private String creation;
	
	@Override
	public String toString() {
		return "Member [memberID=" + memberID + ", passwrod=" + passwrod + ", membername=" + membername + ", phone="
				+ phone + ", responsibility=" + responsibility + ", creation=" + creation + "]";
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getPasswrod() {
		return passwrod;
	}

	public void setPasswrod(String passwrod) {
		this.passwrod = passwrod;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getCreation() {
		return creation;
	}

	public void setCreation(String creation) {
		this.creation = creation;
	}
	

	
	
}
	


