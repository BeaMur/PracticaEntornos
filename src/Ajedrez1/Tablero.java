package Ajedrez1;

import java.awt.*;

public class Tablero {

	private final int N = 8;
	Casilla casillas[][];
	AppletAjedrez applet;
	private int margen;
	int tamaño;

	Tablero(AppletAjedrez applet) {
		this.applet = applet;
		casillas = new Casilla[N][N];
		margen=applet.margen;
		tamaño = (menor(applet.getWidth(), applet.getHeight()) - margen * 2) / N;
		crear_casillas();
                
	}

	void crear_casillas() {
            int color=0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				casillas[i][j] = new Casilla(i, j);
                                color=compruebaColor(i);
                                casillas[i][j].f=crearFicha(color,casillas[i][j],i,j);
			}
		}
	}

	int menor(int x, int y) {
		if (x < y) {
			return x;
		} else {
			return y;
		}
	}

	void pintar_tablero(Graphics g) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				g.setColor(casillas[i][j].c);
				g.fillRect(margen+i*tamaño, margen+j*tamaño,tamaño,tamaño);
			}
		}
	}
        
        public Ficha crearFicha(int color,Casilla c,int x,int y){
            Ficha f=new Ficha();
            if(x==0 || x==7){
               if(y==0 || y==7){
                   f =new Ficha(color,c.c,"Torre",applet);
               }else{
                   if(y==1 || y==6){
                       f =new Ficha(color,c.c,"Caballo",applet);
                   }else{
                       if(y==2 || y==5){
                           f =new Ficha(color,c.c,"Alfil",applet);
                       }else{
                           if(y==3){
                               f =new Ficha(color,c.c,"Rey",applet);
                           }else{
                               f =new Ficha(color,c.c,"Reina",applet);
                           }
                       }
                   }
               }
            }else{
                if(x==1 || x==6){
                    f =new Ficha(color,c.c,"Peon",applet);
                }
            }
            return f;
        }
        
        void pintarFichas(Graphics g){
            int x=applet.margen+(applet.getWidth()/8/4),y=applet.margen+(applet.getHeight()/8/4);
            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    g.drawImage(casillas[i][j].f.im, x, y, applet);
                    x+=((applet.getWidth()-margen*2)/8);
                }
                x=applet.margen+(applet.getWidth()/8/4);
                y+=(applet.getHeight()-margen*2)/8;
            }
        }
        
        int compruebaColor(int x){
            int aux=0;
              if(x==7 || x==6)
                  aux=1;
            return aux;
        }
}
