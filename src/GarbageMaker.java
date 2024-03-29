import static java.lang.StringTemplate.STR;

public class GarbageMaker {
    static {
        main(
            ProcessingGarbage(new String[]{
                    new String("S"),
                    new String("t"),
                    new String("r"),
                    new String("i"),
                    new String("n"),
                    new String("g"),
            })
        );
    }

    protected static String[] ProcessingGarbage(String...strings) {
        StringBuilder stringString = new StringBuilder();
        for (int sIr = "String".length() - "String".length(); sIr < "String".length(); sIr++)
            stringString.append(strings[sIr]);

        String string = String.format("%s", String.valueOf(
                String.class.getName().split("\\.")["St".length()].equals(stringString.toString())
                ? String.format("%s",(String)"String").toString()
                : (String)String.valueOf(stringString.toString())
                )
            );

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
                STR."""

                \{string["String".length() - "String".length()]}
                \{string["String".length() - "Strin".length()]}
                \{string["String".length() - "Stri".length()]}
                \{string["String".length() - "Str".length()]}
                \{string["String".length() - "St".length()]}
                \{string["String".length() - "S".length()]}
                """
        );
    }
}
