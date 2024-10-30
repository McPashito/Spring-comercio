package McPAshito.comercio.model;

public class producto {
private Integer id;
private String nombre;
private String tipo;
private String imagen;
private double precio;
private Integer stock;

public producto(){

}

public producto(Integer id, String nombre, String tipo, String imagen, double precio, Integer stock) {
  this.id = id;
  this.nombre = nombre;
  this.tipo = tipo;
  this.imagen = imagen;
  this.precio = precio;
  this.stock = stock;
}

public Integer getId() {
  return id;
}

public void setId(Integer id) {
  this.id = id;
}

public String getImagen() {
  return imagen;
}

public void setImagen(String imagen) {
  this.imagen = imagen;
}

public double getPrecio() {
  return precio;
}

public void setPrecio(double precio) {
  this.precio = precio;
}

public producto(Integer stock, String nombre, String tipo) {
  this.stock = stock;
  this.nombre = nombre;
  this.tipo = tipo;
}
public Integer getStock() {
  return stock;
}
public void setStock(Integer stock) {
  this.stock = stock;
}
public String getNombre() {
  return nombre;
}
public void setNombre(String nombre) {
  this.nombre = nombre;
}
public String getTipo() {
  return tipo;
}
public void setTipo(String tipo) {
  this.tipo = tipo;
}

@Override
public String toString() {
  return "producto [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", imagen=" + imagen + ", precio=" + precio
      + ", stock=" + stock + "]";
}







}
