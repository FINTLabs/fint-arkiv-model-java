// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.NonNull;
import java.util.List;
import no.fint.model.FintMainObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentobjekt implements FintMainObject {
    public enum Relasjonsnavn {
            VARIANTFORMAT,
            OPPRETTETAV,
            DOKUMENTBESKRIVELSE
    }

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
}
