package UDP;

public class MainServidorUDP {

	public static void main(String[] args) {
		ServidorUDP S = new ServidorUDP(8888);
		
		//El servidor responde con el tama�o de la cadena 
		S.Tama�oS();
		
		
	}
}