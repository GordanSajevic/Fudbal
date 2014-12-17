public class Real extends Tim{

	//Unos podataka za klub
	
	public Real()
	{
		super("Real Madrid", "Madrid");
		// igrači
		Ocjene ocjeneIgrac1 = new Ocjene(77, 79, 76, 87, 82, 88, 72, 75);
		Igrac igrac1 = new Igrac("Karim", "Benzema", ocjeneIgrac1, 9);
		dodajIgraca(igrac1);
		Ocjene ocjeneIgrac2 = new Ocjene(91, 82, 90, 88, 90, 81, 65, 89);
		Igrac igrac2 = new Igrac("Cristiano", "Ronaldo", ocjeneIgrac2, 7);				
		dodajIgraca(igrac2);
		Ocjene ocjeneIgrac3 = new Ocjene(88, 78, 82, 83, 85, 74, 72, 92);
		Igrac igrac3 = new Igrac("Gareth", "Bale", ocjeneIgrac3, 11);
		dodajIgraca(igrac3);
		Ocjene ocjeneIgrac4 = new Ocjene(85, 81, 87, 69, 86, 75, 62, 76);
		Igrac igrac4 = new Igrac("James", "Rodriguez", ocjeneIgrac4, 10);
		dodajIgraca(igrac4);
		Ocjene ocjeneIgrac5 = new Ocjene(75, 83, 77, 75, 85, 65, 76, 79);
		Igrac igrac5 = new Igrac("Toni", "Kroos", ocjeneIgrac5, 8);
		dodajIgraca(igrac5);
		Ocjene ocjeneIgrac6 = new Ocjene(71, 86, 77, 70, 79, 70, 78, 78);
		Igrac igrac6 = new Igrac("Luka", "Modrić", ocjeneIgrac6, 19);
		dodajIgraca(igrac6);
		Ocjene ocjeneIgrac7 = new Ocjene(87, 75, 77, 65, 78, 67, 77, 79);
		Igrac igrac7 = new Igrac("Viera", "Marcelo", ocjeneIgrac7, 12);
		dodajIgraca(igrac7);
		Ocjene ocjeneIgrac8 = new Ocjene(77, 75, 77, 71, 72, 65, 77, 80);
		Igrac igrac8 = new Igrac("Daniel", "Carvajal", ocjeneIgrac8, 15);
		dodajIgraca(igrac8);
		Ocjene ocjeneIgrac9 = new Ocjene(72, 72, 62, 88, 70, 68, 89, 76);
		Igrac igrac9 = new Igrac("Sergio", "Ramos", ocjeneIgrac9, 4);
		dodajIgraca(igrac9);
		Ocjene ocjeneIgrac10 = new Ocjene(71, 72, 57, 85, 73, 50, 89, 75);
		Igrac igrac10 = new Igrac("Ferreira", "Pepe", ocjeneIgrac10, 3);
		dodajIgraca(igrac10);
		Ocjene ocjeneIgrac11 = new Ocjene(72, 72, 53, 77, 52, 42, 70, 67);
		Igrac igrac11 = new Igrac("Iker", "Casillas", ocjeneIgrac11, 1);
		dodajIgraca(igrac11);
				
		//Osoblje kluba
		Osoba predsjednik = new Osoba("Florentin", "Perez", "prz@hotmail.com", "predsjednik");
		Osoba trener = new Osoba("Carlo", "Ancelotti", "anc@hotmail.com", "trener");
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
