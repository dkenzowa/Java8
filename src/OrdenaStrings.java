import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class OrdenaStrings {

	public static void main(String[] args) {
		// Antes java 8
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura");
		palavras.add("Udemy");
		palavras.add("Casa do código");
		palavras.add("Caelum");

		//Comparator<String> comparador = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador);

		// Java 8
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});

		//palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.sort(Comparator.comparing(s -> s.length()));
		palavras.sort(Comparator.comparing(String::length));
		
//		Function<String, Integer> funcao = String::length;
//		Comparator<String> comparador = Comparator.comparing(funcao);
//		palavras.sort(comparador);
		
		System.out.println(palavras);

		palavras.forEach(System.out::println);
		
		// Antes Java 8
		for (String p : palavras) {
			System.out.println(p);
		}

		// Java 8
//		Consumer<String> consumidor = new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		};

		palavras.forEach(t -> System.out.println(t));
	}
}