import java.util.HashSet;

public class NachabrVerwalter {

    HashSet<Nachbar> nachbar;

    public NachabrVerwalter() {
        this.nachbar = new HashSet<>();
    }

    public void create(String name, String Adresse){
        Nachbar nachbar = new Nachbar(name, Adresse);
        this.nachbar.add(nachbar);

    }

    public void read(){
        for(Nachbar nachbar : this.nachbar){
            System.out.println(nachbar.getName() + " " + nachbar.getAdresse());
        }
    }

    public void update(){



    }

}
