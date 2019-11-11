package labsproject.api.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "building")
public class Building implements Serializable{

	private static final long serialVersionUID = -1462302884002834226L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Long facultyid;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getFacultyId() {
		return facultyid;
	}

	public void setFacultyId(Long facultyid) {
		this.facultyid = facultyid;
	}
	
}
