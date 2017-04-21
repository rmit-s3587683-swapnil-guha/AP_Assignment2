import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Sprinting extends Game {

	private ArrayList<Athlete> AthList = new ArrayList<Athlete>();
	private ArrayList<Official> offList = new ArrayList<Official>();
	private  ArrayList<Athlete> sprinterList = new ArrayList<Athlete>();
	private  ArrayList<Athlete> sprinters = new ArrayList<Athlete>();
	private ArrayList<Double> time = new ArrayList<Double>();
	private ArrayList<Integer> point = new ArrayList<Integer>();
	private String selectedOfficial;


	public Sprinting(String u_GameId, ArrayList<Athlete> athList, ArrayList<Official> offList, ArrayList<Double> time, int point) {
		super(u_GameId, athList, offList, time, point);
		// TODO Auto-generated constructor stub
	}

	public Sprinting() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Athlete> assignParticipants() {
		// TODO Auto-generated method stub

		AthList = Database.getParticipantList();
		Random random = new Random();
		int players;

		for (int i = 0; i < AthList.size(); i++) {

			if (AthList.get(i) instanceof Sprinter || AthList.get(i) instanceof SuperAthlete) {
				Sprinter sprint = new Sprinter(AthList.get(i).getID(), AthList.get(i).getType(), AthList.get(i).getName(), AthList.get(i).getAge(), AthList.get(i).getState());
				sprinterList.add(sprint);
				Collections.shuffle(sprinterList);
			}
		}

		players = 4+random.nextInt(sprinterList.size());
		if(players <= 4){
			System.out.println("Total Participants:"+" "+players);
			System.out.println("Not enough athletes to compete");
		}else if (players > 4 && players < 8) {
			System.out.println("Total Participants:"+" "+players);
			for (int i = 0; i < players; i++) {
				sprinters.add(sprinterList.get(i));
			}
		}else {
			System.out.println("Too many athletes");
		}
		return sprinters;
	}

	@Override
	public String assignOfficial() {
		// TODO Auto-generated method stub

		offList = Database.getOfficialList();
		Random random = new Random();
		int index = random.nextInt(offList.size());
		selectedOfficial = offList.get(index).getID();
		
		return selectedOfficial;
//		System.out.format("%-15s%-15s%-15s%-15s%-15s",selectedOfficial.getID() ,selectedOfficial.getType(), selectedOfficial.getName() ,selectedOfficial.getAge(), selectedOfficial.getState());
//		System.out.println();
	}

	//	public void printPlayers() {
	//		sprinters = assignParticipants();
	//		
	//		for (int i = 0; i < sprinters.size(); i++) {
	//
	//			System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s",sprinters.get(i).getID() ,sprinters.get(i).getType(), sprinters.get(i).getName() ,sprinters.get(i).getAge(), sprinters.get(i).getState());
	//			System.out.println();
	//			}		
	//	}


	public ArrayList<Double> competeTime() {

		HashSet<Double> validate = new HashSet<>();
		ArrayList<Double> competeTime = new ArrayList<Double>();
		sprinters = assignParticipants();

		for (int i = 0; i < sprinters.size(); i++) {

			double nextRandom = sprinterList.get(i).compete();

			validate.add(nextRandom);

			while(validate.contains(nextRandom)) {
				nextRandom = sprinterList.get(i).compete();
			}
			validate.add(nextRandom);
			competeTime.add(nextRandom);
		}

		Collections.sort(competeTime);

		return competeTime;
	}

	public ArrayList<Integer> Points() {
		time = competeTime();
		
		
			if(time.get(0) != null){
				point.add(5);	
			}if(time.get(1) != null){
				point.add(3);	
			}if(time.get(2) != null){
				point.add(1);	
			}else {
				point.add(0);
			}
		
		
		
		return point;
	}
	
	
	//	@Override
	//	public void StartGame() {
	//		// TODO Auto-generated method stub
	//
	//		HashSet<Double> validate = new HashSet<>();
	//		ArrayList<Double> competeTime = new ArrayList<Double>();
	//		ArrayList<Integer> points = new ArrayList<Integer>();
	//		//ArrayList<Double> Time = new ArrayList<Double>();
	//		//List<Double> nextRandom = new ArrayList<Double>();
	//		sprinters = assignParticipants();
	//		
	//		for (int i = 0; i < sprinters.size(); i++) {
	//
	//			System.out.format("%-15s%-15s%-15s%-15s%-15s",sprinters.get(i).getID() ,sprinters.get(i).getType(), sprinters.get(i).getName() ,sprinters.get(i).getAge(), sprinters.get(i).getState());
	//			System.out.println();
	//			
	//			
	//			double nextRandom = sprinterList.get(i).compete();
	//
	//			validate.add(nextRandom);
	//
	//			while(validate.contains(nextRandom)) {
	//				nextRandom = sprinterList.get(i).compete();
	//			}
	//			validate.add(nextRandom);
	//			competeTime.add(nextRandom);
	//			
	//			
	//		}
	//		System.out.println("++++++++++++++++++++++++++++++++++++++");
	//		Collections.sort(competeTime);
	//		Collections.shuffle(sprinters);
	//		
	//		for (int i = 0; i < sprinters.size(); i++) {	
	//			System.out.format("%-15s%-15s%-15s%-15s%-15s%-15s",sprinters.get(i).getID() ,sprinters.get(i).getType(), sprinters.get(i).getName() ,sprinters.get(i).getAge(), sprinters.get(i).getState(), competeTime.get(i));
	//			System.out.println();
	//		}


}