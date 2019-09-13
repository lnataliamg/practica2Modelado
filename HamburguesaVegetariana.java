public class HamburguesaVegetariana extends Hamburguesa{
  @Override
  public void prepararCarne(){
      System.out.println("Preparando carne vegetariana de quinoa");
      System.out.println("Poner carne vegetariana");
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
