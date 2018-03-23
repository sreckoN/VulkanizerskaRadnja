package gume;

/**
 * 
 * Klasa sadrzi podatke o auto gumi
 * 
 * @author Srecko Nikolic
 * @version 0.0.1
 *
 */
public class AutoGuma {
	
	/**
	 * Cuva naziv marke gume
	 */
	private String markaModel = null;
	
	/**
	 * Cuva precnik gume
	 */
	private int precnik = 0;
	
	/**
	 * Cuva sirinu gume
	 */
	private int sirina = 0;
	
	/**
	 * Cuva visinu gume
	 */
	private int visina = 0;
	
	/**
	 * Vraca naziv marke gume i model
	 * @return String vrednost atributa markaModel
	 */
	public String getMarkaModel() {
		return markaModel;
	}
	
	/**
	 * Postavlja vrednost atributa markaModel na vrednost parametra
	 * @param markaModel  naziv marke i model
	 * @throws java.lang.RuntimeException kada je parametar null ili kada je kraci od 3
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel==null || markaModel.length()<3)
			throw new RuntimeException("Morate uneti marku i model");
		this.markaModel = markaModel;
	}
	
	/**
	 * Vraca precnik gume
	 * @return celobrojna vrednost atributa precnik
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Postavlja precnik gume
	 * @param precnik  precnik gume
	 * @throws java.lang.RuntimeException kada je precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new RuntimeException("Precnik van opsega");
		this.precnik = precnik;
	}
	
	/**
	 * Vraca sirinu gume
	 * @return celobrojna vrednost atributa sirina
	 */
	public int getSirina() {
		return sirina;
	}
	
	/**
	 * Postavlja sirinu gume
	 * @param sirina  sirina gume
	 * @throws java.lang.RuntimeException kada je sirina manja od 135 ili veca od 355
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new RuntimeException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	/**
	 * Vraca visinu gume
	 * @return celobrojna vrednost atributa visina
	 */
	public int getVisina() {
		return visina;
	}
	
	/**
	 * Postavlja visinu gume
	 * @param visina  visina gume
	 * @throws java.lang.RuntimeException kada je visina manja od 25 ili veca od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new RuntimeException("Visina van opsega");
		this.visina = visina;
	}
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
				", sirina=" + sirina + ", visina=" + visina + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}

}
