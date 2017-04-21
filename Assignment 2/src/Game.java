import java.util.ArrayList;

public abstract class Game {

	private String u_GameId;
	static private int u_Predit;
	private ArrayList<Athlete> athList;
	private ArrayList<Official> offList;
	private ArrayList<Double> time;
	private int point;


	public Game( String u_GameId, ArrayList<Athlete> athList,ArrayList<Official> offList, ArrayList<Double> time, int point){

		this.u_GameId=u_GameId;
		this.athList=athList;
		this.offList=offList;
		this.time = time;
		this.point = point;
	}

	public Game() {
		// TODO Auto-generated constructor stub
	}
	public abstract ArrayList<Athlete> assignParticipants();

	public abstract String assignOfficial();
	
	public abstract ArrayList<Double> competeTime();
	
	//public abstract void StartGame();

	//public abstract void print();

	public String getU_GameId() {
		return u_GameId;
	}
	public void setU_GameId(String u_GameId) {
		this.u_GameId = u_GameId;
	}
	public static int getU_Predit() {
		return u_Predit;
	}
	public static void setU_Predit(int u_Predit) {
		Game.u_Predit = u_Predit;
	}
	public ArrayList<Athlete> getAthList() {
		return athList;
	}
	public void setAthList(ArrayList<Athlete> athList) {
		this.athList = athList;
	}
	public ArrayList<Official> getOffList() {
		return offList;
	}
	public void setOffList(ArrayList<Official> offList) {
		this.offList = offList;
	}

	public ArrayList<Double> getTime() {
		return time;
	}

	public void setTime(ArrayList<Double> time) {
		this.time = time;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = this.point+point;
	}
}
