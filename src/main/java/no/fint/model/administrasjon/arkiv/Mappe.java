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
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Mappe implements FintAbstractObject {
    private Date avsluttetDato;
    private String beskrivelse;
    private Identifikator mappeId;
    @NonNull
    private List<String> noekkelord;
    private String offentligTittel;
    private Date opprettetDato;
    private Identifikator systemId;
    @NonNull
    private String tittel;
}
