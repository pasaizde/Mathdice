import Visual.Ventana1;
import Visual.Ventana2;




public class Principal {

	public static void main(String[] args) {
		Ventana2 v2=new Ventana2();
		Ventana1 v1=new Ventana1(v2);
		v1.setVisible(true);
		
		

	}

}
