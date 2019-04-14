// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.administrasjon.arkiv.Dokumentobjekt;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentbeskrivelse implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            TILKNYTTETAV,
            OPPRETTETAV,
            DOKUMENTTYPE,
            DOKUMENTSTATUS,
            TILKNYTTETREGISTRERINGSOM
    }

    private String beskrivelse;
    private Long dokumentnummer;
    @NonNull
    private List<Dokumentobjekt> dokumentobjekt;
    @NonNull
    private List<String> forfatter;
    private Date opprettetDato;
    @NonNull
    private List<String> referanseArkivdel;
    private Date tilknyttetDato;
    @NonNull
    private String tittel;
}
