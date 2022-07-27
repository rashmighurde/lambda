package AllPojos;

import lombok.Data;

import java.util.List;

@Data
public class Pojo {
    private int accuracy;
    private String name;
    private String phoneNumbers;
    private String address;
    private String website;
    private String language;
    private List<String> types;
    private location location;
}
