import java.util.Scanner;
public class Main{
  Scanner s = new Scanner(System.in);
  MenúGeneral menuGeneral = new MenúGeneral();
  MenúEspecial menuEspecial = new MenúEspecial();
  MenúDinámico menúDinámico = new MenúDinámico();
  Robot robotcito = new Robot(menuGeneral,menúDinámico,menuEspecial);

    int hamburguesasGenerales = 1 ;

  public void darBienvenida(){
    System.out.println("\n                   ---¡Bienvenido a McBurguesas!---                     \n");


    menuGeneral.agregarHamburguesa(1,"1. Hamburguesa quesosa","La original de McBurguesas, carne 100%. Mientras más queso mejor.",(float)58.9,true,false);
    menuGeneral.agregarHamburguesa(2,"2. Hamburguesa picosa","La más picosas de McBurguesas con el mejor queso .",(float)58.9,true,false);
    menuGeneral.agregarHamburguesa(3,"3. Hamburguesa tenebrosa","Con carne especialmente preparada, no te das cuenta de que es no carne",(float)60.9,false,true);
    menuGeneral.agregarHamburguesa(4,"4. Hamburguesa sabrosa ","La vegetariana de McBurguesas con queso.",(float)58.9,true,true);
    menuGeneral.agregarHamburguesa(5,"5. Hamburguesa curiosa","Con nuestra salsa secreta esta hamburguesa tiene el mejor queso.",(float)58.9,true,false);
    menúDinámico.agregarHamburguesa(1,"6. Hamburguesa de carne picosa", "Por tiempo limitado, pídela ahora ", (float)60.0,false,false);
    menúDinámico.agregarHamburguesa(2,"7. Hamburguesa vegetariana orgánica", "Por poco timepo podrás disfrutar una hamburguesa orgánica, completamente natural, hecha de verduras", (float)70.00, false,true);
    menúDinámico.agregarHamburguesa(3,"8. Hamburgesa jugosa con queso.", "Preparamos esta hamburguesa para que se derrita en tu boca", (float)58.9, true,false);
    menuEspecial.agregarHamburguesa(1,"9. Hamburguesa de arrachera", "Hamburguesa con queso y carne de la mejor calidad.", (float)100, true,false);
    menuEspecial.agregarHamburguesa(2,"10. Tripleburguer", "Hamburguesa con queso hecha de tres de nuestras mejores carnes de la mejor calidad." ,(float)120.00, true,false);
    menuEspecial.agregarHamburguesa(3,"11. Hamburguesa de quinoa", "Hamburguesa sumamente deliciosa apta para todos los vegetarianos",(float) 200,true,true);

    menuRobot();
  }



  public void menuRobot(){
    State suspendido = new Suspendido(robotcito);
    Hamburguesa hamburger =  null;
    robotcito.setState(suspendido);
    robotcito.darBienvenida();
    int opción;

    do{
    System.out.println("0. Dame la bienvenida");
    System.out.println("1. Quiero ordenar algo. Léeme el menú");
    System.out.println("2. Camina hacia la cocina");
    System.out.println("3. Cocina");
    System.out.println("4. Tráeme mi comida");
    System.out.println("5. Suspéndete");
    System.out.println("6. Salir del programa");



    System.out.println("¿Qué opción quieres hacer?");
    opción = s.nextInt();

    switch(opción){
      case 0:
        robotcito.darBienvenida();
        break;
      case 1:
        robotcito.leerMenu();

        int comida = s.nextInt();
        switch(comida){
          case 1:
            hamburger = menuGeneral.getElemento(1);
            System.out.println("Ordenaste: "+ hamburger.getNombrePlatillo());
            break;

          case 2:
            hamburger = menuGeneral.getElemento(2);
            System.out.println("Ordenaste: " +hamburger.getNombrePlatillo());
          break;

          case 3:
            hamburger = menuGeneral.getElemento(3);
            System.out.println("Ordenaste: " +hamburger.getNombrePlatillo());
          break;

          case 4:
           hamburger = menuGeneral.getElemento(4);
           System.out.println("Ordenaste: " +hamburger.getNombrePlatillo());
          break;

          case 5:
           hamburger = menuGeneral.getElemento(5);
           System.out.println("Ordenaste: " +hamburger.getNombrePlatillo());
          break;

          case 6:
           hamburger = menúDinámico.getElemento(1);
           System.out.println("Ordenaste: " +hamburger.getNombrePlatillo());
          break;

          case 7:
           hamburger = menúDinámico.getElemento(2);
           System.out.println("Ordenaste: "+hamburger.getNombrePlatillo());
          break;

          case 8:
           hamburger = menúDinámico.getElemento(3);
           System.out.println("Ordenaste: "+hamburger.getNombrePlatillo());
          break;

          case 9:
           hamburger = menuEspecial.getElemento(3);
           System.out.println("Ordenaste: "+hamburger.getNombrePlatillo());
          break;

          case 10:
           hamburger = menuEspecial.getElemento(2);
           System.out.println("Ordenaste: "+hamburger.getNombrePlatillo());
           break;
          case 11:
           hamburger = menuEspecial.getElemento(1);
           System.out.println("Ordenaste: "+hamburger.getNombrePlatillo());
           break;
        }
        break;
      case 2:
      robotcito.caminarHaciaCocina();
      break;

      case 3:
      robotcito.cocinar(hamburger);

      break;

      case 4:
      robotcito.entregarComida();
      break;

      case 5:
      robotcito.suspender();
      break;

      case 6:
      System.exit(0);

    }
    }while(opción!=6);
  }




  public static void main(String[] args) {
    Main main = new Main();
    main.darBienvenida();
  }
}
