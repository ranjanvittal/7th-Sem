import syntaxtree.*;
import visitor.*;

public class P2 {
   public static void main(String [] args) {
      try {
         Node root = new MicroJavaParser(System.in).Goal();
         Object v = root.accept(new GJDepthFirst<Object, Object>(), null);
         root.accept(new GJDepthFirst2<Object, Object>(), v);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
