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

import no.fint.model.FintMainObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ArkivressursResource implements FintMainObject, FintLinks {
    // Attributes
    private @Valid Identifikator kildesystemId;
    private @Valid Identifikator systemId;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getPersonalressurs() {
        return getLinks().getOrDefault("personalressurs", Collections.emptyList()); 
    }
    public void addPersonalressurs(Link link) {
        addLink("personalressurs", link);
    }
    @JsonIgnore
    public List<Link> getAutorisasjon() {
        return getLinks().getOrDefault("autorisasjon", Collections.emptyList()); 
    }
    public void addAutorisasjon(Link link) {
        addLink("autorisasjon", link);
    }
    @JsonIgnore
    public List<Link> getTilgang() {
        return getLinks().getOrDefault("tilgang", Collections.emptyList()); 
    }
    public void addTilgang(Link link) {
        addLink("tilgang", link);
    }
}
