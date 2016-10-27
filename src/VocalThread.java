
public class VocalThread extends Thread{

	private Vocales v;
	private char v1, v2;
	
	public VocalThread(Vocales v, char v1, char v2){
		this.v = v;
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public void run(){
		v.buscarVocales(v1, v2);
	}
}
