package fr.uvsq.exercice5_4;

import static org.junit.Assert.assertTrue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
    @Test
    public void testPersonnel() throws IOException
    {
    	Personnel p1= new Personnel.Builder(0, "aa", "jj",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
    	
    	FileOutputStream fout = new FileOutputStream("perso.ser") ;
    	ObjectOutputStream out = new ObjectOutputStream(fout) ;
    	out.writeObject(p1) ; 
    	out.close() ;
        
    }
    @Test
    public void testCompositePersonnel() throws IOException
    {
    	Personnel p1= new Personnel.Builder(0, "aa", "jj",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();
    	Personnel p2= new Personnel.Builder(5, "e", "f",LocalDate.parse("1990-09-01",DateTimeFormatter.ISO_DATE)).build();
    	Personnel p3=new Personnel.Builder(6, "g", "h",LocalDate.parse("1993-07-07",DateTimeFormatter.ISO_DATE)).build();
    	CompositePersonnels groupe1 = new CompositePersonnels(1);
    	CompositePersonnels groupe2 = new CompositePersonnels(3);
    	groupe1.addPersonnel(p1);
    	groupe1.addPersonnel(p2);
    	groupe1.addPersonnel(p3);
    	groupe1.addPersonnel(groupe2);  
    	FileOutputStream fout = new FileOutputStream("compo.ser") ;
    	ObjectOutputStream out = new ObjectOutputStream(fout) ;
    	out.writeObject(groupe1) ; 
    	out.close();
    	
        
    }
   
}
