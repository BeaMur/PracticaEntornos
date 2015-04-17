package Ajedrez1;

import java.applet.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AppletAjedrez extends Applet implements MouseListener {

	Tablero t;
	int margen=40;

	
	private Image imagenDB;
	private Graphics gDB;
	
	@Override
	public void init() {
		setBackground(Color.GREEN);
		t=new Tablero(this);
                
	}

	@Override
	public void start() {
		
	}

	@Override
	public void stop() {
		
	}

	@Override
	public void destroy() {
		
	}

	
	@Override
	public void paint(Graphics g) {
		t.pintar_tablero(g);
                t.pintarFichas(g);
	}

	@Override
	public void update(Graphics g) {
		if (imagenDB == null) {
			imagenDB = createImage(getWidth(), getHeight());
			gDB = imagenDB.getGraphics();
		}
		gDB.setColor(getBackground());
		gDB.fillRect(0, 0, getWidth(), getHeight());
		gDB.setColor(getForeground());
		paint(gDB);
		g.drawImage(imagenDB, 0, 0, this);
	}
        public void mouseClicked(MouseEvent e){
            
            
        }
        public void mousePressed(MouseEvent e){}
        public void mouseReleased(MouseEvent e){}
        public void mouseEntered(MouseEvent e){}
        public void mouseExited(MouseEvent e){}
}
