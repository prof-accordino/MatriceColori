import java.awt.*;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

public class MainClass
{		
	// Numero di pixel di altezza (righe)
	static int altezza = 400;
	
	// Numero di pixel di larghezza (colonne)
	static int larghezza = 400;

	// Creo una finestra con un titolo 
	static Finestra finestra = new Finestra("Finestra", larghezza, altezza);
	
	// Creo una matrice di pixel
	static Color[][] immagine = new Color[altezza][larghezza];

	public static void main(String[] args) 
	{
		// I colori RGB sono dati con 3 numeri che vanno da 0 a 255
		for(int i = 0; i < 256; i++)
			coloraTutto(new Color(i,0,0));;

	}
	
	public static void coloraTutto(Color c)
	{
		for(int i = 0; i < altezza; i++)
			for(int j = 0; j < larghezza; j++)
				immagine[i][j] = c;
		// Questo metodo disegna la matrice di colori "immagine" per 10 millisecondi
		finestra.disegna(immagine, 10);
	}
}