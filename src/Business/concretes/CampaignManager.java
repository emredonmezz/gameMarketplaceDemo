package Business.concretes;

import Business.abstracts.CampaignService;
import DataAccess.concretes.HibernateCampaignDao;
import Entities.concretes.Campaign;

public class CampaignManager implements CampaignService {

    public CampaignManager(HibernateCampaignDao hibernateCampaignDao){

    }
    @Override
    public void add(Campaign campaign) {
        System.out.println("The campaign has been created   : " + campaign.getCampaignName());
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("The campaign has been deleted   : " + campaign.getCampaignName());
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("The campaign has been updated   : " + campaign.getCampaignName());
    }
}
