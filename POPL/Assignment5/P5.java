import java.io.ByteArrayInputStream;
import java.io.InputStream;

import syntaxtree.*;
import visitor.*;

public class P5 {
   public static void main(String [] args) {
      try {
         Node root = new MicroJavaParser(System.in).Goal();
         //System.out.println("Program parsed successfully");

         String val = (String) root.accept(new GJDepth4<Object, Object>(), null); // Your assignment part is invoked here.
         InputStream is1 = new ByteArrayInputStream( val.getBytes() );
         MicroJavaParser.ReInit(is1);
         Node root2 = MicroJavaParser.Goal();
         Object val2 = root2.accept(new GJDepthFirst<Object, Object>(), null);
         root2.accept(new GJDepth2<Object, Object>(), val2);

      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
