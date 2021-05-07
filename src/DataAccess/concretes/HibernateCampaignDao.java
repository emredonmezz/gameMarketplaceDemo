package DataAccess.concretes;

import DataAccess.abstracts.CampaignDao;
import Entities.concretes.Campaign;

import java.util.List;

public class HibernateCampaignDao implements CampaignDao {
    @Override
    public void add(Campaign campaign) {
        System.out.println("Campaign has been added : " + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Campaign has been deleted : " + campaign.getCampaignName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Campaign has been updated : " + campaign.getCampaignName());
    }

    @Override
    public Campaign get(int campaignId) {
        return null;
    }

    @Override
    public List<Campaign> getAll() {
        return null;
    }
}
