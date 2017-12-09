package udea.clientesAPI.modelo;

/**
 * Created by pabliny193@gmail.com on 05/12/2017.
 */
public class Cliente {

  private String idCliente;
  private String nombre;
  private String telefono;

  public Cliente() {
  }

  public Cliente(String id, String nombre, String telefono) {
    this.idCliente = id;
    this.nombre = nombre;
    this.telefono = telefono;
  }

  public String getId() {
    return idCliente;
  }

  public void setId(String id) {
    this.idCliente = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  @Override
  public String toString() {
    return "Cliente{" +
            "id='" + idCliente + '\'' +
            ", nombre='" + nombre + '\'' +
            ", telefono='" + telefono + '\'' +
            '}';
  }
}
