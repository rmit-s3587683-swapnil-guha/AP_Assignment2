import java.util.concurrent.ThreadLocalRandom;

public class Swimmer extends Athlete {

	public Swimmer(String ID, String Type, String Name, String Age, String State) {
		super(ID, Type, Name, Age, State);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double compete() {
		// TODO Auto-generated method stub
		return ThreadLocalRandom.current().nextInt(100, 200 + 1);

	}
}
