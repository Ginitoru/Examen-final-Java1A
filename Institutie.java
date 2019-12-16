import java.util.*;
public class Institutie{
    int i = 0;
    Map<Integer,Curs> map = new HashMap<>();
    private static Institutie instance;
                                                           //si la examen am uitat sa fac constructor privat la "Institutie":DDD     
    public static final Institutie getInstance(){
        if(instance == null){
            instance = new Institutie();
        }
        return instance;
    }

    public void adaugaCurs(Curs c) throws PreaMulteCursuriException{
        if(map.size() < 30){
            map.put(i,c);
            i++;
        }else{
            throw new PreaMulteCursuriException ();
        } 

    }

    public void afiseazaCursuri(){
        //for(Integer j : map.keySet()){
        map.forEach( (k, v) -> System.out.println(k + " "+ v));
        //}
    }

    public void stergeCurs(int i){
        System.out.println("S-a sters cursul: " + map.get(i));
        map.remove(i);
    }

    public void afiseazaCursuriProgramare(){
        for(Integer j : map.keySet() ){
            if(map.get(j) instanceof Programare){
                System.out.println(map.get(j));
            }

        
        }

    }
}
