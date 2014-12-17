public class Dortmund extends Tim{

	//Unos podataka za klub
	
	public Dortmund()
	{
		super("Borussia Dortmund", "Dortmund");
		// igrači
		Ocjene ocjeneIgrac1 = new Ocjene(75, 73, 76, 82, 77, 82, 72, 71);
		Igrac igrac1 = new Igrac("Ciro", "Immobile", ocjeneIgrac1, 9);
		dodajIgraca(igrac1);
		Ocjene ocjeneIgrac2 = new Ocjene(85, 82, 88, 75, 85, 81, 75, 77);
		Igrac igrac2 = new Igrac("Marco", "Reus", ocjeneIgrac2, 11);				
		dodajIgraca(igrac2);
		Ocjene ocjeneIgrac3 = new Ocjene(80, 75, 77, 72, 78, 76, 71, 75);
		Igrac igrac3 = new Igrac("Pierre-Emerick", "Aubameyang", ocjeneIgrac3, 17);
		dodajIgraca(igrac3);
		Ocjene ocjeneIgrac4 = new Ocjene(77, 84, 82, 75, 84, 75, 74, 83);
		Igrac igrac4 = new Igrac("Henrik", "Mkhitaryan", ocjeneIgrac4, 10);
		dodajIgraca(igrac4);
		Ocjene ocjeneIgrac5 = new Ocjene(75, 83, 77, 75, 77, 72, 78, 75);
		Igrac igrac5 = new Igrac("Nuri", "Sahin", ocjeneIgrac5, 18);
		dodajIgraca(igrac5);
		Ocjene ocjeneIgrac6 = new Ocjene(74, 75, 71, 76, 74, 71, 83, 84);
		Igrac igrac6 = new Igrac("Sven", "Bender", ocjeneIgrac6, 6);
		dodajIgraca(igrac6);
		Ocjene ocjeneIgrac7 = new Ocjene(78, 75, 73, 73, 78, 69, 77, 79);
		Igrac igrac7 = new Igrac("Marcel", "Schmelzer", ocjeneIgrac7, 29);
		dodajIgraca(igrac7);
		Ocjene ocjeneIgrac8 = new Ocjene(78, 77, 78, 70, 75, 71, 77, 80);
		Igrac igrac8 = new Igrac("Lukasz", "Pisczek", ocjeneIgrac8, 26);
		dodajIgraca(igrac8);
		Ocjene ocjeneIgrac9 = new Ocjene(70, 75, 69, 87, 74, 62, 85, 76);
		Igrac igrac9 = new Igrac("Mats", "Hummels", ocjeneIgrac9, 15);
		dodajIgraca(igrac9);
		Ocjene ocjeneIgrac10 = new Ocjene(68, 68, 63, 88, 71, 55, 83, 75);
		Igrac igrac10 = new Igrac("Neven", "Subotić", ocjeneIgrac10, 4);
		dodajIgraca(igrac10);
		Ocjene ocjeneIgrac11 = new Ocjene(70, 72, 53, 73, 52, 42, 70, 64);
		Igrac igrac11 = new Igrac("Roman", "Weidenfeller", ocjeneIgrac11, 1);
		dodajIgraca(igrac11);
				
		//Osoblje kluba
		Osoba predsjednik = new Osoba("Reinhard", "Rauball", "rbl@hotmail.com", "predsjednik");
		Osoba trener = new Osoba("Jurgen", "Klopp", "klp@hotmail.com", "trener");
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
