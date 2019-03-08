// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintAbstractObject;
import java.util.Date;
import no.fint.model.administrasjon.arkiv.Mappe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public abstract class Saksmappe extends Mappe implements FintAbstractObject {
    private String saksaar;
    @NonNull
    private Date saksdato;
    @NonNull
    private String sakssekvensnummer;
    @NonNull
    private Date utlaantDato;
}
