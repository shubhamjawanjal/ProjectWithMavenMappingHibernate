package MantToManyMapping;

import java.util.List;

import javax.persistence.*;

@Entity
public class Emp {
	
	@Id
	private int eId;
	private String eName;
	@ManyToMany
	private List<Project> projects;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Emp(int eId, String eName, List<Project> projects) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.projects = projects;
	}
	public Emp() {
		super();
	}
	
	
	
}
