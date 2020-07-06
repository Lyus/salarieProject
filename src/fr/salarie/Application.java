package fr.salarie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Application {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salarie sa = new Salarie();
		ArrayList<Salarie>tab = new ArrayList<Salarie>();
		tab.add(new Salarie(2, 3, 50, "Duc", 2000));
		tab.add(new Salarie(22, 1, 50, "Duca", 2000));
		tab.add(new Salarie(223, 2, 50, "Duci", 2000));
		tab.add(new Salarie(24, 5, 50, "Ducz", 2000));
		tab.add(new Commercial(220, 4, 50, "Ducon", -20, 20, 20000));
		tab.add(new Salarie(24, 5, 50, "Ducz", -2000));
		tab.add(new Commercial(220, 4, 50, "Ducon", 20, 20, 20000));
		for(Salarie test:tab) {		
			test.isValid();
		}
	
	}


}