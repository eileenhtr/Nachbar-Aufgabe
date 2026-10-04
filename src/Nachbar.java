import records.RecordAdresse;
import records.RecordName;

import java.util.HashSet;

public class Nachbar {

    private RecordName name;
    private RecordAdresse adresse;

    public Nachbar(String name, String adresse) {
        this.name  = new RecordName(name);
        this.adresse = new RecordAdresse(adresse);
    }


    public String getName() {
        return this.name.toString();
    }

    public RecordAdresse getAdresse() {
        return this.adresse;
    }
}
