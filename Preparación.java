public class Preparación implements State{
  Robot robot;
  public Preparación(Robot robot){
    this.robot = robot;
  }
  @Override
  public void darBienvenida(){
    System.out.println("Ya te había dado la bienvenida, pero bienvenido de nuevo, en un momento está tu comida");

  }
  @Override
  public void leerMenu(){
    System.out.println("Lo siento, ya tomé la orden.");
  }
  @Override
  public void cocinar(){
    System.out.println("Estoy cocinando");
  
    robot.setState(robot.getOrdenLista());
  }
  @Override
  public void caminarHaciaCocina(){
    System.out.println("Ya estoy en la cocina");
  }
  @Override
  public void suspender(){
    System.out.println("Lo siento, sólo puedo suspenderme después de cocinar");

  }
  @Override
  public void entregarComida(){
    System.out.println("Lo siento, la comida no está lista");
  }
}
