package smljava;

import java.util.ArrayList;

/**
 * Created by geoff_000 on 19/02/2016.
 */
public class BnzInstruction extends Instruction {

    private int result;

    private String nextInstr;

    public BnzInstruction(String label, String op) {
        super(label, op);
    }

    public BnzInstruction(String label, int result, String nextInstr) {
        this(label, "bnz");
        this.result = result;
        this.nextInstr = nextInstr;


    }



    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(result);
        if(value1 > 0){
            int labelIndex = m.getLabels().indexOf(nextInstr);
            if(labelIndex != -1){
                m.setPc(labelIndex);
            }
        }


    }

    @Override
    public String toString() {
        return super.toString() + " " + result + " to " + nextInstr;
    }
}


