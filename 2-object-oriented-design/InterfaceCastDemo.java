
import people.Student;
import people.Teacher;

/**
 * Demonstration of casting interfaces
 */
public class InterfaceCastDemo {
    public static void main(String[] args) {

	Student[] student = new Student[2];
	Teacher teacher;

	student[0] = new Student("STD00000023", "Kofi Kay Kayson", 9);
	student[1] = new Student("STD00000024", "Adwoa Dwoa Dawson", 7);
	teacher = new Teacher("TEA00000034", "Madam Ama Amason", 24);

	System.out.printf("Database:%n=================%n");
	System.out.printf("Teachers: %n%s%n%n", teacher.toString());
	System.out.printf("Students:%n");
	for (int i = 0; i < student.length; ++i)
	    System.out.printf("%s%n%n", student[i]);

	System.out.println("Comparing Person Objects");
	System.out.printf("%s = %s: %b%n", student[0].getName(), student[1].getName(), student[0].equals(student[1]));
	System.out.printf("%s = %s: %b%n", student[0].getName(), teacher.getName(), student[0].equals(teacher));
	System.out.printf("%s = %s: %b%n", student[1].getName(), teacher.getName(), student[1].equals(teacher));
	System.out.printf("%s = %s: %b%n", student[0].getName(), student[0].getName(), student[0].equals(student[0]));
	System.out.printf("%s = %s: %b%n", student[1].getName(), student[1].getName(), student[1].equals(student[1]));
	System.out.printf("%s = %s: %b%n", teacher.getName(), teacher.getName(), teacher.equals(teacher));
    }
}
