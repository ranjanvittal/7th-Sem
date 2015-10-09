//
// Generated by JTB 1.3.2
//

package visitor;
import syntaxtree.*;
import java.util.*;

/**
 * Provides default methods which visit each node in the tree in depth-first
 * order.  Your visitors may extend this class.
 */
public class DepthFirstVisitor implements Visitor {
   //
   // Auto class visitors--probably don't need to be overridden.
   //
   public void visit(NodeList n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeListOptional n) {
      if ( n.present() )
         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
            e.nextElement().accept(this);
   }

   public void visit(NodeOptional n) {
      if ( n.present() )
         n.node.accept(this);
   }

   public void visit(NodeSequence n) {
      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); )
         e.nextElement().accept(this);
   }

   public void visit(NodeToken n) { }

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> Expression()
    * f1 -> <EOF>
    */
   public void visit(Goal n) {
      n.f0.accept(this);
      n.f1.accept(this);
   }

   /**
    * f0 -> IntegerLiteral()
    *       | TrueLiteral()
    *       | FalseLiteral()
    *       | PlusExpression()
    *       | IfExpression()
    *       | LetExpression()
    *       | Identifier()
    *       | Assignment()
    *       | ProcedureExp()
    *       | Application()
    *       | RecExpression()
    */
   public void visit(Expression n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "#t"
    */
   public void visit(TrueLiteral n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "#f"
    */
   public void visit(FalseLiteral n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> "+"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(PlusExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> "if"
    * f2 -> Expression()
    * f3 -> Expression()
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(IfExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> "let"
    * f2 -> "("
    * f3 -> ( Declaration() )*
    * f4 -> ")"
    * f5 -> Expression()
    * f6 -> ")"
    */
   public void visit(LetExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n) {
      n.f0.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> "set!"
    * f2 -> Identifier()
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(Assignment n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> "lambda"
    * f2 -> "("
    * f3 -> ( Identifier() )*
    * f4 -> ")"
    * f5 -> Expression()
    * f6 -> ")"
    */
   public void visit(ProcedureExp n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ( Expression() )*
    * f3 -> ")"
    */
   public void visit(Application n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> "letrec"
    * f2 -> "("
    * f3 -> ( RecDeclaration() )*
    * f4 -> ")"
    * f5 -> Expression()
    * f6 -> ")"
    */
   public void visit(RecExpression n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
      n.f4.accept(this);
      n.f5.accept(this);
      n.f6.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> Identifier()
    * f2 -> Expression()
    * f3 -> ")"
    */
   public void visit(Declaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

   /**
    * f0 -> "("
    * f1 -> Identifier()
    * f2 -> ProcedureExp()
    * f3 -> ")"
    */
   public void visit(RecDeclaration n) {
      n.f0.accept(this);
      n.f1.accept(this);
      n.f2.accept(this);
      n.f3.accept(this);
   }

}
