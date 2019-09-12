import java.util.*;
public class MenúEspecial{
  Hashtable hamburguesasMenu;

  public MenúEspecial(){
    hamburguesasMenu = new Hashtable();
  }

  public void agregarHamburguesa(int id, String nombre, String descripción, float precio, Boolean tieneQueso, Boolean esVegetariano){
    Hamburguesa hamburguesaNueva = new Hamburguesa(id,nombre,descripción,precio,tieneQueso,esVegetariano);
    hamburguesasMenu.put(hamburguesaNueva.getId(), hamburguesaNueva);
  }

  public Iterator createIterator(){
    return hamburguesasMenu.values().iterator();
  }

}
