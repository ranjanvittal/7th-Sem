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
public class GJDepthFirst<R,A> implements GJVisitor<R,A> {
    //
    // Auto class visitors--probably don't need to be overridden.
    //
    Environment current_env;
    Set<Node> let_rec = new HashSet<Node>();
    Solver solver = new Solver();
    int overall_temps = 1;
    Type booleanType = new BooleanType();
    Type intType = new IntType();
    Type voidType = new VoidType();
    Type setType = new SetType();
    Type final_expression_type;
    boolean first_pass = false;
    Set<Integer> gen = new HashSet<Integer>();
    Type stored_argument;
    Type stored_return;

    void print(String h) {
        System.out.println(h);
    }
    void cry() {
        print("Program does not type check");
        System.exit(0);
    }
    boolean addConstraint(Type t1, Type t2) {
        return solver.addConstraint(t1, t2);
    }


    class Type {
        boolean is_int;
        boolean is_bool;
        boolean is_void;
        boolean is_set;
        boolean is_func;
        boolean is_template;
        Type argument_type;
        Type return_type;
        int temp_count;
        public void print() {}
        public Set<Integer> variables_involved() {return gen;}
        public Type replace(Type t1, Type t2) {return intType;}

        public void print_stuff() {
            System.out.println("");
            System.out.println(is_int);
            System.out.println(is_bool);
            System.out.println(is_void);
            System.out.println(is_set);
            System.out.println(is_func);
            System.out.println(is_template);
            System.out.println(argument_type);
            System.out.println(return_type);
            System.out.println(temp_count);
            System.out.println("");
        }
    }

    class IntType extends Type {
        public IntType() {
            is_int = true;
            is_bool = false;
            is_void = false;
            is_set = false;
            is_func = false;
            is_template = false;
            argument_type = null;
            return_type = null;
            temp_count = 0;
        }

        public void print() {
            System.out.print(" int");
        }

        public Type replace(Type t1, Type t2) {
            return intType;
        }
    }

    class BooleanType extends Type {
        public BooleanType() {
            is_int = false;
            is_bool = true;
            is_void = false;
            is_set = false;
            is_func = false;
            is_template = false;
            argument_type = null;
            return_type = null;
            temp_count = 0;
        }

        public void print() {
            System.out.print(" boolean");
        }

        public Type replace(Type t1, Type t2) {
            return booleanType;
        }
    }

    class VoidType extends Type {
        public VoidType() {
            is_int = false;
            is_bool = false;
            is_void = true;
            is_set = false;
            is_func = false;
            is_template = false;
            argument_type = null;
            return_type = null;
            temp_count = 0;
        }

        public void print() {
            System.out.print(" void");
        }

        public Type replace(Type t1, Type t2) {
            return voidType;
        }
    }

    class SetType extends Type {
        public SetType() {
            is_int = false;
            is_bool = false;
            is_void = false;
            is_set = true;
            is_func = false;
            is_template = false;
            argument_type = null;
            return_type = null;
            temp_count = 0;
        }

        public void print() {
            System.out.print(" tx");
        }

        public Type replace(Type t1, Type t2) {
            return setType;
        }
    }

    class FunctionType extends Type {
        public FunctionType(Type argument_type, Type return_type) {
            is_int = false;
            is_bool = false;
            is_void = false;
            is_set = false;
            is_func = true;
            is_template = false;
            this.argument_type = argument_type;
            this.return_type = return_type;
            temp_count = 0;
        }

        public void print() {
            argument_type.print();
            System.out.print("->");
            return_type.print();
        }
        public Set<Integer> variables_involved() {
            Set<Integer> a = argument_type.variables_involved();
            Set<Integer> b = return_type.variables_involved();
            a.addAll(b);
            return a;
        }
        public Type replace(Type t1, Type t2) {
            Type t1_ = this.argument_type.replace(t1, t2);
            Type t2_ = this.return_type.replace(t1, t2);
            return new FunctionType(t1_, t2_);
        }
    }

    class TemplateType extends Type {
        public TemplateType() {
            is_int = false;
            is_bool = false;
            is_void = false;
            is_set = false;
            is_func = false;
            is_template = true;
            this.argument_type = argument_type;
            this.return_type = return_type;
            temp_count = overall_temps++;
        }

        public void print() {
            System.out.print(" t");
            System.out.print(temp_count);
        }

        public Set<Integer> variables_involved() {
            Set<Integer> s = new HashSet<Integer>();
            s.add(temp_count);
            return s;
        }

        public Type replace(Type t1, Type t2) {
            if(this == t1)
                return t2;
            else
                return this;
        }
    }

    class Environment {
        public Hashtable<String, Type> variables;
        public Environment parent;
        public Environment(Environment parent) {
            variables = new Hashtable<String, Type>();
            this.parent = parent;
        }
        public Environment() {
            variables = new Hashtable<String, Type>();
            this.parent = null;
        }

        public void put(String variable, Type type) {
            variables.put(variable, type);
        }

        public Environment extend() {
            Environment e = new Environment(this);
            current_env = e;
            return e;
        }
        public Environment extend(Hashtable<String, Type> entries) {
            Environment e = new Environment(this);
            e.variables = entries;
            current_env = e;
            return e;
        }

        public Environment rollBack() {
            current_env = parent;
            return parent;
        }

        public Type get(String variable) {
            if(variables.containsKey(variable))
                return variables.get(variable);
            if(parent != null)
                return parent.get(variable);
            else {
                addConstraint(intType, booleanType);
                return intType;
            }
        }

        public void pretty() {
            System.out.println("variables :\n" + variables);
        }
    }

    class Constraint {
        Type s;
        Type t;
        public Constraint(Type s, Type t) {this.s = s;this.t = t;}
        public void print(Type t1, Type t2) {
            t1.print(); System.out.print(" = "); t2.print();
            System.out.println("");
        }
    }

    class Unification {
        Hashtable<Type, Type> unification;
        Hashtable<Type, Vector<Type> > unprocessed_equals;
        Hashtable<Type, Vector<Type> > equals;
        Hashtable<Type, Type> renaming;
        public Unification() {
            unification = new Hashtable<Type, Type>();
            unprocessed_equals = new Hashtable<Type, Vector<Type> >();
            equals = new Hashtable<Type, Vector<Type> >();
            renaming = new Hashtable<Type, Type>();
        }

        public void process_equals(Type t1) {
            Vector<Type> v = equals.remove(t1);
            Set<Type> s;
            if(v == null)
                return;
            else {
                s = new HashSet<Type>();
                s.add(t1);
                Vector< Vector<Type> >v2 = new Vector< Vector <Type> >();
                v2.add(v);
                while(v2.size() > 0) {
                    int i = 0;
                    Vector<Type> v1 = v2.remove(0);
                    while(i < v1.size()) {
                        Type t3 = v1.get(i);
                        if(!s.contains(t3)) {
                            s.add(t3);
                            renaming.put(t3, t1);
                            Vector<Type> v7 = equals.remove(t3);
                            v2.add(v7);
                        }
                        i++;
                    }
                }
            }
        }

        public void process_all_equals() {
            Enumeration<Type> en = equals.keys();
            while(en.hasMoreElements())
                process_equals(en.nextElement());
            en = unification.keys();
            while(en.hasMoreElements()) {
                Type t = en.nextElement();
                Type r = unification.get(t);
                Enumeration<Type> en2 = renaming.keys();
                while(en2.hasMoreElements()) {
                    Type t1 = en2.nextElement();
                    Type t2 = renaming.get(t1);
                    r = r.replace(t1, t2);
                }
                unification.put(t, r);
            }
        }

        public void update_unprocessed(Type t1, Type t2) {

            Vector<Type> v = unprocessed_equals.remove(t1);

            Set<Type> s;
            if(v == null)
                return;
            else {
                s = new HashSet<Type>();
                Vector< Vector<Type> > v2 = new Vector< Vector <Type> >();
                s.add(t1);
                v2.add(v);
                while(v2.size() > 0) {
                    int i = 0;
                    Vector<Type> v1 = v2.remove(0);
                    while(i < v1.size()) {
                        Type t3 = v1.get(i);
                        if(!s.contains(t3)) {
                            s.add(t3);
                            unification.put(t3, t2);
                            Vector<Type> v7 = unprocessed_equals.remove(t3);
                            v2.add(v7);
                        }
                        i++;
                    }
                }
            }
        }
        public boolean compose_simple(Type t1, Type t2) {
            if(unification.containsKey(t1)) {
                Type t3 = unification.get(t1);
                if(t3 != t2)
                    return false;
            }
            else {
                unification.put(t1, t2);
                update_unprocessed(t1, t2);
            }
            return true;
        }

        public boolean compose_templates(Type t1, Type t2) {
            Type t3 = unification.get(t1);
            Type t4 = unification.get(t2);
            // t1.print();
            // t2.print();
            // System.out.println("");
            if(equals.containsKey(t1))
                equals.get(t1).add(t2);
            else {
                Vector<Type> t5 = new Vector<Type>();
                t5.add(t2);
                equals.put(t1, t5);
            }
            if(equals.containsKey(t2))
                equals.get(t2).add(t1);
            else {
                Vector<Type> t5 = new Vector<Type>();
                t5.add(t1);
                equals.put(t2, t5);
            }
            // System.out.println(equals.get(t1));
            // System.out.println(equals.get(t2));
            if(t3 != null && t4 != null) {
                if(t3.is_func && t4.is_func) {
                    addConstraint(t3.argument_type, t4.argument_type);
                    addConstraint(t3.return_type, t4.return_type);
                    return true;
                }
                if(!t3.is_func && !t4.is_func)
                    return t3 == t4;
                return false;
            }
            if(t3 != null && t4 == null) {
                unification.put(t2, t3);
                update_unprocessed(t2, t3);
            }
            if(t4 != null && t3 == null) {
                unification.put(t1, t4);
                update_unprocessed(t1, t4);
            }

            if(t3 == null && t4 == null) {
                if(unprocessed_equals.containsKey(t1))
                    unprocessed_equals.get(t1).add(t2);
                else {
                    Vector<Type> t5 = new Vector<Type>();
                    t5.add(t2);
                    unprocessed_equals.put(t1, t5);
                }
                if(unprocessed_equals.containsKey(t2))
                    unprocessed_equals.get(t2).add(t1);
                else {
                    Vector<Type> t5 = new Vector<Type>();
                    t5.add(t1);
                    unprocessed_equals.put(t2, t5);
                }
            }
            return true;
        }

        public boolean compose_functions(Type t1, Type t2) {
            Set<Integer> k = new HashSet<Integer>(t1.variables_involved());
            k.retainAll(t2.variables_involved());

            if(k.size() == 0) {
                Type t3 = unification.get(t1);
                if(t3 == null) {
                    unification.put(t1, t2);
                    update_unprocessed(t1, t2);
                }
                else {
                    if(t3.is_func) {
                        addConstraint(t3.argument_type, t2.argument_type);
                        addConstraint(t3.return_type, t2.return_type);
                    }
                    else
                        return false;
                }
            }
            else
                return false;
            return true;
        }

        public void print() {
            int i = 0;
            Enumeration<Type> e = unification.keys();
            while(e.hasMoreElements()) {
                Type t1 = e.nextElement();
                Type t2 = unification.get(t1);
                t1.print();
                System.out.print(" = ");
                t2.print();
                System.out.println("");
            }
        }

        public void check_tinker(Type t2, Set<Type> danger) {
            if(danger.contains(t2))
                cry();
            danger.add(t2);
            if(t2.is_template) {
                Type t3 = unification.get(t2);
                if(t3 != null)
                    check_tinker(t3, danger);
            }
            else if(t2.is_func){
                Set<Type> danger1;
                Set<Type> danger2;
                danger1 = new HashSet<Type>();
                danger2 = new HashSet<Type>();
                danger1.addAll(danger);
                danger2.addAll(danger);
                check_tinker(t2.argument_type, danger1);
                check_tinker(t2.return_type, danger2);
            }
        }

        public void final_tinker(Type t2) {
            if(!t2.is_func && !t2.is_template)
                t2.print();
            else if(t2.is_template) {
                Type t3 = unification.get(t2);
                if(t3 == null)
                    t2.print();
                else
                    final_tinker(t3);
            }
            else {
                System.out.print("(");
                final_tinker(t2.argument_type);
                System.out.print(" -> (");
                final_tinker(t2.return_type);
                System.out.print(" ) )");
            }
        }

        public void finish() {
            //print();
            Enumeration<Type> en = unification.keys();
            while(en.hasMoreElements()) {
                Type t1 = en.nextElement();
                Type t2 = unification.get(t1);
                Set<Type> s = new HashSet<Type>();
                s.add(t1);
                check_tinker(t2, s);
            }
            final_tinker(final_expression_type);
            System.out.println("");
        }
    }
    class Solver {
        Vector<Constraint> constraints;
        Vector<Constraint> all_constraints;
        Unification sigma;
        public Solver() {
            constraints = new Vector<Constraint>();
            all_constraints = new Vector<Constraint>();
        }
        public boolean addConstraint(Type t1, Type t2) {
            if(t1 == null || t2 == null) {
                cry();
            }
            if(t1 == t2)
                return true;
            // t1.print();
            // System.out.print( " = ");
            // t2.print();
            // System.out.println("");
            boolean fl = is_constraint_present(t1, t2);
            if(!fl) {
                Constraint c = new Constraint(t1, t2);
                constraints.add(c);
                all_constraints.add(c);
            }

            return !fl;
        }

        public boolean is_constraint_present(Type t1, Type t2) {
            for(int i = 0; i < all_constraints.size(); i++) {
                Constraint c = all_constraints.get(i);
                if((c.s == t1 && c.t == t2) ||
                    (c.s == t2 && c.t == t1)
                )
                    return true;
            }
            return false;
        }

        public boolean processConstraints() {
            //1 Choose and remove an equation e from G. Say eσ is (s = t).
            //2 If s and t are variables, or s and t are both Int then continue.
            //3 If s = s1 → s2 and t = t1 → t2, then G = G∪ {s1 = t1,s2 = t2}.
            //4 If (s = Int and t is an arrow type) or vice versa then failure = true.
            //5 If s is a variable that does not occur in t, then σ = σ o [s := t].
            //6 If t is a variable that does not occur in s, then σ = σ o [t := s].
            //7 If s != t and either s is a variable that occurs in t or vice versa then
            //failure = true.
            Constraint c = constraints.remove(0);
            Type s = c.s;
            Type t = c.t;
            boolean failure = false;
            if(s == null || t == null)
                cry();
            if(!s.is_template && !s.is_func) {
                if(!t.is_template && !t.is_func) {
                  failure = !(s == t);
                }
                else if(t.is_func)
                    failure = true;
                else {
                    failure = !sigma.compose_simple(t, s);
                }
            }

            else if(!t.is_template && !t.is_func) {
                if(s.is_func)
                    failure = true;
                else {failure = !sigma.compose_simple(s, t);}
            }

            else if(s.is_template && t.is_template) {
                failure = !sigma.compose_templates(s, t);
            }

            else if(s.is_func && t.is_func) {
                addConstraint(s.argument_type, t.argument_type);
                addConstraint(s.return_type, t.return_type);
            }

            else {
                if(s.is_template)
                    failure = !sigma.compose_functions(s, t);
                else if(t.is_template)
                    failure = !sigma.compose_functions(t, s);
            }
            return failure;
        }
        public void Solve() {
            //print("Started Solving");
            boolean failure = false;
            sigma = new Unification();
            while(constraints.size() > 0 && !failure) {
                failure = processConstraints();
            }
            sigma.process_all_equals();
            if(failure)
                cry();
            else
                sigma.finish();
        }
    }



    public R visit(NodeList n, A argu) {
        R _ret=null;
        int _count=0;
        for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
        }
        return _ret;
    }

    public R visit(NodeListOptional n, A argu) {
        if ( n.present() ) {
            R _ret=null;
            int _count=0;
            for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
                e.nextElement().accept(this,argu);
                _count++;
            }
            return _ret;
        }
        else
            return null;
    }

    public R visit(NodeOptional n, A argu) {
        if ( n.present() )
            return n.node.accept(this,argu);
        else
            return null;
    }

    public R visit(NodeSequence n, A argu) {
        R _ret=null;
        int _count=0;
        for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
            e.nextElement().accept(this,argu);
            _count++;
        }
        return _ret;
    }

    public R visit(NodeToken n, A argu) { return null; }

    //
    // User-generated visitor methods below
    //

    /**
     * f0 -> Expression()
     * f1 -> <EOF>
     */
    public R visit(Goal n, A argu) {
        R _ret=null;
        current_env = new Environment();
        final_expression_type = new TemplateType();
        addConstraint(final_expression_type, (Type) n.f0.accept(this, argu));
        n.f1.accept(this, argu);
        solver.Solve();
        return _ret;
    }

    /**
     * f0 -> IntegerLiteral()
     *         | TrueLiteral()
     *         | FalseLiteral()
     *         | PlusExpression()
     *         | IfExpression()
     *         | LetExpression()
     *         | Identifier()
     *         | Assignment()
     *         | ProcedureExp()
     *         | Application()
     *         | RecExpression()
     */
    public R visit(Expression n, A argu) {
        if(n.f0.which == 6) {
            return (R) current_env.get((String) n.f0.accept(this, argu));
        }

        return n.f0.accept(this, argu);
    }

    /**
     * f0 -> <INTEGER_LITERAL>
     */
    public R visit(IntegerLiteral n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return (R) intType;
    }

    /**
     * f0 -> "#t"
     */
    public R visit(TrueLiteral n, A argu) {
        return (R) booleanType;
    }

    /**
     * f0 -> "#f"
     */
    public R visit(FalseLiteral n, A argu) {
        return (R) booleanType;
    }

    /**
     * f0 -> "("
     * f1 -> "+"
     * f2 -> Expression()
     * f3 -> Expression()
     * f4 -> ")"
     */
    public R visit(PlusExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        Type t1 = (Type) n.f2.accept(this, argu);
        Type t2 = (Type) n.f3.accept(this, argu);
        addConstraint(t1, intType);
        addConstraint(t2, intType);
        n.f4.accept(this, argu);
        return (R) intType;
    }

    /**
     * f0 -> "("
     * f1 -> "if"
     * f2 -> Expression()
     * f3 -> Expression()
     * f4 -> Expression()
     * f5 -> ")"
     */
    public R visit(IfExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        Type t1 = (Type) n.f2.accept(this, argu);
        addConstraint(t1, booleanType);
        Type t2 = (Type) n.f3.accept(this, argu);
        Type t3 = (Type) n.f4.accept(this, argu);
        addConstraint(t2, t3);
        n.f5.accept(this, argu);
        return (R) t2;
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
    public R visit(LetExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        Hashtable<String, Type> entries = new Hashtable<String, Type>();
        n.f3.accept(this, argu);
        Enumeration<Node> elems = n.f3.elements();
        while(elems.hasMoreElements()) {
            Declaration d = (Declaration) elems.nextElement();
            String id = (String) d.f1.accept(this, argu);
            Type t = (Type) d.f2.accept(this, argu);
            entries.put(id, t);
        }
        current_env.extend(entries);
        Type t = (Type) n.f5.accept(this, argu);

        current_env.rollBack();
        return (R) t;
    }

    /**
     * f0 -> <IDENTIFIER>
     */
    public R visit(Identifier n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return (R) n.f0.toString();
    }

    /**
     * f0 -> "("
     * f1 -> "set!"
     * f2 -> Identifier()
     * f3 -> Expression()
     * f4 -> ")"
     */
    public R visit(Assignment n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        String id = (String) n.f2.accept(this, argu);
        Type t1 = current_env.get(id);
        Type t2 = (Type) n.f3.accept(this, argu);
        addConstraint(t1, t2);
        n.f4.accept(this, argu);
        return (R) setType;
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
    public R visit(ProcedureExp n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        Enumeration<Node> k = n.f3.elements();
        int size = n.f3.size();
        Type argument_type;
        Type return_type;
        Type running_type;
        Hashtable<String, Type> entries = new Hashtable<String, Type>();

        if(let_rec.contains(n)) {
            argument_type = stored_argument;
            running_type = return_type = stored_return;
        }

        else {
            argument_type = new TemplateType();
            running_type = return_type = new TemplateType();
        }
        if(k.hasMoreElements()) {
            String id = (String) k.nextElement().accept(this, argu);
            entries.put(id, argument_type);
            running_type = return_type;

            while(k.hasMoreElements()) {
                id = (String) k.nextElement().accept(this, argu);
                Type t1 = new TemplateType();
                Type t2 = new TemplateType();
                entries.put(id, t1);
                addConstraint(running_type, new FunctionType(t1, t2));
                running_type = t2;
            }
        }
        else {
            addConstraint(argument_type, voidType);
        }
        current_env.extend(entries);
        Type t3 = (Type) n.f5.accept(this, argu);
        addConstraint(running_type, t3);
        current_env.rollBack();
        Type t1 = new FunctionType(argument_type, return_type);
        return (R) t1;
    }

    /**
     * f0 -> "("
     * f1 -> Expression()
     * f2 -> ( Expression() )*
     * f3 -> ")"
     */
    public R visit(Application n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        Type t = (Type) n.f1.accept(this, argu);
        Type return_type;
        Type argument_type;
        Type running_type;
        Enumeration<Node> e = n.f2.elements();
        Type current_type = t;

        if(n.f2.size() == 0) {
            return_type = new TemplateType();
            addConstraint(t, new FunctionType(voidType, return_type));
            current_type = return_type;
        }
        boolean fl = true;
        while(e.hasMoreElements()) {
            Type t1 = (Type) e.nextElement().accept(this, argu);
            argument_type = new TemplateType();
            return_type = new TemplateType();
            Type t2 = new FunctionType(argument_type, return_type);
            addConstraint(current_type, t2);
            if(fl) {
                addConstraint(t, t2);
                fl = false;
            }
            addConstraint(argument_type, t1);
            current_type = return_type;
        }

        return (R) current_type;
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
    public R visit(RecExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        first_pass = true;
        current_env.extend();
        n.f3.accept(this, argu);
        first_pass = false;
        if(!first_pass) {
            n.f3.accept(this, argu);
        }
        Type t1 = (Type) n.f5.accept(this, argu);
        current_env.rollBack();
        return (R) t1;
    }

    /**
     * f0 -> "("
     * f1 -> Identifier()
     * f2 -> Expression()
     * f3 -> ")"
     */
    public R visit(Declaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "("
     * f1 -> Identifier()
     * f2 -> ProcedureExp()
     * f3 -> ")"
     */
    public R visit(RecDeclaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        String id = (String) n.f1.accept(this, argu);
        if(first_pass) {
            Type argument_type = new TemplateType();
            Type return_type = new TemplateType();
            let_rec.add(n.f2);
            current_env.put(id, new FunctionType(argument_type, return_type));
        }
        else {
            stored_argument = current_env.get(id).argument_type;
            stored_return = current_env.get(id).return_type;
            n.f2.accept(this, argu);
        }
        n.f3.accept(this, argu);
        return _ret;
    }

}
