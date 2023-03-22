package layer3;

import java.sql.Date;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import layer2.InsuranceIssued;
import layer2.InsuranceType;


public class DAOImplTest {

	

	@Test
	public void testAllInsuranceIssued()
	{
		System.out.println("started DAO testing...");
		
		InsuranceIssuedDAO insuranceDao = new InsuranceIssuedDAOImpl();
		
	    Assertions.assertTrue(insuranceDao!=null);
		
		List<InsuranceIssued> insuranceIssuedList=insuranceDao.selectAllInsuranceIssued();
	    Assertions.assertTrue(insuranceIssuedList.size() > 0 );
		
		for (InsuranceIssued insuranceIssued : insuranceIssuedList) {
			System.out.println("InsuranceIssued : "+insuranceIssued);
		}
	
	}
	
	@Test
	public void testLoadSingleInsuranceIssued()
	{
		System.out.println("started DAO testing...");
		
		InsuranceIssuedDAO insuranceDao = new InsuranceIssuedDAOImpl();
		
	    Assertions.assertTrue(insuranceDao!=null);
		
		InsuranceIssued insurance=insuranceDao.selectInsuranceIssued(101);
	    Assertions.assertTrue(insurance!=null );
		
		System.out.println("InsuranceIssued : "+insurance);
	
	}
	
	@Test
	public void testAddSingleInsuranceIssued()
	{
		System.out.println("started DAO testing...");
		
		InsuranceIssuedDAO insuranceDao = new InsuranceIssuedDAOImpl();	
	    Assertions.assertTrue(insuranceDao!=null);
		
		InsuranceIssued insurance=new InsuranceIssued();
	    Assertions.assertTrue(insurance!=null);
	
		//insurance.setPolicyId(107);
		insurance.setStartDate(Date.valueOf("2023-03-21"));
		insurance.setExpiryDate(Date.valueOf("2024-03-20"));
		insurance.setInsuranceTypeId(2);
		
		System.out.println("InsuranceIssued : "+insurance);
		insuranceDao.insertInsuranceIssued(insurance);
		System.out.println("InsuranceIssued added....");
	}
	
	@Test
	public void testUpdateSingleInsuranceIssued()
	{
		System.out.println("started DAO testing...");
		
		InsuranceIssuedDAO insuranceDao = new InsuranceIssuedDAOImpl();	
	    Assertions.assertTrue(insuranceDao!=null);
		
		InsuranceIssued insurance=new InsuranceIssued();
	    Assertions.assertTrue(insurance!=null);
	
		insurance.setPolicyId(106);
		insurance.setStartDate(Date.valueOf("2022-10-25"));
		insurance.setExpiryDate(Date.valueOf("2022-10-24"));
		insurance.setInsuranceTypeId(2);
		
		System.out.println("InsuranceIssued : "+insurance);
		insuranceDao.updateInsuranceIssued(insurance);
		System.out.println("InsuranceIssued updated....");
	}
	
	@Test
	public void testDeleteSingleInsuranceIssued()
	{
		System.out.println("started DAO testing...");
		
		InsuranceIssuedDAO insuranceDao = new InsuranceIssuedDAOImpl();	
	    Assertions.assertTrue(insuranceDao!=null);
		
		insuranceDao.deleteInsuranceIssued(108);
		System.out.println("InsuranceIssued deleted....");
	}

	

	
	
	
	
	
	
	

	@Test
	public void testAllInsuranceType()
	{
		System.out.println("started DAO testing...");
		
		InsuranceTypeDAO insuranceDao = new InsuranceTypeDAOImpl();
		
	    Assertions.assertTrue(insuranceDao!=null);
		
		List<InsuranceType> insuranceTypeList=insuranceDao.selectAllInsuranceType();
	    Assertions.assertTrue(insuranceTypeList.size() > 0 );
		
		for (InsuranceType insuranceType : insuranceTypeList) {
			System.out.println("InsuranceIssued : "+insuranceType);
		}
	
	}
	
	@Test
	public void testLoadSingleInsuranceType()
	{
		System.out.println("started DAO testing...");
		
		InsuranceTypeDAO insuranceDao = new InsuranceTypeDAOImpl();
		
	    Assertions.assertTrue(insuranceDao!=null);
		
		InsuranceType insurance=insuranceDao.selectInsuranceType(1);
	    Assertions.assertTrue(insurance!=null );
		
		System.out.println("InsuranceIssued : "+insurance);
	
	}
	
	
	
	
	
	
	
	
}

