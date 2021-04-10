package student;

public class subject {
  private String subjectID;
  private String subjectName;
  
  public subject() {
	  subjectID="1001";
	  subjectName="сОнд";
			  
	  
  }
  public subject(String subjectID,String subjectName) {
	  this.subjectID=subjectID;
	  this.subjectName=subjectName;
	  
  }
public String getSubjectID() {
	return subjectID;
}
public void setSubjectID(String subjectID) {
	this.subjectID = subjectID;
}
public String getSubjectName() {
	return subjectName;
}
public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}

public String toString() {
	String msg;
	msg="ID=:"+this.subjectID;
	msg+="Name:"+this.subjectName;
	return msg;
	}
  
}
