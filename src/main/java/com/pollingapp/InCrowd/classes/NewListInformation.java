package com.pollingapp.InCrowd.classes;

import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="NewListInformation")
public class NewListInformation {

    @XmlElement
    private String ClubName;
    
    @XmlElement
    private String ClubWebsiteURL;

    @XmlElement
    private List<NewsletterNewsItem> NewsletterNewsItems;


    public NewListInformation() {
    }

    public NewListInformation(String ClubName, String ClubWebsiteURL, List<NewsletterNewsItem> NewsletterNewsItems) {
        this.ClubName = ClubName;
        this.ClubWebsiteURL = ClubWebsiteURL;
        this.NewsletterNewsItems = NewsletterNewsItems;
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

    public List<NewsletterNewsItem> getNewsletterNewsItems() {
        return this.NewsletterNewsItems;
    }

    public void setNewsletterNewsItems(List<NewsletterNewsItem> NewsletterNewsItems) {
        this.NewsletterNewsItems = NewsletterNewsItems;
    }

    public NewListInformation ClubName(String ClubName) {
        this.ClubName = ClubName;
        return this;
    }

    public NewListInformation ClubWebsiteURL(String ClubWebsiteURL) {
        this.ClubWebsiteURL = ClubWebsiteURL;
        return this;
    }

    public NewListInformation NewsletterNewsItems(List<NewsletterNewsItem> NewsletterNewsItems) {
        this.NewsletterNewsItems = NewsletterNewsItems;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof NewListInformation)) {
            return false;
        }
        NewListInformation newListInformation = (NewListInformation) o;
        return Objects.equals(ClubName, newListInformation.ClubName) && Objects.equals(ClubWebsiteURL, newListInformation.ClubWebsiteURL) && Objects.equals(NewsletterNewsItems, newListInformation.NewsletterNewsItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ClubName, ClubWebsiteURL, NewsletterNewsItems);
    }

    @Override
    public String toString() {
        return "{" +
            " ClubName='" + getClubName() + "'" +
            ", ClubWebsiteURL='" + getClubWebsiteURL() + "'" +
            ", NewsletterNewsItems='" + getNewsletterNewsItems() + "'" +
            "}";
    }

}
