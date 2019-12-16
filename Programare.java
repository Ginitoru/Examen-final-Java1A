public class Programare extends Curs{
    
Programare(){

}    
    
Programare( String nume, double pret){
    super(nume, pret);

} 

@Override
public String toString(){
    return "Curs Programare: " + getNume() + "-->>pret-->> " + getPret();

}

   
}