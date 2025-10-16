package people;

import interfaces.Person;

/**
 * Student class implements Person interface
 */
public class Student implements Person {

    private String id, name;
    private int age;

    // Simple constructor
    public Student(String id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age = age;
    }

    protected String studyHours() {
	
	return String.format("%d hours", age/2);
    }

    public String getId() {
	return this.id;
    }

    public String getName() {
	return this.name;
    }

    public int getAge() {
	return this.age;
    }

    public boolean equals(Person person) {

	if (!(person instanceof Student))
	    return false;   // Cannot possibly be equal
	Student student = (Student) person;
	
	return this.id.equals(student.id);
    }

    @Override
    public String toString() {
	
	return String.format("ID: %s%nName: %s%nAge: %d%nStudy hourse: %s",
			     this.id, this.name, this.age, this.studyHours());
    }
}
