package fr.uvsq.exercice5_4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class personnelDAO implements DAO<Personnel> {

	public Personnel create(Personnel personnel) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fout = new FileOutputStream("personnel.ser") ;
    	ObjectOutputStream out = new ObjectOutputStream(fout) ;
    	out.writeObject(personnel) ; 
    	out.close() ;
		return personnel;
	}

	public Personnel read(Integer id) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Personnel personnel;
		FileInputStream fileInput = new FileInputStream("personnel.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInput);
        
        personnel = (Personnel) objectInputStream.readObject();
  
		return personnel;
	}

	public Personnel update(Personnel obj) throws ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		Personnel personnel=read(obj.getId());
		FileOutputStream fin = new FileOutputStream("personnel.ser") ;
		ObjectOutputStream intn = new ObjectOutputStream(fin) ;
		intn.writeObject(obj) ; 
		intn.close() ;
		return obj;
		
	
	}

	public Personnel delete(Integer id) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout = new FileOutputStream("personnel.ser") ;
    	ObjectOutputStream out = new ObjectOutputStream(fout) ;
    	out.write(null);
    	out.close() ;
		return null;
	}

}
