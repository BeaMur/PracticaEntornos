
package Ajedrez1;

import java.applet.Applet;
import java.awt.*;


public class Ficha{
    Color casillaColor;
    Image im;
    String tipo;
    int tipoColor;
    
    
    Ficha(){
    
    }
    Ficha(int tipoColor,Color c, String tipo, Applet a){
        this.casillaColor=c;
        this.tipoColor=tipoColor;
        if(tipo=="Peon"){
          if(tipoColor==0){ 
            im=a.getImage(a.getCodeBase(),"imagenes/RedPawn.gif" );
            this.tipo=tipo;
          }else{
              im=a.getImage(a.getCodeBase(),"imagenes/bluePawn.gif" );
              this.tipo=tipo;
          }
        }else{
             if(tipo=="Alfil"){
                if(tipoColor==0){ 
                    im=a.getImage(a.getCodeBase(),"imagenes/RedBishop.gif" );
                    this.tipo=tipo;
                 }else{
                    im=a.getImage(a.getCodeBase(),"imagenes/blueBishop.gif" );
                    this.tipo=tipo;
                 }
            }else{
                 if(tipo=="Caballo"){
                    if(tipoColor==0){ 
                        im=a.getImage(a.getCodeBase(),"imagenes/RedKnight.gif" );
                        this.tipo=tipo;
                     }else{
                        im=a.getImage(a.getCodeBase(),"imagenes/blueKnight.gif" );
                        this.tipo=tipo;
                     }
                 }else{
                     if(tipo=="Torre"){
                        if(tipoColor==0){ 
                            im=a.getImage(a.getCodeBase(),"imagenes/RedRock.gif" );
                            this.tipo=tipo;
                        }else{
                            im=a.getImage(a.getCodeBase(),"imagenes/blueRock.gif" );
                            this.tipo=tipo;
                        }
                     }else{
                         if(tipo=="Rey"){
                            if(tipoColor==0){ 
                                im=a.getImage(a.getCodeBase(),"imagenes/RedKing.gif" );
                                this.tipo=tipo;
                            }else{
                                im=a.getImage(a.getCodeBase(),"imagenes/blueKing.gif" );
                                this.tipo=tipo;
                            }
                         }else{
                             if(tipo=="Reina"){
                                if(tipoColor==0){ 
                                    im=a.getImage(a.getCodeBase(),"imagenes/RedQueen.gif" );
                                    this.tipo=tipo;
                                }else{
                                    im=a.getImage(a.getCodeBase(),"imagenes/blueQueen.gif" );
                                    this.tipo=tipo;
                                }
                             }
                         }
                    }
                }
             }
        }
    }
}
