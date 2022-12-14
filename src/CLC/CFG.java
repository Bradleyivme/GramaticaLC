package CLC;

import java.util.ArrayList;

public class CFG {

    public CFG(int numeroT, int longitudA, int numeroE)
    {
        this.numeroTransiciones = numeroT;
        this.transiciones = new TCFG[numeroTransiciones];
        for (int i = 0; i < numeroTransiciones; i++)
        {
            this.transiciones[i] = new TCFG();
        }
        
        this.longitudAlfabeto = longitudA;
        this.alfabeto = new char [longitudA];
        this.transicionesS = new String[numeroE];
    }
    
    
    // Conj de estados no terminales
    public int numeroEstadosNoTerminales = 0;
    public ArrayList<String> estadosGramatica = new ArrayList<>(); 
    
    // Alfabeto de la gramatica de contexto libre
    public int longitudAlfabeto;
    public char[] alfabeto;
    
    // Transiciones de GLC
    public int numeroTransiciones;
    public TCFG[] transiciones;
    
    // Transiciones del estado no terminal S
    public int numeroTransicionesS;
    public String[] transicionesS;

    @Override
    public String toString() {
        String conjEstadosGramatica = "(";
        for (int i = 0; i < estadosGramatica.size(); i++)
        {
            conjEstadosGramatica = conjEstadosGramatica + estadosGramatica.get(i) + " ";
        }
        conjEstadosGramatica = conjEstadosGramatica + ")";
        
        String conjAlfabeto;
        conjAlfabeto= "{ ";
        for (int i = 0; i < longitudAlfabeto; i++)
        {
            conjAlfabeto = conjAlfabeto + alfabeto[i] + " ";
        }
        conjAlfabeto = conjAlfabeto + "}";
        
        String conjTransicionesS ="TS: S->" + transicionesS[0];
        for (int i = 1; i < this.numeroTransicionesS; i++)
        {
            conjTransicionesS = conjTransicionesS + "|" + transicionesS[i];
        }
        conjTransicionesS = conjTransicionesS + '\n';
               
        
        String conjTransiciones = "";
        for (int i = 0; i < this.numeroTransiciones; i++)
        {
            if(this.transiciones[i].estado.length() != 0)
                conjTransiciones = conjTransiciones + "T" + i + ": " + this.transiciones[i].toString();
        }
        
        return "cfg{" + "estadosNoTerminales=" + conjEstadosGramatica + ", longitudAlfabeto=" + longitudAlfabeto + ", alfabeto=" + conjAlfabeto +
                ", transiciones: \n" + conjTransicionesS + conjTransiciones + '}';
    }	
	
}
