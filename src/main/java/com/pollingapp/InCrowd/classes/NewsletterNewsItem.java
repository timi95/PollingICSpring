package com.pollingapp.InCrowd.classes;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;

public class NewsletterNewsItem {

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
    private String ThumbnailImageURL;

    @XmlElement
    private String Title;

    @XmlElement
    private String OptaMatchId;


    public NewsletterNewsItem() {
    }

    public NewsletterNewsItem(String ArticleURL, String NewsArticleID, String PublishDate, String Taxonomies, String TeaserText, String ThumbnailImageURL, String Title, String OptaMatchId) {
        this.ArticleURL = ArticleURL;
        this.NewsArticleID = NewsArticleID;
        this.PublishDate = PublishDate;
        this.Taxonomies = Taxonomies;
        this.TeaserText = TeaserText;
        this.ThumbnailImageURL = ThumbnailImageURL;
        this.Title = Title;
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

    public String getOptaMatchId() {
        return this.OptaMatchId;
    }

    public void setOptaMatchId(String OptaMatchId) {
        this.OptaMatchId = OptaMatchId;
    }

    public NewsletterNewsItem ArticleURL(String ArticleURL) {
        this.ArticleURL = ArticleURL;
        return this;
    }

    public NewsletterNewsItem NewsArticleID(String NewsArticleID) {
        this.NewsArticleID = NewsArticleID;
        return this;
    }

    public NewsletterNewsItem PublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
        return this;
    }

    public NewsletterNewsItem Taxonomies(String Taxonomies) {
        this.Taxonomies = Taxonomies;
        return this;
    }

    public NewsletterNewsItem TeaserText(String TeaserText) {
        this.TeaserText = TeaserText;
        return this;
    }

    public NewsletterNewsItem ThumbnailImageURL(String ThumbnailImageURL) {
        this.ThumbnailImageURL = ThumbnailImageURL;
        return this;
    }

    public NewsletterNewsItem Title(String Title) {
        this.Title = Title;
        return this;
    }

    public NewsletterNewsItem OptaMatchId(String OptaMatchId) {
        this.OptaMatchId = OptaMatchId;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NewsletterNewsItem)) {
            return false;
        }
        NewsletterNewsItem newsletterNewsItem = (NewsletterNewsItem) o;
        return Objects.equals(ArticleURL, newsletterNewsItem.ArticleURL) && Objects.equals(NewsArticleID, newsletterNewsItem.NewsArticleID) && Objects.equals(PublishDate, newsletterNewsItem.PublishDate) && Objects.equals(Taxonomies, newsletterNewsItem.Taxonomies) && Objects.equals(TeaserText, newsletterNewsItem.TeaserText) && Objects.equals(ThumbnailImageURL, newsletterNewsItem.ThumbnailImageURL) && Objects.equals(Title, newsletterNewsItem.Title) && Objects.equals(OptaMatchId, newsletterNewsItem.OptaMatchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ArticleURL, NewsArticleID, PublishDate, Taxonomies, TeaserText, ThumbnailImageURL, Title, OptaMatchId);
    }

    @Override
    public String toString() {
        return "{" +
            " ArticleURL='" + getArticleURL() + "'" +
            ", NewsArticleID='" + getNewsArticleID() + "'" +
            ", PublishDate='" + getPublishDate() + "'" +
            ", Taxonomies='" + getTaxonomies() + "'" +
            ", TeaserText='" + getTeaserText() + "'" +
            ", ThumbnailImageURL='" + getThumbnailImageURL() + "'" +
            ", Title='" + getTitle() + "'" +
            ", OptaMatchId='" + getOptaMatchId() + "'" +
            "}";
    }

}
