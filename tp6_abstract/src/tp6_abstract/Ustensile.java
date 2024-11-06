package tp6_abstract;

public abstract class Ustensile {
	protected  int annee;

	public Ustensile(int annee) {
		this.annee = annee;
	}
	

	public double calculerTotal() {
		int age = 2019 - annee;
		double t ;
		if (age<50) {
			return t=0;
		}
		else {
			t=age-50;
			
		}
		return t;
		
       
	}
	


}
