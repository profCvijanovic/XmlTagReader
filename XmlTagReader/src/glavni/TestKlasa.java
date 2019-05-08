package glavni;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import metode.XmlMetode;
import model.Category;
import model.Competitor;
import model.Sport;

public class TestKlasa {

	public static void main(String[] args) {
		
		List<Competitor> competitors = new ArrayList<Competitor>();
		Competitor comp = new Competitor();
		Competitor comp2 = new Competitor();
		try {
			competitors = XmlMetode.parseCompetitorsXML("event-14742673.xml");
			for(Competitor c: competitors) {
				System.out.println(c.getId() +  " " + c.getName() + " " +c.getCountry_code());
			}
			
			comp = XmlMetode.dajMiGostujucegTakmicara("event-14742673.xml");
			System.out.println("Gost: " + comp.getId() +  " " + comp.getName() + " " +comp.getCountry_code());
			
			comp2 = XmlMetode.dajMiDomacegTakmicara("event-14742673.xml");
			System.out.println("Domacin: " + comp2.getId() +  " " + comp2.getName() + " " +comp2.getCountry_code());
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
