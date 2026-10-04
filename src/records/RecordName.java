package records;

import java.util.Objects;

public record RecordName(String name) {

    public RecordName {
        Objects.requireNonNull(name);
        if(!name.matches("[A-ZÄÖÜ][a-zäöüß]+([ -][A-ZÄÖÜ][a-zäöüß]+){0,2}")){
            throw new IllegalArgumentException("Das muss records.Name + Vornaem sein!!");
        }

    }

    @Override
    public String toString(){
        return this.name;
    }

}
