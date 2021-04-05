package practica01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Coordenada p1;
		p1 = new Coordenada();
			
		Coordenada p2 = new Coordenada(20,30);
				
		System.out.println(p1);
		p2.setX(5);
		System.out.println(p2);
		System.out.println(p2.distancia(p1));
		System.out.println(Coordenada.distancia(p1, p2));

	}

}
