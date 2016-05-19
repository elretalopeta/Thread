import javax.swing.*;

// Classe con implentacion Thread
//implemetos (interface) = metodos vacios
//extends = metodos no vacio
public class camello implements Runnable{
	
	private Thread hilo;
	private String nombre;
	private JLabel camello;
	private int posicionY;
	private static int podio = 1;
	private int random;
	private String sonido;
	private JLabel label;
	
	public camello(String nombre, JLabel camello, int posicionY, String sonido, JLabel label){		
		this.nombre = nombre;
		this.camello = camello;
		this.posicionY = posicionY;
		this.random = 4 + (int)(Math.random() * 15); 
		this.sonido = sonido;
		this.label = label;		
	}

	//Metodo que ejecuta el hilo
	@Override
	public void run() {		
		for(int i = 0; i < 1100; i++){
			this.camello.setLocation(i, posicionY);
			if (i == 300 && this.camello.getLocation().y == this.label.getLocation().y){
				this.random = this.random/4;
				this.label.setVisible(false);				
			}
			
			if (i == 1099){				
				System.out.println(this.nombre + " ha quedado " + podio);
				
				if (podio == 1){					
					sonido victoria = new sonido(sonido);					
				}				
				podio ++;					
			}
			
			try {
				//duerme el hilo
				Thread.sleep(this.random);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
	//comprobacion de que el objeto no tenga un hilo creado
	public void comprobacion(){		
		if (hilo == null){
			//creamos el hilo
			hilo = new Thread(this);	
			//ejecutamos ese hijo con una funcion propia de thread para que se ejecute como hilo
			hilo.start();
		}	
	}
	
}
