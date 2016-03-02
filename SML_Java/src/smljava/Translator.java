package smljava;

/**
 * Created by geoff_000 on 19/02/2016.
 */
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * The translator of a <b>S</b><b>M</b>al<b>L</b> program.
 */
public class Translator {

    private static final String SRC = "C:\\Users\\geoff_000\\IdeaProjects\\SDP2016\\SML_Java\\src\\smljava\\";
    // word + line is the part of the current line that's not yet processed
    // word has no whitespace
    // If word and line are not empty, line begins with whitespace
    private String line = "";
    private Labels labels; // The labels of the program being translated
    private ArrayList<Instruction> program; // The program to be created
    private String fileName; // source file of SML code

    public Translator(String fileName) {
        this.fileName = SRC + fileName;
    }

    // translate the small program in the file into lab (the labels) and
    // prog (the program)
    // return "no errors were detected"
    public boolean readAndTranslate(Labels lab, ArrayList<Instruction> prog) throws Exception{

        try (Scanner sc = new Scanner(new File(fileName))) {
            // Scanner attached to the file chosen by the user
            labels = lab;
            labels.reset();
            program = prog;
            program.clear();

            try {
                line = sc.nextLine();
            } catch (NoSuchElementException ioE) {
                return false;
            }

            // Each iteration processes line and reads the next line into line
            while (line != null) {
                // Store the label in label
                String label = scan();

                if (label.length() > 0) {
                    Instruction ins = getInstruction(label);
                    if (ins != null) {
                        labels.addLabel(label);
                        program.add(ins);
                    }
                }

                try {
                    line = sc.nextLine();
                } catch (NoSuchElementException ioE) {
                    return false;
                }
            }
        } catch (IOException ioE) {
            System.out.println("File: IO error " + ioE.getMessage());
            return false;
        }
        return true;
    }

    // line should consist of an MML instruction, with its label already
    // removed. Translate line into an instruction with label label
    // and return the instruction
    public Instruction getInstruction(String label) throws Exception {
        int s1; // Possible operands of the instruction
        int s2;
        int r;
        int x;
        String nextInstr = "";


        if (line.equals(""))
            return null;

        String ins = scan();
        //switch (ins) {
        //  case "add":
        //    r = scanInt();
        //  s1 = scanInt();
        //s2 = scanInt();
        //return new AddInstruction(label, r, s1, s2);

        /**
         * Use a factory to lookup the (fully qualified) instruction name from a properties file and then use reflection to
         * get the constructor arguments to determine what sort of instruction is being read
         */
        InstructionFactory instrFac = new InstructionFactory();
        Class instrName = instrFac.getInstrClass(ins); //get the (fully qualified) class name
        Object o = null;
        Instruction i = null;
        Constructor constr = instrFac.getConstructor(instrName); //get the 2nd constructor (the first is to super()= abstract)
        Class[] params = instrFac.getParams(instrName); //get the parameters of the constructor
        if (params.length == 4) { // 4 params will take only ints
            r = scanInt();
            s1 = scanInt();
            s2 = scanInt();
            o = constr.newInstance(label, r, s1, s2);
            Instruction instru = (Instruction) o;
            return instru;


        } else if (params.length == 3) { // else 3 params could be either linInstruction (2 ints) or bnzInstruction (1 int & 1 String)
            String testParam = params[2].toString(); // it's the 3rd param that may be an int or a String
            if (testParam.equals("int")) {
                r = scanInt();
                s1 = scanInt();
                o = constr.newInstance(label, r, s1);
                Instruction linIn = (Instruction) o;
                return linIn;

            } else {
                r = scanInt();
                nextInstr = scan();
                o = constr.newInstance(label, r, nextInstr);
                Instruction bnzIn = (Instruction) o;
                return bnzIn;
            }

        } else {
            r = scanInt(); // must be a out statement
            o = constr.newInstance(label, r);
            Instruction instru = (Instruction) o;
            return instru;

        }








        // You will have to write code here for the other instructions.


    }

    private Boolean validR(int r){
        boolean res = false;
        if(r >= 0 && r < 32){
            res = true;
        }
        return res;
    }

    /*
     * Return the first word of line and remove it from line. If there is no
     * word, return ""
     */
    private String scan() {
        line = line.trim();
        if (line.length() == 0)
            return "";

        int i = 0;
        while (i < line.length() && line.charAt(i) != ' ' && line.charAt(i) != '\t') {
            i = i + 1;
        }
        String word = line.substring(0, i);
        line = line.substring(i);
        return word;
    }

    // Return the first word of line as an integer. If there is
    // any error, return the maximum int
    private int scanInt() {
        String word = scan();
        if (word.length() == 0) {
            return Integer.MAX_VALUE;
        }

        try {
            return Integer.parseInt(word);
        } catch (NumberFormatException e) {
            return Integer.MAX_VALUE;
        }
    }
}