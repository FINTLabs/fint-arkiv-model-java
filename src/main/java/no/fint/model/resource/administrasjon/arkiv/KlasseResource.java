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
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class KlasseResource implements FintMainObject, FintLinks {
    // Attributes
    private String avsluttetAv;
    private Date avsluttetDato;
    private String beskrivelse;
    @NotNull
    private @Valid Identifikator klasseId;
    private List<String> noekkelord;
    @NotBlank
    private String opprettetAv;
    @NotNull
    private Date opprettetDato;
    @NotNull
    private @Valid Identifikator systemId;
    @NotBlank
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getUnderklasse() {
        return getLinks().getOrDefault("underklasse", Collections.emptyList()); 
    }
    public void addUnderklasse(Link link) {
        addLink("underklasse", link);
    }
    @JsonIgnore
    public List<Link> getKlassifikasjonssystem() {
        return getLinks().getOrDefault("klassifikasjonssystem", Collections.emptyList()); 
    }
    public void addKlassifikasjonssystem(Link link) {
        addLink("klassifikasjonssystem", link);
    }
}
