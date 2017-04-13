package model;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class Character extends DocComponent{

    private char ch; //character represented
    private FontData fnt; //Flyweight for font data

    public Character(char ch, Font font){
        this.ch = ch;
        this.fnt = FlyweightPool.getFontData(font);
    }

    @Override
	public void draw(Graphics g, int x, int y) {
		this.fnt.setFontMetrics(g.getFontMetrics(this.fnt.getFont()));
        //unfortunately has to be done for every Graphics object, TODO workaround?
		g.setFont(this.fnt.font);
		g.drawString(Character.toString(ch), x, y);
	}


    //Took inspiration from the GoF book where each glyph is drawn to the screen
    //manually. Here we use colored rectangles to indicate selection of
    //characters TODO garbaaaaaage
    @Override
	public void select(Graphics g, Color hl,
			Color f, int x, int y) {
		Color previousColor = g.getColor();
		g.setColor(hl);
		Rectangle2D selectionRectangle = this.fnt.getMetric().getStringBounds(
				Character.toString(ch), g);
        //draw the rectangle
		g.drawRect(x, y - (int)selectionRectangle.getHeight(), (int)selectionRectangle.getWidth(),
				(int) selectionRectangle.getHeight());
        //fill the rectangle (blank color initially)
		g.fillRect(x, y - (int)selectionRectangle.getHeight(), (int)selectionRectangle.getWidth(),
				(int) selectionRectangle.getHeight());
		g.setColor(f); //set the char color to the desired color
		this.draw(g, x, y); //draw the character over the rectangle
		g.setColor(previousColor);
	}


}
