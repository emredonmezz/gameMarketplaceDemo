package Business.abstracts;
import Entities.concretes.Campaign;
import Entities.concretes.Customer;

public interface CampaignService {
    void add(Campaign campaign);
    void delete(Campaign campaign);
    void update(Campaign campaign);
}
