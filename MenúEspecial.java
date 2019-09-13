import java.util.*;
import java.util.Iterator;
public class MenúEspecial{
  Hashtable hamburguesasMenu;

  public MenúEspecial(){
    hamburguesasMenu = new Hashtable();
  }

  public void agregarHamburguesa(String nombre, String descripción, float precio, Boolean tieneQueso, Boolean esVegetariano){
    Hamburguesa hamburguesaNueva = new Hamburguesa(nombre,descripción,precio,tieneQueso,esVegetariano);
    hamburguesasMenu.put(hamburguesaNueva.getId(), hamburguesaNueva);
  }

  public Iterator createIterator(){
    return hamburguesasMenu.values().iterator();
  }

}
