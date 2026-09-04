package metodo;

public class Fauna {
private int cantidadEspecies;
private double valorPromedio;
public Fauna(int cantidadEspecies, double valorPromedio) {
	this.cantidadEspecies = cantidadEspecies ;
	this.valorPromedio = valorPromedio;
}
public int getCantidadEspecies() {
	return cantidadEspecies;
}
public void setCantidadEspecies(int cantidadEspecies) {
	this.cantidadEspecies = cantidadEspecies;
}
public double getValorPromedio() {
	return valorPromedio;
}
public void setValorPromedio(double valorPromedio) {
	this.valorPromedio = valorPromedio;
}

}