package generics.src.basics;

import java.util.ArrayList;
import java.util.List;

class Repository<T> {

    private final List<T> items = new ArrayList<>();

    public void addToRepository(T item) {
        this.items.add(item);
    }

    public List<T> getAllItems() {
        return this.items;
    }
}

class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class GenericRepository {

    public static void main(String[] args) {
        Repository<Student> studentRepository = new Repository<>();
        studentRepository.addToRepository(new Student("Jay Kay"));
        studentRepository.addToRepository(new Student("May Hay"));
        studentRepository.addToRepository(new Student("Say Shay"));
        studentRepository.addToRepository(new Student("Ray Tay"));

        for (Student student : studentRepository.getAllItems())
            System.out.println(student.getName());
    }
}