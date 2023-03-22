package layer4;

import java.sql.Date;
import java.util.List;

import layer2.InsuranceIssued;
import layer2.InsuranceType;

public interface InsuranceIssuedService {
	 void saveInsuranceIssued(InsuranceIssued i);
	 void updateInsuranceIssued(InsuranceIssued i);
	 
	 List<InsuranceIssued> getInsuranceIssued();
	 
	
}
 