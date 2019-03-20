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
public class SakspartResource implements FintMainObject, FintLinks {
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
    private Identifikator sakspartId;
    @NonNull
    private String sakspartNavn;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getSaksmappe() {
        return getLinks().getOrDefault("saksmappe", Collections.emptyList()); 
    }
    public void addSaksmappe(Link link) {
        addLink("saksmappe", link);
    }
    @JsonIgnore
    public List<Link> getSakspartRolle() {
        return getLinks().getOrDefault("sakspartRolle", Collections.emptyList()); 
    }
    public void addSakspartRolle(Link link) {
        addLink("sakspartRolle", link);
    }
}
