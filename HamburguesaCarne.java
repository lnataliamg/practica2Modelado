public class HamburguesaCarne extends Hamburguesa{

  public HamburguesaCarne(){
    super();
  }

  public HamburguesaCarne(int idHamburguesa,String nombrePlatillo, String descripción, float precio, Boolean tieneQueso){
    super(idHamburguesa, nombrePlatillo,descripción,precio,tieneQueso,false);
  }

  @Override
  public void prepararCarne(){
      System.out.println("Preparando carne en la parrilla");
      System.out.println("Poner carne");
  }

  @Override
  public void agregarQueso(){
    if(tieneQueso()){
      System.out.println("Agregando queso");
    }else{
      System.out.println("Esta hamburguesa no lleva queso");
    }
  }
}
