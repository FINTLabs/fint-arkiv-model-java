// Built from tag arkiv

package no.fint.model.resource.administrasjon.arkiv;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import java.util.Collections;
import java.util.List;
import java.util.Map;

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
    @NonNull
    private List<DokumentbeskrivelseResource> dokumentbeskrivelse;
    @NonNull
    private List<String> forfatter;
    @NonNull
    private List<String> nokkelord;
    private String offentligTittel;
    private Date opprettetDato;
    @NonNull
    private List<String> referanseArkivDel;
    private String registreringsId;
    @NonNull
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
