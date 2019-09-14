public class HamburguesaVegetariana extends Hamburguesa{

  public HamburguesaVegetariana(){
    super();
  }

  public HamburguesaVegetariana(int idHamburguesa, String nombrePlatillo, String descripción, float precio, Boolean tieneQueso){
    super(idHamburguesa,nombrePlatillo,descripción,precio,tieneQueso,true);
  }

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
