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
import no.fint.model.resource.administrasjon.arkiv.KorrespondansepartResource;
import no.fint.model.resource.administrasjon.arkiv.MerknadResource;
import no.fint.model.resource.administrasjon.arkiv.PartsinformasjonResource;
import no.fint.model.resource.administrasjon.arkiv.SkjermingResource;

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
        if (korrespondansepart != null) {
            result.addAll(korrespondansepart);
        }
        if (merknad != null) {
            result.addAll(merknad);
        }
        if (part != null) {
            result.addAll(part);
        }
        if (skjerming != null) {
            result.add(skjerming);
        }
        return result;
    }
    private Date arkivertDato;
    private String beskrivelse;
    private List<@Valid DokumentbeskrivelseResource> dokumentbeskrivelse;
    private List<String> forfatter;
    private List<@Valid KorrespondansepartResource> korrespondansepart;
    private List<@Valid MerknadResource> merknad;
    private List<String> nokkelord;
    private String offentligTittel;
    private Date opprettetDato;
    private List<@Valid PartsinformasjonResource> part;
    private List<String> referanseArkivDel;
    private String registreringsId;
    private @Valid SkjermingResource skjerming;
    @NotBlank
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getAdministrativEnhet() {
        return getLinks().getOrDefault("administrativEnhet", Collections.emptyList()); 
    }
    public void addAdministrativEnhet(Link link) {
        addLink("administrativEnhet", link);
    }
    @JsonIgnore
    public List<Link> getArkivdel() {
        return getLinks().getOrDefault("arkivdel", Collections.emptyList()); 
    }
    public void addArkivdel(Link link) {
        addLink("arkivdel", link);
    }
    @JsonIgnore
    public List<Link> getSaksbehandler() {
        return getLinks().getOrDefault("saksbehandler", Collections.emptyList()); 
    }
    public void addSaksbehandler(Link link) {
        addLink("saksbehandler", link);
    }
    @JsonIgnore
    public List<Link> getArkivertAv() {
        return getLinks().getOrDefault("arkivertAv", Collections.emptyList()); 
    }
    public void addArkivertAv(Link link) {
        addLink("arkivertAv", link);
    }
    @JsonIgnore
    public List<Link> getOpprettetAv() {
        return getLinks().getOrDefault("opprettetAv", Collections.emptyList()); 
    }
    public void addOpprettetAv(Link link) {
        addLink("opprettetAv", link);
    }
    @JsonIgnore
    public List<Link> getKlasse() {
        return getLinks().getOrDefault("klasse", Collections.emptyList()); 
    }
    public void addKlasse(Link link) {
        addLink("klasse", link);
    }
}
