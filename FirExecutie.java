import java.util.*;
public class FirExecutie implements Runnable{
    Institutie i = Institutie.getInstance();

    @Override
    public void run(){
        try{
            for(Integer j : i.map.keySet() ){
                System.out.println(i.map.get(j) + "****sunt in total " + i.map.size() + " cursuri");
                
             
                Thread.sleep(3000);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}