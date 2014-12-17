
public class Ocjene {
	
	//Zadatak za samostalni rad
	
	private int brzina;
	private int dodavanje;
	private int dribling;
	private int igraVuglom;
	private int sutiranje;
	private int instiktZaGol;
	private int uklizavanje;
	private int kondicija;
	
	/**
	 * Konstruktor koji prima sve parametre
	 * @param brzina
	 * @param dodavanja
	 * @param dribling
	 * @param igraVuglom
	 * @param sutiranje
	 * @param instinktZaGol
	 */
	
	public Ocjene(int brzina, int dodavanja, int dribling, int igraVuglom, 
			int sutiranje, int instinktZaGol, int uklizavanje, int kondicija)
	{
		this.brzina = brzina;
		this.dodavanje = dodavanja;
		this.dribling = dribling;
		this.igraVuglom = igraVuglom;
		this.sutiranje = sutiranje;
		this.instiktZaGol = instinktZaGol;
		this.uklizavanje = uklizavanje;
		this.kondicija = kondicija;
	}
	
	/**
	 * Getter za brzinu
	 * @return brzina
	 */
	
	public int getBrzina()
	{
		return brzina;
	}
	
	/**
	 * Getter za dodavanje
	 * @return dodavanje
	 */
	
	public int getDodavanje()
	{
		return dodavanje;
	}
	
	/**
	 * Getter za dribling
	 * @return dribling
	 */
	
	public int getDribling()
	{
		return dribling;
	}
	
	/**
	 * Getter za igru glavom
	 * @return igraVuglom
	 */
	
	public int getVugla()
	{
		return igraVuglom;
	}
	
	/**
	 * Getter za šut
	 * @return sutiranje
	 */
	
	public int getSutiranje()
	{
		return sutiranje;
	}
	
	/**
	 * Getter za instinkt
	 * @return instinktZaGol
	 */
	
	public int getInstinkt()
	{
		return instiktZaGol;
	}
	
	/**
	 * Getter za uklizavanje
	 * @return uklizavanje
	 */
	
	public int getUklizavanje()
	{
		return uklizavanje;
	}
	
	/**
	 * Getter za kondiciju
	 * @return kondicija
	 */
	
	public int getKondicija()
	{
		return kondicija;
	}
	
	/**
	 * Setter za brzinu
	 * @param brzina
	 */
	
	public void setBrzina(int brzina)
	{
		if (brzina < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.brzina = brzina;
		}
	}
	
	/**
	 * Setter za dodavanje
	 * @param dodavanje
	 */
	
	public void setDodavanje(int dodavanje)
	{
		if (dodavanje < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.dodavanje = dodavanje;
		}
	}
	
	/**
	 * Setter za dribling
	 * @param dribling
	 */
	
	public void setDribling(int dribling)
	{
		if (dribling < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.dribling = dribling;
		}
	}
	
	/**
	 * Setter za igru glavom
	 * @param igraVuglom
	 */
	
	public void setVugla(int igraVuglom)
	{
		if (igraVuglom < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.igraVuglom = igraVuglom;
		}
	}
	
	/**
	 * Setter za šut
	 * @param sutiranje
	 */
	
	public void setSutiranje(int sutiranje)
	{
		if (sutiranje < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.sutiranje = sutiranje;
		}
	}
	
	/**
	 * Setter za instikt
	 * @param instiktZaGol
	 */
	
	public void setInstinkt(int instiktZaGol)
	{
		if (instiktZaGol < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.instiktZaGol = instiktZaGol;
		}
	}
	
	/**
	 * Setter za uklizavanje
	 * @param uklizavanje
	 */
	
	public void setUklizavanje(int uklizavanje)
	{
		if (uklizavanje < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.uklizavanje = uklizavanje;
		}
	}
	
	/**
	 * Setter za kondiciju
	 * @param kondicija
	 */
	
	public void setKondicija(int kondicija)
	{
		if (kondicija < 1)
		{
			throw new IllegalArgumentException("Niste ispravno unijeli vrijednost!");
		}
		else
		{
			this.kondicija = kondicija;
		}
	}
	
	/**
	 * Funkcija koja vraća string sa svim ocjenama
	 */
	
	public String toString()
	{
		return "Brzina: " + brzina + "\nDodavanje: " + dodavanje + "\nDribling: " + dribling + 
			"\nIgra glavom: " + igraVuglom + "\nŠut: " + sutiranje + "\nInstikt ubojice: " + instiktZaGol;	
	}

}
