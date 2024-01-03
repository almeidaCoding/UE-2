package PistasMultideportivasPadel;

import java.util.concurrent.Semaphore;

public class PadelCourts {
    private int idCourts;
    public static Semaphore [] semaphores = {new Semaphore(4), new Semaphore(4), new Semaphore(4), new Semaphore(4)};
    
    public PadelCourts (int idCourts){
        this.idCourts = idCourts;
    }

    public int getIdCourts() {
        return idCourts;
    }
}