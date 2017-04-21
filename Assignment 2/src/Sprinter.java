import java.util.concurrent.ThreadLocalRandom;

public class Sprinter  extends Athlete{

	public Sprinter(String ID, String Type, String Name, String Age, String State) {
		super(ID, Type, Name, Age, State);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double compete() {
		// TODO Auto-generated method stub

		return ThreadLocalRandom.current().nextInt(10, 20 + 1);
	}
}
