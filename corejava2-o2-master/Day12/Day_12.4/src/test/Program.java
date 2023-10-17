package test;

import java.lang.annotation.Annotation;

import demo.Author;
import demo.Authors;

public class Program {
	public static void main(String[] args) {
		Class<?> c = Book.class;
		Annotation[] annotations = c.getDeclaredAnnotations();
		for (Annotation annotation : annotations) {
			if( annotation instanceof Authors ) {
				Authors authors = (Authors) annotation;
				for ( Author author : authors.value()) {
					System.out.println(author.name()+"	"+author.date());
				}
			}
		}
	}
}
