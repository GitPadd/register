package de.dhbw.vs.fpr.register;

import java.util.ArrayList;

public class Student {

	private String name = new String();
	private String vorname = new String();

	private ArrayList<Entry> eintraege = new ArrayList<Entry>();
	private Class classID;
	private String eindeutigeID;
	private String ID;

	public Student(String name, String firstName, String ID, String klassenID) {
		this.name = name;
		vorname = firstName;
		this.ID = ID;
		StringBuilder sg = new StringBuilder();
		sg.append(klassenID);
		sg.append(this.ID); // Hier wird die eindeutige ID aus KlassenID und
							// Schüler ID zusammengesetzt
		eindeutigeID = sg.toString();
	}

	public void addEintrag(Entry e) {
		this.eintraege.add(e);
	}

	public void setID(String dieseID) {
		ID = dieseID;
	}

	public void setFirstName(String n) {
		vorname = n;
	}

	public String getName() {
		return name;
	}

	public String getVorname() {
		return vorname;
	}

	public String getID() {
		return ID;
	}
	
	public boolean checkEntrys(){ //Checkt ob min ein Eintag vorhanden ist, gibt true zurück wenn keine vorhanden
		
		return eintraege.isEmpty(); 
	}

	public void getEntrys() {
		String s = null;
		if (eintraege.isEmpty()) {
			System.out.println("Keine Eintraege vorhanden!");
		} else {
			for (int i = 0; i < this.eintraege.size(); i++) {
				
				System.out.println(this.eintraege.get(i).getNotiz());

			}
		}

	}

	public String geteindeutigeID() {
		return eindeutigeID;
	}

}
