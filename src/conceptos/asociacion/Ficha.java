/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.asociacion;
public class Ficha{
  private String color;
  private Posicion ubicacion;
  public Ficha(String color){
    this.color = color;
  }
  public String getColor(){
    return color;
  }
  public Posicion getUbicacion(){
    return ubicacion;
  }
  public void setUbicacion(Posicion nueva){
    this.ubicacion = nueva;
  }
}
