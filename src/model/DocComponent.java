package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
Abstract format for the component pattern used to represent elements of a
document. Rows/columns/pages will be inner components, characters will be leaves
@author Isayah Vidito
@since 2017-04-12
*/

public abstract class DocComponent{

  /**
  draw() - draw the component
  @param Graphics g - the Graphic element to display;
  @param int x,y - location to draw
  */
  public abstract void draw(Graphics g, int x, int y);

  /**
  select() - select the component
  @param Graphics g - the Graphic element to display;
  @param Color hl - the highlighter color (blue will likely be default)
  @param Color f - Font Color
  @param int x,y - location to draw
  */
  public abstract void select(Graphics g, Color hl, Color f, int x, int y);

  /**
  @return size of font for this object
  */
  public abstract int getSize();

  /**
  @return font for this object
  */
  public abstract Font getFont();

  /**
  @param Font font - get character font
  */
  public abstract void setFont(Font font);

  /**
  @param Visitor v - cause I know I'll have to use this at some point
  */
  public abstract void accept(Visitor v); //TODO might have to import this package

  //TODO gonna need to represent this in a file somehow :/

}
