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

import no.fint.model.FintAbstractObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import no.fint.model.administrasjon.arkiv.Registrering;
import no.fint.model.resource.administrasjon.arkiv.JournalpostResource;
import java.util.Date;
import no.fint.model.administrasjon.arkiv.Mappe;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper=true)
@ToString(callSuper=true)
public abstract class SaksmappeResource extends Mappe implements FintAbstractObject, FintLinks {
    // Attributes
    @JsonIgnore
    @Override
    public List<FintLinks> getNestedResources() {
        List<FintLinks> result = FintLinks.super.getNestedResources();
        if (journalpost != null) {
            result.addAll(journalpost);
        }
        return result;
    }
    private List<@Valid Registrering> arkivnotat;
    private List<@Valid JournalpostResource> journalpost;
    private String saksaar;
    private Date saksdato;
    private String sakssekvensnummer;
    private Date utlaantDato;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
