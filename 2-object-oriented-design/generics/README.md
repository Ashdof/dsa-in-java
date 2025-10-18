# JAVA GENERICS
This directory is dedicated to my self-study session on **Java Generics**, part of my advanced studies in **Data Structures and Algorithms with Java**.

## Study Overview
Before proceeding with the main textbook lesson, I completed a quick but detailed **beginner-friendly lesson on Java Generics** with the help of **ChatGPT (GPT-5)**.

## Foundational Concepts
The introductory foundational ideas in **Java Generics** covered are:
- What Generics are and why they are important
- Type safety and compile-time checking
- Generic classes and methods
- Bounded type parameters
- Wildcards (`?`, `extends`, `super`)
- Generic interfaces and collections
- Practical use cases and design patterns involving Generics

## Structure of This Directory


## Concepts Covered

| Concept | Description |
|----------|--------------|
| **Generic Classes** | Creating parameterized classes like `Box<T>` or `Pair<K,V>` |
| **Generic Methods** | Defining methods that accept any type safely |
| **Bounded Types** | Restricting generics to a specific hierarchy using `extends` or `super` |
| **Wildcards** | Making generic methods more flexible with unknown types |
| **Generics and Collections** | Practical usage with `List`, `Map`, `Set` |
| **Type Inference** | Using the diamond operator `<>` for cleaner syntax |

## ⚙️ Example Snippet

```java
public class Box<T> {
	private T content;
	public void set(T content) {
        	this.content = content;
    	}

	public T get() {
        	return content;
	}

    	public static void main(String[] args) {
        	Box<String> stringBox = new Box<>();
        	stringBox.set("Hello, Generics!");

        	System.out.println(stringBox.get());
    	}
}
