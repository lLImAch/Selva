package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import metodo.Empresa;
import metodo.Fauna;
import metodo.Sector;

class EmpresaTest {

	
	void sectoresVulnerablesTest() {
		Fauna kevin = new Fauna(1, 300000000);
		Sector R = new Sector(kevin, 0);
		Fauna kevi = new Fauna(242, 30000);
		Sector Rn = new Sector(kevi, 0);
		ArrayList<Sector> sectores = new ArrayList<Sector>();
		ArrayList<Sector> esperado = new ArrayList<Sector>();
		esperado.add(R);
		sectores.add(R);
		sectores.add(Rn);
		Empresa y = new Empresa(sectores);
		assertEquals(y.sectoresVulnerables(), esperado);
	}
	void sectorConMasEspeciesTest() {
		Fauna kevin = new Fauna(1, 300000000);
		Sector R = new Sector(kevin, 0);
		Fauna kevi = new Fauna(242, 30000);
		Sector Rn = new Sector(kevi, 0);
		ArrayList<Sector> sectores = new ArrayList<Sector>();
		sectores.add(R);
		sectores.add(Rn);
		Empresa y = new Empresa(sectores);
        assertEquals(y.sectorConMasEspecies(), Rn);
	}
	@Test
	void sumaDeValorDeTodoLosSectoresTest() {
		Fauna kevin = new Fauna(1, 30);
		Sector R = new Sector(kevin, 0);
		Fauna kevi = new Fauna(242, 30);
		Sector Rn = new Sector(kevi, 0);
		ArrayList<Sector> sectores = new ArrayList<Sector>();
		sectores.add(R);
		sectores.add(Rn);
		Empresa y = new Empresa(sectores);
		assertEquals(y.sumaDeValorDeTodoLosSectores(), 60);
	}

}
