import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class PipelineSimulator {
   public static void main(String [] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("file.txt"));
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
        Simulator s = new Simulator(code);
        System.out.println(code.size());
        s.simulate();
   }
}

class Simulator {
    InstructionFetch instruction_fetcher;
    InstructionDecode instruction_decoder;
    boolean raw_stall;
    boolean branch_stall;
    boolean halt_stall;

    Hashtable<String, Integer> register_file;
    Hashtable<String, Integer> register_writes;
    Hashtable<Integer, Integer> memory_file;

    Instruction dummy = new Instruction();

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

    public Simulator(Hashtable<Integer, String> code) {
        instruction_fetcher = new InstructionFetch(code);
        instruction_decoder = new InstructionDecode();

        register_file = new Hashtable<String, Integer>();
        register_writes = new Hashtable<String, Integer>();
        memory_file = new Hashtable<Integer, Integer>();

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
    }

    class Instruction {
        public void read_register() {}
        public void alu_execute() {}
        public void mem_access_cycle() {}
        public void write_back() {}
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
            if(!immediate)
                required_r3 = register_file.get(reg3);
            else
                required_r3 = integer;
        }

        public void alu_execute() {
            switch(op_code) {
                case 1 : {result = get_integer(required_r2 + required_r3);break;}
                case 2 : {result = get_integer(required_r2 - required_r3);break;}
                case 3 : {result = get_integer(required_r2 * required_r3);break;}
            }
        }

        public void mem_access_cycle() {}

        public void write_back() {
            register_file.put(reg1, result);
            int ct = register_writes.get(reg1);
            ct--;
            register_writes.put(reg1, ct);
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
        }
        public void alu_execute() {}
        public void mem_access_cycle() {
            result = memory_file.get(required_r2);
            if(result == null)
                result = 0;
        }
        public void write_back() {
            register_file.put(reg1, result);
            int ct = register_writes.get(reg1);
            ct--;
            register_writes.put(reg1, ct);
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
        }
        public void alu_execute() {}

        public void mem_access_cycle() {
            memory_file.put(required_r2, required_r3);
        }
        public void write_back() {}
    }

    class JumpInstruction extends Instruction{
        int offset;
        int pc;
        public JumpInstruction(int offset) {
            this.offset = offset;
        }
        public void read_register() {}
        public void alu_execute() {
            pc = instruction_fetcher.pc + offset;
        }
        public void mem_access_cycle() {
            instruction_fetcher.reset(pc);
            branch_stall = false;
        }
        public void write_back() {}
    }

    class BranchInstruction extends Instruction{
        String reg2;
        int condition_val;
        boolean condition;
        int pc;
        int offset;
        public BranchInstruction(String reg2, Integer offset) {
            this.reg2 = reg2;
            this.offset = offset;
        }

        public void read_register() {
            int condition_val = register_file.get(reg2);
        }

        public void alu_execute() {
            condition = (condition_val == 0);
            pc = instruction_fetcher.pc + offset;
        }

        public void mem_access_cycle() {
            if(condition)
                instruction_fetcher.reset(pc);
            branch_stall = false;
        }

        public void write_back() {}
    }

    class HaltInstruction extends Instruction{
        public void read_register() {}
        public void alu_execute() {}
        public void mem_access_cycle() {}
        public void write_back() {
            System.out.println(register_file);
            System.exit(0);
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
            return fetched_string;
        }

        public void reset(int pc) {
            this.pc = pc;
        }
    }

    class InstructionDecode {
        String reg2;
        String reg3;
        public Instruction decode(String instruction_code) {
            reg2 = null;
            reg3 = null;
            if(instruction_code == null)
                return dummy;
            if(instruction_code.length() == 0)
                return dummy;
            String code = instruction_code.substring(0, 3);
            Instruction instruction;
            if(code.equals("000") || code.equals("001") || code.equals("010")) {
                String im = instruction_code.substring(3, 4);
                boolean immediate = im.equals("1");
                Integer integer = 0;
                int op_code = 0;
                if(code.equals("000")) op_code = 1;
                if(code.equals("001")) op_code = 2;
                if(code.equals("010")) op_code = 3;
                String reg1 = instruction_code.substring(4, 8);
                reg2 = instruction_code.substring(8, 12);
                if(immediate)
                    integer = get_integer(instruction_code.substring(12, 16));
                else
                    reg3 = instruction_code.substring(12, 16);
                instruction = new AluInstruction(
                    op_code, immediate, reg1, reg2, reg3, integer
                );
                raw_stall = !check_raw_over();
                int ct = register_writes.get(reg1);
                register_writes.put(reg1, ct+1);
                return instruction;
            }

            if(code.equals("011")) {
                String reg1 = instruction_code.substring(4, 8);
                reg2 = instruction_code.substring(8, 12);
                int ct = register_writes.get(reg1);
                register_writes.put(reg1, ct+1);
                raw_stall = !check_raw_over();
                return new LoadInstruction(reg1, reg2);
            }
            if(code.equals("100")) {
                reg2 = instruction_code.substring(4, 8);
                reg3 = instruction_code.substring(8, 12);
                raw_stall = !check_raw_over();
                return new StoreInstruction(reg2, reg3);
            }
            if(code.equals("101")) {
                String s = instruction_code.substring(4, 12);
                branch_stall = true;
                raw_stall = false;
                int offset = get_integer(s);
                return new JumpInstruction(offset);
            }
            if(code.equals("110")) {
                reg2 = instruction_code.substring(4, 8);
                String s = instruction_code.substring(8, 16);
                int offset = get_integer(s);
                branch_stall = true;
                raw_stall = !check_raw_over();
                return new BranchInstruction(reg2, offset);
            }
            if(code.equals("111")) {
                halt_stall = true;
                return new HaltInstruction();
            }
            return null;
        }
        public boolean check_raw_over() {
            if(reg2 != null && register_writes.get(reg2) > 0)
                return false;
            if(reg3 != null && register_writes.get(reg3) > 0)
                return false;
            return true;
        }
    }



    public void simulate() {
        String prev;
        String prev2;
        Instruction instruction;
        Instruction instruction1;
        Instruction instruction2;
        Instruction instruction3;
        Instruction instruction4;
        prev2 = instruction_fetcher.fetch_instruction();
        instruction = instruction1 = instruction2 = instruction3 = instruction4 = dummy;
        raw_stall = branch_stall = halt_stall = false;
        prev = "";

        while(true) {
            if(!raw_stall && !branch_stall && !halt_stall)
                instruction = instruction_decoder.decode(prev);
            instruction1.read_register();
            instruction2.alu_execute();
            instruction3.mem_access_cycle();
            instruction4.write_back();
            prev = prev2;
            instruction4 = instruction3;
            instruction3 = instruction2;
            instruction2 = instruction1;
            raw_stall = !instruction_decoder.check_raw_over();
            if(raw_stall)
                instruction1 = dummy;
            else
                instruction1 = instruction;
            if(!raw_stall && !branch_stall && !halt_stall)
                prev2 = instruction_fetcher.fetch_instruction();
            if(branch_stall)
                prev2 = "";
            System.out.println(instruction_fetcher.pc);
        }

    }
}


