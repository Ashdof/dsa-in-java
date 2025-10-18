package src.basics;

public class Author {

    private String id, name, gender;
    private int age;

    public Author(String id, String name, String gender, int age) {
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.age = age;
    }

    @Override
    public String toString() {

	return String.format("Author Information:%n==============================%nID:\t%s%nName:\t%s%nGender:\t%s%nAge:\t%s%n",
			     this.id, this.name, this.gender, String.valueOf(this.age));
    }
}
