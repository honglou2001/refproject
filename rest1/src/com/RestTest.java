/**
 * @author Glan.duanyj
 * @date 2014-05-12
 * @project rest_demo
 */
package com;

import java.util.HashMap;

import com.ucpaas.restDemo.client.AbsRestClient;
import com.ucpaas.restDemo.client.JsonReqClient;
import com.ucpaas.restDemo.client.XmlReqClient;

public class RestTest {
	private String accountSid;
	private String authToken;
	
	public String getAccountSid() {
		return accountSid;
	}
	public void setAccountSid(String accountSid) {
		this.accountSid = accountSid;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	static AbsRestClient InstantiationRestAPI(boolean enable) {
		if(enable) {
			return new JsonReqClient();
		} else {
			return new XmlReqClient();
		}
	}
	public static void testFindAccount(boolean json,String accountSid,String authToken){
		try {
			String result=InstantiationRestAPI(json).findAccoutInfo(accountSid, authToken);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static String testCreateClient(boolean json,String accountSid,String authToken,String appId,String clientName
			,String chargeType,String charge,String mobile){
		String result = "";
		try {
			result=InstantiationRestAPI(json).createClient(accountSid, authToken, appId, clientName, chargeType, charge,mobile);
//			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	public static String testfindClients(boolean json,String accountSid,String authToken,String appId,String start
			,String limit){
		String result= "";
		try {
			result=InstantiationRestAPI(json).findClients(accountSid, authToken, appId, start, limit);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	public static void testfindClientByNbr(boolean json,String accountSid,String authToken,String clientNumber,String appId){
		try {
			String result=InstantiationRestAPI(json).findClientByNbr(accountSid, authToken, clientNumber,appId);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void testCloseClient(boolean json,String accountSid,String authToken,String clientNumber,String appId){
		try {
			String result=InstantiationRestAPI(json).closeClient(accountSid, authToken, clientNumber,appId);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static String testChargeClient(boolean json,String accountSid,String authToken,String clientNumber,
			String chargeType,String charge,String appId){
		String result ="";
		try {
			result=InstantiationRestAPI(json).charegeClient(accountSid, authToken, clientNumber, chargeType, charge,appId);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	public static void testBillList(boolean json,String accountSid,String authToken,String appId,String date){
		try {
			String result=InstantiationRestAPI(json).billList(accountSid, authToken, appId, date);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void testClientBillList(boolean json,String accountSid,String authToken,String appId,String clientNumber,String date){
		try {
			String result=InstantiationRestAPI(json).clientBillList(accountSid, authToken, appId, clientNumber, date);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static String testCallback(boolean json,String accountSid,String authToken,String appId,String fromClient,String to,String toSerNum){
		try {
			String result=InstantiationRestAPI(json).callback(accountSid, authToken, appId, fromClient, to,toSerNum);
			System.out.println("Response content is: " + result);
			return result;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	public static void testVoiceCode(boolean json,String accountSid,String authToken,String appId,String to,String verifyCode){
		try {
			String result=InstantiationRestAPI(json).voiceCode(accountSid, authToken, appId, to, verifyCode);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static String testTemplateSMS(boolean json,String accountSid,String authToken,String appId,String templateId,String to,String param){
		String result = "";
		try {
			result=InstantiationRestAPI(json).templateSMS(accountSid, authToken, appId, templateId, to, param);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	public static String testfindClientByMobile(boolean json,String accountSid,String authToken,String mobile,String appId){
		String result = "";
		try {
			result=InstantiationRestAPI(json).findClientByMobile(accountSid, authToken, mobile, appId);
			System.out.println("Response content is: " + result);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return result;
	}
	/**
	 * 娴嬭瘯璇存槑 鍙傛暟椤哄簭锛岃鍙傜収鍚勫叿浣撴柟娉曞弬鏁板悕绉�
	 * 鍙傛暟鍚嶇О鍚箟锛岃鍙傝�rest api 鏂囨。
	 * @author Glan.duanyj
	 * @date 2014-06-30
	 * @param args[]
	 * @return void
	 * @method main
	 */
	public static void main(String[] args1) {
		
		//http://docs.ucpaas.com/doku.php
		//sales@wearme.cc 
		//wear123456
//		String accountid = "ab9abe2cacfc9a5a2829f2222993018a";
//		String token = "91b6bc5e40148c2a74335d2b730b8c2c";
//		String appid = "a8c88624ad064474a59225609832c505";
		
		//075561355202
		
		
		HashMap<String, String> clientmap = new HashMap<String, String>();
		clientmap.put("18058149508", "68520027654483");
		clientmap.put("13713975317", "68520027660803");
		
		String[] args={"11","json","ab9abe2cacfc9a5a2829f2222993018a","91b6bc5e40148c2a74335d2b730b8c2c",
				"a8c88624ad064474a59225609832c505","68520027660803","075561355202","","","","",""};
		String method=args[0];
		boolean json=true;
		if (args[1].equals("xml")) {
			json=false;
		}
		if (method.equals("1")) {
			//testFindAccount(json,args[2],args[3]);
			testFindAccount(json,"ab9abe2cacfc9a5a2829f2222993018a","91b6bc5e40148c2a74335d2b730b8c2c");
			
		}else if (method.equals("2")) {
			//testCreateClient(json, args[2],args[3], args[4], args[5], args[6], args[7], args[8]);
			
			String[] args11={"2","json","ab9abe2cacfc9a5a2829f2222993018a","91b6bc5e40148c2a74335d2b730b8c2c",
					"a8c88624ad064474a59225609832c505","13713975317","1","1","13713975317","","",""};
			
			testCreateClient(json, args11[2],args11[3], args11[4], args11[5], args11[6], args11[7], args11[8]);
			
		}else if (method.equals("3")) {
			String[] args11={"2","json","ab9abe2cacfc9a5a2829f2222993018a","91b6bc5e40148c2a74335d2b730b8c2c",
					"a8c88624ad064474a59225609832c505","13713975317","1","1","13713975317","","",""};
			
			testfindClients(json, args11[2],args11[3], args11[4], args11[5], args11[6]);
		}else if (method.equals("4")) {
			
			String[] args11={"2","json","ab9abe2cacfc9a5a2829f2222993018a","91b6bc5e40148c2a74335d2b730b8c2c",
					"13713975317","a8c88624ad064474a59225609832c505","13713975317","1","1","13713975317","","",""};
			
			testfindClientByNbr(json,args11[2],args11[3], args11[4], args11[5]);
		}else if (method.equals("5")) {
			testCloseClient(json, args[2],args[3], args[4], args[5]);
		}else if (method.equals("6")) {
			
			
			String accountid = "ab9abe2cacfc9a5a2829f2222993018a";
			String token = "91b6bc5e40148c2a74335d2b730b8c2c";
			String appid = "a8c88624ad064474a59225609832c505";
			//  chargeType 0 充值；1 回收。 
			testChargeClient(true, accountid,token, "68520027654483", "0", "2", appid);
			
			//testChargeClient(json, args[2],args[3], args[4], args[5], args[6], args[7]);
		}else if (method.equals("7")) {
			
			String accountid = "ab9abe2cacfc9a5a2829f2222993018a";
			String token = "91b6bc5e40148c2a74335d2b730b8c2c";
			String appid = "a8c88624ad064474a59225609832c505";
			
			testBillList(true,accountid, token,appid, "20150801");
		}else if (method.equals("8")) {
			
			String accountid = "ab9abe2cacfc9a5a2829f2222993018a";
			String token = "91b6bc5e40148c2a74335d2b730b8c2c";
			String appid = "a8c88624ad064474a59225609832c505";
			
			testClientBillList(true,accountid, token,appid,"68520027654483" ,"20150730");
		}else if (method.equals("9")) {
			//			
			testCallback(json, args[2], args[3], args[4], args[5], args[6],"18058149508");
			//testCallback(json, args[2], args[3], args[4], args[5], args[6]);
		}else if (method.equals("10")) {
			testVoiceCode(json, args[2], args[3], args[4], args[5], args[6]);
		}else if (method.equals("11")) {
			
			String accountid = "ab9abe2cacfc9a5a2829f2222993018a";
			String token = "91b6bc5e40148c2a74335d2b730b8c2c";
			String appid = "a8c88624ad064474a59225609832c505";
			
			testTemplateSMS(true,accountid,token, appid, "13567", "13713975317", "1001,学校,离开");
		}else if (method.equals("12")) {
			
			String[] args11={"2","json","ab9abe2cacfc9a5a2829f2222993018a","91b6bc5e40148c2a74335d2b730b8c2c",
					"18058149508","a8c88624ad064474a59225609832c505","18058149508","1","1","18058149508","","",""};
			
	
			
			testfindClientByMobile(json, args11[2],args11[3], args11[4], args11[5]);
		}
	}
}
