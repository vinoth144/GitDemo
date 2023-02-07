package coreJava;

public class Winter implements Summer,Spring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Summer s = new Winter();
		s.hot();
		s.rashes();
		s.thirsty();
		System.out.println("************");
		Winter w = new Winter();
		w.hot();
		w.cold();
		w.rashes();
		w.gloom();
		w.thirsty();
		System.out.println("*********");
		Spring sp = new Winter();
		sp.thirsty();
	}

	@Override
	public void hot() {
		// TODO Auto-generated method stub
		System.out.println("Stroke heat  problem");
	}

	@Override
	public void rashes() {
		// TODO Auto-generated method stub
		System.out.println("skin problem");
		
	}
public void cold() {
	System.out.println("shivering");
}

@Override
public void gloom() {
	// TODO Auto-generated method stub
	System.out.println("flowers gloom");
}
public void thirsty() {
	// TODO Auto-generated method stub
	System.out.println("Drink Water");
}



}
