// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;
import java.util.Date;
import no.fint.model.administrasjon.arkiv.Registrering;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Journalpost extends Registrering implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            JOURNALENHET,
            JOURNALSTATUS,
            JOURNALPOSTTYPE,
            ARKIVERTAV,
            OPPRETTETAV,
            KORRESPONDANSEPART
    }

    private Long antallVedlegg;
    private Date dokumentetsDato;
    private Date forfallsDato;
    private String journalAr;
    private Date journalDato;
    private Long journalPostnummer;
    private Long journalSekvensnummer;
    private Date mottattDato;
    private Date offentlighetsvurdertDato;
    private Date sendtDato;
}
