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
import no.fint.model.administrasjon.arkiv.Korrespondanse;
import no.fint.model.administrasjon.arkiv.Merknad;
import no.fint.model.administrasjon.arkiv.Partsinformasjon;
import no.fint.model.administrasjon.arkiv.Skjerming;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class Registrering implements FintAbstractObject {
    public enum Relasjonsnavn {
            ADMINISTRATIVENHET,
            ARKIVDEL,
            SAKSBEHANDLER,
            ARKIVERTAV,
            OPPRETTETAV,
            KLASSE
    }

    private Date arkivertDato;
    private String beskrivelse;
    private List<@Valid Dokumentbeskrivelse> dokumentbeskrivelse;
    private List<String> forfatter;
    private List<@Valid Korrespondanse> korrespondansepart;
    private List<@Valid Merknad> merknad;
    private List<String> nokkelord;
    private String offentligTittel;
    private Date opprettetDato;
    private List<@Valid Partsinformasjon> part;
    private List<String> referanseArkivDel;
    private String registreringsId;
    private @Valid Skjerming skjerming;
    @NotBlank
    private String tittel;
}
