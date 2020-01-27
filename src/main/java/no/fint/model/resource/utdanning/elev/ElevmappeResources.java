// Built from tag arkiv

package no.fint.model.resource.utdanning.elev;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class ElevmappeResources extends AbstractCollectionResources<ElevmappeResource> {

    public ElevmappeResources(Collection<ElevmappeResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<ElevmappeResource>> getTypeReference() {
        return new TypeReference<List<ElevmappeResource>>() {};
    }
}
