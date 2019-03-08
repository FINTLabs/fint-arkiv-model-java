// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Adresse;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Sakspart implements FintMainObject {
    public enum Relasjonsnavn {
            SAKSMAPPE,
            SAKSPARTROLLE
    }

    private Adresse adresse;
    private Kontaktinformasjon kontaktinformasjon;
    @NonNull
    private String kontaktperson;
    private String sakspartId;
    @NonNull
    private String sakspartNavn;
}
