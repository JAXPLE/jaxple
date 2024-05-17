~~~
import java.lang.String;

public class GarbageMaker {
    static {
        class Strings<String> {
            String String;

            public Strings(String string) {
                String = string;
            }

            public String getString() {
                return String;
            }
        }

        class Str {
            class ing {
                Strings<String> S = new Strings<String>("S");
                Strings<String> t = new Strings<String>("t");
                Strings<String> r = new Strings<String>("r");
                Strings<String> i = new Strings<String>("i");
                Strings<String> n = new Strings<String>("n");
                Strings<String> g = new Strings<String>("g");
            }
        }

        try {
            main(ProcessingGarbage(
                    new String[]{
                        new Strings<String>(new Str().new ing().S.getString()).getString(),
                        new Strings<String>(new Str().new ing().t.getString()).getString(),
                        new Strings<String>(new Str().new ing().r.getString()).getString(),
                        new Strings<String>(new Str().new ing().i.getString()).getString(),
                        new Strings<String>(new Str().new ing().n.getString()).getString(),
                        new Strings<String>(new Str().new ing().g.getString()).getString()
                    }
                )
            );
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
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

    public static void main(String[] strings) {
        throw new RuntimeException(
            strings["String".length() - "String".length()] +
            strings["String".length() - "Strin".length()] +
            strings["String".length() - "Stri".length()] +
            strings["String".length() - "Str".length()] +
            strings["String".length() - "St".length()] +
            strings["String".length() - "S".length()]
        );
    }
}

~~~