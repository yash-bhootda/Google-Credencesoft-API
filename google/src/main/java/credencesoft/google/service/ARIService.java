package credencesoft.google.service;

import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;

import javax.xml.bind.JAXB;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import credencesoft.google.dto.ARITransaction;
import credencesoft.google.response.ARITransactionResponse;


@Service
public class ARIService {
	
	@Value("${google.ARI.url}")
	private String mmtARI;
	
	private static final Logger logger = LoggerFactory.getLogger(ARIService.class);
	
	
	public void updateARI(ARITransaction AriTransaction) {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
		RestTemplate restTemplate = new RestTemplate();
		now = LocalDateTime.now();
        logger.info("*******   Starting request time********" + now.format(format));
//		restTemplate.getMessageConverters().add(new SimpleXmlHttpMessageConverter());
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(MediaType.APPLICATION_XML);
		requestHeaders.setAccept(Collections.singletonList(new MediaType("application","xml")));
		
		/*not sure*/
		requestHeaders.add("channel-token", "9h7td8zz9o");
		requestHeaders.add("bearer-token", "0e092c03ef");
		
		HttpEntity<ARITransaction> requestEntity = new HttpEntity<ARITransaction>(AriTransaction, requestHeaders);
		StringWriter sw = new StringWriter();

		JAXB.marshal(AriTransaction, sw);
		String xmlRequest = sw.toString();
		logger.info("*******MMT Request XML ******" + xmlRequest);
//		logger.info("*******MMT Request******" + requestEntity.toString());
		
		ResponseEntity<ARITransactionResponse> responseEntity = restTemplate.exchange(mmtARI, HttpMethod.POST,requestEntity, ARITransactionResponse.class);
		ARITransactionResponse responseRS = responseEntity.getBody();
		StringWriter response = new StringWriter();
		JAXB.marshal(responseRS, response);
		String xmlResponse = response.toString();
		logger.info("*******MMT xml Response******" + xmlResponse);
//		logger.info("*******MMT Response******" + responseEntity.toString());
		logger.info("*******   Ending request time********" + now.format(format));

	}

}
