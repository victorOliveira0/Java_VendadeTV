package aplicacao;

import entidade.tv_a1;
import entidade.tv_c137;

public class programa {

	public static void main(String[] args) {
		tv_a1 tv1 = new tv_a1(); 
		tv_c137 tv2 = new tv_c137();
		
		tv1.desligar();
		System.out.println(tv1);
		
		tv2.ligar();
		System.out.println(tv2);

	}

}
