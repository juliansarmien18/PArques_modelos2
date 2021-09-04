/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.asociacion;
import java.util.LinkedList;
import java.util.Iterator;
import conceptos.dependencia.*;
import conceptos.generalizacion.*;
public class Parques{
  private LinkedList<Posicion> tablero = new LinkedList<Posicion>();

  public static Dado dados[] = new Dado[2];
  
  public Parques(){
    for(int i=0; i<4; i++){
      for(int j=0; j<17; j++){
        boolean p = (j==4||j==11||j==16);
        tablero.add(new Posicion(i,j,p));
      }
    }
    dados[0] = new Dado();
    dados[1] = new Dado();
  }
  public void mostrarTablero(){
      Iterator<Posicion> i = tablero.iterator();
      Pos posi = new Pos();
      Seguro seg = new Seguro();
      while(i.hasNext()){
      Posicion actual = i.next();
      if(actual.isProtegido()){
          System.out.println(actual);
      }else{
          
      }
    }
  }
}
