package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import metodo.Fauna;
import metodo.Sector;

class SectorTest {

	@Test
	void sectorVulnerableTest() {
		Fauna kevin = new Fauna(1, 30030000);
        Sector r = new Sector(kevin,2);
        assertEquals(r.sectorVulnerable(), true);
	}
	@Test
	void valorSectorTest() {
	Fauna kevin = new Fauna(21, 300);
	Sector R = new Sector(kevin, 2);
	assertEquals(R.valorSector(), 900);
	}
	


}
