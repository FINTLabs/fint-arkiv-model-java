// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentbeskrivelse implements FintMainObject {
    public enum Relasjonsnavn {
            TILKNYTTETAV,
            OPPRETTETAV,
            DOKUMENTSTATUS,
            DOKUMENTTYPE,
            DOKUMENTOBJEKT,
            TILKNYTTETREGISTRERINGSOM,
            JOURNALPOST
    }

    private String beskrivelse;
    private Long dokumentnummer;
    @NonNull
    private List<String> forfatter;
    private Date opprettetDato;
    @NonNull
    private List<String> referanseArkivdel;
    private Identifikator systemId;
    private Date tilknyttetDato;
    @NonNull
    private String tittel;
}
