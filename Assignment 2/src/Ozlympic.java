import java.nio.channels.GatheringByteChannel;
import java.util.ArrayList;

public class Ozlympic {


	static ArrayList<Integer> game = new ArrayList<Integer>();
	static String time;

	public static void main( String args[] )
	{
		Sprinting S = new Sprinting();
		game = S.Points();

		for (int i = 0; i < game.size(); i++) {	
		System.out.format("%-15s",game.get(i));
		System.out.println();
		}




		//		HashSet<Double> validate = new HashSet<>();
		//		ArrayList<Double> competeTime = new ArrayList<Double>();
		//
		//		for (int i = 0; i < sprinterList.size(); i++) {
		//
		//			double nextRandom = sprinterList.get(i).compete();
		//
		//			validate.add(nextRandom);
		//
		//			while(validate.contains(nextRandom)) {
		//				nextRandom = ThreadLocalRandom.current().nextInt(10, 20 + 1);
		//			}
		//			validate.add(nextRandom);
		//			competeTime.add(nextRandom);
		//
		//			System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s",sprinterList.get(i).getID() ,sprinterList.get(i).getType(), sprinterList.get(i).getName() ,sprinterList.get(i).getAge(), sprinterList.get(i).getState(), competeTime.get(i));
		//			System.out.println();
		//		}
	}
}
