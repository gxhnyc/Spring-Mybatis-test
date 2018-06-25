package pojo;

/**
 * Student类
 * -number: Int
  -name: String
  -gender: enum(Male, Female)
  -age: Int
  -major: String
  +getters
  +构造器（初始化所有字段）
 * @author Administrator
 *
 */
public class Student {
	
	private Integer s_id;
	private Integer s_number;
	private String s_name;
	private Gender s_gender;
	private Integer s_age;
	private String s_major;
	
	
	/*
	 * 构造方法，初始化所有字段
	 */
	public Student() {}
	public Student(Integer s_id, Integer s_number, String s_name, Gender s_gender, Integer s_age, String s_major) {
		super();
		this.s_id = s_id;
		this.s_number = s_number;
		this.s_name = s_name;
		this.s_gender = s_gender;
		this.s_age = s_age;
		this.s_major = s_major;
	}


	public Integer getS_id() {
		return s_id;
	}


	public void setS_id(Integer s_id) {
		this.s_id = s_id;
	}


	public Integer getS_number() {
		return s_number;
	}


	public void setS_number(Integer s_number) {
		this.s_number = s_number;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public Gender getS_gender() {
		return s_gender;
	}


	public void setS_gender(Gender s_gender) {
		this.s_gender = s_gender;
	}


	public Integer getS_age() {
		return s_age;
	}


	public void setS_age(Integer s_age) {
		this.s_age = s_age;
	}


	public String getS_major() {
		return s_major;
	}


	public void setS_major(String s_major) {
		this.s_major = s_major;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", s_number=" + s_number + ", s_name=" + s_name + ", s_gender=" + s_gender
				+ ", s_age=" + s_age + ", s_major=" + s_major + "]";
	}
	
	
	
}
