public class Igrac {
	
	//Zadatak za samostalni rad
	
	private String ime;
	private String prezime;
	private Ocjene ocjene;
	private int broj;
	
	/**
	 * Konstruktor koji prima sve parametre
	 * @param ime
	 * @param prezime
	 * @param ocjene
	 * @param broj
	 */
	
	public Igrac(String ime, String prezime, Ocjene ocjene, int broj)
	{
		this.ime = ime;
		this.prezime = prezime;
		this.ocjene = ocjene;
		this.broj = broj;
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
	 * Getter za prezime
	 * @return prezime
	 */
	
	public String getPrezime()
	{
		return prezime;
	}
	
	/**
	 * Getter za ocjene
	 * @return ocjene
	 */
	
	public Ocjene getOcjene()
	{
		return ocjene;
	}
	
	/**
	 * Getter za broj
	 * @return broj
	 */
	
	public int getBroj()
	{
		return broj;
	}
	
	/**
	 * Setter za ime
	 * @param ime
	 */
	
	public void setIme(String ime)
	{
		if (ime.length() < 1)
		{
			throw new IllegalArgumentException("Ime ne može biti prazno!");
		}
		else
		{
			this.ime = ime;
		}
	}
	
	/**
	 * Setter za prezime
	 * @param prezime
	 */
	
	public void setPrezime(String prezime)
	{
		if (prezime.length() < 1)
		{
			throw new IllegalArgumentException("Prezime ne može biti prazno!");
		}
		else
		{
			this.prezime = prezime;
		}
	}
	
	/**
	 * Setter za ocjene
	 * @param ocjene
	 */
	
	public void setOcjene(Ocjene ocjene)
	{
		this.ocjene = ocjene;
	}
	
	
	/**
	 * Setter za broj
	 * @param broj
	 */
	
	public void setBroj(int broj)
	{
		if (broj < 1 || broj > 99)
		{
			throw new IllegalArgumentException("Niste dobro unijeli broj dresa!");
		}
		else
		{
			this.broj = broj;
		}
	}
	
	/**
	 * Funkcija vraća niz koji sadrži sve podatke o igraču
	 */
	
	public String toString()
	{
		return "\nIme: " + ime + "\nPrezime: " + prezime + "\nBroj dresa: " + broj
				+ "\nOcjene\n" + ocjene.toString() + "\n";
	}
}
