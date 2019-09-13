import java.util.*;
public class Robot extends PreparadorHamburguesas{
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
    Iterator iteradorGeneral =  menúGeneral.createIterator();
    Iterator iteradorEspecial = (Iterator) menúEspecial.createIterator();
    Iterator iteradorDinámico = (Iterator) menúDinámico.createIterator();
    System.out.println("El menú del día tiene: \n");
    printMenu(iteradorGeneral);

    System.out.println("El menú que siempre está disponible tiene: \n");
    printMenu(iteradorGeneral);


    System.out.println("El menú especial tiene: \n");
    printMenu(iteradorGeneral);


  }

  public void printMenu(Iterator iterator){
    while(iterator.hasNext()){
      Hamburguesa hamburguesas = (Hamburguesa)iterator.next();

      System.out.println(hamburguesas.getNombrePlatillo() + "                   ");
      System.out.println(hamburguesas.getPrecio() + "\n");
      System.out.println(hamburguesas.getDescripción() );
    }

  }
  public void setState(State newState){
    this.estado = newState;
  }

  public void leerMenu(){
    estado.leerMenu();
  }
  public void suspender(){
    estado.suspender();
  }
  public void cocinar(){
    estado.cocinar();
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

  @Override
  public  void prepararCarne(Boolean vegetariano){
    if(vegetariano){
      System.out.println("Preparando carne de Tofu");

    }else{
      System.out.println("Preparando carne término 3/4");
    }
      System.out.println("Poniendo carne");
  }
  @Override
  public  void agregarQueso(Boolean queso){
    if(queso){
      System.out.println("Agregando queso");
    }
  }



}
