public class OrdenTomada implements State{
  Robot robot;

  public OrdenTomada(Robot robot){
    this.robot = robot;
  }
  @Override
  public void darBienvenida(){
    System.out.println("Ya te había dado la bienvenida, pero bienvenido de nuevo, en seguida te llevo tu orden");
  }
  @Override
  public void leerMenu(){
    System.out.println("Lo siento, ya tomé la orden.");
  }
  @Override
  public void cocinar(Hamburguesa hamburguesa){
    System.out.println("Aún no he llegado a la cocina, no puedo cocinar aquí");
  }
  @Override
  public void caminarHaciaCocina(){
    System.out.println("En cuanto me digas, me voy caminando hacia la cocina");
    robot.setState(robot.getPreparación());
  }
  @Override
  public void suspender(){
    System.out.println("Tu orden se cancela. Me suspenderé");
    robot.setState(robot.getSuspendido());
  }
  @Override
  public void entregarComida(){
    System.out.println("Lo siento, la comida no está lista");
  }
}
