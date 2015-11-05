import java.io.ByteArrayInputStream;
import java.io.InputStream;

import syntaxtree.*;
import visitor.*;

public class Main {
   public static void main(String [] args) {
      try {
         Node root = new NanoJavaParser(System.in).Goal();
         System.out.println("Program parsed successfully");
      }
      catch (ParseException e) {
         System.out.println(e.toString());
      }
   }
}
