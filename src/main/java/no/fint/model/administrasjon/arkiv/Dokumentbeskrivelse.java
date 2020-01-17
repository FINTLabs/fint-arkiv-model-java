// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.administrasjon.arkiv.Dokumentobjekt;
import java.util.Date;
import no.fint.model.administrasjon.arkiv.Partsinformasjon;
import no.fint.model.administrasjon.arkiv.Skjerming;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentbeskrivelse implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            TILKNYTTETAV,
            OPPRETTETAV,
            DOKUMENTTYPE,
            DOKUMENTSTATUS,
            TILKNYTTETREGISTRERINGSOM
    }

    private String beskrivelse;
    private Long dokumentnummer;
    private List<@Valid Dokumentobjekt> dokumentobjekt;
    private List<String> forfatter;
    private Date opprettetDato;
    private List<@Valid Partsinformasjon> part;
    private List<String> referanseArkivdel;
    private @Valid Skjerming skjerming;
    private Date tilknyttetDato;
    @NotBlank
    private String tittel;
}
