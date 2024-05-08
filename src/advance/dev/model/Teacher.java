package advance.dev.model;

import advance.dev.dao.IPeople;

public class Teacher extends People implements IPeople {
	private String TeacherID;
	// Implement IPeople methods
	// Getters and setters for teacherID
	public Teacher(String name, int age, String TeacherID) {
		super(name,age);
        this.TeacherID = TeacherID;
    }

	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printPeople() {
		// TODO Auto-generated method stub
		
	}
}
