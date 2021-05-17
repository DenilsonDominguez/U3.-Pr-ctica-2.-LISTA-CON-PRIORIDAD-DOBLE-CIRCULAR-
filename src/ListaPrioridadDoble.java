//Denilson de Jesus Dominguez Herrera
public class ListaPrioridadDoble {
    
    private NodoDobleP ini;
    private NodoDobleP fin;
    
    public ListaPrioridadDoble(){
        ini=null;
        fin=null;
    }
    
    public boolean insertar(char dato, int prio){
        NodoDobleP nuevo = new NodoDobleP(dato,prio);
        if (nuevo == null) return false;
        if(hayListaDobleVacia()) {
            ini = fin = nuevo;
            return true;
         
        }
        // Aqui abajo comparamos si el nodo "NUEVO" tiene una prioridad mayor a la de INI, para acomodarlo al principio
         if(nuevo.getPrio()>ini.getPrio()){
            ini.setAnt(nuevo);
            nuevo.setSig(ini);
            ini=nuevo;
            return true;
        }
         // Aqui abajo comparamos si el nodo "NUEVO" tiene una prioridad menor a la de INI, para acomodarlo al final
        if(nuevo.getPrio()<=fin.getPrio()){
            fin.setAnt(nuevo);
            nuevo.setAnt(fin);
            fin=nuevo;
            return true;
        }
        NodoDobleP t=null;
        for(t=fin.getAnt();nuevo.getPrio()>t.getPrio(); t=t.getAnt()){}
        t.getSig().setAnt(nuevo);       
        nuevo.setSig(t.getSig());
        t.setSig(nuevo);
        nuevo.setAnt(t);
        return true;
    }
    
    
    public boolean hayListaDobleVacia(){
    return ini== null && fin == null;
    }
    
   public boolean eliminar(char dato, int prio){
       if(hayListaDobleVacia()) return false;
       if(hayUnSoloNodo()){
           ini = fin = null;
           return true;
       }
        //Comparamos si el valor a eliminar esta al principio
        if(ini.getDato()==dato && ini.getPrio()==prio){
            NodoDobleP temp = ini.getSig();
            temp.setAnt(null);
            ini.setSig(null);
            ini=temp;
            return true;
        }
        //Comparamos si el valor a eliminar esta al final
        if(fin.getDato()==dato && fin.getPrio()==prio){
            NodoDobleP temp=fin.getAnt();
            temp.setSig(null);
            fin.setAnt(null);
            fin=temp;
            return true;
        }
        //Comparamos si el valor a eliminar esta en medio de la lista
        for(NodoDobleP temp=ini.getSig(); temp!=fin; temp=temp.getSig()){
            if(temp.getDato()==dato && temp.getPrio()==prio){
                temp.getAnt().setSig(temp.getSig());
                temp.getSig().setAnt(temp.getAnt());               
                temp.setAnt(null);
                temp.setSig(null);
                return true;
            }
        }
        return false;
       
       
   }
   public boolean hayUnSoloNodo(){
       return ini == fin && ini != null;
   }
   
   public NodoDobleP getIni(){
       return ini;
   }
  
}
