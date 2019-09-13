import java.util.Scanner;
public class Main{
  Scanner s = new Scanner(System.in);
  MenúGeneral menuGeneral = new MenúGeneral();
  MenúEspecial menuEspecial = new MenúEspecial();
  MenúDinámico menúDinámico = new MenúDinámico();
  Robot robotcito = new Robot(menuGeneral,menúDinámico,menuEspecial);

    int hamburguesasGenerales = 1 ;

  public void darBienvenida(){
    System.out.println("                   ¡Bienvenido a McBurguesas!                     \n");


    menuGeneral.agregarHamburguesa("1. Hamburguesa quesosa","La original de McBurguesas, pídela en su versión vegetariana. Mientras más queso mejor.",(float)58.9,true,false);
    menuGeneral.agregarHamburguesa("2. Hamburguesa picosa","La más picosas de McBurguesas, pídela en su versión vegetariana y con queso.",(float)58.9,false,false);
    menuGeneral.agregarHamburguesa("3. Hamburguesa tenebrosa","Con tres trozos de carne, la tenebrosa es la más grande de las hamburgesas de McBurguesas, pídela en su versión vegetariana y con queso .",(float)60.9,false,false);
    menuGeneral.agregarHamburguesa("4. Hamburguesa sabrosa ","La vegetariana de McBurguesas.",(float)58.9,false,true);
    menuGeneral.agregarHamburguesa("5. Hamburguesa curiosa","Con nuestra salsa secreta, pídela en su versión vegetariana y con queso.",(float)58.9,false,false);

    menúDinámico.agregarHamburguesa("6. Hamburguesa de carme picosas", "Por tiempo limitado, pídela ahora. Disfrutarás más su sabor con queso", (float)60.0,false,false);
    menúDinámico.agregarHamburguesa("7. Hamburguesa de quinoa", "Por poco timepo podrás disfrutar una hamburguesa orgánica, completamente natural", (float)70.00, false,true);

    menuEspecial.agregarHamburguesa("8. Hamburguesa de arrachera", "Hamburguesa con queso y carne de la mejor calidad.", (float)100, true,false);
    menuEspecial.agregarHamburguesa("9. Tripleburguer", "Hamburguesa con queso hecha de tres de nuestras mejores carnes de la mejor calidad." ,(float)120.00, true,false);
    menuEspecial.agregarHamburguesa("10. Hamburguesa de trufas", "Hamburguesa sumamente deliciosa apta para todos los vegetarianos, tiene trufas frescas y verdaaderas",(float) 200,false,true);

    menuRobot();
  }

  public Boolean preguntarVegetariano(){
    System.out.println("La quieres vegetariana?");
    System.out.println("1. Sí");
    System.out.println("2. No");

    int respuestaVegetariana = s.nextInt();
    if(respuestaVegetariana == 1){
      return true;
    }else{
      return false;
    }
  }

  public Boolean pregntarQueso(){
    System.out.println("La quieres con queso?");
    System.out.println("1. Sí");
    System.out.println("2. No");

    int respuestaQueso = s.nextInt();
    if(respuestaQueso == 1){
      return true;
    }else{
       return false;
    }
  }

  public void menuRobot(){
    State suspendido = new Suspendido(robotcito);
    robotcito.setState(suspendido);
    robotcito.darBienvenida();
    int opción;

    do{
    System.out.println("1. Quiero ordenar algo. Leeme el menú");
    System.out.println("2. Camina");
    System.out.println("3. Cocina");
    System.out.println("4. Tráeme mi comida");
    System.out.println("5. Suspéndete");
    System.out.println("6. Salir del programa");



    System.out.println("¿Qué opción queres hacer?");
    opción = s.nextInt();

    switch(opción){
      case 1:
        robotcito.leerMenu();
        System.out.println("¿Qué quieres ordenar?");
        int comida = s.nextInt();

        switch(comida){
          case 1:

          case 2:

          case 3:

          case 4:

          case 5:

          case 7:

          case 8:

          case 9:


        }
      case 2:
      robotcito.caminarHaciaCocina();
      break;

      case 3:
      robotcito.cocinar();
      break;
      case 4:
      robotcito.entregarComida();
      break;
      case 5:
      robotcito.suspender();

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
