public abstract class Curs{

    private String nume;
    private double pret;

    Curs(){

    }

    Curs(String nume, double pret){

        this.nume =nume;
        this.pret = pret;

    }
    
    public void setNume(String nume){
        this.nume = nume;
    }

    public void setPret(double pret){
        this.pret = pret;
    }

    
    public String getNume(){
        return this.nume;
    }

    public double getPret(){
        return this.pret;
    }
}