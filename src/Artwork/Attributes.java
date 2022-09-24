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

    public Attributes(String yearFrom, String yearTo, String date, String invNo, String plainDescription, String locale, Artwork.Category category, List<String> descriptions, List<String> keywords, List<String> documentationOtherSources, List<SubtitleItems> subtitle, List<TitleItems> title, List<Dimensions3DItems> dimensions3D, List<Dimensions2DItems> dimensions2D, List<String> dimensionsTime, List<String> dimensionsText, List<String> material, List<MaterialTechniquesItems> materialTechniques, List<String> technique, List<String> localizations) {
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
        Title = title;
        Dimensions3D = dimensions3D;
        Dimensions2D = dimensions2D;
        DimensionsTime = dimensionsTime;
        DimensionsText = dimensionsText;
        Material = material;
        MaterialTechniques = materialTechniques;
        Technique = technique;
        this.localizations = localizations;
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

    public List<String> getDescriptions() {
        return Descriptions;
    }

    public List<String> getKeywords() {
        return Keywords;
    }

    public List<String> getDocumentationOtherSources() {
        return DocumentationOtherSources;
    }

    public List<SubtitleItems> getSubtitle() {
        return Subtitle;
    }

    public List<TitleItems> getTitle() {
        return Title;
    }

    public List<Dimensions3DItems> getDimensions3D() {
        return Dimensions3D;
    }

    public List<Dimensions2DItems> getDimensions2D() {
        return Dimensions2D;
    }

    public List<String> getDimensionsTime() {
        return DimensionsTime;
    }

    public List<String> getDimensionsText() {
        return DimensionsText;
    }

    public List<String> getMaterial() {
        return Material;
    }

    public List<MaterialTechniquesItems> getMaterialTechniques() {
        return MaterialTechniques;
    }

    public List<String> getTechnique() {
        return Technique;
    }

    public List<String> getLocalizations() {
        return localizations;
    }

    @Override
    public String toString() {
        return "\n\t\t\t\tAttributes" +
                "\n\t\t\t\t\tYearFrom='" + YearFrom + '\'' +
                "\n\t\t\t\t\tYearTo='" + YearTo + '\'' +
                "\n\t\t\t\t\tDate='" + Date + '\'' +
                "\n\t\t\t\t\tInvNo='" + InvNo + '\'' +
                "\n\t\t\t\t\tPlainDescription='" + PlainDescription + '\'' +
                "\n\t\t\t\t\tlocale='" + locale + '\'' +
                "\n\t\t\t\t\tCategory=" + Category +
                "\n\t\t\t\t\tDescriptions=" + Descriptions +
                "\n\t\t\t\t\tKeywords=" + Keywords +
                "\n\t\t\t\t\tDocumentationOtherSources=" + DocumentationOtherSources +
                "\n\t\t\t\t\tSubtitle=" + Subtitle +
                "\n\t\t\t\t\tTitle=" + Title +
                "\n\t\t\t\t\tDimensions3D=" + Dimensions3D +
                "\n\t\t\t\t\tDimensions2D=" + Dimensions2D +
                "\n\t\t\t\t\tDimensionsTime=" + DimensionsTime +
                "\n\t\t\t\t\tDimensionsText=" + DimensionsText +
                "\n\t\t\t\t\tMaterial=" + Material +
                "\n\t\t\t\t\tMaterialTechniques=" + MaterialTechniques +
                "\n\t\t\t\t\tTechnique=" + Technique +
                "\n\t\t\t\t\tlocalizations=" + localizations +
                "\n\t\t\t\t}";
    }
}
