/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.dependencia;
import conceptos.asociacion.*;
public class Jugador{
  private Ficha fichas[] = new Ficha[4];
  public void funcionalidad(){
    Parques.dados[0].lanzar();
  }
}
