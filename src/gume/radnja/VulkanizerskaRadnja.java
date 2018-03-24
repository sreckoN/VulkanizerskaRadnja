package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;

/**
 * 
 * Klasa predstavlja vulkanizersku radnju
 * 
 * @author Srecko Nikolic
 * @version 0.0.1
 *
 */
public class VulkanizerskaRadnja {
	
	/**
	 * Lista guma koje su dostupne u radnji
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Dodaje novu gumu u radnju
	 * @param a guma koju treba dodati
	 * @throws java.lang.RuntimeException ako je knjiga za unos null ili vec postoji u radnji
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 * Pronalazi i vraca listu sa svim gumama iz radnje koje odgovaraju upitu
	 * @param markaModel marka i model gume koju treba pronaci
	 * @return lista sa gumama
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for(int i=0;i<gume.size();i++)
			if (gume.get(i).getMarkaModel().equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}

}
