import java.util.Arrays;

public class GarbageMaker {
    static {
        main(ProcessingGarbage("S","t","r","i","n","g"));
    }

    protected static String[] ProcessingGarbage(String...strings) {
        StringBuilder stringString = new StringBuilder();
        for (int stringI = "String".length() - "String".length(); stringI < "String".length(); stringI++)
            stringString.append(strings[stringI]);

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
        throw new RuntimeException(Arrays.toString(string));
    }
}
