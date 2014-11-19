public class Milk extends Liquid {
	@Override
	public void changeState() {
		System.out.println("The milk changed state...");
	}

	public void spoil() {
		System.out.println("The milk has gone bad...");
	}
}
