// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.administrasjon.arkiv.Saksmappe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class Sak extends Saksmappe implements FintMainObject {
    public enum Relasjonsnavn {
            JOURNALENHET,
            ADMINISTRATIVENHET,
            SAKSANSVARLIG,
            SAKSPART,
            SAKSSTATUS,
            AVSLUTTETAV,
            OPPRETTETAV
    }

}