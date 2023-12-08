import java.util.*;

public class Main {
	public static void main(String[] args) {
		//crea la mappa
		Map<String, String> hashmap = new HashMap<>();
		hashmap.put("Cibo", "Pizza");
		hashmap.put("Bibita", "Fanta");
		hashmap.put("Dolce", "Cheesecake");

		//stampa hashMap
		System.out.println(hashmap);

		//riordina la mappa
		Collection<String> keySorted = hashmap.values();

		//stampa hashMap riordinato
		System.out.println(keySorted);
	}
}