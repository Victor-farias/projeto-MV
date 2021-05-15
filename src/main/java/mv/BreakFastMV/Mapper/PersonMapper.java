package mv.BreakFastMV.Mapper;

import mv.BreakFastMV.dto.request.PersonDTO;
import mv.BreakFastMV.entities.Person;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PersonMapper {


    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);

}
