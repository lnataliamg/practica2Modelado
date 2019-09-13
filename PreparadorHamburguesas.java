public abstract class PreparadorHamburguesas{
  Hamburguesa hamburguesa;
  public void prepararHamburguesa(String elementoDiferente){

    System.out.println("Poner pan");
    System.out.println("Poner mayonesa");
    prepararCarne(hamburguesa.esVegetariano());
    agregarQueso(hamburguesa.tieneQueso());
    System.out.println("Poner vegetales");
    System.out.println("Poner catsup");
    System.out.println("Poner pan");

  }
  public abstract void prepararCarne(Boolean vegetariano);
  public abstract void agregarQueso(Boolean queso);
}
