package block7crudvalidation.Entity;

import lombok.Data;

import java.io.Serializable;

/**
 * A DTO for the {@link Person} entity
 */
@Data
public class OutuputPersonDto implements Serializable {
    private final Long id;
    private final String users;
    private final String name;
    private final String surname;
    private final String company_email;
    private final String personal_email;
    private final String city;
    private final Boolean active;
}