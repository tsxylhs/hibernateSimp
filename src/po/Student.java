package po;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="t_student")
public class Student {
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer stuNo;
	
	@Column(name="stu_name" ,nullable=false ,length=10,unique=true)
	private String stuName;
	
	
	
	
	private String stuSex;
	@ManyToMany(cascade={CascadeType.PERSIST},fetch=FetchType.EAGER)
	@JoinTable(name="t_stu_course",
	joinColumns=@JoinColumn(name="stu_id" ,referencedColumnName="stuNo"),
	inverseJoinColumns=@JoinColumn(name="cour_id" ,referencedColumnName="courid")
	)
	private Set<Course>  stuCourse = new HashSet<Course>();
	
	
	@Column(name="stu_day")
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date stubirthday;
	
	public Integer getStuNo() {
		return stuNo;
	}
	public void setStuNo(Integer stuNo) {
		this.stuNo = stuNo;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	
	public java.util.Date getStubirthday() {
		return stubirthday;
	}
	public void setStubirthday(java.util.Date stubirthday) {
		this.stubirthday = stubirthday;
	}
	
	
	

}
