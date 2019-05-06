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
public class KorrespondanseResource implements FintComplexDatatypeObject, FintLinks {

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getKorrespondansepart() {
        return getLinks().getOrDefault("korrespondansepart", Collections.emptyList()); 
    }
    public void addKorrespondansepart(Link link) {
        addLink("korrespondansepart", link);
    }
    @JsonIgnore
    public List<Link> getKorrespondanseparttype() {
        return getLinks().getOrDefault("korrespondanseparttype", Collections.emptyList()); 
    }
    public void addKorrespondanseparttype(Link link) {
        addLink("korrespondanseparttype", link);
    }
}
