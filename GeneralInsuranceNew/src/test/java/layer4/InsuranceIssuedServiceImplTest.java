package layer4;

import java.sql.Date;

import org.junit.jupiter.api.Test;

import layer2.InsuranceIssued;

public class InsuranceIssuedServiceImplTest
{
	InsuranceIssuedService insuranceService = new InsuranceIssuedServiceImpl();

	 
	@Test
	public void insuranceAddTest() 
	{
		InsuranceIssued insuranceIssued = new InsuranceIssued();
		
		//insuranceIssued.setPolicyId(107);
		insuranceIssued.setStartDate(Date.valueOf("2023-03-21"));
		insuranceIssued.setExpiryDate(Date.valueOf("2024-03-20"));
		insuranceIssued.setInsuranceTypeId(1);	
		 
	}
	
	@Test 
	public void insuranceModifyTest() {
	InsuranceIssued insuranceIssued = new InsuranceIssued();
	
	insuranceIssued.setPolicyId(106);
	insuranceIssued.setStartDate(Date.valueOf("2042-03-21"));
	insuranceIssued.setExpiryDate(Date.valueOf("2043-03-20"));
	insuranceIssued.setInsuranceTypeId(1);
	 
	
}

}
