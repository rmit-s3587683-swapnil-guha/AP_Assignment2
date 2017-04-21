import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Database {



	public static ArrayList<Athlete> participantList = new ArrayList<Athlete>();
	public static ArrayList<Official> offList = new ArrayList<Official>();

	public static ArrayList<Athlete> getParticipantList() {

		Connection c = null;
		Statement stmt = null;

		try {
			c = Sqliteconnection.dbconnector();	
			stmt = c.createStatement();

			ResultSet rs = stmt.executeQuery("Select * from participants;");
			while (rs.next()) {
				if(rs.getString("Type").contains("swimmer")){
					Athlete participant = new Swimmer(rs.getString("ID"), rs.getString("Type"),rs.getString("Name"), rs.getString("Age"), rs.getString("State"));
					participantList.add(participant);
				}else if(rs.getString("Type").contains("sprinter")){
					Athlete participant = new Sprinter(rs.getString("ID"), rs.getString("Type"),rs.getString("Name"), rs.getString("Age"), rs.getString("State"));
					participantList.add(participant);
				}else if(rs.getString("Type").contains("cyclist")){
					Athlete participant = new Cyclist(rs.getString("ID"), rs.getString("Type"),rs.getString("Name"), rs.getString("Age"), rs.getString("State"));
					participantList.add(participant);
				}else if(rs.getString("Type").contains("super")){
					Athlete participant = new SuperAthlete(rs.getString("ID"), rs.getString("Type"),rs.getString("Name"), rs.getString("Age"), rs.getString("State"));
					participantList.add(participant);
				}
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		return participantList;
	}

	public static ArrayList<Official> getOfficialList() {

		Connection c = null;
		Statement stmt = null;

		try {
			c = Sqliteconnection.dbconnector();	
			stmt = c.createStatement();

			ResultSet rs = stmt.executeQuery("Select * from participants;");
			while (rs.next()) {
				if(rs.getString("Type").contains("officer")){
					Official participant = new Official(rs.getString("ID"), rs.getString("Type"),rs.getString("Name"), rs.getString("Age"), rs.getString("State"));
					offList.add(participant);
				}
			}
			rs.close();
			stmt.close();
			c.close();
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
		return offList;
	}
}
