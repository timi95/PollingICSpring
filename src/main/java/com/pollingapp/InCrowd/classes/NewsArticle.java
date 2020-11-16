package com.pollingapp.InCrowd.classes;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;

public class NewsArticle {
    
    @XmlElement
    private String ArticleURL;

    @XmlElement
    private String NewsArticleID;

    @XmlElement
    private String PublishDate;

    @XmlElement
    private String Taxonomies;

    @XmlElement
    private String TeaserText;

    @XmlElement
    private String Subtitle;

    @XmlElement
    private String ThumbnailImageURL;

    @XmlElement
    private String Title;

    @XmlElement
    private String BodyText;

    @XmlElement
    private String GalleryImageURLs;

    @XmlElement
    private String VideoURL;

    @XmlElement
    private String OptaMatchId;


    public NewsArticle() {
    }

    public NewsArticle(String ArticleURL, String NewsArticleID, String PublishDate, String Taxonomies, String TeaserText, String Subtitle, String ThumbnailImageURL, String Title, String BodyText, String GalleryImageURLs, String VideoURL, String OptaMatchId) {
        this.ArticleURL = ArticleURL;
        this.NewsArticleID = NewsArticleID;
        this.PublishDate = PublishDate;
        this.Taxonomies = Taxonomies;
        this.TeaserText = TeaserText;
        this.Subtitle = Subtitle;
        this.ThumbnailImageURL = ThumbnailImageURL;
        this.Title = Title;
        this.BodyText = BodyText;
        this.GalleryImageURLs = GalleryImageURLs;
        this.VideoURL = VideoURL;
        this.OptaMatchId = OptaMatchId;
    }

    public String getArticleURL() {
        return this.ArticleURL;
    }

    public void setArticleURL(String ArticleURL) {
        this.ArticleURL = ArticleURL;
    }

    public String getNewsArticleID() {
        return this.NewsArticleID;
    }

    public void setNewsArticleID(String NewsArticleID) {
        this.NewsArticleID = NewsArticleID;
    }

    public String getPublishDate() {
        return this.PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getTaxonomies() {
        return this.Taxonomies;
    }

    public void setTaxonomies(String Taxonomies) {
        this.Taxonomies = Taxonomies;
    }

    public String getTeaserText() {
        return this.TeaserText;
    }

    public void setTeaserText(String TeaserText) {
        this.TeaserText = TeaserText;
    }

    public String getSubtitle() {
        return this.Subtitle;
    }

    public void setSubtitle(String Subtitle) {
        this.Subtitle = Subtitle;
    }

    public String getThumbnailImageURL() {
        return this.ThumbnailImageURL;
    }

    public void setThumbnailImageURL(String ThumbnailImageURL) {
        this.ThumbnailImageURL = ThumbnailImageURL;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getBodyText() {
        return this.BodyText;
    }

    public void setBodyText(String BodyText) {
        this.BodyText = BodyText;
    }

    public String getGalleryImageURLs() {
        return this.GalleryImageURLs;
    }

    public void setGalleryImageURLs(String GalleryImageURLs) {
        this.GalleryImageURLs = GalleryImageURLs;
    }

    public String getVideoURL() {
        return this.VideoURL;
    }

    public void setVideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
    }

    public String getOptaMatchId() {
        return this.OptaMatchId;
    }

    public void setOptaMatchId(String OptaMatchId) {
        this.OptaMatchId = OptaMatchId;
    }

    public NewsArticle ArticleURL(String ArticleURL) {
        this.ArticleURL = ArticleURL;
        return this;
    }

    public NewsArticle NewsArticleID(String NewsArticleID) {
        this.NewsArticleID = NewsArticleID;
        return this;
    }

    public NewsArticle PublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
        return this;
    }

    public NewsArticle Taxonomies(String Taxonomies) {
        this.Taxonomies = Taxonomies;
        return this;
    }

    public NewsArticle TeaserText(String TeaserText) {
        this.TeaserText = TeaserText;
        return this;
    }

    public NewsArticle Subtitle(String Subtitle) {
        this.Subtitle = Subtitle;
        return this;
    }

    public NewsArticle ThumbnailImageURL(String ThumbnailImageURL) {
        this.ThumbnailImageURL = ThumbnailImageURL;
        return this;
    }

    public NewsArticle Title(String Title) {
        this.Title = Title;
        return this;
    }

    public NewsArticle BodyText(String BodyText) {
        this.BodyText = BodyText;
        return this;
    }

    public NewsArticle GalleryImageURLs(String GalleryImageURLs) {
        this.GalleryImageURLs = GalleryImageURLs;
        return this;
    }

    public NewsArticle VideoURL(String VideoURL) {
        this.VideoURL = VideoURL;
        return this;
    }

    public NewsArticle OptaMatchId(String OptaMatchId) {
        this.OptaMatchId = OptaMatchId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NewsArticle)) {
            return false;
        }
        NewsArticle newsArticle = (NewsArticle) o;
        return Objects.equals(ArticleURL, newsArticle.ArticleURL) && Objects.equals(NewsArticleID, newsArticle.NewsArticleID) && Objects.equals(PublishDate, newsArticle.PublishDate) && Objects.equals(Taxonomies, newsArticle.Taxonomies) && Objects.equals(TeaserText, newsArticle.TeaserText) && Objects.equals(Subtitle, newsArticle.Subtitle) && Objects.equals(ThumbnailImageURL, newsArticle.ThumbnailImageURL) && Objects.equals(Title, newsArticle.Title) && Objects.equals(BodyText, newsArticle.BodyText) && Objects.equals(GalleryImageURLs, newsArticle.GalleryImageURLs) && Objects.equals(VideoURL, newsArticle.VideoURL) && Objects.equals(OptaMatchId, newsArticle.OptaMatchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ArticleURL, NewsArticleID, PublishDate, Taxonomies, TeaserText, Subtitle, ThumbnailImageURL, Title, BodyText, GalleryImageURLs, VideoURL, OptaMatchId);
    }

    @Override
    public String toString() {
        return "{" +
            " ArticleURL='" + getArticleURL() + "'" +
            ", NewsArticleID='" + getNewsArticleID() + "'" +
            ", PublishDate='" + getPublishDate() + "'" +
            ", Taxonomies='" + getTaxonomies() + "'" +
            ", TeaserText='" + getTeaserText() + "'" +
            ", Subtitle='" + getSubtitle() + "'" +
            ", ThumbnailImageURL='" + getThumbnailImageURL() + "'" +
            ", Title='" + getTitle() + "'" +
            ", BodyText='" + getBodyText() + "'" +
            ", GalleryImageURLs='" + getGalleryImageURLs() + "'" +
            ", VideoURL='" + getVideoURL() + "'" +
            ", OptaMatchId='" + getOptaMatchId() + "'" +
            "}";
    }

}
