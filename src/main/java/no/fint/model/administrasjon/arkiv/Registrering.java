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
import no.fint.model.administrasjon.arkiv.Dokumentbeskrivelse;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Registrering implements FintAbstractObject {
    private Date arkivertDato;
    private String beskrivelse;
    private List<@Valid Dokumentbeskrivelse> dokumentbeskrivelse;
    private List<String> forfatter;
    private List<String> nokkelord;
    private String offentligTittel;
    private Date opprettetDato;
    private List<String> referanseArkivDel;
    private String registreringsId;
    @NotBlank
    private String tittel;
}
