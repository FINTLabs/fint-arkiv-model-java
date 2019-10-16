// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Tilgang implements FintMainObject {
    public enum Relasjonsnavn {
            ADMINISTRATIVENHET,
            ARKIVDEL,
            ARKIVRESSURS,
            ROLLE
    }

    @NotNull
    private @Valid Identifikator systemId;
    @NotBlank
    private String tittel;
}
