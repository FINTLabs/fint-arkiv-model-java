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
import no.fint.model.administrasjon.arkiv.Registrering;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public class JournalpostResource extends Registrering implements FintMainObject, FintLinks {
    // Attributes
    private Long antallVedlegg;
    private java.util.Date dokumentetsDato;
    private java.util.Date forfallsDato;
    private String journalAr;
    @NonNull
    private java.util.Date journalDato;
    private Long journalPostnummer;
    private Long journalSekvensnummer;
    private java.util.Date mottattDato;
    private java.util.Date offentlighetsvurdertDato;
    private java.util.Date sendtDato;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
        
    @JsonIgnore
    public List<Link> getDokumentbeskrivelse() {
        return getLinks().getOrDefault("dokumentbeskrivelse", Collections.emptyList()); 
    }
    public void addDokumentbeskrivelse(Link link) {
        addLink("dokumentbeskrivelse", link);
    }
    @JsonIgnore
    public List<Link> getJournalStatus() {
        return getLinks().getOrDefault("journalStatus", Collections.emptyList()); 
    }
    public void addJournalStatus(Link link) {
        addLink("journalStatus", link);
    }
    @JsonIgnore
    public List<Link> getJournalEnhet() {
        return getLinks().getOrDefault("journalEnhet", Collections.emptyList()); 
    }
    public void addJournalEnhet(Link link) {
        addLink("journalEnhet", link);
    }
    @JsonIgnore
    public List<Link> getJournalPostType() {
        return getLinks().getOrDefault("journalPostType", Collections.emptyList()); 
    }
    public void addJournalPostType(Link link) {
        addLink("journalPostType", link);
    }
    @JsonIgnore
    public List<Link> getMappe() {
        return getLinks().getOrDefault("mappe", Collections.emptyList()); 
    }
    public void addMappe(Link link) {
        addLink("mappe", link);
    }
    @JsonIgnore
    public List<Link> getArkivertAv() {
        return getLinks().getOrDefault("arkivertAv", Collections.emptyList()); 
    }
    public void addArkivertAv(Link link) {
        addLink("arkivertAv", link);
    }
    @JsonIgnore
    public List<Link> getOpprettetAv() {
        return getLinks().getOrDefault("opprettetAv", Collections.emptyList()); 
    }
    public void addOpprettetAv(Link link) {
        addLink("opprettetAv", link);
    }
    @JsonIgnore
    public List<Link> getKorrespondansepart() {
        return getLinks().getOrDefault("korrespondansepart", Collections.emptyList()); 
    }
    public void addKorrespondansepart(Link link) {
        addLink("korrespondansepart", link);
    }
}
