// Built from tag arkiv

package no.fint.model.resource.administrasjon.arkiv;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class DokumentobjektResources extends AbstractCollectionResources<DokumentobjektResource> {

    public DokumentobjektResources(Collection<DokumentobjektResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<DokumentobjektResource>> getTypeReference() {
        return new TypeReference<List<DokumentobjektResource>>() {};
    }
}
