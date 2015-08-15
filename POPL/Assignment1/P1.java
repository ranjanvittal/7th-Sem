import syntaxtree.*;
import visitor.*;

public class P1 {
   public static void main(String [] args) {
      try {
         Node root = new MiniJavaParser(System.in).Goal();
         Object passOn = root.accept(new GJDepthFirst<Object, Object>(), null); // Your assignment part is invoked here.
         root.accept(new GJDepthFirst2<Object, Object>(), passOn);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
