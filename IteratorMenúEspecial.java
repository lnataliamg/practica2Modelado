import java.util.*;
public class IteratorMenúEspecial implements Iterator{
  ArrayList hamburguesas;
  int posición;
  public IteratorMenúEspecial( ArrayList hamburguesas){
    this.hamburguesas = hamburguesas;
  }

  public Object next(){
    Object object = hamburguesas.get(posición);
    posición++;
    return object;
  }

  public boolean hasNext(){
    if(posición>= hamburguesas.size()){
      return false;
    }else{
      return true;
    }
  }


}
