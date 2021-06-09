package TestUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {

//	public static final String BASEURL = "http://213.133.139.190/BNS-SOP/";
//	public static final String BASEURL = "http://172.16.2.71:9194/#/"; //version 1.0
//	public static final String BASEURL = "http://10.0.0.44:9192/#/"; //version 2.0
	public static final String BASEURL = "http://10.0.0.44:9196/#/"; //version 3.0 & 3.1

//	public static final String ContactPersonName= "Test Name";

	public static final String CustomerName ="Tushar Patel";
	public static final String CustomerAddress="kunj vila society laxmipura ,Baroda";
	public static final String County="India";
	public static final String CustomerAccountNumber="Test_reg-2021";
	public static final String City="Vadodara";
	public static final String PostCode="388350";
	public static final String ContactPersonName= "Test Name";
	public static final String ContactPersonNumber="8989898989";
	public static final String FaxNumber="363636";
	public static final String Email="Tusharpatel@luxshtech.com";

	public static final String USERNAME = "E123456";
	public static final String PASSWORD = "112245998";

	//--------------------------------------------Parth-Constant--------------
//	public static final String ADMIN_USERNAME = "psptester@gmail.com"; //""Emp39"; //"Emp10";  //Emp188
//	public static final String AGENT_USERNAME =  "Emp41"; //"Emp13"; //Emp190
//	public static final String MANAGER_USERNAME =  "test.manager@spam4.me"; //"Emp40"; //"Emp11"; //Emp189
//	public static final String DEPARTMENTAL_USERNAME =  "Emp42"; //"Emp18";
//	public static final String VALID_PASSWORD =  "123456"; //"11112222";
//
//	public static final String INVALIDUSERNAME = "!@$123~&";
//	public static final String INVALIDPASSWORD = "!@$123~&";
//
//	public static final String EMPTYDATA = "";

	//--------------------------------------------Updated Constants--------------------------------------------
	public static final String ADMIN_USERNAME = "test.manager@spam4.me"; //added in ver 3.1
	public static final String AGENT_USERNAME =  "hp_agent@spam4.me"; //added in ver 3.1
	public static final String CUSTOMER_USERNAME =  "hp_cx@spam4.me"; //added in ver 3.1
	public static final String CUSTOMER_USER =  "hp_cx_user@spam4.me"; //added in ver 3.1
	public static final String CUSTOMER_USER_ADMIN =  "hp_cx_admin@spam4.me"; //added in ver 3.1
	public static final String MANAGER_USERNAME =  "test.manager@spam4.me"; //added in ver 3.1
	public static final String DEPARTMENTAL_USERNAME =  "Emp42"; //"Emp18";
	public static final String VALID_PASSWORD =  "11112222";

	public static final String INVALID_USERNAME = "!@$123~&";
	public static final String INVALID_PASSWORD = "!@$123~&";

	public static final String EMPTY_DATA = "";

	public static final String PROJECT_PATH =  "D:\\HARDIK\\Testing Purpose\\intelliJ Testing\\CsHDv3.1"; //"D:\\HARDIK\\BnS\\Automation\\CSHD"; //"D:\\A_Parth\\Automation Practice\\HPAT\\CxHelpDesk";

	public static final String FILE_UPLOAD_PATH = PROJECT_PATH + "\\src\\main\\java\\helper\\testingPurpose\\Test PNG-1.png";
	public static final String UPDATED_FILE_UPLOAD_PATH = PROJECT_PATH + "\\src\\main\\java\\helper\\testingPurpose\\Pdf_test.html";

	public static final String IMPORT_EMP_PATH = PROJECT_PATH +"\\src\\main\\java\\helper\\Import\\EmployeeUserMaster.csv";
	public static final String IMPORT_GROUP_PATH = PROJECT_PATH + "\\src\\main\\java\\helper\\Import\\GroupMaster.csv";
	public static final String IMPORT_CUST_PATH = PROJECT_PATH + "\\src\\main\\java\\helper\\Import\\CustomerMaster.csv";
	public static final String IMPORT_CUSTUSER_PATH = PROJECT_PATH + "\\src\\main\\java\\helper\\Import\\CustomerUserMaster.csv";

	public static final Date date = new Date();

	public static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
	public static String strDate = formatter.format(date);
	public static String tempData = "TempData";
}
