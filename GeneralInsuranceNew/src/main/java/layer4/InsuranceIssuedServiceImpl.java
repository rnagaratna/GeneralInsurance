package layer4;

import java.util.List;

import layer2.InsuranceIssued;
import layer3.InsuranceIssuedDAO;
import layer3.InsuranceIssuedDAOImpl;

 


public class InsuranceIssuedServiceImpl implements InsuranceIssuedService {
	
	InsuranceIssuedDAO insurance=new InsuranceIssuedDAOImpl();
	
     
    
	@Override
	public void saveInsuranceIssued(InsuranceIssued i)
	{
		// TODO Auto-generated method stub
		 
		List<InsuranceIssued> insurances=insurance.selectAllInsuranceIssued();
				 
	}

	@Override
	public void updateInsuranceIssued(InsuranceIssued i) {
		// TODO Auto-generated method stub
		insurance.updateInsuranceIssued(i);
		
		
		
	}

	@Override
	public List<InsuranceIssued> getInsuranceIssued() {
		// TODO Auto-generated method stub
		List<InsuranceIssued> insuranceIssuedList=insurance.selectAllInsuranceIssued();
		return insuranceIssuedList;
	}

	 
 

	 

	 

}
