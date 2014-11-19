public class Water extends Liquid {
	@Override
	public void changeState() {
		System.out.println("The water changed state...");
	}

	public void rain() {
		System.out.println("It is raining...");
	}
}
