package br.com.gobds.methodreference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.forEach(System.out::println);

	}

}
