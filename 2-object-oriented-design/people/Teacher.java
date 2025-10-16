package people;

import interfaces.Person;

/**
 * Teacher class implements Person interface
 */
public class Teacher implements Person {
    
    private String id, name;
    private int age;

    // Simple constructor
    public Teacher(String id, String name, int age) {
	this.id = id;
	this.name = name;
	this.age = age;
    }

    protected String classAssigned() {

	return "Class " + this.age/2;
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

	if (!(person instanceof Teacher))
	    return false;
	Teacher teacher = (Teacher) person;
	
	return this.id.equals(teacher.id);
    }

    @Override
    public String toString() {

	return String.format("ID: %s%nName: %s%nAge: %d%nAssigned class: %s%n",
			     this.id, this.name, this.age, this.classAssigned());
    }
}
