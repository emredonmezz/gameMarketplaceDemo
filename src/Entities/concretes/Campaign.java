package Entities.concretes;

public class Campaign {
    int campaignId;
    String campaignName;
    int discount;

    public Campaign(int campaignId, String campaignName, int discount) {
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.discount = discount;
    }

    public int getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(int campaignId) {
        this.campaignId = campaignId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
