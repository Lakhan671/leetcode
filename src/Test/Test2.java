package Test;

import java.io.File;
import java.util.*;
import java.util.stream.Stream;

public class Test2 {
    private static Map<String, Integer> cache = new TreeMap<>();
    private static Set<String> masterData = new HashSet<>();

    public static void main(String[] args) {
        masterData.add("abc");
        masterData.add("abbc");
        masterData.add("abcd");
        masterData.add("abcc");
        masterData.add("apple");
        masterData.add("cat");
        masterData.add("dog");
        masterData.add("book");
        masterData.add("balck book");
        masterData.add("java");

        for (String input : masterData) {
            System.out.println(getData(input));
        }


    }

    static List<String> getData(String input) {

        if (cache.containsKey(input)) {
            cache.put(input, cache.get(input) + 1);

        } else {
            int c=0;

                if (masterData.contains(input)) {
                    cache.put(input, 1);
            }
            if(c==0){
                cache.put(input, 1);
            }

        }
        return null;

    }

}

class _10MostUsedKeywords{
    int id;
     String key;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _10MostUsedKeywords that = (_10MostUsedKeywords) o;
        return id == that.id &&
                Objects.equals(key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, key);
    }
}