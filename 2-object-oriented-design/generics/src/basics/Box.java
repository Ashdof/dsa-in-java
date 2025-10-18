package src.basics;

public class Box<T> { // T is a type parameter

    private T content;

    public void setContent(T content) {
	this.content = content;
    }

    public T getContent() {

	return this.content;
    }

    public static void main(String[] args) {

	Box<String> stringBox = new Box<>();
	stringBox.setContent("Hello, world!");
	System.out.printf("String box content: '%s'%n", stringBox.getContent());

	Box<Double> doubleBox = new Box<>();
	doubleBox.setContent(324.009);
	System.out.printf("Double box content: '%.3f'%n", doubleBox.getContent());
    }
}
