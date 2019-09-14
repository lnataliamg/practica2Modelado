import java.util.*;
import java.util.Iterator;
public class IteratorMenúDinámico implements Iterator{
  ArrayList hamburguesas;
  int posición;
  public IteratorMenúDinámico( ArrayList hamburguesas){
    this.hamburguesas = hamburguesas;
  }
  @Override
  public Object next(){
    Object object = hamburguesas.get(posición);
    posición++;
    return object;
  }
  @Override
  public boolean hasNext(){
    if(posición>= hamburguesas.size()){
      return false;
    }else{
      return true;
    }
  }


}
