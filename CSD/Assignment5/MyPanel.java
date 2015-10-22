import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class MyPanel extends JPanel implements ActionListener{
    PipelineSimulator p;
    Simulator s;
    String file;
    int tt;

    Timer timer = new Timer(1000, this);

    public MyPanel(String[] args) {
        timer.start();// Start the timer here.
        p = new PipelineSimulator();
        p.process_args(args);
        s = p.start(file);
        s.start_simulate();
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getSource()==timer){
            repaint();// this will call at every 1 second
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(tt == 1) {
            Deliverable d = s.simulate_cycle();
            int width = 180;
            int x1 = 10;
            int x2 = x1 + width + 10;
            int x3 = x2 + width + 10;
            int x4 = x3 + width + 10;
            int x5 = x4 + width + 10;
            int x6 = x5 + width + 10;
            g.drawRect(x1/*x*/, 10/*y*/, width/*width*/, 30/*hight*/);
            g.drawString("IF : " + d.prev, x1+15/*x*/, 25/*y*/);
            g.drawRect(x2/*x*/, 10/*y*/, width/*width*/, 30/*hight*/);
            g.drawString("ID : " + d.in, x2+15/*x*/, 25/*y*/);
            g.drawRect(x3/*x*/, 10/*y*/, width/*width*/, 30/*hight*/);
            g.drawString("RR : " + d.in1, x3+15/*x*/, 25/*y*/);
            g.drawRect(x4/*x*/, 10/*y*/, width/*width*/, 30/*hight*/);
            g.drawString("ALU : " + d.in2, x4+15/*x*/, 25/*y*/);
            g.drawRect(x5/*x*/, 10/*y*/, width/*width*/, 30/*hight*/);
            g.drawString("MAC : " + d.in3, x5+15/*x*/, 25/*y*/);
            g.drawRect(x6/*x*/, 10/*y*/, width/*width*/, 30/*hight*/);
            g.drawString("WB : " + d.in4, x6+15/*x*/, 25/*y*/);

            int initial_y = 70;
            for(int i = 0; i < 8; i++) {
                String i2 = String.valueOf(i);
                String reg = "R" + i2;
                String mapped_reg = s.register_reverse.get(reg);
                int required_val = s.register_file.get(mapped_reg);
                int y_coord = initial_y + i*50;
                g.drawRect(10/*x*/, initial_y + i*50/*y*/, width/*width*/, 30/*hight*/);
                g.drawString(reg + " : " + required_val, 25/*x*/, y_coord+15/*y*/);
            }

            for(int i = 0; i < 8; i++) {
                String i2 = String.valueOf(i+8);
                String reg = "R" + i2;
                String mapped_reg = s.register_reverse.get(reg);
                int required_val = s.register_file.get(mapped_reg);
                int y_coord = initial_y + i*50;
                g.drawRect(220/*x*/, initial_y + i*50/*y*/, width/*width*/, 30/*hight*/);
                g.drawString(reg + " : " + required_val, 235/*x*/, y_coord+15/*y*/);
            }
        }
        else
            tt++;
    }
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().add(new MyPanel(args));
        f.setSize(1500, 1000);
        f.setVisible(true);
    }

    class PipelineSimulator {
        public Simulator start(String arg) {
            BufferedReader br = null;
            String file = arg;
            try {
                br = new BufferedReader(new FileReader(file));
            }   catch(Exception e) {
                    System.out.println(e.toString());
                }
            Hashtable<Integer, String> code = new Hashtable<Integer, String>();
            String line = null;
            try {
                line = br.readLine();
            }   catch(Exception e) {
                    System.out.println(e.toString());
                }
            int ct = 0;
            if(line != null) {
                do {
                    code.put(ct, line);
                    try {
                        line = br.readLine();
                    }   catch(Exception e) {
                            System.out.println(e.toString());
                        }
                    ct += 2;
                } while(line != null);
            }
            process_args()

            Simulator s = new Simulator(code, true);
            s.start_simulate();
            return new Simulator(code, false);
        }

        private enum Parameter {
            width, reorder_buffer_size, reservation_station_size,
            store_buffer_size, mul_latency,
            add_latency, sub_latency;
        }

        public void process_args(String[] args) {
            String file = args[0];
            Integer width = 2;
            Integer reorder_buffer_size = 2;
            Integer reservation_station_size = 2;
            Integer store_buffer_size = 2;
            Integer add_latency = 2;
            Integer mul_latency = 2;
            Integer sub_latency = 2;

            for(int i = 1; i < args.length; i += 3) {
                String value = args[i];
                Parameter p = Parameter.valueOf(args[i]);
                switch(p) {
                    case width : { width = Integer.parseInt(args[i+2]); break;}
                    case reorder_buffer_size : { reorder_buffer_size = Integer.parseInt(args[i+2]); break;}
                    case reservation_station_size : { reservation_station_size = Integer.parseInt(args[i+2]); break;}
                    case store_buffer_size : { store_buffer_size = Integer.parseInt(args[i+2]); break;}
                    case mul_latency : { mul_latency = Integer.parseInt(args[i+2]); break;}
                    case add_latency : { add_latency = Integer.parseInt(args[i+2]); break;}
                    case sub_latency : { sub_latency = Integer.parseInt(args[i+2]); break;}
                }
            }
        }
    }

    class Deliverable {
        String prev;
        String in;
        String in1;
        String in2;
        String in3;
        String in4;
        public Deliverable(String prev1, String in, String in1, String in2, String in3, String in4) {
            this.prev = prev1;
            this.in = in;
            this.in1 = in1;
            this.in2 = in2;
            this.in3 = in3;
            this.in4 = in4;
        }
    }

    class Simulator {
        InstructionFetch instruction_fetcher;
        InstructionDecode instruction_decoder;
        Random rand = new Random();
        boolean raw_stall;
        boolean branch_stall;
        boolean first_stall;
        boolean halt_stall;
        boolean pain;
        boolean generate_program;
        Instruction instruction;
        Instruction instruction1;
        Instruction instruction2;
        Instruction instruction3;
        Instruction instruction4;
        int pc;
        int bad_val = 123456789;
        BranchPredictor bp;

        Hashtable<String, Integer> register_file;
        Hashtable<String, Integer> register_writes;
        Hashtable<String, String> register_pretty;
        Hashtable<String, String> register_reverse;
        Hashtable<Integer, Integer> memory_file;
        Hashtable<String, Integer> operand_forwarding;
        String prev;
        String prev2;
        int num_raw;
        int num_branch;
        int num_intersection;
        int num_cycles;
        int num_instructions;
        boolean prediction;


        Instruction dummy = new Instruction();

        class BranchPredictor {
            int state;
            public BranchPredictor() {
                state = 0;
            }
            boolean predict() {
                return state > 1;
            }
            boolean predict(boolean taken) {
                if(taken) {
                    if(state < 3)
                        state = state+1;
                }
                else {
                    if(state < 1)
                        state = state - 1;
                }
                return true;
            }
        }

        public Integer get_integer(String s) {
            int p = Integer.parseInt(s, 2);
            int shift = s.length()-1;
            if(p < (1 << shift))
                return p;
            else
                return p - (1 << (shift+1));
        }

        public Integer get_integer(int a) {
            int shift = 15;
            int p = a & ((1 << 16) - 1);
            if(p < (1 << shift))
                return p;
            else
                return p - (1 << (shift+1));
        }

        public Simulator(Hashtable<Integer, String> code, boolean generate_program) {
            instruction_fetcher = new InstructionFetch(code);
            instruction_decoder = new InstructionDecode();

            register_file = new Hashtable<String, Integer>();
            register_pretty = new Hashtable<String, String>();
            register_reverse = new Hashtable<String, String>();
            register_writes = new Hashtable<String, Integer>();
            memory_file = new Hashtable<Integer, Integer>();
            operand_forwarding = new Hashtable<String, Integer>();
            bp = new BranchPredictor();
            this.generate_program = generate_program;

            register_file.put("0000", 0);
            register_file.put("0001", 0);
            register_file.put("0010", 0);
            register_file.put("0011", 0);
            register_file.put("0100", 0);
            register_file.put("0101", 0);
            register_file.put("0110", 0);
            register_file.put("0111", 0);
            register_file.put("1000", 0);
            register_file.put("1001", 0);
            register_file.put("1010", 0);
            register_file.put("1011", 0);
            register_file.put("1100", 0);
            register_file.put("1101", 0);
            register_file.put("1110", 0);
            register_file.put("1111", 0);

            operand_forwarding.put("0000", bad_val);
            operand_forwarding.put("0001", bad_val);
            operand_forwarding.put("0010", bad_val);
            operand_forwarding.put("0011", bad_val);
            operand_forwarding.put("0100", bad_val);
            operand_forwarding.put("0101", bad_val);
            operand_forwarding.put("0110", bad_val);
            operand_forwarding.put("0111", bad_val);
            operand_forwarding.put("1000", bad_val);
            operand_forwarding.put("1001", bad_val);
            operand_forwarding.put("1010", bad_val);
            operand_forwarding.put("1011", bad_val);
            operand_forwarding.put("1100", bad_val);
            operand_forwarding.put("1101", bad_val);
            operand_forwarding.put("1110", bad_val);
            operand_forwarding.put("1111", bad_val);

            register_writes.put("", 0);
            register_writes.put("0000", 0);
            register_writes.put("0001", 0);
            register_writes.put("0010", 0);
            register_writes.put("0011", 0);
            register_writes.put("0100", 0);
            register_writes.put("0101", 0);
            register_writes.put("0110", 0);
            register_writes.put("0111", 0);
            register_writes.put("1000", 0);
            register_writes.put("1001", 0);
            register_writes.put("1010", 0);
            register_writes.put("1011", 0);
            register_writes.put("1100", 0);
            register_writes.put("1101", 0);
            register_writes.put("1110", 0);
            register_writes.put("1111", 0);

            register_pretty.put("0000", "R0");
            register_pretty.put("0001", "R1");
            register_pretty.put("0010", "R2");
            register_pretty.put("0011", "R3");
            register_pretty.put("0100", "R4");
            register_pretty.put("0101", "R5");
            register_pretty.put("0110", "R6");
            register_pretty.put("0111", "R7");
            register_pretty.put("1000", "R8");
            register_pretty.put("1001", "R9");
            register_pretty.put("1010", "R10");
            register_pretty.put("1011", "R11");
            register_pretty.put("1100", "R12");
            register_pretty.put("1101", "R13");
            register_pretty.put("1110", "R14");
            register_pretty.put("1111", "R15");

            register_reverse.put("R0", "0000");
            register_reverse.put("R1", "0001");
            register_reverse.put("R2", "0010");
            register_reverse.put("R3", "0011");
            register_reverse.put("R4", "0100");
            register_reverse.put("R5", "0101");
            register_reverse.put("R6", "0110");
            register_reverse.put("R7", "0111");
            register_reverse.put("R8", "1000");
            register_reverse.put("R9", "1001");
            register_reverse.put("R10", "1010");
            register_reverse.put("R11", "1011");
            register_reverse.put("R12", "1100");
            register_reverse.put("R13", "1101");
            register_reverse.put("R14", "1110");
            register_reverse.put("R15", "1111");
        }

        class Instruction {
            public void read_register() {}
            public void alu_execute() {}
            public void mem_access_cycle() {}
            public void write_back() {}
            public String print() { return "";}
        }


        class AluInstruction extends Instruction{
            boolean immediate;
            int op_code;
            String reg1;
            String reg2;
            String reg3;
            Integer integer;
            Integer required_r2;
            Integer required_r3;
            Integer result;
            public AluInstruction(
                int op_code, boolean immediate, String reg1, String reg2,
                String reg3, Integer integer
            ) {
                this.immediate = immediate;
                this.reg1 = reg1;
                this.reg2 = reg2;
                this.reg3 = reg3;
                this.integer = integer;
                this.op_code = op_code;
            }
            public void read_register() {
                required_r2 = register_file.get(reg2);
                if(operand_forwarding.get(reg2) != bad_val)
                    required_r2 = operand_forwarding.get(reg2);


                if(!immediate) {
                    required_r3 = register_file.get(reg3);
                    if(operand_forwarding.get(reg3) != bad_val)
                        required_r3 = operand_forwarding.get(reg3);
                }
                else
                    required_r3 = integer;
            }

            public void alu_execute() {
                switch(op_code) {
                    case 1 : {result = get_integer(required_r2 + required_r3);break;}
                    case 2 : {result = get_integer(required_r2 - required_r3);break;}
                    case 3 : {result = get_integer(required_r2 * required_r3);break;}
                }
                operand_forwarding.put(reg1, result);
            }

            public void mem_access_cycle() {}

            public void write_back() {
                register_file.put(reg1, result);
                int ct = register_writes.get(reg1);
                ct--;
                register_writes.put(reg1, ct);
                operand_forwarding.put(reg1, bad_val);
            }

            public String print() {
                String str = null;
                if(op_code == 1) str = "ADD ";
                if(op_code == 2) str = "SUB ";
                if(op_code == 3) str = "MUL ";
                String s;
                s = str + register_pretty.get(reg1) + " " + register_pretty.get(reg2) + " ";
                if(reg3 != null)
                    s += register_pretty.get(reg3);
                else
                    s += integer;
                return s;
            }
        }
        class LoadInstruction extends Instruction{
            String reg1;
            String reg2;
            Integer required_r2;
            Integer result;
            public LoadInstruction(String reg1, String reg2) {
                this.reg1 = reg1;
                this.reg2 = reg2;
            }

            public void read_register() {
                required_r2 = register_file.get(reg2);
                if(operand_forwarding.get(reg2) != bad_val)
                    required_r2 = operand_forwarding.get(reg2);
            }
            public void alu_execute() {}
            public void mem_access_cycle() {
                result = memory_file.get(required_r2);
                if(result == null) {
                    result = rand.nextInt(65536) - 32768;
                    memory_file.put(required_r2, result);
                }
                operand_forwarding.put(reg1, result);
            }
            public void write_back() {
                register_file.put(reg1, result);
                int ct = register_writes.get(reg1);
                ct--;
                register_writes.put(reg1, ct);
                operand_forwarding.put(reg1, bad_val);
            }

            public String print() {
                return "LOAD " + register_pretty.get(reg1) + " [" + register_pretty.get(reg2) + "] ";
            }
        }

        class StoreInstruction extends Instruction{
            String reg2;
            String reg3;
            Integer required_r2;
            Integer required_r3;
            public StoreInstruction(String reg2, String reg3) {
                this.reg2 = reg2;
                this.reg3 = reg3;
            }

            public void read_register() {
                required_r2 = register_file.get(reg2);
                required_r3 = register_file.get(reg3);
                if(operand_forwarding.get(reg2) != bad_val)
                    required_r2 = operand_forwarding.get(reg2);
                if(operand_forwarding.get(reg3) != bad_val)
                    required_r3 = operand_forwarding.get(reg3);
            }
            public void alu_execute() {}

            public void mem_access_cycle() {
                memory_file.put(required_r2, required_r3);
            }
            public void write_back() {}

            public String print() {
                return "STORE [" + register_pretty.get(reg2) + "] " + register_pretty.get(reg3);
            }
        }

        class JumpInstruction extends Instruction{
            int offset;
            int pc;
            public JumpInstruction(int offset) {
                this.offset = offset;
            }
            public void read_register() {}
            public void alu_execute() {
                pc = instruction_fetcher.pc + (offset*2) - 2;
            }
            public void mem_access_cycle() {
                instruction_fetcher.reset(pc);
                instruction = instruction1 = instruction2 = dummy;
                branch_stall = false;
                first_stall = true;
            }
            public void write_back() {}
            public String print() {
                return "JUMP " + offset;
            }
        }

        class BranchInstruction extends Instruction{
            String reg2;
            int condition_val;
            boolean condition;
            int pc;
            int offset;
            int default_pc;
            public BranchInstruction(String reg2, Integer offset) {
                this.reg2 = reg2;
                this.offset = offset;
            }

            public void read_register() {
                condition_val = register_file.get(reg2);
                if(operand_forwarding.get(reg2) != bad_val)
                    condition_val = operand_forwarding.get(reg2);
            }

            public void alu_execute() {
                condition = (condition_val == 0);
                pc = instruction_fetcher.pc + (offset*2) - 2;
            }

            public void mem_access_cycle() {
                if(condition) {
                    instruction_fetcher.reset(pc);
                }
                branch_stall = false;
                first_stall = true;
            }

            public void write_back() {}

            public String print() {
                return "BEQZ " + register_pretty.get(reg2) + " " + offset;
            }
        }

        class HaltInstruction extends Instruction{
            public void read_register() {}
            public void alu_execute() {}
            public void mem_access_cycle() {}
            public void write_back() {
                System.out.println(register_file);
                System.out.println(memory_file);
                double num_cycles2 = num_cycles;
                double num_instructions2 = num_instructions;
                double cpi = num_cycles2/(num_instructions2);
                System.out.println("Number of instructions : " + Integer.toString(num_instructions));
                System.out.println("Number of cycles : "+ Integer.toString(num_cycles));
                System.out.print("CPI : ");
                System.out.println(cpi);
                System.out.println("Number of stalls : " +  Integer.toString(num_branch + num_raw - num_intersection));
                System.out.println("Number of raw stalls : " + Integer.toString(num_raw));
                System.out.println("Number of branch stalls : " + Integer.toString(num_branch - num_intersection));
                System.exit(0);

            }
            public String print() {
                return "HALT";
            }
        }

        class InstructionFetch {
            Hashtable<Integer, String> code;
            int pc;
            public InstructionFetch(Hashtable<Integer, String> code) {
                this.code = code;
                pc = 0;
            }

            public String fetch_instruction() {
                String fetched_string = code.get(pc);
                pc += 2;
                if(fetched_string != null)
                    return fetched_string;
                else
                    return "";
            }

            public void reset(int pc) {
                this.pc = pc;
            }
        }

        class InstructionDecode {
            String reg1;
            String reg2;
            String reg3;
            public Instruction decode(String instruction_code) {
                reg1 = "";
                reg2 = null;
                reg3 = null;
                if(instruction_code == null)
                    return dummy;
                if(instruction_code.length() == 0)
                    return dummy;
                String code = instruction_code.substring(0, 3);
                Instruction instruction = null;
                if(code.equals("000") || code.equals("001") || code.equals("010")) {
                    String im = instruction_code.substring(3, 4);
                    boolean immediate = im.equals("1");
                    Integer integer = 0;
                    int op_code = 0;
                    if(code.equals("000")) op_code = 1;
                    if(code.equals("001")) op_code = 2;
                    if(code.equals("010")) op_code = 3;
                    reg1 = instruction_code.substring(4, 8);
                    reg2 = instruction_code.substring(8, 12);
                    if(immediate)
                        integer = get_integer(instruction_code.substring(12, 16));
                    else
                        reg3 = instruction_code.substring(12, 16);
                    instruction = new AluInstruction(
                        op_code, immediate, reg1, reg2, reg3, integer
                    );
                    int ct = register_writes.get(reg1);
                    register_writes.put(reg1, ct+1);
                    raw_stall = !check_raw_over();
                }

                if(code.equals("011")) {
                    reg1 = instruction_code.substring(4, 8);
                    reg2 = instruction_code.substring(8, 12);
                    int ct = register_writes.get(reg1);
                    register_writes.put(reg1, ct+1);
                    raw_stall = !check_raw_over();
                    instruction = new LoadInstruction(reg1, reg2);
                }
                if(code.equals("100")) {
                    reg2 = instruction_code.substring(4, 8);
                    reg3 = instruction_code.substring(8, 12);
                    raw_stall = !check_raw_over();
                    instruction = new StoreInstruction(reg2, reg3);
                }
                if(code.equals("101")) {
                    String s = instruction_code.substring(4, 12);
                    branch_stall = true;
                    raw_stall = false;
                    int offset = get_integer(s);
                    instruction = new JumpInstruction(offset);
                }
                if(code.equals("110")) {
                    reg2 = instruction_code.substring(4, 8);
                    String s = instruction_code.substring(8, 16);
                    int offset = get_integer(s);
                    branch_stall = true;
                    raw_stall = !check_raw_over();
                    instruction = new BranchInstruction(reg2, offset);
                }
                if(code.equals("111")) {
                    halt_stall = true;
                    instruction = new HaltInstruction();
                }
                //instruction.print();
                return instruction;
            }
            public boolean check_raw_over() {
                boolean bool1 = (reg2 != null);
                boolean bool2 = (reg3 != null);
                boolean bool3 = bool1 && (reg1.equals(reg2));
                boolean bool4 = bool2 && (reg1.equals(reg3));

                boolean bool5 = bool1 && (operand_forwarding.get(reg2) != bad_val);
                boolean bool6 = bool2 && (operand_forwarding.get(reg3) != bad_val);

                // System.out.println(bool1);
                // System.out.println(bool2);
                // System.out.println(bool3);
                // System.out.println(bool4);
                // System.out.println(bool5);
                // System.out.println(bool6);

                int reg2_val = bad_val;
                int reg3_val = bad_val;

                if(bool1)
                    reg2_val = register_writes.get(reg2);
                if(bool2)
                    reg3_val = register_writes.get(reg3);

                boolean bool7 = (reg2_val == 0);
                boolean bool8 = (reg3_val == 0);

                boolean bool9 = (reg2_val == 1);
                boolean bool10 = (reg3_val == 1);

                boolean bool11 = (reg2_val == 2);
                boolean bool12 = (reg3_val == 2);

                boolean val_2 = (!bool1) || (bool7) || (bool9 && bool3) || (bool9 && bool5) || (bool11 && bool3 && bool5);
                boolean val_3 = (!bool2) || (bool8) || (bool10 && bool4) || (bool10 && bool6) || (bool12 && bool4 && bool6);

                return (val_2 && val_3);
            }
        }

        public void start_simulate() {
            prev = "";
            if(generate_program) {
                for(int i = 0; i < instruction_fetcher.code.size(); i++) {
                    prev = instruction_fetcher.fetch_instruction();
                    System.out.println(instruction_decoder.decode(prev).print());
                }
                return;
            }

            instruction_fetcher.reset(0);
            num_raw = 0;
            num_branch = 0;
            num_intersection = 0;
            num_cycles = 0;
            num_instructions = 0;
            prev2 = instruction_fetcher.fetch_instruction();
            instruction = instruction1 = instruction2 = instruction3 = instruction4 = dummy;
            raw_stall = branch_stall = halt_stall = false;
            pc = 0;
            first_stall = true;
            pain = true;
            // while(true) {
            //     simulate_cycle();
            // }
        }

        public Deliverable simulate_cycle() {
            if(!raw_stall && !branch_stall && !halt_stall)
                instruction = instruction_decoder.decode(prev);
            instruction1.read_register();
            instruction2.alu_execute();
            instruction3.mem_access_cycle();
            instruction4.write_back();
            prev = prev2;

            //System.out.println("ID");
            String i = instruction.print();
            //System.out.println("");
            //System.out.println("RR");
            String i1 = instruction1.print();
            //System.out.println("");
            //System.out.println("ALU");
            String i2 = instruction2.print();
            //System.out.println("");
            //System.out.println("MAC");
            String i3 = instruction3.print();
            //System.out.println("");
            //System.out.println("WB");
            String i4 = instruction4.print();
            //System.out.println("");

            instruction4 = instruction3;
            instruction3 = instruction2;
            instruction2 = instruction1;
            raw_stall = !instruction_decoder.check_raw_over();
            //System.out.println(raw_stall);
            if(raw_stall)
                instruction1 = dummy;
            else
                instruction1 = instruction;

            // System.out.println(instruction_fetcher.pc);
            // System.out.println(raw_stall);
            // System.out.println(branch_stall);
            // System.out.println(halt_stall);

            if(!raw_stall && !branch_stall && !halt_stall)
                prev2 = instruction_fetcher.fetch_instruction();
            if(raw_stall)
                num_raw++;
            if(branch_stall)
                num_branch++;
            if(raw_stall && branch_stall)
                num_intersection++;
            if(instruction4 != dummy)
                num_instructions++;
            num_cycles++;
            if(branch_stall && first_stall) {
                prev2 = "";
                if(!raw_stall) {
                    instruction = dummy;
                    pain = false;
                }
                else
                    pain = true;
                instruction_fetcher.reset(pc - 2);
                first_stall = false;
            }
            else
                pc = instruction_fetcher.pc;
            if(branch_stall && pain && !raw_stall) {
                instruction = dummy;
                pain = false;
            }
            return new Deliverable(prev, i, i1, i2, i3, i4);
        }
    }
}
