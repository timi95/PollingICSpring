package com.pollingapp.InCrowd.classes;

import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="NewsArticleInformation")
public class NewsArticleInformation {
    

    @XmlElement
    private String ClubName;

    @XmlElement
    private String ClubWebsiteURL;

    @XmlElement
    private NewsArticle NewsArticle;

    public NewsArticleInformation() {
    }

    public NewsArticleInformation(String ClubName, String ClubWebsiteURL, NewsArticle NewsArticle) {
        this.ClubName = ClubName;
        this.ClubWebsiteURL = ClubWebsiteURL;
        this.NewsArticle = NewsArticle;
    }

    public String getClubName() {
        return this.ClubName;
    }

    public void setClubName(String ClubName) {
        this.ClubName = ClubName;
    }

    public String getClubWebsiteURL() {
        return this.ClubWebsiteURL;
    }

    public void setClubWebsiteURL(String ClubWebsiteURL) {
        this.ClubWebsiteURL = ClubWebsiteURL;
    }

    public NewsArticle getNewsArticle() {
        return this.NewsArticle;
    }

    public void setNewsArticle(NewsArticle NewsArticle) {
        this.NewsArticle = NewsArticle;
    }

    public NewsArticleInformation ClubName(String ClubName) {
        this.ClubName = ClubName;
        return this;
    }

    public NewsArticleInformation ClubWebsiteURL(String ClubWebsiteURL) {
        this.ClubWebsiteURL = ClubWebsiteURL;
        return this;
    }

    public NewsArticleInformation NewsArticle(NewsArticle NewsArticle) {
        this.NewsArticle = NewsArticle;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NewsArticleInformation)) {
            return false;
        }
        NewsArticleInformation newsArticleInformation = (NewsArticleInformation) o;
        return Objects.equals(ClubName, newsArticleInformation.ClubName) && Objects.equals(ClubWebsiteURL, newsArticleInformation.ClubWebsiteURL) && Objects.equals(NewsArticle, newsArticleInformation.NewsArticle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ClubName, ClubWebsiteURL, NewsArticle);
    }

    @Override
    public String toString() {
        return "{" +
            " ClubName='" + getClubName() + "'" +
            ", ClubWebsiteURL='" + getClubWebsiteURL() + "'" +
            ", NewsArticle='" + getNewsArticle() + "'" +
            "}";
    }

}
