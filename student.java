package student;

public class student {
  private String studentID;
  private String firstName;
  private String lastName;
  
  public student() {
	  studentID="01";
	  firstName="Èý";
	  lastName="ÕÅ";
	
  }
  
  public student(String studentID,String firstName,String lastName) {
	  this.studentID=studentID;
	  this.firstName=firstName;
	  this.lastName=lastName;
  }

public String getStudentID() {
	return studentID;
}

public void setStudentID(String studentID) {
	this.studentID = studentID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String toString() {
	String msg;
	msg="studentID:"+this.studentID;
	msg+="firstName:"+this.firstName;
	msg+="lastName:"+this.lastName;
	return msg;
	}
  
  
  
  
}
