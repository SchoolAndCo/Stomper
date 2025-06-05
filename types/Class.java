package types;

public class Class {
    private Integer id;
    private String name;

    public Class() {
        // Default constructor
    }

    public Class(Integer id, String name, String description, String teacher) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public boolean updateField(String field, String value) {
        switch (field.toLowerCase()) {
            case "name":
                this.name = value;
                return true;
            default:
                return false; // Field not recognized
        }
    }
}
