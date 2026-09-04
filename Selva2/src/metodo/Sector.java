package metodo;

public class Sector {
private Fauna fauna;
private double superficie;
public Sector(Fauna fauna, double superficie) {
	this.fauna = fauna ;
	this.superficie = superficie ;
	
}
public boolean sectorVulnerable() {
	if(fauna.getCantidadEspecies() < 2 && fauna.getValorPromedio() >3000000) {
		return true;
	} else return false;
}
public double valorSector() {
	return (superficie * 300)+fauna.getValorPromedio();
}
public Fauna getFauna() {
	return fauna;
}
public void setFauna(Fauna fauna) {
	this.fauna = fauna;
}
public double getSuperficie() {
	return superficie;
}
public void setSuperficie(double superficie) {
	this.superficie = superficie;
}
}
