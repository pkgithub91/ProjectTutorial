package hcl.pradeep.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "mst_state")
public class StateBean {
	@Id
	@Column(name = "state_code")
	private int stCode;
	@Column(name = "state_name")
	private int stName;
	@Column(name = "state_short_name")
	private int stsortName;
	public int getStCode() {
		return stCode;
	}
	public void setStCode(int stCode) {
		this.stCode = stCode;
	}
	public int getStName() {
		return stName;
	}
	public void setStName(int stName) {
		this.stName = stName;
	}
	public int getStsortName() {
		return stsortName;
	}
	public void setStsortName(int stsortName) {
		this.stsortName = stsortName;
	}
	
	
	

}
