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
public abstract class Registrering implements FintAbstractObject {
    @NonNull
    private Date arkivertDato;
    private String beskrivelse;
    @NonNull
    private List<String> forfatter;
    @NonNull
    private List<String> nokkelord;
    private String offentligTittel;
    @NonNull
    private Date opprettetDato;
    @NonNull
    private List<String> referanseArkivDel;
    @NonNull
    private String registreringsId;
    @NonNull
    private Identifikator systemId;
    @NonNull
    private String tittel;
}
