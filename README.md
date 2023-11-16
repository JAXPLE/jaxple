~~~
public class GarbageMaker {
    public static void main(String[] args) {
        Object object = new String("string");
        String string = String.valueOf(object);
        System.out.println((String)string.toString());
    }
}
~~~
