package api.mssql.demo;

import com.itextpdf.text.DocumentException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class DemoApplicationTests {


	@Test
	public void contextLoads() throws  ParseException, DocumentException, IOException, InterruptedException {

		String payload="[{\"Agt1\":null,\"Iv_InvoiceDate\":\"2020-03-25\",\"Iv_PeriodEnd\":\"2020-03-31\",\"Ad_City\":\"Osler               \",\"Ad_AddressLine2\":\"                                                  \",\"Op_Description\":\"SK                                                \",\"Id_StartDate\":\"2020-03-01\",\"Pl_PlanID\":385,\"Iv_PeriodStart\":\"2020-03-01\",\"Cf_Description\":\"Canada\",\"Bf_FrequencyID\":0,\"Gr_CompanyName\":\"Ideal Meats                        \",\"OnSupplemental\":\"N\",\"SumindHealth\":52.93,\"SumindDental\":0.0,\"SumindLife\":0.0,\"Iv_Total\":156.4,\"Oy_OptionTypeID\":0,\"Pl_Description\":\"Advantage Health - Gold\",\"Pv_Abbreviation\":\"SK\",\"In_FirstName\":\"Jillian\",\"ProvOfResidence\":\"SK\",\"Gpt_PlanTypeID\":1,\"In_LastName\":\"Pauls\",\"Ad_AddressLine1\":\"Box 127                                 \",\"Ad_PostalCode\":\"S0K3A0    \",\"DepLifeCount\":0,\"SumindADPremium\":0.0,\"SumindADDVol\":0.0,\"SumlifePremium\":0.0,\"SumdepOptLife\":0.0,\"SumindHealthVol\":0.0,\"Sumltd\":0.0,\"ContractAccount\":0,\"OptDepLifeCount\":0,\"Age\":38,\"Ltdcount\":0,\"OptADDCount\":0,\"StopLossCount\":0,\"HealthVol\":0,\"LifeVol\":0,\"OptLifeVol\":0,\"DepLifeVol\":0,\"SumdepLife\":0.0,\"Sumwi\":0.0,\"HealthCount\":2,\"OptLifeCount\":0,\"DepOptLifeVol\":0,\"Ltdvol\":0,\"SumstopLoss\":0.0,\"OptADDVol\":0,\"Papfee\":0.0,\"AccountID\":1,\"Gst\":0.4,\"ThirdPartyGST\":0,\"SumindOptADD\":0.0,\"Addvol\":0,\"SumindLifeVol\":0.0,\"Wivol\":0,\"Sumdental\":149.7,\"StopLossVol\":0,\"ThirdPartyPST\":0,\"SumoptADD\":0.0,\"Addcount\":0,\"SumindLTD\":0.0,\"NoOfLives\":1,\"DentalVol\":0,\"OsinvoiceAmount\":628.2,\"SumindOptLife\":0.0,\"SumindOptADDVol\":0.0,\"SumoptLife\":0.0,\"LifeCount\":0,\"Wicount\":0,\"CritCount\":0,\"OtherTax\":0,\"SumindCritVol\":0.0,\"Sumhealth\":164.4,\"Pst\":0,\"Agt2\":null,\"OssalesTaxes\":0.4,\"SumindDepLife\":0.0,\"SumindWI\":0.0,\"SumindStopLoss\":0.0,\"SumindDentalVol\":0.0,\"SumindWIVol\":0.0,\"SumindLTDVol\":0.0,\"Sumadpremium\":0.0,\"InvoiceID\":5517849,\"PaymentType\":0,\"DentalCount\":2,\"DiscountAmount\":0.0,\"CompanyID\":1,\"SumindCritIllness\":0.0,\"SumindStopLossVol\":0.0,\"SumindDepOptLife\":0.0,\"SuppInvoiceAmount\":0.0,\"SumcriticalIllness\":0.0,\"SumindOptLifeVol\":0.0,\"CriticalIllnessVol\":0,\"SumindDepLifeVol\":0.0,\"Op_ExternalDescription\":\"Group Health Plan                                 \",\"Co_ContractID_Group\":326611,\"SumindOptDepLifeVol\":0.0,\"ThirdPartyOtherTax\":0,\"OssuppInvoiceAmount\":0.0,\"Co_ContractID_Indiv\":299569},{\"Agt1\":null,\"Iv_InvoiceDate\":\"2020-03-25\",\"Iv_PeriodEnd\":\"2020-03-31\",\"Ad_City\":\"Osler               \",\"Ad_AddressLine2\":\"                                                  \",\"Op_Description\":\"SK Dental                                         \",\"Id_StartDate\":\"2020-03-01\",\"Pl_PlanID\":393,\"Iv_PeriodStart\":\"2020-03-01\",\"Cf_Description\":\"Canada\",\"Bf_FrequencyID\":0,\"Gr_CompanyName\":\"Ideal Meats                        \",\"OnSupplemental\":\"N\",\"SumindHealth\":0.0,\"SumindDental\":42.76,\"SumindLife\":0.0,\"Iv_Total\":149.7,\"Oy_OptionTypeID\":0,\"Pl_Description\":\"Advantage Dental - Gold 1500\",\"Pv_Abbreviation\":\"SK\",\"In_FirstName\":\"Jillian\",\"ProvOfResidence\":\"SK\",\"Gpt_PlanTypeID\":2,\"In_LastName\":\"Pauls\",\"Ad_AddressLine1\":\"Box 127                                 \",\"Ad_PostalCode\":\"S0K3A0    \",\"DepLifeCount\":0,\"SumindADPremium\":0.0,\"SumindADDVol\":0.0,\"SumlifePremium\":0.0,\"SumdepOptLife\":0.0,\"SumindHealthVol\":0.0,\"Sumltd\":0.0,\"ContractAccount\":0,\"OptDepLifeCount\":0,\"Age\":38,\"Ltdcount\":0,\"OptADDCount\":0,\"StopLossCount\":0,\"HealthVol\":0,\"LifeVol\":0,\"OptLifeVol\":0,\"DepLifeVol\":0,\"SumdepLife\":0.0,\"Sumwi\":0.0,\"HealthCount\":2,\"OptLifeCount\":0,\"DepOptLifeVol\":0,\"Ltdvol\":0,\"SumstopLoss\":0.0,\"OptADDVol\":0,\"Papfee\":0.0,\"AccountID\":1,\"Gst\":0.4,\"ThirdPartyGST\":0,\"SumindOptADD\":0.0,\"Addvol\":0,\"SumindLifeVol\":0.0,\"Wivol\":0,\"Sumdental\":149.7,\"StopLossVol\":0,\"ThirdPartyPST\":0,\"SumoptADD\":0.0,\"Addcount\":0,\"SumindLTD\":0.0,\"NoOfLives\":1,\"DentalVol\":0,\"OsinvoiceAmount\":628.2,\"SumindOptLife\":0.0,\"SumindOptADDVol\":0.0,\"SumoptLife\":0.0,\"LifeCount\":0,\"Wicount\":0,\"CritCount\":0,\"OtherTax\":0,\"SumindCritVol\":0.0,\"Sumhealth\":164.4,\"Pst\":0,\"Agt2\":null,\"OssalesTaxes\":0.4,\"SumindDepLife\":0.0,\"SumindWI\":0.0,\"SumindStopLoss\":0.0,\"SumindDentalVol\":0.0,\"SumindWIVol\":0.0,\"SumindLTDVol\":0.0,\"Sumadpremium\":0.0,\"InvoiceID\":5517849,\"PaymentType\":0,\"DentalCount\":2,\"DiscountAmount\":0.0,\"CompanyID\":1,\"SumindCritIllness\":0.0,\"SumindStopLossVol\":0.0,\"SumindDepOptLife\":0.0,\"SuppInvoiceAmount\":0.0,\"SumcriticalIllness\":0.0,\"SumindOptLifeVol\":0.0,\"CriticalIllnessVol\":0,\"SumindDepLifeVol\":0.0,\"Op_ExternalDescription\":\"Group Dental Plan                                 \",\"Co_ContractID_Group\":326611,\"SumindOptDepLifeVol\":0.0,\"ThirdPartyOtherTax\":0,\"OssuppInvoiceAmount\":0.0,\"Co_ContractID_Indiv\":299569},{\"Agt1\":null,\"Iv_InvoiceDate\":\"2020-03-25\",\"Iv_PeriodEnd\":\"2020-03-31\",\"Ad_City\":\"Osler               \",\"Ad_AddressLine2\":\"                                                  \",\"Op_Description\":\"SK Family                                         \",\"Id_StartDate\":\"2020-03-01\",\"Pl_PlanID\":385,\"Iv_PeriodStart\":\"2020-03-01\",\"Cf_Description\":\"Canada\",\"Bf_FrequencyID\":0,\"Gr_CompanyName\":\"Ideal Meats                        \",\"OnSupplemental\":\"N\",\"SumindHealth\":111.47,\"SumindDental\":0.0,\"SumindLife\":0.0,\"Iv_Total\":156.4,\"Oy_OptionTypeID\":1,\"Pl_Description\":\"Advantage Health - Gold\",\"Pv_Abbreviation\":\"SK\",\"In_FirstName\":\"Cory                          \",\"ProvOfResidence\":\"SK\",\"Gpt_PlanTypeID\":1,\"In_LastName\":\"Wiebe                         \",\"Ad_AddressLine1\":\"Box 127                                 \",\"Ad_PostalCode\":\"S0K3A0    \",\"DepLifeCount\":0,\"SumindADPremium\":0.0,\"SumindADDVol\":0.0,\"SumlifePremium\":0.0,\"SumdepOptLife\":0.0,\"SumindHealthVol\":0.0,\"Sumltd\":0.0,\"ContractAccount\":0,\"OptDepLifeCount\":0,\"Age\":49,\"Ltdcount\":0,\"OptADDCount\":0,\"StopLossCount\":0,\"HealthVol\":0,\"LifeVol\":0,\"OptLifeVol\":0,\"DepLifeVol\":0,\"SumdepLife\":0.0,\"Sumwi\":0.0,\"HealthCount\":2,\"OptLifeCount\":0,\"DepOptLifeVol\":0,\"Ltdvol\":0,\"SumstopLoss\":0.0,\"OptADDVol\":0,\"Papfee\":0.0,\"AccountID\":1,\"Gst\":0.4,\"ThirdPartyGST\":0,\"SumindOptADD\":0.0,\"Addvol\":0,\"SumindLifeVol\":0.0,\"Wivol\":0,\"Sumdental\":149.7,\"StopLossVol\":0,\"ThirdPartyPST\":0,\"SumoptADD\":0.0,\"Addcount\":0,\"SumindLTD\":0.0,\"NoOfLives\":5,\"DentalVol\":0,\"OsinvoiceAmount\":628.2,\"SumindOptLife\":0.0,\"SumindOptADDVol\":0.0,\"SumoptLife\":0.0,\"LifeCount\":0,\"Wicount\":0,\"CritCount\":0,\"OtherTax\":0,\"SumindCritVol\":0.0,\"Sumhealth\":164.4,\"Pst\":0,\"Agt2\":null,\"OssalesTaxes\":0.4,\"SumindDepLife\":0.0,\"SumindWI\":0.0,\"SumindStopLoss\":0.0,\"SumindDentalVol\":0.0,\"SumindWIVol\":0.0,\"SumindLTDVol\":0.0,\"Sumadpremium\":0.0,\"InvoiceID\":5517849,\"PaymentType\":0,\"DentalCount\":2,\"DiscountAmount\":0.0,\"CompanyID\":1,\"SumindCritIllness\":0.0,\"SumindStopLossVol\":0.0,\"SumindDepOptLife\":0.0,\"SuppInvoiceAmount\":0.0,\"SumcriticalIllness\":0.0,\"SumindOptLifeVol\":0.0,\"CriticalIllnessVol\":0,\"SumindDepLifeVol\":0.0,\"Op_ExternalDescription\":\"Group Health Plan                                 \",\"Co_ContractID_Group\":326611,\"SumindOptDepLifeVol\":0.0,\"ThirdPartyOtherTax\":0,\"OssuppInvoiceAmount\":0.0,\"Co_ContractID_Indiv\":326626},{\"Agt1\":null,\"Iv_InvoiceDate\":\"2020-03-25\",\"Iv_PeriodEnd\":\"2020-03-31\",\"Ad_City\":\"Osler               \",\"Ad_AddressLine2\":\"                                                  \",\"Op_Description\":\"SK Dental Family                                  \",\"Id_StartDate\":\"2020-03-01\",\"Pl_PlanID\":393,\"Iv_PeriodStart\":\"2020-03-01\",\"Cf_Description\":\"Canada\",\"Bf_FrequencyID\":0,\"Gr_CompanyName\":\"Ideal Meats                        \",\"OnSupplemental\":\"N\",\"SumindHealth\":0.0,\"SumindDental\":106.94,\"SumindLife\":0.0,\"Iv_Total\":149.7,\"Oy_OptionTypeID\":1,\"Pl_Description\":\"Advantage Dental - Gold 1500\",\"Pv_Abbreviation\":\"SK\",\"In_FirstName\":\"Cory                          \",\"ProvOfResidence\":\"SK\",\"Gpt_PlanTypeID\":2,\"In_LastName\":\"Wiebe                         \",\"Ad_AddressLine1\":\"Box 127                                 \",\"Ad_PostalCode\":\"S0K3A0    \",\"DepLifeCount\":0,\"SumindADPremium\":0.0,\"SumindADDVol\":0.0,\"SumlifePremium\":0.0,\"SumdepOptLife\":0.0,\"SumindHealthVol\":0.0,\"Sumltd\":0.0,\"ContractAccount\":0,\"OptDepLifeCount\":0,\"Age\":49,\"Ltdcount\":0,\"OptADDCount\":0,\"StopLossCount\":0,\"HealthVol\":0,\"LifeVol\":0,\"OptLifeVol\":0,\"DepLifeVol\":0,\"SumdepLife\":0.0,\"Sumwi\":0.0,\"HealthCount\":2,\"OptLifeCount\":0,\"DepOptLifeVol\":0,\"Ltdvol\":0,\"SumstopLoss\":0.0,\"OptADDVol\":0,\"Papfee\":0.0,\"AccountID\":1,\"Gst\":0.4,\"ThirdPartyGST\":0,\"SumindOptADD\":0.0,\"Addvol\":0,\"SumindLifeVol\":0.0,\"Wivol\":0,\"Sumdental\":149.7,\"StopLossVol\":0,\"ThirdPartyPST\":0,\"SumoptADD\":0.0,\"Addcount\":0,\"SumindLTD\":0.0,\"NoOfLives\":5,\"DentalVol\":0,\"OsinvoiceAmount\":628.2,\"SumindOptLife\":0.0,\"SumindOptADDVol\":0.0,\"SumoptLife\":0.0,\"LifeCount\":0,\"Wicount\":0,\"CritCount\":0,\"OtherTax\":0,\"SumindCritVol\":0.0,\"Sumhealth\":164.4,\"Pst\":0,\"Agt2\":null,\"OssalesTaxes\":0.4,\"SumindDepLife\":0.0,\"SumindWI\":0.0,\"SumindStopLoss\":0.0,\"SumindDentalVol\":0.0,\"SumindWIVol\":0.0,\"SumindLTDVol\":0.0,\"Sumadpremium\":0.0,\"InvoiceID\":5517849,\"PaymentType\":0,\"DentalCount\":2,\"DiscountAmount\":0.0,\"CompanyID\":1,\"SumindCritIllness\":0.0,\"SumindStopLossVol\":0.0,\"SumindDepOptLife\":0.0,\"SuppInvoiceAmount\":0.0,\"SumcriticalIllness\":0.0,\"SumindOptLifeVol\":0.0,\"CriticalIllnessVol\":0,\"SumindDepLifeVol\":0.0,\"Op_ExternalDescription\":\"Group Dental Plan                                 \",\"Co_ContractID_Group\":326611,\"SumindOptDepLifeVol\":0.0,\"ThirdPartyOtherTax\":0,\"OssuppInvoiceAmount\":0.0,\"Co_ContractID_Indiv\":326626}]";


		HttpClient client = HttpClient.newBuilder().build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://localhost:8081/createpdf"))
				.POST(HttpRequest.BodyPublishers.ofString(payload))
				.setHeader("Content-Type", "application/json; charset=utf8")
				.build();

		HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());


		String responseBody = new String(response.body(), 0, 5);
		byte[] bytes=responseBody.getBytes();

		assertEquals("pdf bytes are  equals",5 ,checkPdf(bytes));//positive test

		new File("EOBs//test/test.pdf").delete();
		OutputStream os= new FileOutputStream(new File("EOBs//test/test.pdf"));
		os.write(response.body());
		os.close();
	}



	private int checkPdf(byte[] bytes) {
		int n=0;
		for (byte b : bytes) {
			switch(String.format("%02X",b)){
				case "25":n++;break;
				case "50":n++;break;
				case "44":n++;break;
				case "46":n++;break;
				case "2D":n++;break;
				default: break;
			}
		}
		return n;
	}
}
