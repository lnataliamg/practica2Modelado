public class IteradorMenúGeneral implements Iterator{
  Hamburguesa[] hamburguesas;
  int posición = 0;

  public IteradorMenúGeneral(Hamburguesa [] hamburguesas){
    this.hamburguesas = hamburguesas;
  }
  public Object next(){
    Hamburguesa hamburguesaRecorrida  = hamburguesas[posición];
    posición++;
    return hamburguesaRecorrida;
  }

  public boolean hasNext(){
    if(posición >= hamburguesas.length || hamburguesas[posición] == null){
      return false;
    }else{
      return true;
    }

  }


}
