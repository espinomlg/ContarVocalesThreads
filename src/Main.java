
import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		File file = new File("texto");
		Vocales v = null;
		VocalThread a,e,i,o,u;
		
		if(file.exists()){
			v = new Vocales(file);

			a = new VocalThread(v, 'a', 'A');
			e = new VocalThread(v, 'e', 'E');
			i = new VocalThread(v, 'i', 'I');
			o = new VocalThread(v, 'o', 'O');
			u = new VocalThread(v, 'u', 'U');

			a.start();e.start();i.start();o.start();u.start();
			
			System.out.println("El número de vocales en el texto es " + v.getVocales());
		}
		else
			System.out.println("El fichero indicado no existe");

	}

}
