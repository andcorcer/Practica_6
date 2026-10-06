// Importes
package mx.unam.fi.die.poo.g7.src.Práctica_5.Ejercicio_3;

public class Fecha {

  // Atributos
  private int mes;
  private int dia;
  private int año;

  // Constructor
  public Fecha(int dia, int mes, int año) {
    this.dia = dia;
    this.mes = mes;
    this.año = año;
  }

  // Getters
  public int getDia() {
    return dia;
  }

  public int getMes() {
    return mes;
  }

  public int getAño() {
    return año;
  }

  // Setters
  public void setDia(int dia) {
    this.dia = dia;
  }

  public void setMes(int mes) {
    this.mes = mes;
  }

  public void setAño(int año) {
    this.año = año;
  }

  // Métodos
  public void mostrarFecha() {
    System.out.println(mes + "/" + dia + "/" + año);
  }
}
