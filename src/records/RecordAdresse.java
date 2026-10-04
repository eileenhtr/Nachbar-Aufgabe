package records;

import java.util.Objects;

public record RecordAdresse(String Adresse) {

    public RecordAdresse {
        Objects.requireNonNull(Adresse);
        if(!Adresse.matches("^[A-ZÄÖÜ][A-Za-zÄÖÜäöüß.-]+\\s+[0-9]+,\\s+[0-9]{5}\\s+[A-ZÄÖÜ][A-Za-zÄÖÜäöüß.-]+$")){
            throw new IllegalArgumentException("Keine gültige Adresse!");
        }
    }

    @Override
    public String toString(){
        return this.Adresse;
    }
}
