import java.util.Scanner;
public class Main{
  Scanner s = new Scanner(System.in);
  MenúGeneral menuGeneral;
  MenúEspecial menuEspecial;
  MenúDinámico menúDinámico;
  Robot robotcito = new Robot(menuGeneral,menúDinámico,menuEspecial);

  public void darBienvenida(){
    int hamburguesasGenerales = 5;
    menuGeneral.agregarHamburguesa("Hamburguesa quesosa","La original de McBurguesas, pídela en su versión vegetariana. Mientras más queso mejor.",(float)58.9,true,false);
    System.out.println("                     ¡Bienvenido a McBurguesas!                     \n");
    this.mostrarMenús();
  }
  public void menuRobot(int opción){
    System.out.println("1. Quiero ordenar algo");
    System.out.println("2. ");
    switch(opción){
      case 1:


    }
  }

  public void mostrarMenús(){
    System.out.println("Los menús de hoy son: \n");
    robotcito.printMenu();
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.darBienvenida();
  }
}
