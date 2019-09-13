public class Activado implements State{
  Robot robot;

  public Activado(Robot robot){
    this.robot = robot;
  }
  public void darBienvenida(){
    System.out.println("Ya te había dado la bienvenida, pero bienvenido de nuevo");

  }
  @Override
  public void leerMenu(){
    System.out.println("Aquí está el menú");
    robot.setState(robot.getOrdenTomada());
  }

  @Override
  public void cocinar(){
    System.out.println("No puedo cocinar, aún no has pedido");
  }
  @Override
  public void caminarHaciaCocina(){
    System.out.println("No puedo ir a la cocina, aún no has pedido");
  }

  @Override
  public void suspender(){
    System.out.println("No me puedo suspender ahora mismo");
  }

  @Override
  public void entregarComida(){
    System.out.println("Aún no has ordenado nada");
  }


}
