import syntaxtree.*;
import visitor.*;

public class P3 {
   public static void main(String [] args) {
      try {
         Node root = new InterfaceParser(System.in).Goal();
         root.accept(new GJDepthFirst<Object, Object>(), null);
         //root.accept(new GJDepthFirst2<Object, Object>(), v);
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
