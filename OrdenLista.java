public class OrdenLista implements State{
  Robot robot;
  public OrdenLista(Robot robot){
    this.robot = robot;
  }
  @Override
  public void darBienvenida(){
    System.out.println("Ya te había dado la bienvenida, pero bienvenido de nuevo. Espero que te guste tu comida");
  }
  @Override
  public void leerMenu(){
    System.out.println("Lo siento, ya tomé la orden.");
  }
  @Override
  public void cocinar(Hamburguesa hamburguesa){
    System.out.println("Ya acabé de cocinar, en seguida te llevo tu comida");
  }
  @Override
  public void caminarHaciaCocina(){
    System.out.println("Ya no puedo ir a la cocina");
  }

  @Override
  public void suspender(){
    System.out.println("No me puedo suspender ahora mismo, primero debo darte tu comida.");

  }
  @Override
  public void entregarComida(){
    System.out.println("Aquí está tu comida, espero que la disfrutes. Me voy a suspender");
    robot.setState(robot.getSuspendido());
  }
}
