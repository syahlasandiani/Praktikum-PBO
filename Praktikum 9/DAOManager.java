/*  Nama File   : DAOManager.java
 *  Deskripsi   : pengelola DAO dalam program
 *  Pembuat     : Syahla Sandiani / 24060123130066
 *  Tanggal     : 15 Mei 2025 */

public class DAOManager {
    private PersonDAO personDAO;
    
    public void setPersonDAO(PersonDAO personDAO){
        this.personDAO = personDAO;
    }
    
    public PersonDAO getPersonDAO(){
        return this.personDAO;
    }
}
