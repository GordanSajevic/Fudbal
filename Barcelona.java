public class Barcelona extends Tim {

	//Unos podataka za klub
	
	public Barcelona(){
		super("FC Barcelona", "Barcelona");
		
		// igrači
				Ocjene ocjeneSuarez = new Ocjene(85, 85, 81, 76, 82, 80, 72, 79);
				Igrac suarez = new Igrac("Luis", "Suarez", ocjeneSuarez, 9);
				dodajIgraca(suarez);
				Ocjene ocjeneMessi = new Ocjene(91, 86, 88, 67, 85, 81, 65, 85);
				Igrac messi = new Igrac("Lionel", "Messi", ocjeneMessi, 10);				
				dodajIgraca(messi);
				Ocjene ocjeneNeymar = new Ocjene(86, 78, 87, 70, 80, 74, 60, 75);
				Igrac neymar = new Igrac("Santos", "Neymar", ocjeneNeymar, 11);
				dodajIgraca(neymar);
				Ocjene ocjeneIniesta = new Ocjene(80, 88, 86, 69, 86, 70, 67, 76);
				Igrac iniesta = new Igrac("Andres", "Iniesta", ocjeneIniesta, 23);
				dodajIgraca(iniesta);
				Ocjene ocjeneXavi = new Ocjene(72, 93, 83, 66, 80, 68, 74, 76);
				Igrac xavi = new Igrac("Hernandez", "Xavi", ocjeneXavi, 8);
				dodajIgraca(xavi);
				Ocjene ocjeneBusquets = new Ocjene(71, 80, 77, 80, 73, 70, 78, 78);
				Igrac busquets = new Igrac("Sergio", "Busquets", ocjeneBusquets, 5);
				dodajIgraca(busquets);
				Ocjene ocjeneAlba = new Ocjene(80, 77, 75, 70, 75, 67, 77, 79);
				Igrac alba = new Igrac("jordi", "Alba", ocjeneAlba, 18);
				dodajIgraca(alba);
				Ocjene ocjeneAlves = new Ocjene(83, 75, 77, 71, 79, 71, 80, 83);
				Igrac alves = new Igrac("Dani", "Alves", ocjeneAlves, 26);
				dodajIgraca(alves);
				Ocjene ocjenePique = new Ocjene(68, 75, 68, 85, 70, 58, 82, 72);
				Igrac pique = new Igrac("Gerard", "Pique", ocjenePique, 3);
				dodajIgraca(pique);
				Ocjene ocjeneMathieu = new Ocjene(76, 72, 67, 82, 73, 50, 77, 76);
				Igrac mathieu = new Igrac("Jeremy", "Mathieu", ocjeneMathieu, 24);
				dodajIgraca(mathieu);
				Ocjene ocjeneStegen = new Ocjene(72, 72, 53, 77, 52, 42, 70, 67);
				Igrac stegen = new Igrac("Marc-Andre", "ter Stegen", ocjeneStegen, 1);
				dodajIgraca(stegen);
						
				//Osoblje kluba
				Osoba predsjednik = new Osoba("Josep", "Bartomeu", "brt@hotmail.com", "predsjednik");
				Osoba trener = new Osoba("Luis", "Enrique", "enr@hotmail.com", "trener");
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
