package test;

import java.lang.annotation.Annotation;

import demo.Author;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Book.class;
		Annotation[] annotations = c.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			if( annotation instanceof Author ) {
				Author author = (Author) annotation;
				System.out.println("Name	:	"+author.name());
				System.out.println("Date	:	"+author.date());
			}
		}
	}
}
