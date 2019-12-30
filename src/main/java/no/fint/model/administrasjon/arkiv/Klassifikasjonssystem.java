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
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Klassifikasjonssystem implements FintMainObject {
    public enum Relasjonsnavn {
            KLASSE,
            ARKIVDEL
    }

    private String avsluttetAv;
    private Date avsluttetDato;
    private String beskrivelse;
    private String klassifikasjonstype;
    @NotBlank
    private String opprettetAv;
    @NotNull
    private Date opprettetDato;
    @NotNull
    private @Valid Identifikator systemId;
    @NotBlank
    private String tittel;
}
