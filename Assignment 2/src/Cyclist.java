import java.util.concurrent.ThreadLocalRandom;

public class Cyclist extends Athlete {

	public Cyclist(String ID, String Type, String Name, String Age, String State) {
		super(ID, Type, Name, Age, State);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double compete() {
		// TODO Auto-generated method stub
		return ThreadLocalRandom.current().nextInt(500, 800 + 1);
	}
}
