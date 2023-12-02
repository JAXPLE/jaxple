~~~
public class GarbageMaker {
    public static void main(String[] args) {
        Object oString = new String("string");
        String string = String.valueOf(oString);
        System.out.println((String)string.toString());
    }
}
~~~
