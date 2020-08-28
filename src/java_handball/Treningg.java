/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_handball;

/**
 *
 * @author Luka
 */
public class Treningg {
    
    int training_id;
    String ime,prezime, drugi , peti, osmi, petnaesti,dvadeset, dvadestdrugi, dvadesetpeti, trideseti;
    
    
    public Treningg (String ime,String prezime,int training_id, String drugi, String peti, String osmi, String petnaesti, String dvadeseti, String dvadesetdrugi, String dvadesetpeti, String trideseti)
    {
        
        this.ime = ime;
        this.prezime = prezime;
        this.training_id = training_id;
        this.drugi = drugi;
        this.peti = peti;
        this.osmi = osmi;
        this.petnaesti= petnaesti;
        this.dvadeset = dvadeseti;
        this.dvadestdrugi = dvadesetdrugi;
        this.dvadesetpeti = dvadesetpeti;
        this.trideseti = trideseti;
      
    }
    
    public String getIme(){
            return ime;
                    }
    
    public String getPrezime(){
            return prezime;
                    }
    
    public int getTraining_id(){
            return training_id;
                    }
    
    public String getDrugi(){
            return drugi;
                    }
    
    public String getPeti(){
            return peti;
                    }
    
    public String getOsmi(){
            return osmi;
                    }
    
    public String getPetnaesti(){
            return petnaesti;
                    }
  
    
    public String getDvadeseti(){
            return dvadeset;
                    }
    
    public String getDvadesetdrugi(){
            return dvadestdrugi;
                    }
    public String getDvadesetipeti(){
            return dvadesetpeti;
                    }
    
    public String getTrideseti(){
            return trideseti;
                    }
}
