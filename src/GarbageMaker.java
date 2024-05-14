import java.lang.*;

public class GarbageMaker {
    static class Str {
        class ing {
            String S = "S";
            String t = "t";
            String r = "r";
            String i = "i";
            String n = "n";
            String g = "g";
        }
    };

    static {
        try {
            main(ProcessingGarbage(
                    new String[]{
                        new Str().new ing().S,
                        new Str().new ing().t,
                        new Str().new ing().r,
                        new Str().new ing().i,
                        new Str().new ing().n,
                        new Str().new ing().g
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
