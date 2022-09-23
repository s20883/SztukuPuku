package Artwork;

import java.util.List;

public class Attributes {

    private String YearFrom;

    private String YearTo;

    private String Date;

    private String InvNo;

    private String PlainDescription;

    private String locale;

    private Category Category;

    private List<String> Descriptions;

    private List<String> Keywords;

    private List<String> DocumentationOtherSources;

    private List<SubtitleItems> Subtitle;
    public static class SubtitleItems{
        private String Subtitle;
        public SubtitleItems(String Subtitle){
            this.Subtitle = Subtitle;
        }
        public String getSubtitle() {
            return Subtitle;
        }
    }

    private List<TitleItems> Title;
    public static class TitleItems{
        private String Title;
        public TitleItems(String Title){
            this.Title = Title;
        }
        public String getTitle() {
            return Title;
        }
    }

    private List<Dimensions3DItems> Dimensions3D;
    public static class Dimensions3DItems{
        private Integer Height;
        private Integer Width;
        private Integer Length;
        public Dimensions3DItems(Integer Height, Integer Width, Integer Length){
            this.Height = Height;
            this.Width = Width;
            this.Length = Length;
        }
        public Integer getHeight() {
            return Height;
        }
        public Integer getWidth() {
            return Width;
        }
        public Integer getLength() {
            return Length;
        }
    }

    private List<Dimensions2DItems> Dimensions2D;
    public static class Dimensions2DItems{
        private Integer Height;
        private Integer Width;
        public Dimensions2DItems(Integer Height, Integer Width){
            this.Height = Height;
            this.Width = Width;
        }
        public Integer getHeight() {
            return Height;
        }
        public Integer getWidth() {
            return Width;
        }
    }

    private List<String> DimensionsTime;

    private List<String> DimensionsText;

    private List<String> Material;

    private List<MaterialTechniquesItems> MaterialTechniques;
    public static class MaterialTechniquesItems{
        private String MaterialTechnique;
        public MaterialTechniquesItems(String MaterialTechnique){
            this.MaterialTechnique = MaterialTechnique;
        }
        public String getMaterialTechnique() {
            return MaterialTechnique;
        }
    }

    private List<String> Technique;

    private List<String> localizations;

    public Attributes(String yearFrom, String yearTo, String date, String invNo, String plainDescription, String locale, Artwork.Category category, List<String> descriptions, List<String> keywords, List<String> documentationOtherSources, List<SubtitleItems> subtitle) {
        YearFrom = yearFrom;
        YearTo = yearTo;
        Date = date;
        InvNo = invNo;
        PlainDescription = plainDescription;
        this.locale = locale;
        Category = category;
        Descriptions = descriptions;
        Keywords = keywords;
        DocumentationOtherSources = documentationOtherSources;
        Subtitle = subtitle;
    }

    public String getYearFrom() {
        return YearFrom;
    }

    public String getYearTo() {
        return YearTo;
    }

    public String getDate() {
        return Date;
    }

    public String getInvNo() {
        return InvNo;
    }

    public String getPlainDescription() {
        return PlainDescription;
    }

    public String getLocale() {
        return locale;
    }

    public Artwork.Category getCategory() {
        return Category;
    }
}
