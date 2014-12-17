
public class Arsenal extends Tim{

	//Unos podataka za klub
	
	public Arsenal()
	{
		super("Arsenal", "North London");
		// igrači
		Ocjene ocjeneIgrac1 = new Ocjene(85, 72, 76, 82, 76, 78, 71, 79);
		Igrac igrac1 = new Igrac("Danny", "Welbeck", ocjeneIgrac1, 23);
		dodajIgraca(igrac1);
		Ocjene ocjeneIgrac2 = new Ocjene(81, 87, 86, 68, 84, 71, 65, 75);
		Igrac igrac2 = new Igrac("Mesut", "Ozil", ocjeneIgrac2, 11);				
		dodajIgraca(igrac2);
		Ocjene ocjeneIgrac3 = new Ocjene(88, 78, 86, 73, 85, 77, 72, 88);
		Igrac igrac3 = new Igrac("Alexis", "Sanchez", ocjeneIgrac3, 17);
		dodajIgraca(igrac3);
		Ocjene ocjeneIgrac4 = new Ocjene(95, 75, 77, 63, 76, 72, 62, 79);
		Igrac igrac4 = new Igrac("Theo", "Walcott", ocjeneIgrac4, 14);
		dodajIgraca(igrac4);
		Ocjene ocjeneIgrac5 = new Ocjene(75, 78, 79, 77, 85, 75, 76, 79);
		Igrac igrac5 = new Igrac("Aaron", "Ramsey", ocjeneIgrac5, 16);
		dodajIgraca(igrac5);
		Ocjene ocjeneIgrac6 = new Ocjene(76, 76, 77, 72, 79, 70, 78, 78);
		Igrac igrac6 = new Igrac("Jack", "Wilshere", ocjeneIgrac6, 10);
		dodajIgraca(igrac6);
		Ocjene ocjeneIgrac7 = new Ocjene(77, 75, 77, 65, 78, 67, 75, 79);
		Igrac igrac7 = new Igrac("Kieran", "Gibbs", ocjeneIgrac7, 3);
		dodajIgraca(igrac7);
		Ocjene ocjeneIgrac8 = new Ocjene(77, 77, 75, 73, 72, 65, 77, 80);
		Igrac igrac8 = new Igrac("Mathieu", "Debuchy", ocjeneIgrac8, 2);
		dodajIgraca(igrac8);
		Ocjene ocjeneIgrac9 = new Ocjene(62, 72, 62, 90, 70, 68, 83, 76);
		Igrac igrac9 = new Igrac("Per", "Mertesacker", ocjeneIgrac9, 4);
		dodajIgraca(igrac9);
		Ocjene ocjeneIgrac10 = new Ocjene(78, 72, 67, 85, 73, 50, 81, 81);
		Igrac igrac10 = new Igrac("Calum", "Chambers", ocjeneIgrac10, 21);
		dodajIgraca(igrac10);
		Ocjene ocjeneIgrac11 = new Ocjene(72, 73, 53, 77, 52, 42, 71, 67);
		Igrac igrac11 = new Igrac("Wojciech", "Szczezny", ocjeneIgrac11, 1);
		dodajIgraca(igrac11);
				
		//Osoblje kluba
		Osoba predsjednik = new Osoba("Chips", "Keswick", "ksw@hotmail.com", "predsjednik");
		Osoba trener = new Osoba("Arsene", "Wenger", "arsw@hotmail.com", "trener");
		Osoba fiz = new Osoba("Francisco", "Coppado", "cpd@hotmail.com", "fizioterapeut");
		Osoba menager= new Osoba("Martino", "Martes", "mrt@hotmail.com", "menadžer");
		Osoba doktor = new Osoba("Pedro", "Gonzales", "pgl@hotmail.com", "doktor");
		Osoba psi = new Osoba("Luis", "Rodriguez", "lis@hotmail.com", "psiholog");
		dodajOsobu(predsjednik);
		dodajOsobu(trener);
		dodajOsobu(menager);
		dodajOsobu(doktor);
		dodajOsobu(psi);
		dodajOsobu(fiz);
	}
}
