~~~
public class GarbageProcessor {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder(new String("S"));
        StringBuilder t = new StringBuilder(new String("t"));
        StringBuilder r = new StringBuilder(new String("r"));
        StringBuilder i = new StringBuilder(new String("i"));
        StringBuilder n = new StringBuilder(new String("n"));
        StringBuilder g = new StringBuilder(new String("g"));

        Object stringBuilder = s.append(t).append(r).append(i).append(n).append(g);
        String string = new String(String.valueOf((String)stringBuilder.toString()));

        System.out.println(String.valueOf((String)string.toString()).toString());
    }
}
~~~
