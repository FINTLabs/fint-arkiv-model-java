// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.administrasjon.arkiv.Registrering;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Journalpost extends Registrering implements FintMainObject {
    public enum Relasjonsnavn {
            DOKUMENTBESKRIVELSE,
            JOURNALSTATUS,
            JOURNALENHET,
            JOURNALPOSTTYPE,
            MAPPE,
            ARKIVERTAV,
            OPPRETTETAV,
            KORRESPONDANSEPART
    }

    private Long antallVedlegg;
    private java.util.Date dokumentetsDato;
    private java.util.Date forfallsDato;
    private String journalAr;
    @NonNull
    private java.util.Date journalDato;
    private Long journalPostnummer;
    private Long journalSekvensnummer;
    private java.util.Date mottattDato;
    private java.util.Date offentlighetsvurdertDato;
    private java.util.Date sendtDato;
}
