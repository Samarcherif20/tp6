package tp6_abstract;


public class AssietteCaree extends Asiette {
		private double cote;

		public AssietteCaree(int annee , double cote) {
			super(annee);
			this.cote=cote;
			
		}

		public double calculerSurfaceAssiettes() {
			
			return  (this.cote*this.cote);
		}
		public double calculerTotal() {
			int age = 2019 - annee;
			double t ;
			if (age<50) {
				return t=0;
			}
			else {
				t=(age-50)*5;
				
			}
			return t;}
		

	}



