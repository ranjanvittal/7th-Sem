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
public class GJDepth2<R,A> extends GJDepthFirst<R, A> {
    //
    // Auto class visitors--probably don't need to be overridden.
    //

    int variable_count = 0;
    int class_count = 0;
    int index;
    Hashtable<String, Type> current_variables;
    Hashtable<Identifier, ClassExtendsDeclaration> types;
    MethodDeclaration current_method;
    Type current_class;
    ClassExtendsDeclaration klass;
    boolean inMethod;
    boolean boolean1;

    public boolean is_main(MethodDeclaration m) {
    	return !((String)m.f2.accept(new GJDepth5(), null)).startsWith("run");
    }



    public void __print(String s) {
        System.out.print(s);
    }
    public void __print(Node n) {
        n.accept(new GJDepth3(), null);
    }

    public void __println(String s) {
        System.out.println(s);
    }

    public Identifier new_variable() {
        variable_count++;
        return make_identifier(
            "var_" + Integer.toString(variable_count)
        );
    }

    public Identifier new_class() {
        class_count++;
        return make_identifier(
            "Class" + Integer.toString(class_count)
        );
    }

    public Identifier new_class_variable() {
    	variable_count++;
    	return make_identifier("latest_class_" + variable_count);
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
    Hashtable<String, String> current_context;

    public NodeListOptional make_node_list_optional(Node n) {
        return new NodeListOptional(n);
    }

    public NodeListOptional make_node_list_optional(Vector<Node> v) {
        NodeListOptional node_list_optional = new NodeListOptional();
        for(int i = 0; i < v.size(); i++) {
            node_list_optional.addNode(v.get(i));
        }
        return node_list_optional;
    }

    public Block make_block(Vector<Node> v) {
        return new Block(
            make_node_list_optional(v)
        );
    }

    public Identifier make_identifier(String s) {
        return new Identifier(new NodeToken(s));
    }

    public VarRef make_var_ref(Node n) {
        int choice = -1;
        if(n instanceof DotExpression) {
        	choice = 0;
        }
        else if(n instanceof Identifier) {
        	choice = 1;
        }
        NodeChoice node_choice = new NodeChoice(n, choice);
        VarRef var_ref = new VarRef(node_choice);
        return var_ref;
    }
    Vector<ClassExtendsDeclaration> new_classes = new Vector<ClassExtendsDeclaration>();
    //
    // User-generated visitor methods below
    //

    public Statement make_statement(Node n) {
        int choice = -1;
        if(n instanceof Block) {
            choice  = 0;
        }
        else if(n instanceof AssignmentStatement) {
            choice  = 1;
        }
        else if(n instanceof ArrayAssignmentStatement) {
            choice  = 2;
        }
        else if(n instanceof IfStatement) {
            choice  = 3;
        }
        else if(n instanceof WhileStatement) {
            choice  = 4;
        }
        else if(n instanceof PrintStatement) {
            choice  = 5;
        }
        else if(n instanceof MessageSendStatement) {
            choice  = 6;
        }
        return new Statement(
            new NodeChoice(n, choice)
        );
    }


    public ClassExtendsDeclaration makeClass() {
        MethodDeclaration md = new MethodDeclaration(
            make_identifier("run"), new NodeOptional()
            , new NodeListOptional(), new NodeListOptional()
        );
        Identifier cur_name = new_class();
        ClassExtendsDeclaration new_class_now = new ClassExtendsDeclaration(
            cur_name, make_identifier("Runner"),
            new NodeListOptional(), new NodeListOptional(md)
        );
        types.put(cur_name, new_class_now);
        return new_class_now;
    }

    public void add_statement(ClassExtendsDeclaration c, Statement s) {
        Node n = c.f6.elementAt(0);
        MethodDeclaration md = (MethodDeclaration) n;
        NodeListOptional node_list_optional = make_node_list_optional(s);
        md.f8 = node_list_optional;
    }

    public Identifier name(ClassExtendsDeclaration c) {
        return c.f1;
    }
    public Expression make_expression(Node n) {
    	Node p = null;
    	int choice = -1;
    	if(n instanceof AllocationExpression) {
	        p = new PrimaryExpression(new NodeChoice(n, 6));
	        choice = 6;
    	}
	    if(n instanceof Identifier) {
	    	p = new PrimaryExpression(new NodeChoice(
	    		make_var_ref(n), 3
	    	));
	    	choice = 6;
	    }
	    if(n instanceof ThisExpression) {
	    	p = new PrimaryExpression(new NodeChoice(n, 4));
	    	choice = 6;
	    }
        Expression expression = new Expression (
            new NodeChoice(p, choice)
        );
        return expression;
    }

    public void add_variable(MethodDeclaration m, Identifier var1, Node f1) {
    	if(m.f7 == null)
    		m.f7 = new NodeListOptional();
    	m.f7.addNode(new VarDeclaration(make_type(f1), var1));
    }

    public void add_variable(ClassExtendsDeclaration c, Identifier var1, Node f1) {
        if(c.f5 == null)
            c.f5 = new NodeListOptional();
        c.f5.addNode(new VarDeclaration(make_type(f1), var1));
    }

    private Type make_type(Node f1) {
    	int choice = -1;
    	if(f1 instanceof Type)
    		return (Type) f1;
		if(f1 instanceof ArrayType) {
			choice = 0;
		}
		else if(f1 instanceof BooleanType) {
            choice = 1;
        }
        else if(f1 instanceof IntegerType) {
            choice = 2;
        }
        else {
            choice = 3;
        }
        NodeChoice n = new NodeChoice(f1, choice);
		return new Type(n);
	}

    private Vector<Node> strip_remaining_statements(MethodDeclaration m, int index) {
    	Vector<Node> vc = new Vector<Node>();
		for(int i = index+1; i < m.f8.size(); i++) {
			vc.add(m.f8.elementAt(i));
            //__print(m.f8.elementAt(i));
		}
		return vc;
	}

    public Identifier make_continuation(MethodDeclaration m, int index, Type clas, ClassExtendsDeclaration c, boolean func) {

        while(index < m.f8.size()) {
    		m.f8.nodes.remove(index);
    	}
    	Identifier var = new_variable();
        if(is_main(m)) {
            add_variable(m, var, c.f1);
        }
        else {
            add_variable(klass, var, c.f1);
            // System.out.println(klass.f1.f0.toString());
            // System.out.println(c.f1.f0.toString());
            // System.out.println(var.f0.toString());
        }
    	Enumeration<String> en = current_variables.keys();
    	NodeListOptional fields = new NodeListOptional();
        m.f8.addNode(
            make_statement(
                new AssignmentStatement(
                    make_var_ref(var),
                    make_expression(
                        new AllocationExpression(
                            c.f1
                        )
                    )
                )
            )
        );
    	while(en.hasMoreElements()) {
    		String id = en.nextElement();
            //__println(id + " " + m.f2.f0.toString());
    		m.f8.addNode(
    			make_statement(
    				new AssignmentStatement(
    				    make_var_ref(
                            new DotExpression(
                                var, make_identifier(id)
                            )
                        ), make_expression(
                            make_identifier(id)
                        )
    				)
    			)
    		);
    		fields.addNode(
    			new VarDeclaration(
    				current_variables.get(id), make_identifier(id)
    			)
    		);
    	}

    	if(is_main(m)) {
    		Identifier class_variable = new_class_variable();
	    	m.f8.addNode(
	    		make_statement(
    				new AssignmentStatement(
    					make_var_ref(
    						new DotExpression(var, class_variable)
    					), make_expression(new ThisExpression())
    				)
	    		)
	    	);
            // __print(clas);
            // __println("");
	    	fields.addNode(
	    		new VarDeclaration(make_type(clas), class_variable)
	    	);
    	}
        if(!func) {
    		m.f8.addNode(
        		make_statement(
        			new MessageSendStatement(
        				var,
        				make_identifier("run"),
        				new NodeOptional()
        			)
        		)
        	);
        }
        // System.out.println("");
        // System.out.println("eeeeeE");
    	c.f5 = fields;
    	return var;
    }

    public void make_continuation(Vector<Node> statements, Identifier var,
		ClassExtendsDeclaration c1, ClassExtendsDeclaration c2) {
		c2.f5 = c1.f5;
		for(int i = 0; i < c1.f5.size(); i++) {
			VarDeclaration vd = (VarDeclaration) c1.f5.elementAt(i);
			statements.add(
				make_statement(
					new AssignmentStatement(
						make_var_ref(
							new DotExpression(var, vd.f1)
						), make_expression(vd.f1)
					)
				)
			);
		}
    }

    public void make_variables(NodeListOptional node_list_optional) {
        current_variables = new Hashtable<String, Type>();
        for(int i = 0; i < node_list_optional.size(); i++) {
            VarDeclaration vd = (VarDeclaration) node_list_optional.elementAt(i);
            current_variables.put(vd.f1.f0.toString(), vd.f0);
        }
    }

	public void ifHandler(IfStatement if_statement, MethodDeclaration m, int index) {
        //__println("if_here");
        Expression if_expr = if_statement.f2;
        Statement if_true = if_statement.f4;
        Statement if_false = if_statement.f6;
        ClassExtendsDeclaration c1 = makeClass();
        ClassExtendsDeclaration c2 = makeClass();
        ClassExtendsDeclaration c3 = makeClass();
        ClassExtendsDeclaration c4 = makeClass();
        // if(klass != null) {
        //     __println("--------");
        //     __print(klass);
        // }
        Vector<Node> vc = strip_remaining_statements(m, index);
        boolean make_c4 = vc.size() != 0;
        make_continuation(m, index, current_class, c1, false);

        MethodDeclaration m1 = (MethodDeclaration) c1.f6.elementAt(0);

        Identifier var1 = new_variable();
        Identifier var2 = new_variable();
        Identifier var3 = new_variable();
        add_variable(c1, var1, c2.f1);
        add_variable(c1, var2, c3.f1);
        if(make_c4)
            add_variable(c1, var3, c4.f1);
        Vector<Node> for_true, for_false;
        Vector<Node> true_statements;
        Vector<Node> false_statements;


        for_true = new Vector<Node>();
        for_false = new Vector<Node>();

        for_true.add(
        	make_statement(
        		new AssignmentStatement(
        			make_var_ref(var1),
        			make_expression(
        				new AllocationExpression(c2.f1)
        			)
        		)
        	)
        );
        if(make_c4)
            for_true.add(
                make_statement(
                    new AssignmentStatement(
                        make_var_ref(var3),
                        make_expression(
                            new AllocationExpression(c4.f1)
                        )
                    )
                )
            );
        make_continuation(for_true, var1, c1, c2);

        for_true.add(
        	make_statement(
                new MessageSendStatement(
                    var1,
                    make_identifier("run"),
                    new NodeOptional()
                )
            )
        );

        for_false.add(
            make_statement(
                new AssignmentStatement(
                    make_var_ref(var2),
                    make_expression(
                        new AllocationExpression(c3.f1)
                    )
                )
            )
        );
        if(make_c4)
            for_false.add(
                make_statement(
                    new AssignmentStatement(
                        make_var_ref(var3),
                        make_expression(
                            new AllocationExpression(c4.f1)
                        )
                    )
                )
            );
        make_continuation(for_false, var2, c1, c3);
        for_false.add(
            make_statement(
                new MessageSendStatement(
                    var2,
                    make_identifier("run"),
                    new NodeOptional()
                )
            )
        );

        IfStatement is = new IfStatement(
            if_expr,
            make_statement(make_block(for_true)),
            make_statement(make_block(for_false))
        );
        add_statement(c1, make_statement(is));

        true_statements = new Vector<Node>();
        false_statements = new Vector<Node>();
        true_statements.add(if_true);
        if(make_c4) {
            make_continuation(true_statements, var3, c2, c4);
            true_statements.add(
            	make_statement(
        			new MessageSendStatement(
                        var3,
                        make_identifier("run"),
                        new NodeOptional()
                    )
            	)
            );
        }
        false_statements.add(if_false);
        if(make_c4) {
            make_continuation(false_statements, var3, c3, c4);
            false_statements.add(
            	make_statement(
        			new MessageSendStatement(
                        var3,
                        make_identifier("run"),
                        new NodeOptional()
                    )
            	)
            );
        }
        // __print(c1);
        // __print(c2);
        // __print(c3);
        // __print(c4);


        MethodDeclaration m2 = (MethodDeclaration) c2.f6.elementAt(0);
        m2.f8 = make_node_list_optional(true_statements);
        MethodDeclaration m3 = (MethodDeclaration) c3.f6.elementAt(0);
        m3.f8 = make_node_list_optional(false_statements);
        if(make_c4) {
            MethodDeclaration m4 = (MethodDeclaration) c4.f6.elementAt(0);
            m4.f8 = make_node_list_optional(vc);
        }

        // __print(c1);
        // __print(c2);
        // __print(c3);
        klass = c2;
        current_class = make_type(c2.f1);
        make_variables(c2.f5);
        // __print(c2);
        // __print(c3);
        // __println("-------");
        //__print(c1);
        //__print(c2);
        new_classes.add(c1);
        new_classes.add(c2);
        c2.f6.elementAt(0).accept(this, (A) new Boolean(false));
        klass = c3;
        current_class = make_type(c3.f1);
        make_variables(c3.f5);
        new_classes.add(c3);
        c3.f6.elementAt(0).accept(this, (A) new Boolean(false));
        if(make_c4) {
            klass = c4;
            current_class = make_type(c4.f1);
            make_variables(c4.f5);
            new_classes.add(c4);
            c4.f6.elementAt(0).accept(this, (A) new Boolean(false));
        }
    }

    public void __println(Integer i) {
        System.out.println(i);
    }
	public void whileHandler(WhileStatement while_statement, MethodDeclaration m, int index) {
        ClassExtendsDeclaration c1 = makeClass();
        //__println("while_here");
        // __println(index);
        // if(klass != null) {
        //     __println("--------");
        //     __print(klass);
        // }
        Vector<Node> vc = strip_remaining_statements(m, index);
        make_continuation(m, index, current_class, c1, false);
        Expression expr = while_statement.f2;
        Statement s1 = while_statement.f4;
//        rename(expr);
//        rename(s);
        IfStatement if1;
        Statement if_statement, else_statement;
        MethodDeclaration m1 = (MethodDeclaration) c1.f6.elementAt(0);
        Vector<Node> v = new Vector<Node>();

        Identifier var = new_variable();
        //System.out.println(var.f0.toString());
        add_variable(c1, var, c1.f1);

        Statement s2 = make_statement(
            new AssignmentStatement(
                make_var_ref(var),
                make_expression(
                    new AllocationExpression(
                        c1.f1
                    )
                )
            )
        );
        add_statement(c1, s2);

        v.add(s1);
        Statement s3 = make_statement(
            new MessageSendStatement(
                var,
                make_identifier("run"),
                new NodeOptional()
            )
        );
        v.add(s3);
        if_statement = make_statement(make_block(v));
        else_statement = make_statement(make_block(vc));
        if1 = new IfStatement(expr, if_statement, else_statement);
        m1.f8.addNode(make_statement(if1));
        klass = c1;
        current_class = make_type(c1.f1);
        make_variables(c1.f5);
        // __print(c1);
        // __println("----------");
        c1.f6.elementAt(0).accept(this, (A) new Boolean(false));
        new_classes.add(c1);
    }

	public void addAll(NodeListOptional node_list_optional, Vector<Node> vc) {
		for(int i = 0; i < vc.size(); i++) {
			node_list_optional.addNode(vc.elementAt(i));
		}
	}

    public void functionHandler(MessageSendStatement mss, MethodDeclaration m, int index) {
        if(index == m.f8.size()-1) {
            if(!is_main(m)) {
                Vector<Node> v1 = klass.f5.nodes;
//                __print(mss);
//                __print(klass);
                //__println(mss.f0.f0.toString());
                Identifier n;
                try {
                	n = (Identifier) current_variables.get(mss.f0.f0.toString()).f0.choice;
                }
                catch(Exception e) {
                	n = make_identifier("Runner");
                }
                //__println(n.f0.toString() + " " + mss.f0.f0.toString());
                if(n.f0.toString().startsWith("Runner")) {
                	return;
                }
                Vector<Node> v2 = types.get((Identifier) current_variables.get(mss.f0.f0.toString()).f0.choice).f5.nodes;
                m.f8.nodes.remove(m.f8.size()-1);
                for(int i = 0; i < v1.size(); i++) {
                	for(int j = 0; j < v2.size(); j++) {
                		String s1 = ((VarDeclaration) v1.elementAt(i)).f1.f0.toString();
                		String s2 = ((VarDeclaration) v2.elementAt(j)).f1.f0.toString();
	                	if(s2.equals(s1)) {
	                		m.f8.addNode(
	                			new AssignmentStatement(
	                				make_var_ref(
	                					new DotExpression(mss.f0, (Identifier) ((VarDeclaration) v1.elementAt(i)).f1)
	                				),
	                				make_expression(((VarDeclaration) v1.elementAt(i)).f1)
	                			)
	                		);
	                	}
                	}
                }
                m.f8.addNode(mss);
            }
        	   return;
        }

        // __println(Integer.toString(index));
        // __println(Integer.toString(m.f8.size()));
        // __println("function_here");
//        if(klass != null)
//            __print(klass);
//        __print(mss);
//        __print(m);
        //mss.accept(new GJDepth3(), null);
        // if(klass != null)
        //     klass.accept(new GJDepth3(), null);

        // if(((String)mss.f0.accept(new GJDepth5(), null)).startsWith("var_240")) {
        //     __println(Integer.toString(index));
        //     __println(Integer.toString(m.f8.size()));
        //     __println("function_here");
        //     m.accept(new GJDepth3(), null);
        //     mss.accept(new GJDepth3(), null);
        //     if(klass != null)
        //         klass.accept(new GJDepth3(), null);
        // }
    	ClassExtendsDeclaration c1 = makeClass();
        Vector<Node> vc = strip_remaining_statements(m, index);
        Identifier var = make_continuation(m, index, current_class, c1, true);
        MethodDeclaration m1 = (MethodDeclaration) c1.f6.elementAt(0);
        m1.f8 = new NodeListOptional();
        addAll(m1.f8, vc);
        if(!mss.f4.present()) {
        	ExpressionList epl = new ExpressionList(
    			make_expression(var),
    			new NodeListOptional()
    		);
        	mss.f4.node = epl;
        }
        else {
        	ExpressionList epl = (ExpressionList) mss.f4.node;
	        epl.f1.addNode(
	        	new ExpressionRest(make_expression(var))
	        );
        }
        m.f8.addNode(
            make_statement(mss)
        );
        current_class = make_type(c1.f1);
        make_variables(c1.f5);
        // ClassExtendsDeclaration old_class;
        // old_class = klass;
        klass = c1;
        m1.accept(this, (A) new Boolean(false));
        // __println("-----------");
        // // if(old_class != null)
        // //     __print(old_class);
        // __print(c1);
        // __println("------------");
        new_classes.add(c1);
    }
    /**
     * f0 -> MainClass()
     * f1 -> ( TypeDeclaration() )*
     * f2 -> <EOF>
     */
    public R visit(Goal n, A argu) {
        R _ret=null;
        types = new Hashtable<Identifier, ClassExtendsDeclaration>();
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.accept(new GJDepth3(), null);
        globalClassInfo = (Hashtable<String, ClassInfo>) argu;
        __println(
            "class Runner {\npublic void run() {\n}\n}"
        );
        GJDepth5 k = new GJDepth5();
        for(int i = 0; i < new_classes.size(); i++) {
        	new_classes.elementAt(i).accept(k, argu);
        }
        return _ret;
    }

    /**
     * f0 -> "class"
     * f1 -> Identifier()
     * f2 -> "{"
     * f3 -> "public"
     * f4 -> "static"
     * f5 -> "void"
     * f6 -> "main"
     * f7 -> "("
     * f8 -> "String"
     * f9 -> "["
     * f10 -> "]"
     * f11 -> Identifier()
     * f12 -> ")"
     * f13 -> "{"
     * f14 -> "new"
     * f15 -> Identifier()
     * f16 -> "("
     * f17 -> ")"
     * f18 -> "."
     * f19 -> Identifier()
     * f20 -> "("
     * f21 -> ( ExpressionList() )?
     * f22 -> ")"
     * f23 -> ";"
     * f24 -> "}"
     * f25 -> "}"
     */
    public R visit(MainClass n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);
        n.f8.accept(this, argu);
        n.f9.accept(this, argu);
        n.f10.accept(this, argu);
        n.f11.accept(this, argu);
        n.f12.accept(this, argu);
        n.f13.accept(this, argu);
        n.f14.accept(this, argu);
        n.f15.accept(this, argu);
        n.f16.accept(this, argu);
        n.f17.accept(this, argu);
        n.f18.accept(this, argu);
        n.f19.accept(this, argu);
        n.f20.accept(this, argu);
        if(n.f21.present()) {
        	((ExpressionList) n.f21.node).f1.addNode(
        		new ExpressionRest(
                    make_expression(new AllocationExpression(make_identifier("Runner")))
                )
        	);
        }
        else {
        	n.f21.node = new ExpressionList(
        		make_expression(new AllocationExpression(make_identifier("Runner"))),
        		new NodeListOptional()
        	);
        }
        n.f22.accept(this, argu);
        n.f23.accept(this, argu);
        n.f24.accept(this, argu);
        n.f25.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> ClassDeclaration()
     *         | ClassExtendsDeclaration()
     */
    public R visit(TypeDeclaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "class"
     * f1 -> Identifier()
     * f2 -> "{"
     * f3 -> ( VarDeclaration() )*
     * f4 -> ( MethodDeclaration() )*
     * f5 -> "}"
     */
    public R visit(ClassDeclaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        current_class = make_type(n.f1);
        argu = (A) new Boolean(true);
        inMethod = false;
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        Enumeration<Node> node_list_optional = n.f4.elements();
        while(node_list_optional.hasMoreElements()) {
            current_class = make_type(n.f1);
            node_list_optional.nextElement().accept(this, argu);
        }
        n.f5.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "class"
     * f1 -> Identifier()
     * f2 -> "extends"
     * f3 -> Identifier()
     * f4 -> "{"
     * f5 -> ( VarDeclaration() )*
     * f6 -> ( MethodDeclaration() )*
     * f7 -> "}"
     */
    public R visit(ClassExtendsDeclaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        current_class = make_type(n.f1);
        argu = (A) new Boolean(true);
        //System.out.println(n.f1.f0.toString());
        inMethod = false;
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        Enumeration<Node> node_list_optional = n.f6.elements();
        while(node_list_optional.hasMoreElements()) {
            current_class = make_type(n.f1);
            node_list_optional.nextElement().accept(this, argu);
        }
        n.f7.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Type()
     * f1 -> Identifier()
     * f2 -> ";"
     */
    public R visit(VarDeclaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        if(inMethod && is_main(current_method)) {
        	current_variables.put(n.f1.f0.toString(), n.f0);
        }
        return _ret;
    }

    /**
     * f0 -> "public"
     * f1 -> "void"
     * f2 -> Identifier()
     * f3 -> "("
     * f4 -> ( FormalParameterList() )?
     * f5 -> ")"
     * f6 -> "{"
     * f7 -> ( VarDeclaration() )*
     * f8 -> ( Statement() )*
     * f9 -> "}"
     */
    public R visit(MethodDeclaration n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        inMethod = true;
        current_method = n;
        Identifier var = null;
        if(is_main(n))
            current_variables = new Hashtable<String, Type>();
        if(is_main(n)) {
        	var = new_variable();
        	if(!n.f4.present()) {

        		FormalParameterList fpl = new FormalParameterList(
        			new FormalParameter(
        				make_type(make_identifier("Runner")), var
        			), new NodeListOptional()
        		);
        		n.f4.addNode(fpl);
        	}
        	else {
        		FormalParameterList fpl = (FormalParameterList) n.f4.node;
        		fpl.f1.addNode(
    				new FormalParameterRest(
    					new FormalParameter(
    						make_type(make_identifier("Runner")), var
    					)
    				)
        		);
        	}
        	n.f8.addNode(
    			make_statement(
	    			new MessageSendStatement(
	    				var,
	    				make_identifier("run"),
	    				new NodeOptional()
	    			)
    			)
        	);

        }
        //n.accept(new GJDepth3(), null);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        n.f7.accept(this, argu);
        //__print(n.f8);
        //__println(Integer.toString(n.f8.size()));
        boolean1 = true;
        for(int i = 0; (i < n.f8.size()) && boolean1; i++) {
        	index = i;
        	n.f8.elementAt(i).accept(this, argu);
            i = index;
        }
        n.f9.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> FormalParameter()
     * f1 -> ( FormalParameterRest() )*
     */
    public R visit(FormalParameterList n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Type()
     * f1 -> Identifier()
     */
    public R visit(FormalParameter n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        if(is_main(current_method))
        	current_variables.put(n.f1.f0.toString(), n.f0);
        return _ret;
    }

    /**
     * f0 -> ","
     * f1 -> FormalParameter()
     */
    public R visit(FormalParameterRest n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> ArrayType()
     *         | BooleanType()
     *         | IntegerType()
     *         | Identifier()
     */
    public R visit(Type n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "int"
     * f1 -> "["
     * f2 -> "]"
     */
    public R visit(ArrayType n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "boolean"
     */
    public R visit(BooleanType n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "int"
     */
    public R visit(IntegerType n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Block()
     *         | AssignmentStatement()
     *         | ArrayAssignmentStatement()
     *         | IfStatement()
     *         | WhileStatement()
     *         | PrintStatement()
     *         | MessageSendStatement()
     */
    public R visit(Statement n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "{"
     * f1 -> ( Statement() )*
     * f2 -> "}"
     */
    public R visit(Block n, A argu) {
    	R _ret = null;
        //__print(current_method);
        current_method.f8.nodes.remove(index);
        for(int i = 0; i < n.f1.size(); i++) {
            current_method.f8.nodes.add(index+i, n.f1.nodes.elementAt(i));
        }
        index -= 1;
        //__print(current_method);
        return _ret;
    }

    /**
     * f0 -> VarRef()
     * f1 -> "="
     * f2 -> Expression()
     * f3 -> ";"
     */
    public R visit(AssignmentStatement n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "["
     * f2 -> Expression()
     * f3 -> "]"
     * f4 -> "="
     * f5 -> Expression()
     * f6 -> ";"
     */
    public R visit(ArrayAssignmentStatement n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        n.f5.accept(this, argu);
        n.f6.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "if"
     * f1 -> "("
     * f2 -> Expression()
     * f3 -> ")"
     * f4 -> Statement()
     * f5 -> "else"
     * f6 -> Statement()
     */
    public R visit(IfStatement n, A argu) {
        R _ret=null;
        boolean1 = false;
        ifHandler(n, current_method, index);

        return _ret;
    }

    /**
     * f0 -> "while"
     * f1 -> "("
     * f2 -> Expression()
     * f3 -> ")"
     * f4 -> Statement()
     */
    public R visit(WhileStatement n, A argu) {
        R _ret=null;
        boolean1 = false;
        whileHandler(n, current_method, index);
        return _ret;
    }

    /**
     * f0 -> "System.out.println"
     * f1 -> "("
     * f2 -> Expression()
     * f3 -> ")"
     * f4 -> ";"
     */
    public R visit(PrintStatement n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "."
     * f2 -> Identifier()
     * f3 -> "("
     * f4 -> ( ExpressionList() )?
     * f5 -> ")"
     * f6 -> ";"
     */
    public R visit(MessageSendStatement n, A argu) {
        R _ret=null;
        boolean1 = false;
        functionHandler(n, current_method, index);
        return _ret;
    }

    /**
     * f0 -> AndExpression()
     *         | CompareExpression()
     *         | PlusExpression()
     *         | MinusExpression()
     *         | TimesExpression()
     *         | ArrayLookup()
     *         | PrimaryExpression()
     */
    public R visit(Expression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "&"
     * f2 -> PrimaryExpression()
     */
    public R visit(AndExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "<"
     * f2 -> PrimaryExpression()
     */
    public R visit(CompareExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "+"
     * f2 -> PrimaryExpression()
     */
    public R visit(PlusExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "-"
     * f2 -> PrimaryExpression()
     */
    public R visit(MinusExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "*"
     * f2 -> PrimaryExpression()
     */
    public R visit(TimesExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> PrimaryExpression()
     * f1 -> "["
     * f2 -> PrimaryExpression()
     * f3 -> "]"
     */
    public R visit(ArrayLookup n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Expression()
     * f1 -> ( ExpressionRest() )*
     */
    public R visit(ExpressionList n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> ","
     * f1 -> Expression()
     */
    public R visit(ExpressionRest n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> IntegerLiteral()
     *         | TrueLiteral()
     *         | FalseLiteral()
     *         | VarRef()
     *         | ThisExpression()
     *         | ArrayAllocationExpression()
     *         | AllocationExpression()
     *         | NotExpression()
     *         | BracketExpression()
     */
    public R visit(PrimaryExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> <INTEGER_LITERAL>
     */
    public R visit(IntegerLiteral n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "true"
     */
    public R visit(TrueLiteral n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "false"
     */
    public R visit(FalseLiteral n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> <IDENTIFIER>
     */
    public R visit(Identifier n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "this"
     */
    public R visit(ThisExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "new"
     * f1 -> "int"
     * f2 -> "["
     * f3 -> Expression()
     * f4 -> "]"
     */
    public R visit(ArrayAllocationExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        n.f4.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "new"
     * f1 -> Identifier()
     * f2 -> "("
     * f3 -> ")"
     */
    public R visit(AllocationExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        n.f3.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "!"
     * f1 -> Expression()
     */
    public R visit(NotExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> "("
     * f1 -> Expression()
     * f2 -> ")"
     */
    public R visit(BracketExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> DotExpression()
     *         | Identifier()
     */
    public R visit(VarRef n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        return _ret;
    }

    /**
     * f0 -> Identifier()
     * f1 -> "."
     * f2 -> Identifier()
     */
    public R visit(DotExpression n, A argu) {
        R _ret=null;
        n.f0.accept(this, argu);
        n.f1.accept(this, argu);
        n.f2.accept(this, argu);
        return _ret;
    }

}
