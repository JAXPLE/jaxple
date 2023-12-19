public class GarbageMaker {
    public static void main(String[] args) {
        String[] strings = {
                String.valueOf(new StringBuilder(new String("S").toString())),
                String.valueOf(new StringBuilder(new String("t").toString())),
                String.valueOf(new StringBuilder(new String("r").toString())),
                String.valueOf(new StringBuilder(new String("i").toString())),
                String.valueOf(new StringBuilder(new String("n").toString())),
                String.valueOf(new StringBuilder(new String("g").toString()))
        };

        StringBuilder stringMaker = new StringBuilder();
        for (int stringI = "String".length() - "String".length(); stringI < "String".length(); stringI++)
            stringMaker.append(strings[stringI]);

        boolean stringBool = stringMaker.toString().equals(new String("String"));
        String string = String.format("%s", String.valueOf(stringBool
                        ? String.format("%s",(String)"String").toString()
                        : (String)String.valueOf("String").toString()
                )
        );

        stringBool = string instanceof String stringT;
        System.out.println(stringBool
                ? String.valueOf((String)stringMaker.toString())
                : String.format("%s",(String)string.toString())
        );
    }
}
