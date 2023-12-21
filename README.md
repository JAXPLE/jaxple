~~~
public class GarbageMaker {
    static {
        main("S","t","r","i","n","g");
    }
    public static void main(String... strings) {
        StringBuilder string = new StringBuilder();
        for (int stringI = "String".length() - "String".length(); stringI < "String".length(); stringI++)
            string.append(strings[stringI]);

        boolean stringBool = string.toString().equalsIgnoreCase(new String("String"));
        new RuntimeException(
            String.format("%s", String.valueOf(stringBool
                ? String.format("%s",(String)"String").toString()
                : (String)String.valueOf("String").toString()
                ))
        ).printStackTrace();
    }
}
~~~