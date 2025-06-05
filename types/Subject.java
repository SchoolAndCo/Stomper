package types;

public class Subject {
    private Integer id;
    private String name;
    private String description;
    private String teacher;

    public Subject() {
        // Default constructor
    }

    public Subject(Integer id, String name, String description, String teacher) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.teacher = teacher;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getTeacher() {
        return teacher;
    }

    public boolean updateField(String field, String value) {
        switch (field.toLowerCase()) {
            case "name":
                this.name = value;
                return true;
            case "description":
                this.description = value;
                return true;
            case "teacher":
                this.teacher = value;
                return true;
            default:
                return false; // Field not recognized
        }
    }
}
