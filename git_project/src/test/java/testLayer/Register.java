package testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;


public class Register extends Base {
	@Test
	public void veirfy_register_with_mandatory_fields() {
		
	
	page.Myacc();
	page.Reg();
	
	
	reg.first_name("Sangram");
	reg.Lastname("patil");
	reg.input_mail("sangram@gmail.com");
	reg.telephone("8947637564");
	reg.password("sangram123");
	reg.cnfrmpass("sangram123");
	reg.btn();
	reg.plc();
	reg.conti();
//	String Expected =""
	Assert.assertEquals(false, null);

	}
	@Test
	public void veirfy_register_with_invalid_fields() {
		
		
		page.Myacc();
		page.Reg();
		
		
		reg.first_name("Sangram");
		reg.Lastname("patil");
		reg.input_mail("sangram@com");
		reg.telephone("8947637564");
		reg.password("sangram123");
		reg.cnfrmpass("sangram123");
		reg.btn();
		reg.plc();
		reg.conti();

		}
	

}
