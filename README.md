~~~
public class GarbageMaker {
    static {
        main(ProcessingGarbage("S","t","r","i","n","g"));
    }

    protected static String[] ProcessingGarbage(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int stringI = "String".length() - "String".length(); stringI < "String".length(); stringI++)
            stringBuilder.append(strings[stringI]);

        boolean stringBool = stringBuilder.toString().equalsIgnoreCase(new String("String"));
        String string = String.format("%s", String.valueOf(stringBool
                ? String.format("%s",(String)"String").toString()
                : (String)String.valueOf(stringBuilder.toString()).toString()));

        return new String[] {
                String.valueOf(string.charAt("String".length() - "S".length())),
                String.valueOf(string.charAt("String".length() - "St".length())),
                String.valueOf(string.charAt("String".length() - "Str".length())),
                String.valueOf(string.charAt("String".length() - "Stri".length())),
                String.valueOf(string.charAt("String".length() - "Strin".length())),
                String.valueOf(string.charAt("String".length() - "String".length())),
        };
    }

    public static void main(String[] string) {
        throw new RuntimeException(
                string["String".length() - "String".length()] +
                string["String".length() - "Strin".length()] +
                string["String".length() - "Stri".length()] +
                string["String".length() - "Str".length()] +
                string["String".length() - "St".length()] +
                string["String".length() - "S".length()]
        );
    }
}
~~~