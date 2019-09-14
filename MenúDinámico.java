import java.util.*;
import java.util.Iterator;
public class MenúDinámico{
  ArrayList hamburguesasMenu;

  public MenúDinámico(){
    hamburguesasMenu = new ArrayList<Hamburguesa>();
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
    public void agregarHamburguesa(int idHamburguesa,String nombre, String descripción, float precio, Boolean tieneQueso, Boolean esVegetariano){
      Hamburguesa hamburguesaNueva;
      if(esVegetariano){
        hamburguesaNueva =  new HamburguesaVegetariana(idHamburguesa,nombre,descripción,precio,tieneQueso);
      }else{
          hamburguesaNueva =  new HamburguesaCarne(idHamburguesa,nombre,descripción,precio,tieneQueso);
      }
      hamburguesasMenu.add(hamburguesaNueva);
    }


    public Iterator createIterator(){
      return new IteratorMenúDinámico(hamburguesasMenu);
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
