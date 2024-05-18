~~~
import java.lang.String;

public class GarbageMaker {
    static {
        class Strings<String> {
            String String;

            public Strings(String String) {
                this.String = String;
            }

            public String getString() {
                return String;
            }
        }

        class Str {
            static class ing {
                String S = new Strings<String>("S").getString();
                String t = new Strings<String>("t").getString();
                String r = new Strings<String>("r").getString();
                String i = new Strings<String>("i").getString();
                String n = new Strings<String>("n").getString();
                String g = new Strings<String>("g").getString();
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