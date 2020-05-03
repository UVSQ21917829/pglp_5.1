package fr.uvsq.exercice5_4;

public class FactoryDAO {

	public static DAO<CompositePersonnels> getGroupeDAO() {

		return new GroupeDAO();
	}

	public static DAO<Personnel> getPersonnelDAO() {

		return new PersonnelDAO();
	}

}
