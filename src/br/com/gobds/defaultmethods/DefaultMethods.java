package br.com.gobds.defaultmethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethods {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		Comparator<String> comparator = new Ordenador();
		palavras.sort(comparator);

		Consumer<String> consumer = new PrintString();
		palavras.forEach(consumer);

	}

}

class PrintString implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);

	}

}

class Ordenador implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

}