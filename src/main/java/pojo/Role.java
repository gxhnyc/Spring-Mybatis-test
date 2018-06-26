package pojo;

import java.util.List;

public class Role {
	private Long role_id;
	private String role_name;
	private String role_desc;
	private List<Limits> limits;
	
	public Long getRole_id() {
		return role_id;
	} 
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getRole_desc() {
		return role_desc;
	}
	public void setRole_desc(String role_desc) {
		this.role_desc = role_desc;
	}
	public List<Limits> getLimits() {
		return limits;
	}
	public void setLimits(List<Limits> limits) {
		this.limits = limits;
	}
	
	
}
