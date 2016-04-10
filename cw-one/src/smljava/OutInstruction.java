package smljava;

/**
 * Created by geoff_000 on 19/02/2016.
 */
public class OutInstruction extends Instruction {

    private int result;


    public OutInstruction(String label, String op) {
        super(label, op);
    }

    public OutInstruction(String label, int result) {
        this(label, "out");
        this.result = result;


    }



    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(result);
        System.out.println("Value of register " + result + " is: " + value1);

    }

    @Override
    public String toString() {
        return super.toString() + " " + result;
    }
}
