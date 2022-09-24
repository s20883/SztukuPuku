package Artwork;

public class Category {
    private String Name;
    public Category(String Name){
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\t\tCategory{" +
                "\n\t\t\t\t\t\tName='" + Name + '\'' +
                "\n\t\t\t\t\t}";
    }
}
