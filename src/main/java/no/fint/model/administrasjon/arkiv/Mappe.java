// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintAbstractObject;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;
import no.fint.model.administrasjon.arkiv.Partsinformasjon;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Mappe implements FintAbstractObject {
    private Date avsluttetDato;
    private String beskrivelse;
    private @Valid Identifikator mappeId;
    private List<String> noekkelord;
    private String offentligTittel;
    private Date opprettetDato;
    @NotEmpty
    private List<@Valid Partsinformasjon> part;
    @NotNull
    private @Valid Identifikator systemId;
    @NotBlank
    private String tittel;
}
