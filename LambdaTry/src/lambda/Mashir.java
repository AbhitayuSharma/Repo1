package lambda;

import java.util.ArrayList;
import java.util.List;

public class Mashir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mashir mashir = new Mashir();
		List<Mashir> m = new ArrayList<Mashir>();
		m.add(mashir);
		
		m.forEach(name -> System.out.println(name));
		Abhitayu ex = (name -> System.out.println(name));
//		System.out.println(ex);
	}

}
