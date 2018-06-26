package pojo;

public class Administrator {
	private Long admin_id;
	private String admin_name;
	private String admin_pwd;
	private Boolean admin_disabled;
	private Role role;
	public Long getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Long admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_pwd() {
		return admin_pwd;
	}
	public void setAdmin_pwd(String admin_pwd) {
		this.admin_pwd = admin_pwd;
	}
	public Boolean getAdmin_disabled() {
		return admin_disabled;
	}
	public void setAdmin_disabled(String admin_disabled) {
		this.admin_disabled = Boolean.valueOf(admin_disabled);
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
}
