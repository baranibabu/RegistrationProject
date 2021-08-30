package RegPack;

public class Member {
	private String uname,password,studentid,degree,branch,email,phone;

	public Member() {
		super();
	}

	public Member(String uname, String password, String studentid, String degree, String branch, String email,
			String phone) {
		super();
		this.uname = uname;
		this.password = password;
		this.studentid = studentid;
		this.degree = degree;
		this.branch = branch;
		this.email = email;
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}


