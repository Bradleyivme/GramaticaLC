package CLC;

public class PATCFG {

    public static void main(String[] args) {
        
        AUTOMATA AP = new AUTOMATA(); 
        System.out.println(AP.toString());
        AP.transformAutomata();
        System.out.println(AP.gramatica.toString());
        
        
    }	
}
