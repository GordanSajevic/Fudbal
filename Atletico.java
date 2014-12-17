public class Atletico extends Tim{

	//Unos podataka za klub
	
	public Atletico()
	{
		super("Atletico Madrid", "Madrid");
		// igrači
				Ocjene ocjeneIgrac1 = new Ocjene(77, 73, 72, 87, 79, 85, 72, 80);
				Igrac igrac1 = new Igrac("Mario", "Madžukić", ocjeneIgrac1, 9);
				dodajIgraca(igrac1);
				Ocjene ocjeneIgrac2 = new Ocjene(81, 82, 83, 78, 83, 72, 78, 81);
				Igrac igrac2 = new Igrac("Arda", "Turan", ocjeneIgrac2, 10);				
				dodajIgraca(igrac2);
				Ocjene ocjeneIgrac3 = new Ocjene(80, 75, 81, 72, 81, 76, 72, 72);
				Igrac igrac3 = new Igrac("Antoine", "Griezmann", ocjeneIgrac3, 7);
				dodajIgraca(igrac3);
				Ocjene ocjeneIgrac4 = new Ocjene(77, 86, 85, 75, 84, 75, 84, 83);
				Igrac igrac4 = new Igrac("Jorge", "Koke", ocjeneIgrac4, 6);
				dodajIgraca(igrac4);
				Ocjene ocjeneIgrac5 = new Ocjene(75, 78, 77, 72, 80, 72, 71, 75);
				Igrac igrac5 = new Igrac("Raul", "Garcia", ocjeneIgrac5, 8);
				dodajIgraca(igrac5);
				Ocjene ocjeneIgrac6 = new Ocjene(74, 78, 71, 78, 77, 70, 83, 84);
				Igrac igrac6 = new Igrac("Fernandez", "Gabi", ocjeneIgrac6, 14);
				dodajIgraca(igrac6);
				Ocjene ocjeneIgrac7 = new Ocjene(77, 75, 74, 68, 75, 66, 77, 79);
				Igrac igrac7 = new Igrac("Guilherme", "Siquera", ocjeneIgrac7, 3);
				dodajIgraca(igrac7);
				Ocjene ocjeneIgrac8 = new Ocjene(78, 77, 78, 70, 75, 71, 77, 80);
				Igrac igrac8 = new Igrac("Francisco", "Juanfran", ocjeneIgrac8, 20);
				dodajIgraca(igrac8);
				Ocjene ocjeneIgrac9 = new Ocjene(64, 70, 62, 88, 70, 65, 87, 76);
				Igrac igrac9 = new Igrac("Diego", "Godin", ocjeneIgrac9, 2);
				dodajIgraca(igrac9);
				Ocjene ocjeneIgrac10 = new Ocjene(71, 72, 57, 82, 73, 50, 83, 75);
				Igrac igrac10 = new Igrac("Joao", "Miranda", ocjeneIgrac10, 23);
				dodajIgraca(igrac10);
				Ocjene ocjeneIgrac11 = new Ocjene(70, 72, 53, 73, 52, 42, 70, 64);
				Igrac igrac11 = new Igrac("Jan", "Oblak", ocjeneIgrac11, 1);
				dodajIgraca(igrac11);
						
				//Osoblje kluba
				Osoba predsjednik = new Osoba("Enrique", "Cerezo", "crz@hotmail.com", "predsjednik");
				Osoba trener = new Osoba("Diego", "Simeone", "sim@hotmail.com", "trener");
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
