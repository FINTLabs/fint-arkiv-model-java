// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentbeskrivelse implements FintMainObject {
    public enum Relasjonsnavn {
            DOKUMENTSTATUS,
            DOKUMENTTYPE,
            TILKNYTTETAV,
            OPPRETTETAV,
            DOKUMENTOBJEKT,
            TILKNYTTETREGISTRERINGSOM,
            JOURNALPOST
    }

    private String beskrivelse;
    @NonNull
    private Long dokumentnummer;
    @NonNull
    private List<String> forfatter;
    @NonNull
    private java.util.Date opprettetDato;
    @NonNull
    private List<String> referanseArkivdel;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private java.util.Date tilknyttetDato;
    @NonNull
    private String tittel;
}
