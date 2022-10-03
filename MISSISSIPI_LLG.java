import org.w3c.dom.ls.LSOutput;

public class Lauraplayground_week_2_Assignment_1 {
    public static void main(String[] args) {
        //each letter has its own pattern written out
        M();
        System.out.println();
        ISS();
        System.out.println();
        ISS();
        System.out.println();
        IPP();
        I();
    }

    public static void
    M() {
        DM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        DM();
        DM();
        DM();
    }

    public static void
    I() {
        GI();
        IL();
        IL();
        IL();
        IL();
        IL();
        GI();
    }

    public static void
    S() {
        FS();
        TS();
        System.out.println("S      ");
        FS();
        System.out.println("      S");
        TS();
        FS();
    }

    public static void
    P() {
        SP();
        TP();
        TP();
        SP();
        OP();
        OP();
        OP();
    }

    public static void
        //this DM is used to reduce having to write out individual lines of the double M in the large M() on line 30
    DM() {
        System.out.println("M     M");
    }

    // this GI group of I and IL I-line are used to make the I() simpler to program
    public static void
    GI() {
        System.out.println("IIIII");
    }

    public static void
    IL() {
        System.out.println("  I  ");
    }

    // the S() is made up of two structures that repeat so make a method for each line and then type out each command
    public static void
    FS() {
        System.out.println(" SSSSS ");
    }

    public static void
    TS() {
        System.out.println("S     S");
    }

    //The P() is made up of three structures so make methods to make it easier to type
    public static void
    SP() {
        System.out.println("PPPPPP ");
    }

    public static void
    TP() {
        System.out.println("P     P");
    }

    public static void
    OP() {
        System.out.println("P");
    }

    public static void
    ISS() {
        I();
        System.out.println();
        S();
        System.out.println();
        S();

    }

    public static void
    IPP() {
        I();
        System.out.println();
        P();
        System.out.println();
        P();
        System.out.println();
    }
}
