public enum Main {
    ;

    public static void main(String... args) {
//        var provider = StringProviderGenerator.builder().string("String").build().generate();
//        var reader = StringProvider::provide;

//        var printer = new StringPrinter(provider, reader);

//        printer.print();
    }

    public static interface StringProviderGenerator {
        StringProvider generate();

        public static Builder builder() {
            return new Builder();
        }

        public static class Builder {
            private String string;

            private Builder() {
                this.string = "";
            }

            public Builder string(String string) {
                this.string = string;
                return this;
            }

            public StringProviderGenerator build() {
                return () -> {return () -> string;};
            }
        }
    }

    public static interface StringProvider {
        String provide();
    }


    public static interface StringReader {
        String read(StringProvider provider);
    }

    public static class StringPrinter {
        private final String string;

        public StringPrinter(StringProvider provider, StringReader reader) {
            this.string = reader.read(provider);
        }

        public void print() {
            System.out.println(string);
        }
    }
}