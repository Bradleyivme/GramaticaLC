package CLC;

public class TCFG {

    public TCFG()
    {
        this.transiciones = new String [50];
    }
    // Estado no terminal
    public String estado = new String();
    
    // Transiciones del estado no terminal
    public int numeroTransiciones;
    public String[] transiciones;

    @Override
    public String toString() {
        String conjTransiciones;
        conjTransiciones = this.transiciones[0];
        for (int i = 1; i < numeroTransiciones; i++)
        {
            conjTransiciones = conjTransiciones + " | " + this.transiciones[i];
        }
        
        return estado + "->" + conjTransiciones + '\n';
    }
    
    

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String[] getTransiciones() {
        return transiciones;
    }

    public void setTransiciones(String[] transiciones) {
        this.transiciones = transiciones;
    }
    
}
