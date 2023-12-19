~~~
public class GarbageProcessor {
    public static void main(String[] args) {
        StringBuilder S = new StringBuilder(new String("S"));
        StringBuilder t = new StringBuilder(new String("t"));
        StringBuilder r = new StringBuilder(new String("r"));
        StringBuilder i = new StringBuilder(new String("i"));
        StringBuilder n = new StringBuilder(new String("n"));
        StringBuilder g = new StringBuilder(new String("g"));
        Object stringBuilder = S.append(t).append(r).append(i).append(n).append(g);

        boolean stringBool = ((String)stringBuilder.toString()).equals((String)new String("String").toString());
        String string = String.format("%s", String.valueOf(stringBool ? new String("String") : "String"));

        stringBool = string instanceof String stringT;
        System.out.println(stringBool ? String.valueOf((String)string.toString()).toString() : (String)stringBuilder.toString());
    }
}
~~~
