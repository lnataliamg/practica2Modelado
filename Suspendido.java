public class Suspendido implements State{
  Robot robot;

  public Suspendido(Robot robot){
    this.robot = robot;
  }

  @Override
  public void darBienvenida(){
    System.out.println("Me activé y te doy la bienvendida");
    robot.setState(robot.getActivo());
  }
  @Override
  public void leerMenu(){
    System.out.println("No puedo, estoy suspendido");
  }

  @Override
  public void cocinar(Hamburguesa hamburguesa){
    System.out.println("No puedo, estoy suspendido");
  }
  @Override
  public void caminarHaciaCocina(){
    System.out.println("No puedo, estoy suspendido");
  }

  @Override
  public void suspender(){
    System.out.println("No puedo, estoy suspendido");

  }
  @Override
  public void entregarComida(){
    System.out.println("No puedo, estoy suspendido");
  }


}
