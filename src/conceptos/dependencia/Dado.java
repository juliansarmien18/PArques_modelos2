/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.dependencia;
import java.util.Random;
public class Dado{
  private Random r = new Random(System.currentTimeMillis());
  public int lanzar(){
    return r.nextInt(6)+1;
  }
}
