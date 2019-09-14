import java.util.*;
import java.util.Iterator;
public class Robot{
  State activo;
  State ordenTomada;
  State preparación;
  State ordenLista;
  State estado;
  State suspendido;
  MenúGeneral menúGeneral;
  MenúEspecial menúEspecial;
  MenúDinámico menúDinámico;

  public Robot(MenúGeneral menúGeneral, MenúDinámico menúDinámico, MenúEspecial menúEspecial){
    activo = new Activado(this);
    ordenTomada = new OrdenTomada(this);
    preparación = new Preparación(this);
    ordenLista = new OrdenLista(this);
    suspendido = new Suspendido(this);

    this.menúGeneral = menúGeneral;
    this.menúDinámico = menúDinámico;
    this.menúEspecial = menúEspecial;


  }

  public void printMenu(){
    Iterator iteradorGeneral  =  menúGeneral.createIterator();
    Iterator iteradorEspecial =  menúEspecial.createIterator();
    Iterator iteradorDinámico =  menúDinámico.createIterator();
    System.out.println("\n El menú que siempre está disponible tiene: \n");
    printMenu(iteradorGeneral);
    System.out.println("\n El menú del día tiene: \n");
    printMenu(iteradorDinámico);
    System.out.println("\n El menú especial tiene:\n");
    printMenu(iteradorEspecial);


  }

  public void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      Hamburguesa hamburguesas = (Hamburguesa)iterator.next();

      System.out.print(hamburguesas.getNombrePlatillo() + "....................................");
      System.out.println(hamburguesas.getPrecio());
      System.out.println(hamburguesas.getDescripción() );
    }

  }

  public void darBienvenida(){
    estado.darBienvenida();
  }

  public void leerMenu(){
    estado.leerMenu();
  }
  public void suspender(){
    estado.suspender();
  }
  public void cocinar(Hamburguesa hamburguesa){
    estado.cocinar(hamburguesa);
  }
  public void caminarHaciaCocina(){
    estado.caminarHaciaCocina();
  }
  public void entregarComida(){
    estado.entregarComida();
  }

  public State getActivo(){
    return activo;
  }
  public State getOrdenTomada(){
    return ordenTomada;
  }
  public State getPreparación(){
    return preparación;
  }

  public State getOrdenLista(){
    return ordenLista;
  }
  public State getSuspendido(){
    return suspendido;
  }
  public void setState(State state){
    this.estado= state;
  }
}
