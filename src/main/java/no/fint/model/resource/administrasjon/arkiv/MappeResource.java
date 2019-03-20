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

import no.fint.model.FintAbstractObject;
import no.fint.model.resource.FintLinks;
import no.fint.model.resource.Link;
import java.util.Date;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class MappeResource implements FintAbstractObject, FintLinks {
    // Attributes
    private Date avsluttetDato;
    private String beskrivelse;
    private Identifikator mappeId;
    @NonNull
    private List<String> noekkelord;
    private String offentligTittel;
    private Date opprettetDato;
    private Identifikator systemId;
    @NonNull
    private String tittel;

    // Relations
    @Getter
    private final Map<String, List<Link>> links = createLinks();
}
