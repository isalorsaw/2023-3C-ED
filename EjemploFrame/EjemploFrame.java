import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Image;
public class EjemploFrame extends JFrame
{
    ImageIcon fondo;
    Image fondoi;
    ImageIcon a[];
    public EjemploFrame()
    {
        super("Titulo del Proyecto o del Juego");//Titulo del Frame
        //getContentPane().setLayout(null);
        inicializarFondo();
        inicializarCartas();
        setBackground(Color.yellow);
        setSize(1200,800);//Tamano de la pantalla o jframe
        setLocationRelativeTo(null);//Centrar la Pantalla
        
        setVisible(true);//Mostrar el formulario o la pantalla o jframe 
    }
    public void inicializarCartas()
    {
        a=new ImageIcon[15];
        for(int i=0;i<a.length;i++)
        {
            a[i]=new ImageIcon(getClass().getResource("imagenes/carta1.png"));
        }
    }
    public void dibujarCartas(Graphics g)
    {
        int x=50;
        int y=100;
        for(int i=0;i<a.length;i++)
        {
            
            a[i]=new ImageIcon(getClass().getResource("imagenes/carta1.png"));
            Image carta=a[i].getImage();
            g.drawImage(carta,x,y,null);
            x+=50;
        }
    }
    public void inicializarFondo()
    {
        //fondo=new ImageIcon(getClass().getResource("imagenes/fondo.jpg"));
        fondo=new ImageIcon(getClass().getResource("imagenes/fondo2.png"));
        fondoi=fondo.getImage();
    }
    public static void main(String args[])
    {
        new EjemploFrame();
    }
    public void paint(Graphics g)
    {
        super.paint(g);//Linea Importante
        g.setColor(Color.YELLOW);
        
        g.drawImage(fondoi,0,0,null);//Imagen,puntox y, siempre null
        dibujarCartas(g);
        
    }
}