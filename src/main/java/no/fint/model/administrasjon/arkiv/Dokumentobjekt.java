// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;
import no.fint.model.felles.kompleksedatatyper.Identifikator;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentobjekt implements FintMainObject {
    public enum Relasjonsnavn {
            OPPRETTETAV,
            VARIANTFORMAT,
            DOKUMENTBESKRIVELSE
    }

    private String filstorrelse;
    private String format;
    private String formatDetaljer;
    private String referanseDokumentfil;
    private String sjekksum;
    private String sjekksumAlgoritme;
    private Identifikator systemId;
    private Long versjonsummer;
}
