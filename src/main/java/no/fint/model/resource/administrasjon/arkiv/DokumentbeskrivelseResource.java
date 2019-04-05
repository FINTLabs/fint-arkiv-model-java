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

import no.fint.model.FintComplexDatatypeObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.resource.administrasjon.arkiv.DokumentobjektResource;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class DokumentbeskrivelseResource implements FintComplexDatatypeObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (dokumentobjekt != null) {
            result.addAll(dokumentobjekt);
        }
        return result;
    }
    private String beskrivelse;
    private Long dokumentnummer;
    @NonNull
    private List<DokumentobjektResource> dokumentobjekt;
    @NonNull
    private List<String> forfatter;
    private Date opprettetDato;
    @NonNull
    private List<String> referanseArkivdel;
    private Date tilknyttetDato;
    @NonNull
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getTilknyttetAv() {
        return getLinks().getOrDefault("tilknyttetAv", Collections.emptyList()); 
    }
    public void addTilknyttetAv(Link link) {
        addLink("tilknyttetAv", link);
    }
    @JsonIgnore
    public List<Link> getOpprettetAv() {
        return getLinks().getOrDefault("opprettetAv", Collections.emptyList()); 
    }
    public void addOpprettetAv(Link link) {
        addLink("opprettetAv", link);
    }
    @JsonIgnore
    public List<Link> getDokumentstatus() {
        return getLinks().getOrDefault("dokumentstatus", Collections.emptyList()); 
    }
    public void addDokumentstatus(Link link) {
        addLink("dokumentstatus", link);
    }
    @JsonIgnore
    public List<Link> getDokumentType() {
        return getLinks().getOrDefault("dokumentType", Collections.emptyList()); 
    }
    public void addDokumentType(Link link) {
        addLink("dokumentType", link);
    }
    @JsonIgnore
    public List<Link> getTilknyttetRegistreringSom() {
        return getLinks().getOrDefault("tilknyttetRegistreringSom", Collections.emptyList()); 
    }
    public void addTilknyttetRegistreringSom(Link link) {
        addLink("tilknyttetRegistreringSom", link);
    }
}
