import java.util.Hashtable;
import java.util.Iterator;
public class MenúEspecial{
  Hashtable hamburguesasMenu;

  public MenúEspecial(){
    hamburguesasMenu = new Hashtable();
  }

  public void agregarHamburguesa(int idHamburguesa,String nombre, String descripción, float precio, Boolean tieneQueso, Boolean esVegetariano){
    Hamburguesa hamburguesaNueva;
    if(esVegetariano){
      hamburguesaNueva =  new HamburguesaVegetariana(idHamburguesa,nombre,descripción,precio,tieneQueso);

    }else{
        hamburguesaNueva =  new HamburguesaCarne(idHamburguesa,nombre,descripción,precio,tieneQueso);
    }

    hamburguesasMenu.put(hamburguesaNueva.getId(), hamburguesaNueva);

  }


  public Iterator createIterator(){
    Iterator iteradorEspecial = hamburguesasMenu.values().iterator();
    return iteradorEspecial;
  }

  public Hamburguesa getElemento(int index){
    Hamburguesa hamburguesaBuscada = null;

    Iterator iterador = createIterator();
    int i = 1;
    while(iterador.hasNext()){
      Hamburguesa hamburguesa = (Hamburguesa)iterador.next();
      if(index == i){
        hamburguesaBuscada = hamburguesa;
      }
      i++;
    }
    return hamburguesaBuscada;
  }
}
