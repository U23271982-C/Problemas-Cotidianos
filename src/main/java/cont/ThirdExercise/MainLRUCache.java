package cont.ThirdExercise;

public class MainLRUCache {
    public static void main(String[] args) {
        int capacity = 4;
        LRUCache<Integer, String> cache = new LRUCache<>(capacity);
        cache.put(1, "a");
        cache.put(2, "b");
        cache.put(3, "c");

        System.out.println(cache); // {3=C, 1=A, 4=D}

        cache.get(1); // Accedemos a 1, ahora es el más reciente
        cache.put(4, "D");
        cache.put(5, "E"); // Se elimina el menos usado (clave 2)

        System.out.println(cache); // {3=C, 1=A, 4=D}
    }
}
