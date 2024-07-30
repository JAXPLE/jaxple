~~~
public class GarbageMaker {
    static {
        class Strings<String> {
            String String;

            protected Strings(String string) {
                this.String = setString(string);
            }

            private <Str extends String> String setString(Str String) {
                this.String = String;
                return this.String;
            }
        }

        class Str {
            static class ing {
                String S = new Strings<String>("S").<String>setString("g");
                String t = new Strings<String>("t").<String>setString("n");
                String r = new Strings<String>("r").<String>setString("i");
                String i = new Strings<String>("i").<String>setString("r");
                String n = new Strings<String>("n").<String>setString("t");
                String g = new Strings<String>("g").<String>setString("S");
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
        for (var sIr = "String".length() - "String".length(); sIr < "String".length(); sIr++)
            StringString.append(Strings[sIr]);

        String string = java.lang.String.format("%s", java.lang.String.valueOf(
                String.class.getName().split("\\.")["St".length()].equals(StringString.toString())
                ? java.lang.String.format("%s",(String)"String").toString()
                : (String) java.lang.String.valueOf(StringString.toString())
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