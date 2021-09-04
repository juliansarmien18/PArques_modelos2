/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.asociacion;
public class Posicion{

  private int seccion;
  private int ubicacion;
  private boolean protegido;

  public Posicion(int seccion, int ubicacion, boolean protegido){
    this.seccion = seccion;
    this.ubicacion = ubicacion;
    this.protegido = protegido;
  }

  public int getSeccion(){
    return seccion;
  }
  public int getUbicacion(){
    return ubicacion;
  }
  public boolean isProtegido(){
    return protegido;
  }

  @Override
    public String toString(){
    String objeto = "(seccion: "+seccion+",ubicacion: "+ubicacion+")"+(protegido?"seguro":"");
    return objeto;
  }
}
