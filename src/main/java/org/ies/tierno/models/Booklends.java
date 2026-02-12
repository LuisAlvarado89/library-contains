package org.ies.tierno.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Booklends implements Comparable<Booklends> {
    private String isbn;
    private LocalDate date;
    private String nif;

    @Override
    public int compareTo(Booklends o) {
        int compare = this.date.compareTo(o.date);
        if (compare == 0) {
            compare = this.nif.compareTo(o.nif);
        }
        return compare;
    }
}
