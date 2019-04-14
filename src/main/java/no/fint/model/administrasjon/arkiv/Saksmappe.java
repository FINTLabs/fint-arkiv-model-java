// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintAbstractObject;
import no.fint.model.administrasjon.arkiv.Registrering;
import no.fint.model.administrasjon.arkiv.Journalpost;
import java.util.Date;
import no.fint.model.administrasjon.arkiv.Mappe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public abstract class Saksmappe extends Mappe implements FintAbstractObject {
    @NonNull
    private List<Registrering> arkivnotat;
    @NonNull
    private List<Journalpost> journalpost;
    private String saksaar;
    private Date saksdato;
    private String sakssekvensnummer;
    private Date utlaantDato;
}
