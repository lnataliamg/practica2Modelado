import java.util.*;
public class MenúDinámico{
  ArrayList hamburguesasMenu;

  public MenúDinámico(){
    hamburguesasMenu = new ArrayList();
  }
  /**
  * Clase que agrega una hamgurgesa al menú. si no hay espacio no lo agregar
  * @param idHamburguesa es el nuevo id de la hamburguesa nueva
  * @param nombrePlatillo es el nuevo nombre de la hamburgesa nueva
  * @param descripción es la nueva descripción de la hamburgesa nueva
  * @param precio es el nuevo precio de la hamburgesa nueva
  *  @param tieneQueso es el neuvo valor Booleano para ver si tiene queso una hamburgesa True tiene False no tiene queso
  *  @param esVegetariano es el neuvo valor Booleano para ver siuna hamburgesa es vegetariana True es False no es vegetariana
  */
    public void agregarHamburguesa(int id, String nombre, String descripción, float precio, Boolean tieneQueso, Boolean esVegetariano){

      Hamburguesa hamburguesaNueva = new Hamburguesa(id,nombre,descripción,precio,tieneQueso,esVegetariano);
      hamburguesasMenu.add(hamburguesaNueva);
    }

    /*public Iterator createIterator(){
      return new IteratorMenúDinámico(hamburguesasMenu);

    }*/

    public Iterator createIterator(){
      return hamburguesasMenu.value().iterator();
    }
}
