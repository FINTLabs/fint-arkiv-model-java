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
public class DokumentobjektResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    private String filstorrelse;
    private String format;
    private String formatDetaljer;
    private String referanseDokumentfil;
    private String sjekksum;
    private String sjekksumAlgoritme;
    private Long versjonsummer;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getOpprettetAv() {
        return getLinks().getOrDefault("opprettetAv", Collections.emptyList()); 
    }
    public void addOpprettetAv(Link link) {
        addLink("opprettetAv", link);
    }
    @JsonIgnore
    public List<Link> getVariantFormat() {
        return getLinks().getOrDefault("variantFormat", Collections.emptyList()); 
    }
    public void addVariantFormat(Link link) {
        addLink("variantFormat", link);
    }
}
