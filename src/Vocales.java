import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Vocales{

	private int vocales;
	private String texto;
	
	public Vocales(File file) throws IOException{
		vocales = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String linea;
		
		while((linea = br.readLine()) != null)
			texto += linea + "\n";
		
		br.close();
		
	}
	
	public synchronized void aumentarVocales(){
		vocales++;
	}
	
	public void buscarVocales(char v1, char v2){
		for(int i = 0;i < texto.length(); i++){
			if(texto.charAt(i) == v1 || texto.charAt(i) == v2)
				aumentarVocales();
		}
	}

	public int getVocales() {
		return vocales;
	}

	public String getTexto() {
		return texto;
	}
	
	
	
}
