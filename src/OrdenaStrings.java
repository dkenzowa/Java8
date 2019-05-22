import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		//Antes java 8
		List<String> palavras = new ArrayList<String>();
		palavras.add("Alura");
		palavras.add("Udemy");
		palavras.add("Casa do código");
		palavras.add("Caelum");
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		//Collections.sort(palavras, comparador);
		
		//Java 8
		palavras.sort(comparador);
		
		System.out.println(palavras);
		
		//Antes Java 8
		for (String p : palavras) {
			System.out.println(p);
		}
		
		//Java 8
		Consumer<String> consumidor = new ImprimeraNaLinha();
		palavras.forEach(consumidor);
	}
}

class ImprimeraNaLinha implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}

class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		if(s1.length() < s2.length()) {
			return -1;
		}
		if(s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}
	
}