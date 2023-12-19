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

        Object stringMaker =
                strings[((Character)'S' - (Character)'S') + 0] +
                        strings[((Character)'t' - (Character)'t') + 1] +
                        strings[((Character)'r' - (Character)'r') + 2] +
                        strings[((Character)'i' - (Character)'i') + 3] +
                        strings[((Character)'n' - (Character)'n') + 4] +
                        strings[((Character)'g' - (Character)'g') + 5];

        boolean stringBool = ((String)stringMaker.toString()).equals((String)new String("String").toString());
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
