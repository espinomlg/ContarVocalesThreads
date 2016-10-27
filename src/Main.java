
import java.io.File;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException{
		File file = new File("texto");
		Vocales v = null;
		
		if(file.exists())
			v = new Vocales(file);
		
		VocalThread a = new VocalThread(v, 'a', 'A');
		VocalThread e = new VocalThread(v, 'e', 'E');
		VocalThread i = new VocalThread(v, 'i', 'I');
		VocalThread o = new VocalThread(v, 'o', 'O');
		VocalThread u = new VocalThread(v, 'u', 'U');
		
		a.start();e.start();i.start();o.start();u.start();
		
		System.out.println(v.getVocales());


	}

}
