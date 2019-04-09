// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.constraints.*;
import no.fint.model.FintAbstractObject;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Mappe implements FintAbstractObject {
    private Date avsluttetDato;
    private String beskrivelse;
    private String mappeId;
    private List<String> noekkelord;
    private String offentligTittel;
    private Date opprettetDato;
    @NotBlank
    private String tittel;
}
