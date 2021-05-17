//Denilson de Jesus Dominguez Herrera 19400559
public class NodoDobleP {
    
    private char dato;
    private int  prio;
    private NodoDobleP sig;
    private NodoDobleP ant;
    
    public NodoDobleP(char d, int p ){
        dato = d;
        prio= p;
        sig= null;
        ant= null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }

    public NodoDobleP getSig() {
        return sig;
    }

    public void setSig(NodoDobleP sig) {
        this.sig = sig;
    }

    public NodoDobleP getAnt() {
        return ant;
    }

    public void setAnt(NodoDobleP ant) {
        this.ant = ant;
    }

    
    
}
