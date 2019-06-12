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

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class PartsinformasjonResource implements FintComplexDatatypeObject, FintLinks {

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getPart() {
        return getLinks().getOrDefault("part", Collections.emptyList()); 
    }
    public void addPart(Link link) {
        addLink("part", link);
    }
    @JsonIgnore
    public List<Link> getPartRolle() {
        return getLinks().getOrDefault("partRolle", Collections.emptyList()); 
    }
    public void addPartRolle(Link link) {
        addLink("partRolle", link);
    }
}