package tp6_abstract;

	public class asietteRonde extends Asiette {
		private double rayon;

		public asietteRonde(int annee , double rayon) {
			super(annee);
			this.rayon=rayon;
			
		}

		
		public double calculerSurfaceAssiettes() {
			
			return (3.14*this.rayon*this.rayon);
		}

	}


