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
    public void testApp() throws IOException
    {
    	Personnel p1= new Personnel.Builder(0, "aa", "jj",LocalDate.parse("1997-08-01",DateTimeFormatter.ISO_DATE)).build();

    	
    	FileOutputStream fout = new FileOutputStream("data.ser") ;
    	ObjectOutputStream out = new ObjectOutputStream(fout) ;
    	out.writeObject(p1) ; 
    	out.close() ;
        
    }
}
