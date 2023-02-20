package hcl.pradeep.model;

import org.springframework.stereotype.Component;

@Component
public class RegistrationBean {
	
	private String stCode;
	private String name;
	public String getStCode() {
		return stCode;
	}
	public void setStCode(String stCode) {
		this.stCode = stCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
