public enum GarbageMaker {;
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
                            new String[]{
                                    new Str.ing().S,
                                    new Str.ing().t,
                                    new Str.ing().r,
                                    new Str.ing().i,
                                    new Str.ing().n,
                                    new Str.ing().g,
                            }
                    )
            );
        } catch (SSSString e) {
            System.err.println(e.goodCatchButImGonnaGiveYouStringLOL());
        }
    }

    protected static String[] ProcessingGarbage(String... Strings) {
        StringBuilder StringString = new StringBuilder();
        for (var sIr = "String".length() - "String".length(); sIr < "String".length(); sIr++)
            StringString.append(Strings[sIr]);

        String string = java.lang.String.format("%s", java.lang.String.valueOf(
                        String.class.getName().split("\\.")["St".length()].equals(StringString.toString())
                                ? java.lang.String.format("%s", (String) "String").toString()
                                : (String) java.lang.String.valueOf(StringString.toString())
                )
        );

        return new String[]{
                String.valueOf(string.charAt("String".length() - "S".length())),
                String.valueOf(string.charAt("String".length() - "St".length())),
                String.valueOf(string.charAt("String".length() - "Str".length())),
                String.valueOf(string.charAt("String".length() - "Stri".length())),
                String.valueOf(string.charAt("String".length() - "Strin".length())),
                String.valueOf(string.charAt("String".length() - "String".length())),
        };
    }

    public static void main(String... Strings) throws SSSString {
        throw new SSSString(
                Strings["String".length() - "String".length()] +
                        Strings["String".length() - "Strin".length()] +
                        Strings["String".length() - "Stri".length()] +
                        Strings["String".length() - "Str".length()] +
                        Strings["String".length() - "St".length()] +
                        Strings["String".length() - "S".length()]
        );
    }
}

class SSSString extends Exception {
    public SSSString(String string) {
        super(string.equals("String") ? string : "String");
    }

    public String goodCatchButImGonnaGiveYouStringLOL() {
        return "String";
    }
}
