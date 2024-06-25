import java.lang.String;
import java.util.Arrays;

public class GarbageMaker {
    static {
        class Strings<String> {
            String String;

            public <Str extends String> String setString(Str String) {
                this.String = String;
                return this.String;
            }
        }

        class Str {
            static class ing {
                String S = new Strings<String>().<String>setString("S");
                String t = new Strings<String>().<String>setString("t");
                String r = new Strings<String>().<String>setString("r");
                String i = new Strings<String>().<String>setString("i");
                String n = new Strings<String>().<String>setString("n");
                String g = new Strings<String>().<String>setString("g");
            }
        }

        try {
            main(ProcessingGarbage(
                    new String[] {
                        new Str.ing().S,
                        new Str.ing().t,
                        new Str.ing().r,
                        new Str.ing().i,
                        new Str.ing().n,
                        new Str.ing().g,
                    }
                )
            );
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    protected static String[] ProcessingGarbage(String... Strings) {
        StringBuilder StringString = new StringBuilder();
        for (int sIr = "String".length() - "String".length(); sIr < "String".length(); sIr++)
            StringString.append(Strings[sIr]);

        String string = java.lang.String.format("%s", java.lang.String.valueOf(
                String.class.getName().split("\\.")["St".length()].equals(StringString.toString())
                ? java.lang.String.format("%s",(String)"String").toString()
                : (String) java.lang.String.valueOf(StringString.toString())
                )
            );

        return new String[] {
                java.lang.String.valueOf(string.charAt("String".length() - "S".length())),
                java.lang.String.valueOf(string.charAt("String".length() - "St".length())),
                java.lang.String.valueOf(string.charAt("String".length() - "Str".length())),
                java.lang.String.valueOf(string.charAt("String".length() - "Stri".length())),
                java.lang.String.valueOf(string.charAt("String".length() - "Strin".length())),
                java.lang.String.valueOf(string.charAt("String".length() - "String".length())),
        };
    }

    public static void main(String... Strings) {
//                Arrays.sort(Strings, (string1, string2) -> Integer.compare(string1.charAt(0), string2.charAt(0)));
        throw new RuntimeException(
                Arrays.toString(Strings)
        );
    }
}
