public class LimbiStraine extends Curs{

    LimbiStraine(){

    }

    LimbiStraine( String nume, double pret){
        super(nume, pret);
    } 

    @Override
    public String toString(){
        return "Curs LimbiStraine: " + getNume() + "-->> pret-->> " + getPret();       
    }

}