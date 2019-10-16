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
public class ArkivdelResource implements FintMainObject, FintLinks {
    // Attributes
    @NotNull
    private @Valid Identifikator systemId;
    @NotBlank
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getRegistrering() {
        return getLinks().getOrDefault("registrering", Collections.emptyList()); 
    }
    public void addRegistrering(Link link) {
        addLink("registrering", link);
    }
    @JsonIgnore
    public List<Link> getMappe() {
        return getLinks().getOrDefault("mappe", Collections.emptyList()); 
    }
    public void addMappe(Link link) {
        addLink("mappe", link);
    }
}
