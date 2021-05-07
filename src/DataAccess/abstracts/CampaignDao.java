package DataAccess.abstracts;

import Entities.concretes.Campaign;

import java.util.List;

public interface CampaignDao {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
    Campaign get(int campaignId);
    List<Campaign> getAll();
}
