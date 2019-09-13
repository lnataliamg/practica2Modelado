/*
* Clase que crea un objeto Hamburguesa
* @author Méndez Gallegos Ligia Natalia
*/
public class Hamburguesa{
  int idHamburguesa = 0;
  String nombrePlatillo;
  String descripción;
  float precio;
  Boolean tieneQueso;
  Boolean esVegetariano;



	/**
	* Contstructor por omisión de Hamburguesa
	*/
	public Hamburguesa() {
		super();
	}

  /**
  * Constructor que crea una hamburguesa con los parámetros
  * @param idHamburguesa es el nuevo id de la hamburguesa
  * @param nombrePlatillo es el nuevo nombre de la hamburgesa
  * @param descripción es la nueva descripción de la hamburgesa
  * @param precio es el nuevo precio de la hamburgesa
  *  @param tieneQueso es el neuvo valor Booleano para ver si tiene queso una hamburgesa True tiene False no tiene queso
  *  @param esVegetariano es el neuvo valor Booleano para ver siuna hamburgesa es vegetariana True es False no es vegetariana
  */
  public Hamburguesa(String nombrePlatillo, String descripción, float precio, Boolean tieneQueso, Boolean esVegetariano){
    this.idHamburguesa++;
    this.nombrePlatillo= nombrePlatillo;
    this.descripción=descripción;
    this.precio = precio;
    this.tieneQueso = tieneQueso;
    this.esVegetariano = esVegetariano;
  }

  public int getId(){
    return idHamburguesa;
  }
  public String getNombrePlatillo(){
    return nombrePlatillo;
  }
  public String getDescripción(){
    return descripción;
  }

  public float getPrecio(){
    return precio;
  }

  public Boolean tieneQueso(){
    return tieneQueso;
  }

  public Boolean esVegetariano(){
    return esVegetariano;
  }
}
