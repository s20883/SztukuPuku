package Artwork;

public class ArtworkItem {
    private Data data;

    private Meta meta;

    public ArtworkItem(Data data, Meta meta) {
        this.data = data;
        this.meta = meta;
    }

    public Data getData() {
        return data;
    }

    public Meta getMeta() {
        return meta;
    }

    @Override
    public String toString() {
        return "ArtworkItem" +
                "\n\tdata= " + data +
                "\n\tmeta= " + meta +
                "\n}";
    }
}
