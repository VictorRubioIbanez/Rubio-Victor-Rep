package block13mongodb.person.infraestructure.controller.outputDto;


import lombok.Data;

@Data
public class OutputPersonDto {

    private  String name;
    private String surname;
    private int age;
    private String city;
}
