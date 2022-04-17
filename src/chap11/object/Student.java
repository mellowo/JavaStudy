package chap11.object;

public class Student {
	public int studentID;
	public String studentName;
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentID == std.studentID) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentID;
	}
	
	

}
