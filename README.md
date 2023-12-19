~~~
public class GarbageMaker {
    public static void main(String[] args) {
        StringBuilder S = new StringBuilder(new String("S"));
        StringBuilder t = new StringBuilder(new String("t"));
        StringBuilder r = new StringBuilder(new String("r"));
        StringBuilder i = new StringBuilder(new String("i"));
        StringBuilder n = new StringBuilder(new String("n"));
        StringBuilder g = new StringBuilder(new String("g"));
        Object stringBuilder = S.append(t).append(r).append(i).append(n).append(g);

        boolean stringBool = ((String)stringBuilder.toString()).equals((String)new String("String").toString());
        String string = String.format("%s", String.valueOf(stringBool
                ? new String(String.format("%s","String").toString())
                : (String)"String".toString())
        );

        stringBool = string instanceof String stringT;
        System.out.println(stringBool
                ? new String(String.valueOf((String)string.toString()).toString())
                : new String(String.format("%s",(String)stringBuilder.toString())).toString()
        );
    }
}
~~~
