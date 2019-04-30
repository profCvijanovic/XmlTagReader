package glavni;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import metode.XmlMetode;
import model.Category;
import model.Sport;

public class TestKlasa {

	public static void main(String[] args) {
		
		Category c = new Category();
		
		try {
			c = XmlMetode.parseCategoryXML("event-14742673.xml");
			System.out.println(c.getId() +  " " + c.getId_sport() + " " + c.getName());
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
