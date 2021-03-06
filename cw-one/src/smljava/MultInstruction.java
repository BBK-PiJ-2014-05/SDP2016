package smljava;

/**
 * Created by geoff_000 on 19/02/2016.
 */
public class MultInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    public MultInstruction(String label, String op) {
        super(label, op);
    }

    public MultInstruction(String label, int result, int op1, int op2) {
        this(label, "mult");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;

    }



    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 * value2);

    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " x " + op2 + " to " + result;
    }
}

