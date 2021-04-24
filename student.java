package lll;

public class student {
	 private String id;
	  private String name;
	  private String birth;
	  private String  gender;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", birth=" + birth + ", gender=" + gender + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public student(String id, String name, String birth, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
	}
	public student() {
		// TODO Auto-generated constructor stub
	}
}
