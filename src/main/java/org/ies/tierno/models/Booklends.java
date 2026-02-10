package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Booklends implements Comparable<Booklends> {
    private String isbn;
    private String localDate;
    private String nif;

    @Override
    public int compareTo(Booklends o) {
        int compare = this.localDate.compareTo(o.localDate);
        if (compare == 0) {
            compare = this.nif.compareTo(o.nif);
        }
        return compare;
    }
}
