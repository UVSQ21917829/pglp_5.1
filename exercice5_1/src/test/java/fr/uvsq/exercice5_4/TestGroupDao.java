package fr.uvsq.exercice5_4;

import static org.junit.Assert.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class TestGroupDao {

	@Test
	public void testCreat() throws IOException {
		GroupeDAO goupdao = new GroupeDAO();
		Personnel p1= new Personnel.Builder(13, "aa", "jj",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
		CompositePersonnels groupe= new CompositePersonnels(1);
		groupe.addPersonnel(p1);
		goupdao.create(groupe);
		
		
	}

}
