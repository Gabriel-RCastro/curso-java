package POO.exemplos.map.demo1;

import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>(); // Map<K,V> | Map<Key, Value>

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "999711122");

        cookies.remove("email");
        cookies.put("phone", "999711133");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Phone number: " + cookies.get("phone"));
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size());

        System.out.println("\nALL COOKIES: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
