public class SubstanceRunner {
	public static void main(String[] args) {
		Substance substance = new Substance();
		Soild s = new Soild();
		Liquid l = new Liquid();
		Ice ice = new Ice();
		SugarCube sc = new SugarCube();
		Water w = new Water();
		Milk m = new Milk();

		s.changeState();
		s.submerge();
		
		l.changeState();
		l.evaporate();
		l.freeze();
		
		ice.changeState();
		ice.melt();
		ice.submerge();
		
		sc.changeState();
		sc.dissolve();
		sc.melt();
		sc.submerge();
		
		w.changeState();
		w.rain();
		w.freeze();
		w.evaporate();
		
		m.changeState();
		m.spoil();
		m.freeze();
		m.evaporate();
				
	}
}
