public class Tim {

	//Zadatak za samostalni rad
	
	private String ime;
	private String grad;
	private Igrac[] igraci;
	private Osoba[] osobe;
	private int brojIgraca;
	private int brojOsoba;
	
	/**
	 * Konstuktor sa dva parametra
	 * @param ime
	 * @param grad
	 */
	
	public Tim(String ime, String grad)
	{
		this.ime = ime;
		this.grad = grad;
		igraci = new Igrac[11];
		osobe = new Osoba[6];
	}
	
/**
 * Getter za ime
 * @return ime
 */
	
	public String getIme()
	{ 
		return ime;
	}
	
	/**
		 * Getter za igrače
		 * @return ugraci
		 */
		
		public Igrac[] getIgraci()
		{
			return igraci;
		}
	
	/**
	 * Getter za grad
	 * @return grad
	 */
	
	public String getGrad()
	{
		return grad;
	}
	
	/**
	 * Setter za ime
	 * @param ime
	 */
	
	public void setIme(String ime)
	{
		if (ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime tima ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
		}
	}
	
	/**
	 * Setter za grad
	 * @param grad
	 */
	
	public void setGrad(String grad)
	{
		if (grad.length() < 1)
		{
			throw new IllegalArgumentException("Ime grada ne može biti prazno!");
		}
		else
		{
			this.grad = grad;
		}
	}
	
	/**
	 * Funkcija koja dodaje igrača u niz
	 * @param igrac
	 */
	
	public void dodajIgraca(Igrac igrac)
	{
		igraci[brojIgraca] = new Igrac(igrac.getIme(), igrac.getPrezime(), igrac.getOcjene(), igrac.getBroj());
		brojIgraca++;
	}
	
	/**
	 * Funkcija koja dodaje osobu u niz
	 * @param osoba
	 */
	
	public void dodajOsobu(Osoba osoba)
	{
		osobe[brojOsoba] = new Osoba(osoba.getIme(), osoba.getPrezime(), osoba.getMail(), osoba.getUloga());
		brojOsoba++;
	}
	
	/**
	 * Funkcoja vrača string sa svim podacima o timu
	 */
	
	public String toString()
	{
		String strIgraci = "";
		String strOsobe = "";
		for (int i=0; i<11; i++)
		{
			strIgraci += igraci[i].toString();
		}
		for (int i=0; i<6; i++)
		{
			strOsobe += osobe[i].toString();
		}
		return "Ime: " + ime + "\nGrad: " + grad + "\n" + strIgraci + "\n" + strOsobe + "\n"; 
	}
}
