package fr.uvsq.exercice5_4;

public interface DAO <T>{
	//crud
	public T create(T obj);
    public T read(Integer id);
    public T update(T obj);
    public T delete(Integer id);
	

}
