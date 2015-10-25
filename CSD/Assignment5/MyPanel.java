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
import java.io.IOException;

class Triplet<X, Y, Z> {
    public final X x;
    public final Y y;
    public final Z z;
    public Triplet(X x, Y y, Z z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

class Pair<X, Y> {
    public final X x;
    public final Y y;
    public Pair(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}

class RequiredParameters {
    String file;
    Integer width;
    Integer reorder_buffer_size;
    Integer reservation_station_size;
    Integer store_buffer_size;
    Integer add_latency;
    Integer sub_latency;
    Integer mul_latency;
    Integer load_latency;
    Integer store_latency;
    Integer jump_latency;
    Integer branch_latency;
    Integer halt_latency;
    Integer alu_rs_size;
    Integer load_store_rs_size;
    Integer branch_rs_size;
    Integer halt_rs_size;
    Integer data_cache_latency;
    Hashtable<Integer, String> code;

    public RequiredParameters(
        String file, Integer width, Integer reorder_buffer_size,
        Integer reservation_station_size, Integer store_buffer_size,
        Integer add_latency, Integer sub_latency, Integer mul_latency,
        Integer load_latency, Integer store_latency, Integer jump_latency,
        Integer branch_latency, Integer halt_latency,
        Integer alu_rs_size, Integer load_store_rs_size, Integer branch_rs_size,
        Integer halt_rs_size, Integer data_cache_latency
    ) {
        this.file = file;
        this.width = width;
        this.reorder_buffer_size = reorder_buffer_size;
        this.reservation_station_size = reservation_station_size;
        this.store_buffer_size = store_buffer_size;
        this.add_latency = add_latency;
        this.sub_latency = sub_latency;
        this.mul_latency = mul_latency;
        this.load_latency = load_latency;
        this.store_latency = store_latency;
        this.jump_latency = jump_latency;
        this.branch_latency = branch_latency;
        this.halt_latency = halt_latency;

        this.alu_rs_size = alu_rs_size;
        this.load_store_rs_size = load_store_rs_size;
        this.branch_rs_size = branch_rs_size;
        this.halt_rs_size = halt_rs_size;
        this.data_cache_latency = data_cache_latency;


    }
    public void __print(String a, String b) {
        System.out.println(a + " : " + b);
    }
    public void __print(String a, Integer b) {
        System.out.println(a + " : " + Integer.toString(b));
    }
    public void print() {
        __print("file ", file);
        __print("width ", width);
        __print("reorder_buffer_size ", reorder_buffer_size);
        __print("reservation_station_size ", reservation_station_size);
        __print("store_buffer_size ", store_buffer_size);
        __print("add_latency ", add_latency);
        __print("sub_latency ", sub_latency);
        __print("mul_latency ", mul_latency);
        __print("load_latency ", load_latency);
        __print("store_latency ", store_latency);
        __print("jump_latency ", jump_latency);
        __print("branch_latency ", branch_latency);
        __print("halt_latency ", halt_latency);
        __print("alu_rs_size ", alu_rs_size);
        __print("load_store_rs_size ", load_store_rs_size);
        __print("branch_rs_size ", branch_rs_size);
        __print("halt_rs_size ", halt_rs_size);
        __print("data_cache_latency ", data_cache_latency);
    }
    public void set_code(Hashtable<Integer, String> code) {
        this.code = code;
    }
}

class MyPanel {
    public static void main(String args[]) {
        new PipelineSimulator().execute(args);
    }
}

class PipelineSimulator {
    RequiredParameters required_parameters;

    public enum Parameter {
        width, reorder_buffer_size,
        store_buffer_size, add_latency, sub_latency, mul_latency,
        load_latency, store_latency, jump_latency, branch_latency, halt_latency,
        alu_rs_size, load_store_rs_size, branch_rs_size, halt_rs_size,
        data_cache_latency;
    }
    public void execute(String args[]) {
        process_args(args);
        Simulator simulator = start(args[0]);
        simulator.start_simulate();
        simulator.simulate();
    }
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
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        required_parameters.set_code(code);
        Simulator s = new Simulator(required_parameters, true);
        s.start_simulate();
        return new Simulator(required_parameters, false);
    }

    public void process_args(String[] args) {
        String file = args[0];
        Integer width = 2;
        Integer reorder_buffer_size = 1;
        Integer reservation_station_size = 1;
        Integer store_buffer_size = 10;
        Integer add_latency = 2;
        Integer sub_latency = 2;
        Integer mul_latency = 2;
        Integer load_latency = 2;
        Integer store_latency = 2;
        Integer jump_latency = 2;
        Integer branch_latency = 2;
        Integer halt_latency = 8;
        Integer alu_rs_size = 2;
        Integer load_store_rs_size = 2;
        Integer branch_rs_size = 2;
        Integer halt_rs_size = 1;
        Integer data_cache_latency = 4;


        for(int i = 1; i < args.length; i += 3) {
                String p = args[i];
                System.out.println(p);
                switch(p) {
                    case "width" : { width = Integer.parseInt(args[i+2]); break;}
                    case "reorder_buffer_size" : { reorder_buffer_size = Integer.parseInt(args[i+2]); break;}
                    case "store_buffer_size" : { store_buffer_size = Integer.parseInt(args[i+2]); break;}
                    case "add_latency" : { add_latency = Integer.parseInt(args[i+2]); break;}
                    case "sub_latency" : { sub_latency = Integer.parseInt(args[i+2]); break;}
                    case "mul_latency" : { mul_latency = Integer.parseInt(args[i+2]); break;}
                    case "load_latency" : {load_latency = Integer.parseInt(args[i+2]); break;}
                    case "store_latency" : {store_latency = Integer.parseInt(args[i+2]); break;}
                    case "jump_latency" : {jump_latency = Integer.parseInt(args[i+2]); break;}
                    case "branch_latency" : {branch_latency = Integer.parseInt(args[i+2]); break;}
                    case "halt_latency" : {halt_latency = Integer.parseInt(args[i+2]); break;}
                    case "alu_rs_size" : { alu_rs_size = Integer.parseInt(args[i+2]); break;}
                    case "load_store_rs_size" : { load_store_rs_size = Integer.parseInt(args[i+2]); break;}
                    case "branch_rs_size" : { branch_rs_size = Integer.parseInt(args[i+2]); break;}
                    case "halt_rs_size" : { halt_rs_size = Integer.parseInt(args[i+2]); break;}
                    case "data_cache_latency" : {data_cache_latency = Integer.parseInt(args[i+2]); break;}
                }
            }
        required_parameters = new RequiredParameters(
            file, width, reorder_buffer_size, reservation_station_size,
            store_buffer_size, add_latency,
            sub_latency, mul_latency, load_latency, store_latency, jump_latency,
            branch_latency, halt_latency,
            alu_rs_size, load_store_rs_size, branch_rs_size,
            halt_rs_size, data_cache_latency
        );
        required_parameters.print();
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

    Hashtable<String, Register> register_file;
    Hashtable<Integer, RenamedRegister> renamed_registers;
    Hashtable<Register, String> register_pretty;
    Hashtable<String, Register> register_reverse;
    Hashtable<Integer, Integer> memory_file;
    String prev;
    String prev2;
    int num_raw;
    int num_branch;
    int num_intersection;
    int num_cycles;
    int num_instructions;
    ReservationStation alu_rs;
    ReservationStation load_store_rs;
    ReservationStation branch_rs;
    ReservationStation halt_rs;
    String[] instruction_fetch_results;
    boolean[] instruction_fetch_results_occupied;
    int[] instruction_fetch_pc;

    Vector<Instruction> instruction_decode_results;
    Register[] registers;
    int add_latency;
    int sub_latency;
    int mul_latency;
    int load_latency;
    int store_latency;
    int jump_latency;
    int branch_latency;
    int halt_latency;
    int data_cache_latency;
    StoreBuffer store_buffer;
    DispatchBuffer dispatch_buffer;
    Instruction alu_rs_instruction;
    Instruction load_store_rs_instruction;
    Instruction branch_rs_instruction;
    Instruction halt_rs_instruction;

    ReorderBuffer reorder_buffer;


    Instruction dummy;
    Vector<Instruction> finished;
    ReservationStationExecutor reservation_station;
    boolean can_go_ahead;

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

    String _string(Integer i) {
        return Integer.toString(i);
    }

    public Simulator(RequiredParameters rp, boolean generate_program) {

        register_file = new Hashtable<String, Register>();
        renamed_registers = new Hashtable<Integer, RenamedRegister>();
        register_pretty = new Hashtable<Register, String>();
        register_reverse = new Hashtable<String, Register>();
        memory_file = new Hashtable<Integer, Integer>();
        registers = new Register[16];
        this.generate_program = generate_program;

        Register reg0 = new Register();
        Register reg1 = new Register();
        Register reg2 = new Register();
        Register reg3 = new Register();
        Register reg4 = new Register();
        Register reg5 = new Register();
        Register reg6 = new Register();
        Register reg7 = new Register();
        Register reg8 = new Register();
        Register reg9 = new Register();
        Register reg10 = new Register();
        Register reg11 = new Register();
        Register reg12 = new Register();
        Register reg13 = new Register();
        Register reg14 = new Register();
        Register reg15 = new Register();
        Register[] reg = registers;
        reg[0] = new Register();
        reg[1] = new Register();
        reg[2] = new Register();
        reg[3] = new Register();
        reg[4] = new Register();
        reg[5] = new Register();
        reg[6] = new Register();
        reg[7] = new Register();
        reg[8] = new Register();
        reg[9] = new Register();
        reg[10] = new Register();
        reg[11] = new Register();
        reg[12] = new Register();
        reg[13] = new Register();
        reg[14] = new Register();
        reg[15] = new Register();

        reg0 = reg[0];
        reg1 = reg[1];
        reg2 = reg[2];
        reg3 = reg[3];
        reg4 = reg[4];
        reg5 = reg[5];
        reg6 = reg[6];
        reg7 = reg[7];
        reg8 = reg[8];
        reg9 = reg[9];
        reg10 = reg[10];
        reg11 = reg[11];
        reg12 = reg[12];
        reg13 = reg[13];
        reg14 = reg[14];
        reg15 = reg[15];


        register_file.put("0000", reg0);
        register_file.put("0001", reg1);
        register_file.put("0010", reg2);
        register_file.put("0011", reg3);
        register_file.put("0100", reg4);
        register_file.put("0101", reg5);
        register_file.put("0110", reg6);
        register_file.put("0111", reg7);
        register_file.put("1000", reg8);
        register_file.put("1001", reg9);
        register_file.put("1010", reg10);
        register_file.put("1011", reg11);
        register_file.put("1100", reg12);
        register_file.put("1101", reg13);
        register_file.put("1110", reg14);
        register_file.put("1112", reg15);

        register_pretty.put(reg0, "R0");
        register_pretty.put(reg1, "R1");
        register_pretty.put(reg2, "R2");
        register_pretty.put(reg3, "R3");
        register_pretty.put(reg4, "R4");
        register_pretty.put(reg5, "R5");
        register_pretty.put(reg6, "R6");
        register_pretty.put(reg7, "R7");
        register_pretty.put(reg8, "R8");
        register_pretty.put(reg9, "R9");
        register_pretty.put(reg10, "R10");
        register_pretty.put(reg11, "R11");
        register_pretty.put(reg12, "R12");
        register_pretty.put(reg13, "R13");
        register_pretty.put(reg14, "R14");
        register_pretty.put(reg15, "R15");

        register_reverse.put("R0", reg0);
        register_reverse.put("R1", reg1);
        register_reverse.put("R2", reg2);
        register_reverse.put("R3", reg3);
        register_reverse.put("R4", reg4);
        register_reverse.put("R5", reg5);
        register_reverse.put("R6", reg6);
        register_reverse.put("R7", reg7);
        register_reverse.put("R8", reg8);
        register_reverse.put("R9", reg9);
        register_reverse.put("R10", reg10);
        register_reverse.put("R11", reg11);
        register_reverse.put("R12", reg12);
        register_reverse.put("R13", reg13);
        register_reverse.put("R14", reg14);
        register_reverse.put("R15", reg15);

        add_latency = rp.add_latency;
        sub_latency = rp.sub_latency;
        mul_latency = rp.mul_latency;
        load_latency = rp.load_latency;
        store_latency = rp.store_latency;
        jump_latency = rp.jump_latency;
        branch_latency = rp.branch_latency;
        halt_latency = rp.halt_latency;


        dummy = new Instruction();

        instruction_fetch_results = new String[rp.width];
        instruction_fetch_results_occupied = new boolean[rp.width];
        instruction_fetch_pc = new int[rp.width];
        instruction_fetcher = new InstructionFetch(rp.code, rp.width);

        instruction_decode_results = new Vector<Instruction>();
        instruction_decoder = new InstructionDecode(rp.width);


        alu_rs_instruction = null;
        branch_rs_instruction = null;
        load_store_rs_instruction = null;
        halt_rs_instruction = null;
        dispatch_buffer = new DispatchBuffer(rp.width);


        int alu_rs_size = rp.alu_rs_size;
        int load_store_rs_size = rp.load_store_rs_size;
        int branch_rs_size = rp.branch_rs_size;
        int halt_rs_size = rp.halt_rs_size;
        int first_renamed_alu = 0;
        int first_renamed_load_store = alu_rs_size;
        int first_renamed_branch = alu_rs_size + load_store_rs_size;
        int first_renamed_halt = alu_rs_size + load_store_rs_size + branch_rs_size;
        alu_rs = new ReservationStation(alu_rs_size, first_renamed_alu);
        load_store_rs = new ReservationStation(load_store_rs_size, first_renamed_load_store);
        branch_rs = new ReservationStation(branch_rs_size, first_renamed_branch);
        halt_rs = new ReservationStation(halt_rs_size, first_renamed_halt);

        can_go_ahead = true;
        int rename_register_size = (
            alu_rs_size + load_store_rs_size +
            branch_rs_size + halt_rs_size
        );

        for(int i = 0; i < rename_register_size; i++) {
            renamed_registers.put(i, new RenamedRegister());
        }
        reservation_station = new ReservationStationExecutor();

        data_cache_latency = rp.data_cache_latency;
        store_buffer = new StoreBuffer(rp.store_buffer_size);

        reorder_buffer = new ReorderBuffer();
        finished = new Vector<Instruction>();
    }

    class InstructionFetch {
        Hashtable<Integer, String> code;
        Vector<Instruction> instructions_fetched;
        int width;
        int pc;
        int occupied;
        int counter;
        public void print() {
            System.out.println("Instruction Fetch results");
            for (int i = 0; i < width; ++ i) {
                System.out.print("  " + Integer.toString(i) + " : ");
                if (instruction_fetch_results_occupied[i]) {
                    System.out.print(instruction_fetch_results[i] + "\n");
                } else {
                    System.out.print("\n");
                }
            }
        }
        public InstructionFetch(Hashtable<Integer, String> code, Integer width) {
            this.code = code;
            this.width = width;
            pc = 0;
            occupied = 0;
            for (int i = 0; i < width; ++ i) {
                instruction_fetch_results_occupied[i] = false;
            }
        }
        public void execute_cycle() {
            if (branch_stall) return;
            for(int i = 0; i < width; i++) {
                if (!instruction_fetch_results_occupied[i]) {
                    instruction_fetch_results[i] = code.get(pc);
                    instruction_fetch_results_occupied[i] = true;
                    instruction_fetch_pc[i] = pc;
                    pc += 2;
                }
            }
        }
        public void set_occupied(int occupied) {
            this.occupied = occupied;
        }
        public void reset(int pc) {
            this.pc = pc;
        }
    }


    class InstructionDecode {
        String reg1;
        String reg2;
        String reg3;
        int occupied = 0;
        int width;
        public InstructionDecode(int width) {
            this.width = width;
            this.occupied = 0;
        }
        public void set_occupied(int occupied) {
            this.occupied = occupied;
            instruction_fetcher.set_occupied(occupied);
        }
        public void print() {
            System.out.println("Instruction Decode results");
            for (int i = 0; i < instruction_decode_results.size(); ++ i) {
                System.out.println("  " + instruction_decode_results.get(i).print());
            }
        }
        public void execute_cycle() {
            boolean[] checked = new boolean[width];
            for (int i = 0; i < width; ++ i) checked[i] = false;
            int num_checked = 0;
            Instruction instruction;
            String instruction_code;
            while (num_checked < width) {
                int i = -1;
                int min_pc = 1000000;
                for(int j = 0; j < width; j++) {
                    if (!checked[j]) {
                        if (instruction_fetch_results_occupied[j]) {
                            if (min_pc >= instruction_fetch_pc[j]) {
                                i = j;
                                min_pc = instruction_fetch_pc[j];
                            }
                        } else {
                            if (i == -1) {
                                i = j;
                            }
                        }
                    }
                }

                checked[i] = true;
                num_checked ++;

                if (instruction_fetch_results_occupied[i]) {
                    reg1 = "";
                    reg2 = null;
                    reg3 = null;
                    instruction_code = instruction_fetch_results[i];
                    if(instruction_code == null) {
                        instruction = dummy;
                        System.out.println("Instruction null");
                        continue;
                    }
                    if(instruction_code.length() == 0) {
                        instruction = dummy;
                        System.out.println("Instruction empty");
                        continue;
                    }
                    String code = instruction_code.substring(0, 3);
                    instruction = null;
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
                        // int ct = register_writes.get(reg1);
                        // register_writes.put(reg1, ct+1);
                    }

                    if(code.equals("011")) {
                        reg1 = instruction_code.substring(4, 8);
                        reg2 = instruction_code.substring(8, 12);
                        // int ct = register_writes.get(reg1);
                        // register_writes.put(reg1, ct+1);
                        instruction = new LoadInstruction(reg1, reg2);
                    }
                    if(code.equals("100")) {
                        reg2 = instruction_code.substring(4, 8);
                        reg3 = instruction_code.substring(8, 12);
                        instruction = new StoreInstruction(reg2, reg3);
                    }
                    if(code.equals("101")) {
                        String s = instruction_code.substring(4, 12);
                        raw_stall = false;
                        int offset = get_integer(s);
                        instruction = new JumpInstruction(offset);
                        branch_stall = true;
                        for (int j = 0; j < width; ++ j) {
                            if (instruction_fetch_pc[j] > instruction_fetch_pc[i]) {
                                instruction_fetcher.pc -= 2;
                                instruction_fetch_results_occupied[j] = false;
                            }
                        }
                        instruction.pc = instruction_fetch_pc[i];
                        instruction.jump();
                        branch_stall = false;
                    }
                    if(code.equals("110")) {
                        reg2 = instruction_code.substring(4, 8);
                        String s = instruction_code.substring(8, 16);
                        int offset = get_integer(s);
                        instruction = new BranchInstruction(reg2, offset);
                        branch_stall = true;
                        for (int j = 0; j < width; ++ j) {
                            if (instruction_fetch_pc[j] > instruction_fetch_pc[i]) {
                                instruction_fetcher.pc -= 2;
                                instruction_fetch_results_occupied[j] = false;
                            }
                        }
                    }
                    if(code.equals("111")) {
                        halt_stall = true;
                        instruction = new HaltInstruction();
                    }
                    if (instruction != null) {
                        instruction.pc = instruction_fetch_pc[i];
                    }
                    if (instruction_decode_results.size() < dispatch_buffer.size) {
                        instruction_fetch_results_occupied[i] = false;
                        instruction_decode_results.add(instruction);
                    }
                }
            }
        }
    }


    class DispatchBuffer {
        int size;
        public DispatchBuffer(int width) {
          size = width;
        }
        public void print() {
            System.out.println("Dispatch Buffer results");
            System.out.println("  ALU RS : ");
            if (alu_rs_instruction != null) {
                System.out.print(alu_rs_instruction.print() + "\n");
            } else {
                System.out.print("\n");
            }
            System.out.println("  BRANCH RS : ");
            if (branch_rs_instruction != null) {
                System.out.print(branch_rs_instruction.print() + "\n");
            } else {
                System.out.print("\n");
            }
            System.out.println("  LOAD STORE RS : ");
            if (load_store_rs_instruction != null) {
                System.out.print(load_store_rs_instruction.print() + "\n");
            } else {
                System.out.print("\n");
            }
            System.out.println("  HALT RS : ");
            if (halt_rs_instruction != null) {
                System.out.print(halt_rs_instruction.print() + "\n");
            } else {
                System.out.print("\n");
            }
        }
        public void execute_cycle() {
            alu_rs_instruction = null;
            boolean alu_rs_instruction_inserted = false;
            branch_rs_instruction = null;
            boolean branch_rs_instruction_inserted = false;
            load_store_rs_instruction = null;
            boolean load_store_rs_instruction_inserted = false;
            halt_rs_instruction = null;
            boolean halt_rs_instruction_inserted = false;
            for (int i = 0; i < registers.length; ++ i) {
                registers[i].dependencies = 0;
            }
            for (int i = 0; i < instruction_decode_results.size(); ++ i) {
                String printed = instruction_decode_results.get(i).print();
                boolean inserted = false;
                int dep1 = 0;
                int dep2 = 0;
                int dep3 = 0;
                if(instruction_decode_results.get(i).reg1 != null)
                    dep1 = instruction_decode_results.get(i).reg1.dependencies;
                if(instruction_decode_results.get(i).reg2 != null)
                    dep2 = instruction_decode_results.get(i).reg2.dependencies;
                if(instruction_decode_results.get(i).reg3 != null)
                    dep3 = instruction_decode_results.get(i).reg3.dependencies;
                if(dep1 + dep2 + dep3 != 0) {
                    if(instruction_decode_results.get(i).reg1 != null) {
                        instruction_decode_results.get(i).reg1.dependencies++;
                    }
                    continue;
                }
                if (printed.startsWith("ADD")) {
                    if (alu_rs.can_take_instructions() && !alu_rs_instruction_inserted) {
                        alu_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        alu_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("MUL")) {
                    if (alu_rs.can_take_instructions() && !alu_rs_instruction_inserted) {
                        alu_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        alu_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("SUB")) {
                    if (alu_rs.can_take_instructions() && !alu_rs_instruction_inserted) {
                        alu_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        alu_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("BEQZ")) {
                    if (branch_rs.can_take_instructions() && !branch_rs_instruction_inserted) {
                        branch_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        branch_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("JUMP")) {
                    if (branch_rs.can_take_instructions() && !branch_rs_instruction_inserted) {
                        branch_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        branch_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("HALT")) {
                    if (halt_rs.can_take_instructions() && !halt_rs_instruction_inserted) {
                        halt_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        halt_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("LOAD")) {
                    if (load_store_rs.can_take_instructions() && !load_store_rs_instruction_inserted) {
                        load_store_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        load_store_rs_instruction_inserted = true;
                    }
                } else if (printed.startsWith("STORE")) {
                    if (load_store_rs.can_take_instructions() && !load_store_rs_instruction_inserted) {
                        load_store_rs_instruction = instruction_decode_results.get(i);
                        inserted = true;
                        load_store_rs_instruction_inserted = true;
                    }
                }

                if(instruction_decode_results.get(i).reg1 != null) {
                    instruction_decode_results.get(i).reg1.dependencies++;
                }
                if (inserted) {
                    instruction_decode_results.remove(i);
                    i--;
                }

            }
        }
    }

    class Register extends Object{
        int value;
        boolean ready;
        int tag;
        int dependencies;
        public Register() {
            ready = true;
            tag = -1;
            value = 0;
            dependencies = 0;
        }
        public void set_tag(int tag) {
            this.tag = tag;
            renamed_registers.get(tag).set_valid(false);
            ready = false;
        }
        public boolean is_ready() {
            return (ready || renamed_registers.get(tag).valid);
        }
        public void set_value() {
            if(renamed_registers.get(tag).valid) {
                value = renamed_registers.get(tag).value;
                ready = true;
            }
        }
        public void set_value(int value) {
            this.value = value;
        }
        public String print() {
            String s = "value : " +  _string(value);
            return s;
        }
    }
    class RenamedRegister extends Object{
        int value;
        boolean valid;
        public void set_valid(boolean valid) {this.valid = valid;}
        public void set_value(int value) {this.value = value; this.valid = true;}
    }
    public Triplet<RenamedRegister, Integer, Boolean> tag_reg(Register reg, Integer default_val) {
        if(reg == null) {
            return new Triplet<RenamedRegister, Integer, Boolean>(null, default_val, true);
        }
        else if(reg.ready) {
            return new Triplet<RenamedRegister, Integer, Boolean>(null, reg.value, true);
        }
        else {
            RenamedRegister ren3 = renamed_registers.get(reg.tag);
            return new Triplet<RenamedRegister, Integer, Boolean>(ren3, 0, false);
        }
    }
    public int get_latency(int op_code) {
        switch(op_code) {
            case 0 : {return add_latency;}
            case 1 : {return sub_latency;}
            case 2 : {return mul_latency;}
            case 3 : {return load_latency;}
            case 4 : {return store_latency;}
            case 5 : {return jump_latency;}
            case 6 : {return branch_latency;}
            case 7 : {return halt_latency;}
            default : {return 0;}
        }
    }



    class ReservationStation {
        Instruction[] instructions;
        int size;
        int occupancy;
        int first_renamed;
        public ReservationStation(int size, int first_renamed) {
            this.size = size;
            instructions = new Instruction[size];
            occupancy = 0;
            this.first_renamed = first_renamed;
        }
        public boolean can_take_instructions() {
            return occupancy < size;
        }
        public void receive_instructions(Instruction rs_instruction) {
            if (rs_instruction != null) {
                for(int i = 0; i < size; i++) {
                    if(instructions[i] == null) {
                        instructions[i] = rs_instruction;
                        occupancy++;
                        instructions[i].set_tag(first_renamed+i);
                        break;
                    }
                }
            }
        }
        public Instruction execute_cycle() {
            Instruction finished = null;
            can_go_ahead = true;
            for(int i = 0; i < instructions.length; i++) {
                if(instructions[i] != null && instructions[i] != dummy) {
                    __print("index : " + _string(i) + " current_stage :" + _string(instructions[i].current_stage));
                    if(instructions[i].finished) {
                        instructions[i] = null;
                        occupancy--;
                    }
                    else if(!instructions[i].result_got()){
                        boolean is_over = instructions[i].execute_cycle();
                        if(is_over) {
                            finished = instructions[i];
                        }
                    }
                }
            }
            return finished;
        }
        public void print() {
            for(int i = 0; i < instructions.length; i++) {
                if(instructions[i] != null && instructions[i] != dummy) {
                    __print("  " + _string(i) + " : " + instructions[i].print() + " " + _string(instructions[i].current_stage));
                }
            }
            __print(" Occupancy = " + Integer.toString(occupancy));
        }
    }

    class ReservationStationExecutor {
        public void execute_cycle() {
            alu_rs.receive_instructions(alu_rs_instruction);
            load_store_rs.receive_instructions(load_store_rs_instruction);
            branch_rs.receive_instructions(branch_rs_instruction);
            halt_rs.receive_instructions(halt_rs_instruction);
            finished.add(alu_rs.execute_cycle());
            finished.add(load_store_rs.execute_cycle());
            finished.add(branch_rs.execute_cycle());
            finished.add(halt_rs.execute_cycle());
        }
        public void print() {
            __print("Reservation Station: ");
            __print("ALU: ");
            alu_rs.print();
            __print("Load Store: ");
            load_store_rs.print();
            __print("Branch: ");
            branch_rs.print();
            __print("Halt: ");
            halt_rs.print();
            System.out.println("Reorder Buffer output: size = " + _string(finished.size()));
            for (int i = 0; i < finished.size(); ++ i) {
                if(finished.get(i) != null)
                    System.out.println("  " + finished.get(i).print());
            }
        }
    }
    class Instruction {
        public boolean finished = false;
        Register reg1;
        Register reg2;
        Register reg3;
        int op_code;
        int current_stage;
        int pc;
        RenamedRegister ren1;
        RenamedRegister ren2;
        RenamedRegister ren3;
        boolean r2_wait;
        boolean r3_wait;
        Integer required_r2;
        Integer required_r3;
        Integer integer;
        Integer result;
        int latency;
        int pc_changed;
        boolean gen = false;
        public void jump() {}
        public boolean execute() {return true;}
        public void write_back() {finished = true;}
        public boolean result_got() {return latency < current_stage;}
        public void set_tag(Integer i) {
            Triplet<RenamedRegister, Integer, Boolean> t2 = tag_reg(reg2, 0);
            Triplet<RenamedRegister, Integer, Boolean> t3 = tag_reg(reg3, integer);
            r2_wait = !t2.z;
            r3_wait = !t3.z;
            if(t2.z) {
                required_r2 = t2.y;
            }
            else {
                ren2 = t2.x;
            }
            if(t3.z) {
                required_r3 = t3.y;
            }
            else {
                ren3 = t3.x;
            }
            ren1 = renamed_registers.get(i);
            if(reg1 != null)
                reg1.set_tag(i);
            gen = t2.z && t3.z;
        }
        public void dependency_over() {
            if(gen) {
                current_stage++;
                return;
            }
            if(r2_wait && ren2.valid) {
                required_r2 = ren2.value;
                r2_wait = false;
            }
            if(r3_wait && ren3 != null && ren3.valid) {
                required_r3 = ren3.value;
                r3_wait = false;
            }

            if(!r2_wait && !r3_wait)
                current_stage++;
        }
        public boolean execute_cycle() {
            // __print(current_stage);
            // __print(latency);
            //__print(current_stage);
            if(current_stage == 0) {
                dependency_over();
                //can_go_ahead = false;
                return false;
            }
            else if(can_go_ahead)
                return execute();
            return false;
        }
        public String print() { return "";}
    }
    public void __print(String s) {
        System.out.println(s);
    }
    public void __print(Integer s) {
        System.out.println(s);
    }

    class AluInstruction extends Instruction {
        boolean immediate;
        Integer result;
        public AluInstruction(
            int op_code, boolean immediate, String reg1, String reg2,
            String reg3, Integer integer
        ) {
            this.immediate = immediate;
            this.reg1 = register_file.get(reg1);
            this.reg2 = register_file.get(reg2);
            if(reg3 != null)
                this.reg3 = register_file.get(reg3);
            this.integer = integer;
            this.op_code = op_code;
            latency = get_latency(op_code);
            current_stage = 0;
            r2_wait = true;
            r3_wait = true;
            //__print(print());
        }

        public boolean execute() {
            if(current_stage < latency) {
                current_stage++;
                return false;
            }
            else {
                switch(op_code) {
                    case 1 : {result = get_integer(required_r2 + required_r3);break;}
                    case 2 : {result = get_integer(required_r2 - required_r3);break;}
                    case 3 : {result = get_integer(required_r2 * required_r3);break;}
                }
                ren1.set_value(result);
                current_stage++;
                return true;
            }
        }

        public void write_back() {
            reg1.set_value();
            //reg1.set_value(result);
            finished = true;
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

    class LoadInstruction extends Instruction {
        public LoadInstruction(String reg1, String reg2) {
            this.reg1 = register_file.get(reg1);
            this.reg2 = register_file.get(reg2);
            op_code = 3;
            latency = get_latency(op_code);
            current_stage = 0;
            //__print(print());
        }

        public boolean execute() {
            if(current_stage == 1) {
                Pair<Integer, Boolean> p = store_buffer.service(required_r2);
                if(p.y)
                    result = p.x;
                else {
                    latency = data_cache_latency;
                }
                result = memory_file.get(required_r2);
                if(result == null) {
                    result = rand.nextInt(65536) - 32768;
                    memory_file.put(required_r2, result);

                }
                current_stage++;
                ren1.set_value(result);
                return false;
            }
            if(current_stage < latency) {
                current_stage++;
                return false;
            }
            else {
                current_stage++;
            }
            return true;
        }
        public void write_back() {
            reg1.set_value();
            //reg1.set_value(result);
            finished = true;
        }
        // public void write_back() {
        //     register_file.put(reg1, result);
        //     int ct = register_writes.get(reg1);
        //     ct--;
        //     register_writes.put(reg1, ct);
        //     operand_forwarding.put(reg1, bad_val);
        // }

        public String print() {
            return "LOAD " + register_pretty.get(reg1) + " [" + register_pretty.get(reg2) + "] ";
        }
    }

    class StoreBuffer {
        Vector< Pair<Integer, Integer>> store_buffer;
        int current;
        public StoreBuffer(int size) {
            current = 0;
            store_buffer = new Vector< Pair<Integer, Integer>> ();
            for(int i = 0; i < size; i++)
                store_buffer.add(null);
        }
        public void free() {
            for(int i = 0; i < store_buffer.size(); i++) {
                if(store_buffer.get(i) != null) {
                    memory_file.put(store_buffer.get(i).x, store_buffer.get(i).y);
                    store_buffer.set(i, null);
                }
            }
        }
        public void add(int r2, int r3) {
            if(current == store_buffer.size()) {
                // stall_all_cycle = true;
                for(int i = 0; i < store_buffer.size(); i++) {
                    memory_file.put(store_buffer.get(i).x, store_buffer.get(i).y);
                    store_buffer.set(i, null);
                }
                current = 0;
            }
            store_buffer.set(current, new Pair<Integer, Integer>(r2, r3));
            current++;
        }
        public Pair<Integer, Boolean> service(int r2) {
            for(int i = current - 1; i >= 0; i--)
                if(store_buffer.get(i).x == r2)
                    return new Pair<Integer, Boolean>(store_buffer.get(i).y, true);
            return new Pair<Integer, Boolean>(0, false);
        }
    }

    class StoreInstruction extends Instruction{
        public StoreInstruction(String reg2, String reg3) {
            this.reg2 = register_file.get(reg2);
            this.reg3 = register_file.get(reg3);
            op_code = 4;
            latency = get_latency(op_code);
            current_stage = 0;
            //__print(print());
        }

        public boolean execute() {
            if(current_stage < latency) {
                current_stage++;
                return false;
            }
            else {
                store_buffer.add(required_r2, required_r3);
                current_stage++;
                return true;
            }
        }

        public String print() {
            return "STORE [" + register_pretty.get(reg2) + "] " + register_pretty.get(reg3);
        }
    }

    class JumpInstruction extends Instruction {
        int offset;
        int pc1;
        public JumpInstruction(int offset) {
            this.offset = offset;
            op_code = 5;
            latency = get_latency(op_code);
            current_stage = 0;
            //__print(print());
        }

        public void jump() {
            pc1 = pc + (offset*2) ;
            pc_changed = pc1;
            instruction_fetcher.reset(pc1);
            instruction = instruction1 = instruction2 = dummy;
            // Modify as per requirement.
            branch_stall = false;
            first_stall = true;
        }
        public boolean execute() {
            if(current_stage < latency) {
                current_stage++;
                return false;
            }
            else {
                current_stage++;
                return true;
            }
        }
        public String print() {
            return "JUMP " + offset;
        }
    }

    class BranchInstruction extends Instruction{
        int offset;
        int default_pc;
        public BranchInstruction(String reg2, Integer offset) {
            this.reg2 = register_file.get(reg2);
            this.offset = offset;
            op_code = 6;
            latency = get_latency(op_code);
            current_stage = 0;
            //__print(print());
        }

        public boolean execute() {
            if(current_stage < latency) {
                current_stage++;
                return false;
            }
            else {
                boolean condition = (required_r2 == 0);
                int pc1 = pc + (offset*2);
                if(condition) {
                    instruction_fetcher.reset(pc1);
                    pc_changed = pc1;
                }
                else {
                    pc_changed = pc+2;
                }
                branch_stall = false;
                first_stall = true;
                current_stage++;
                return true;
            }
        }

        public String print() {
            return "BEQZ " + register_pretty.get(reg2) + " " + offset;
        }
    }

    public void print_regs() {
        Enumeration<String> s = register_file.keys();
        while(s.hasMoreElements()) {
            String s1 =s.nextElement();
            Register r = register_file.get(s1);
            __print(s1 + " : " + r.print());
        }
    }

    class HaltInstruction extends Instruction{
        public HaltInstruction() {
            op_code = 7;
            latency = get_latency(op_code);
            current_stage = 0;
            //__print(print());
        }
        public boolean execute() {
            if(current_stage < latency) {
                current_stage++;
                return false;
            }
            else {
                current_stage++;
                return true;
            }
        }
        public void write_back() {
            print_regs();
            store_buffer.free();
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
            finished = true;
            System.exit(0);
        }
        public String print() {
            return "HALT";
        }
    }

    public void start_simulate() {
        prev = "";
        instruction_fetcher.reset(0);
        num_raw = 0;
        num_branch = 0;
        num_intersection = 0;
        num_cycles = 0;
        num_instructions = 0;
        instruction = instruction1 = instruction2 = instruction3 = instruction4 = dummy;
        raw_stall = branch_stall = halt_stall = false;
        pc = 0;
        first_stall = true;
        pain = true;
    }

    class ReorderBuffer {
        int expected = 0;
        public void execute_cycle() {
            for(int i = 0; i < finished.size(); i++) {
                if(finished.get(i) == null || finished.get(i) == dummy) {
                    finished.remove(i);
                    i--;
                }
            }

            for(int i = 0; i < finished.size() - 1; i++)
                for (int j = i+1; j < finished.size(); j++)
                    if(finished.get(i).pc > finished.get(j).pc) {
                        Instruction temp = finished.get(i);
                        finished.set(i, finished.get(j));
                        finished.set(j, temp);
                    }

            if(finished.size() > 0) {
                __print(expected);
                __print(finished.get(0).pc);
            }

            while(finished.size() > 0) {
                if(finished.get(0).pc != expected) {
                    break;
                }
                finished.get(0).write_back();
                if(finished.get(0) instanceof BranchInstruction
                        || finished.get(0) instanceof JumpInstruction) {
                    expected = finished.get(0).pc_changed;
                    __print("eeeeee");
                }
                else
                    expected += 2;
                finished.remove(0);
            }
        }
    }

    public void simulate() {
        instruction_fetcher.pc = 0;
        int i = 0;
        while(true) {
            simulate_cycle();
            i++;
        }
    }

    public Deliverable simulate_cycle() {
        __print("----------------------");
        reorder_buffer.execute_cycle();
        //reorder_buffer.print();
        reservation_station.execute_cycle();
        reservation_station.print();
        dispatch_buffer.execute_cycle();
        dispatch_buffer.print();
        instruction_decoder.execute_cycle();
        instruction_decoder.print();
        instruction_fetcher.execute_cycle();
        instruction_fetcher.print();
        print_regs();
        __print("----------------------");
        return null;
    }
}

