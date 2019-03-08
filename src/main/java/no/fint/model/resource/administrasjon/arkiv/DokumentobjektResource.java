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

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class DokumentobjektResource implements FintMainObject, FintLinks {
    // Attributes
    @NonNull
    private String filstorrelse;
    @NonNull
    private String format;
    private String formatDetaljer;
    @NonNull
    private String referanseDokumentfil;
    @NonNull
    private String sjekksum;
    @NonNull
    private String sjekksumAlgoritme;
    @NonNull
    private Long versjonsummer;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getVariantFormat() {
        return getLinks().getOrDefault("variantFormat", Collections.emptyList()); 
    }
    public void addVariantFormat(Link link) {
        addLink("variantFormat", link);
    }
    @JsonIgnore
    public List<Link> getOpprettetAv() {
        return getLinks().getOrDefault("opprettetAv", Collections.emptyList()); 
    }
    public void addOpprettetAv(Link link) {
        addLink("opprettetAv", link);
    }
    @JsonIgnore
    public List<Link> getDokumentbeskrivelse() {
        return getLinks().getOrDefault("dokumentbeskrivelse", Collections.emptyList()); 
    }
    public void addDokumentbeskrivelse(Link link) {
        addLink("dokumentbeskrivelse", link);
    }
}
