package Shapes;

import Screen.Screen;

public class SquareShape extends BasicShape {

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point p1 = new Point(centerGrav.getX() - ref, centerGrav.getY() - ref);
		Point p2 = new Point(centerGrav.getX() + ref, centerGrav.getY() - ref);
		Point p3 = new Point(centerGrav.getX() + ref, centerGrav.getY() + ref);
		Point p4 = new Point(centerGrav.getX() - ref, centerGrav.getY() + ref);
		screen.drawLineOnScreen(p1 , p2, Constants.Symbols.SQUARE_SYMBOL);
		screen.drawLineOnScreen(p2 , p3, Constants.Symbols.SQUARE_SYMBOL);
		screen.drawLineOnScreen(p3 , p4, Constants.Symbols.SQUARE_SYMBOL);
		screen.drawLineOnScreen(p4 , p1, Constants.Symbols.SQUARE_SYMBOL);
		
	}
	
}
