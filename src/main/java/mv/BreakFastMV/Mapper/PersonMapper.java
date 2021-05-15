package mv.BreakFastMV.Mapper;

import mv.BreakFastMV.dto.request.PersonDTO;
import mv.BreakFastMV.entities.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {


    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

}
