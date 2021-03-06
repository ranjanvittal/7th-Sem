//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * All GJ visitors with no argument must implement this interface.
 */

public interface GJNoArguVisitor<R> {

   //
   // GJ Auto class visitors with no argument
   //

   public R visit(NodeList n);
   public R visit(NodeListOptional n);
   public R visit(NodeOptional n);
   public R visit(NodeSequence n);
   public R visit(NodeToken n);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> ( Query() )*
    * f1 -> ( InterfaceDeclaration() )*
    * f2 -> <EOF>
    */
   public R visit(Goal n);

   /**
    * f0 -> Identifier()
    * f1 -> "<="
    * f2 -> Identifier()
    * f3 -> "?"
    */
   public R visit(Query n);

   /**
    * f0 -> "interface"
    * f1 -> Identifier()
    * f2 -> InterfaceBody()
    */
   public R visit(InterfaceDeclaration n);

   /**
    * f0 -> "{"
    * f1 -> ( InterfaceMember() )*
    * f2 -> "}"
    */
   public R visit(InterfaceBody n);

   /**
    * f0 -> ResultType()
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> Type()
    * f4 -> Identifier()
    * f5 -> ")"
    * f6 -> ";"
    */
   public R visit(InterfaceMember n);

   /**
    * f0 -> BooleanType()
    *       | IntegerType()
    *       | Identifier()
    */
   public R visit(Type n);

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n);

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n);

   /**
    * f0 -> VoidType()
    *       | Type()
    */
   public R visit(ResultType n);

   /**
    * f0 -> "void"
    */
   public R visit(VoidType n);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n);

}

