package schoolassistantbot;

import java.util.Date;

public class Assignment {
	enum AssignmentType {
		Homework,
		Classwork,
		Project
	}
	
	public Date duedate;
	public AssignmentType type;
	public String name;
	
}
