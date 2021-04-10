package student;

public class ClassList {
  private int semester;
  private int year;
  

private subject subj;
  private student s1;
  private student s2;
  
  public ClassList() {
	  semester=1;
	  year=2;
	  subject subj=new subject();
	  subj.getSubjectID();
	 subj.getSubjectName();
	 student s1=new student();
	 s1.getFirstName();
	 s1.getLastName();
	 s1.getStudentID();
	 student s2=new student();
	 s2.getFirstName();
	 s2.getLastName();
	 s2.getStudentID();
  }
  public ClassList(int semester,int year,subject subj,student s1,student s2) {
	  this.semester=semester;
	  this.year=year;
	  this.subj=subj;
	  this.s1=s1;
	  this.s2=s2;
  }

public int getSemester() {
	return semester;
}
public void setSemester(int semester) {
	this.semester = semester;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public subject getSubj() {
	return subj;
}
public void setSubj(subject subj) {
	this.subj = subj;
}
public student getS1() {
	return s1;
}
public void setS1(student s1) {
	this.s1 = s1;
}
public student getS2() {
	return s2;
}
public void setS2(student s2) {
	this.s2 = s2;
}

public String toString() {
	String info;
	info="semester:"+this.semester;
	info+="year:"+this.year;
	info+="subj:"+this.subj;
	info+="s1:"+this.s1;
	info+="s2:"+this.s2;
	return info;
  
}
  
}
