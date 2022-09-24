package Artwork;

import java.util.List;

public class Data {

    private String type;

    private String id;

    private Attributes attributes;

    private Relationships relationships;

    private Links links;


    public Data(String type, String id, Attributes attributes, Relationships relationships, Links links) {
        this.type = type;
        this.id = id;
        this.attributes = attributes;
        this.relationships = relationships;
        this.links = links;
    }

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public Links getLinks() {
        return links;
    }

    @Override
    public String toString() {
        return "\n\t\tData{" +
                "\n\t\t\ttype='" + type + '\'' +
                "\n\t\t\tid='" + id + '\'' +
                "\n\t\t\tattributes=" + attributes +
                "\n\t\t\trelationships=" + relationships +
                "\n\t\t\tlinks=" + links +
                "\n\t\t}";
    }
}
