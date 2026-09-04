package metodo;

import java.util.ArrayList;

public class Empresa {
private ArrayList<Sector> sectores;
public Empresa(ArrayList<Sector> sectores) {
	this.sectores= sectores;
}
public void agregarSector(Sector s) {
	sectores.add(s);
}
public ArrayList<Sector> sectoresVulnerables() {
	ArrayList<Sector> sectoresVulnerables = new ArrayList<Sector>();
	for(Sector s : sectores) {
		if(s.sectorVulnerable()) {
			sectoresVulnerables.add(s);
		}
	} return sectoresVulnerables;
}
public Sector sectorConMasEspecies() {
	Sector j = sectores.get(0);
	for(Sector s : sectores) {
		if(s.getFauna().getCantidadEspecies() > j.getFauna().getCantidadEspecies()) {
			j = s;
		}
	} return j;
}
public double sumaDeValorDeTodoLosSectores() {
	double u=0;
	for(Sector s : sectores) {
		u+=s.valorSector();
	} return u;
}
public ArrayList<Sector> getSectores() {
	return sectores;
}

public void setSectores(ArrayList<Sector> sectores) {
	this.sectores = sectores;
}

}
