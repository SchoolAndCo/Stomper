package types;

public class Student {
    private Integer id;
    private String name;
    private String birthdate;
    private String dday;
    private Subject[] subjects;

    public Student() {
        // Default constructor
    }

    public Student(Integer id, String name, String birthdate, String dday) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.dday = dday;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getDday() {
        return dday;
    }

    public boolean updateField(String field, String value) {
        switch (field.toLowerCase()) {
            case "name":
                this.name = value;
                return true;
            case "birthdate":
                this.birthdate = value;
                return true;
            case "dday":
                this.dday = value;
                return true;
            default:
                return false; // Field not recognized
        }
    }
}
