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

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.felles.kompleksedatatyper.AdresseResource;
import no.fint.model.felles.kompleksedatatyper.Kontaktinformasjon;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class KorrespondansepartResource implements FintMainObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (adresse != null) {
            result.add(adresse);
        }
        return result;
    }
    private AdresseResource adresse;
    private Kontaktinformasjon kontaktinformasjon;
    private String kontaktperson;
    private String korrespondansepartNavn;
    private Identifikator systemId;

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
    public List<Link> getSaksbehandler() {
        return getLinks().getOrDefault("saksbehandler", Collections.emptyList()); 
    }
    public void addSaksbehandler(Link link) {
        addLink("saksbehandler", link);
    }
    @JsonIgnore
    public List<Link> getKorrespondanseparttype() {
        return getLinks().getOrDefault("korrespondanseparttype", Collections.emptyList()); 
    }
    public void addKorrespondanseparttype(Link link) {
        addLink("korrespondanseparttype", link);
    }
    @JsonIgnore
    public List<Link> getRegistrering() {
        return getLinks().getOrDefault("registrering", Collections.emptyList()); 
    }
    public void addRegistrering(Link link) {
        addLink("registrering", link);
    }
}
