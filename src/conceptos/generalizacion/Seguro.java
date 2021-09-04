/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptos.generalizacion;
import java.awt.Graphics;
public class Seguro extends Pos{

  @Override
  public void dibujar(Graphics g){
    g.drawPolygon(x,y,4);
    g.drawString("Seguro", 0,0);
  }
}
