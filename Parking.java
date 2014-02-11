import java.util.ArrayList;
public class Parking{

	private ArrayList<Vehicule> liste_vehicules;


	public Parking(){ 
		Grid myGrid = new Grid();
		liste_vehicules = new ArrayList<Vehicule>();
	}

	public void add(Vehicule mon_vehicule)
	{
		liste_vehicules.add(mon_vehicule);
	}
	public Vehicule get(String name)
	{
		for(Vehicule v : liste_vehicules)
			if(v.getNom().equals(name))
				return v;
		return null;
	}
}
