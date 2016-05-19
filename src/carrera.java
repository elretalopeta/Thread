import java.awt.Color;
import java.util.ArrayList;

import javax.swing.*;

public class carrera{
	public carrera(){
		
		try{
			//ArrayList de clase camello
			ArrayList<camello> arrayCamellos = new ArrayList<camello>();
			

			int random = (1 + (int)(Math.random() * 5)) * 100; 
			
			//Marco
			JFrame frame = new JFrame();
			
			//Contenido del Marco
			JPanel panel = new JPanel(null);
			
			//Asociamos imagen con variable
			ImageIcon imageIcon = new ImageIcon("/Users/usu27/Documents/workspace/Camellos2/src/camello.gif");
			ImageIcon imageIcon2 = new ImageIcon("/Users/usu27/Documents/workspace/Camellos2/src/camello.gif");
			ImageIcon imageIcon3 = new ImageIcon("/Users/usu27/Documents/workspace/Camellos2/src/camello.gif");
			ImageIcon imageIcon4 = new ImageIcon("/Users/usu27/Documents/workspace/Camellos2/src/camello.gif");
			ImageIcon imageIcon5 = new ImageIcon("/Users/usu27/Documents/workspace/Camellos2/src/camello.gif");
			ImageIcon imageIcon6 = new ImageIcon("/Users/usu27/Documents/workspace/Camellos2/src/agua.png");
			
			//Etiqueta asociada a la imagen
			JLabel camello1 = new JLabel(imageIcon);
			JLabel camello2 = new JLabel(imageIcon2);
			JLabel camello3 = new JLabel(imageIcon3);
			JLabel camello4 = new JLabel(imageIcon4);
			JLabel camello5 = new JLabel(imageIcon5);
		    JLabel powerUp = new JLabel(imageIcon6);
			
		    //Añadimos en contendio del Marco al Marco
			frame.add(panel);
			
			//Añadimos la Etiqueta al contendio del Marco
			panel.add(camello1);
			panel.add(camello2);
			panel.add(camello3);
			panel.add(camello4);
			panel.add(camello5);
			panel.add(powerUp);
			
			//Insertamos color de fondo al contendio del Marco
			panel.setBackground(Color.BLACK);
			
			//Dimensiones del Marco
			frame.setSize(1000, 1000);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Cerramos el Marco cuando seleccionamos la aspa
			frame.setTitle("Carrera Camellos");
			
			//Posicionamos las etiquetas en el marco
			camello1.setLocation(0, 100); //Posicion
			camello1.setVisible(true); //Estado
			camello1.setSize(100,100); //tamaño
			camello2.setLocation(0, 200);
			camello2.setVisible(true);
			camello2.setSize(100,100);
			camello3.setLocation(0, 300);
			camello3.setVisible(true);
			camello3.setSize(100,100);
			camello4.setLocation(0, 400);
			camello4.setVisible(true);
			camello4.setSize(100,100);
			camello5.setLocation(0, 500);
			camello5.setVisible(true);
			camello5.setSize(100,100);
			powerUp.setLocation(280, random);
			powerUp.setVisible(true);
			powerUp.setSize(100,100);
			
			//Creamos un Objeto de tipo Camello y los insertamos en el arraylist
			camello camelloObjeto1 = new camello("Camello 1", camello1, 100, "/Users/usu27/Documents/workspace/Camellos2/src/_You_39_re_Too_Slow_Sound_-_Download_Link_mp3.wav", powerUp);
			arrayCamellos.add(camelloObjeto1);
			camello camelloObjeto2 = new camello("Camello 2", camello2, 200, "/Users/usu27/Documents/workspace/Camellos2/src/Mega_Man_Battle_Network-_Viruses_Deleted_.wav", powerUp);
			arrayCamellos.add(camelloObjeto2);
			camello camelloObjeto3 = new camello("Camello 3", camello3, 300, "/Users/usu27/Documents/workspace/Camellos2/src/Naruto_Uzumaki_I_never_give_up.wav", powerUp);
			arrayCamellos.add(camelloObjeto3);
			camello camelloObjeto4 = new camello("Camello 4", camello4, 400, "/Users/usu27/Documents/workspace/Camellos2/src/boo-mike_wazowski.wav", powerUp);
			arrayCamellos.add(camelloObjeto4);
			camello camelloObjeto5 = new camello("Camello 5", camello5, 500, "/Users/usu27/Documents/workspace/Camellos2/src/Crash_Bandicoot_Sounds_-_Woah_.wav", powerUp);	
			arrayCamellos.add(camelloObjeto5);
			
			//Indicamos que arranque los camellos en hilos en paralelo
			for(int i = 0; i < arrayCamellos.size(); i ++) {				
				arrayCamellos.get(i).comprobacion();			
			}
			//Insertamos musica
			sonido sonidoCarrera = new sonido("/Users/usu27/Documents/workspace/Camellos2/src/Super_Smash_Bros.wav");
			
		}catch(Exception e){System.out.println(e);}
	}
	
	
}
