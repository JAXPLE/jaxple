~~~
import java.lang.String;

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

    protected static String[] ProcessingGarbage(String...strings) {
        StringBuilder StringString = new StringBuilder();
        for (int sIr = "String".length() - "String".length(); sIr < "String".length(); sIr++)
            StringString.append(strings[sIr]);

        String string = String.format("%s", String.valueOf(
                String.class.getName().split("\\.")["St".length()].equals(StringString.toString())
                ? String.format("%s",(String)"String").toString()
                : (String)String.valueOf(StringString.toString())
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

    public static void main(String... Strings) {
        throw new RuntimeException(
            Strings["String".length() - "String".length()] +
            Strings["String".length() - "Strin".length()] +
            Strings["String".length() - "Stri".length()] +
            Strings["String".length() - "Str".length()] +
            Strings["String".length() - "St".length()] +
            Strings["String".length() - "S".length()]
        );
    }
}
~~~