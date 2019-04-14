// Built from tag arkiv

package no.fint.model.resource.kultur.kulturminnevern;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.Collection;
import java.util.List;

import lombok.NoArgsConstructor;
import no.fint.model.resource.AbstractCollectionResources;

@NoArgsConstructor
public class TilskuddFredaHusPrivatEieResources extends AbstractCollectionResources<TilskuddFredaHusPrivatEieResource> {

    public TilskuddFredaHusPrivatEieResources(Collection<TilskuddFredaHusPrivatEieResource> input) {
        super(input);
    }

    @JsonIgnore
    @Deprecated
    @Override
    public TypeReference<List<TilskuddFredaHusPrivatEieResource>> getTypeReference() {
        return new TypeReference<List<TilskuddFredaHusPrivatEieResource>>() {};
    }
}
