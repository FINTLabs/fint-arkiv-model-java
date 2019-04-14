// Built from tag arkiv

package no.fint.model.resource.administrasjon.arkiv;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.*;

import no.fint.model.FintAbstractObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import java.util.Date;
import no.fint.model.resource.administrasjon.arkiv.DokumentbeskrivelseResource;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class RegistreringResource implements FintAbstractObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (dokumentbeskrivelse != null) {
            result.addAll(dokumentbeskrivelse);
        }
        return result;
    }
    private Date arkivertDato;
    private String beskrivelse;
    private List<@Valid DokumentbeskrivelseResource> dokumentbeskrivelse;
    private List<String> forfatter;
    private List<String> nokkelord;
    private String offentligTittel;
    private Date opprettetDato;
    private List<String> referanseArkivDel;
    private String registreringsId;
    @NotBlank
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
