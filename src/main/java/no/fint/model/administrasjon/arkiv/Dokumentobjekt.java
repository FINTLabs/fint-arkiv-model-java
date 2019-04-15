// Built from tag arkiv

package no.fint.model.administrasjon.arkiv;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.*;
import no.fint.model.FintComplexDatatypeObject;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Dokumentobjekt implements FintComplexDatatypeObject {
    public enum Relasjonsnavn {
            OPPRETTETAV,
            REFERANSEDOKUMENTFIL,
            VARIANTFORMAT
    }

    private String filstorrelse;
    private String format;
    private String formatDetaljer;
    private String sjekksum;
    private String sjekksumAlgoritme;
    private Long versjonsummer;
}
