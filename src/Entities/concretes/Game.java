package Entities.concretes;
import Entities.concretes.Campaign;

public class Game {
    int gameId;
    String gameName;
    int categoryId;
    String categoryName;
    String description;
    String publisherName;
    String developerName;
    String releaseDate;
    double price;
    double campaignPrice;

    public Game(int gameId, String gameName, int categoryId, String categoryName,
                String description, String publisherName, String developerName,
                String releaseDate, double price) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.description = description;
        this.publisherName = publisherName;
        this.developerName = developerName;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public void setDeveloperName(String developerName) {
        this.developerName = developerName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCampaignPrice() {
        return this.campaignPrice;
    }
}
