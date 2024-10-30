package McPAshito.comercio.model;

public class Usuario {
  private Integer id;
  private String nombre;
  private String username;
  private String password;
  private String email;

  public Usuario() {}
  
  public Usuario(Integer id, String nombre, String username, String password, String email) {
    this.id = id;
    this.nombre = nombre;
    this.username = username;
    this.password = password;
    this.email = email;
  }
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  

}
