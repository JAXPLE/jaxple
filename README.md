~~~
public class GarbageMaker {
    public static void main(String[] args) {
        Object str = new String("str");
        String stringStr = String.valueOf(str);

        Object ing = new String("ing");
        String stringIng = String.valueOf(ing);

        Object oString = (String)str.toString() + (String)ing.toString();
        String string = String.valueOf(oString);
        
        System.out.println((String)string.toString());
    }
}
~~~
