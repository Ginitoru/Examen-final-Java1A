import java.util.*;
public class Ex{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        Institutie in = Institutie.getInstance();

        
        try{
            while(true){
                System.out.println("COMANDA:");
                String s = sc.nextLine();
                String s1[] = s.split(" ");

                switch(s1[0].toLowerCase().trim()){

                    case "l":
                    LimbiStraine l = new LimbiStraine();     // se adauga instanta limbi straine
                    l.setNume(s1[1]);
                    l.setPret(Double.parseDouble(s1[2]));
                    Institutie.getInstance().adaugaCurs(l);
                    break;

                    case "p":
                    Programare p = new Programare();        // se adauga instanta programe
                    p.setNume(s1[1]);
                    p.setPret(Double.parseDouble(s1[2]));
                    in.adaugaCurs(p);
                    break;

                    case "afisare":                         // se afiseaza toate cursurile
                    Institutie.getInstance().afiseazaCursuri();
                    break;

                    case "sterge" :                        // se sterge un curs in functie de index
                    Institutie.getInstance().stergeCurs(Integer.parseInt(s1[1]));
                    break;

                    case "exit":                           // se iese din program
                    System.out.println("SE INCHIDE PROGRAMUL.....");
                    System.exit(0);
                    break;

                    case "programare":                   // afiseaza cursurile de programare
                    in.afiseazaCursuriProgramare();
                    break;

                    case "thread":                      // dau drumul la thread pt afisare cursuri
                    FirExecutie f = new FirExecutie();
                    Thread th = new Thread(f);
                    th.start();
                    break;

                    
                    default:
                    System.out.println("Ai gresit comanda baiatu' meu...mai incearca odata..:DD");

                }

        
            }
        }catch(PreaMulteCursuriException e){
            System.out.println(e.getMessage());
        }
    }
}