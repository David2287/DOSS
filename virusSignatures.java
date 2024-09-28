public class VirusSignature {
    private String name;
    private String description;
    private String signature;

    public VirusSignature(String name, String description, String signature) {
        this.name = name;
        this.description = description;
        this.signature = signature;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}