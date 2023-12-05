
``` 
public class GarbageMaker {
    public static void main(String[] args) {
        Object str = new String("str");
        String stringStr = String.valueOf(str).toString();

        Object ing = new String("ing");
        String stringIng = String.valueOf(ing).toString();

        Object stringString = (String)str.toString() + (String)ing.toString();
        String string = String.valueOf(stringString).toString();
        
        System.out.println((String)string.toString());
    }
}
```
