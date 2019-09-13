public class HamburguesaCarne extends Hamburguesa{

  @Override
  public void prepararCarne(){
      System.out.println("Preparando carne");
      System.out.println("Poner carne");
  }

  @Override
  public void agregarQueso(){
    if(tieneQueso()){
      System.out.println("Agregando queso");
    }else{
      System.out.println("Esta hamburguesa no tiene queso");
    }
  }
}
