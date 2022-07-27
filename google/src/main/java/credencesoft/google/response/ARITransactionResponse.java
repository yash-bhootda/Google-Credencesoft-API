package credencesoft.google.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name = "ARITransactionResponse")
@XmlAccessorType(XmlAccessType.FIELD)

public class ARITransactionResponse {
	@XmlAttribute(name = "rs_timeStamp")
	private String rs_timeStamp;
	
	@XmlAttribute(name = "rs_tr_id")
	private String rs_tr_id;
	
	@XmlAttribute(name = "rs_partner")
	private String rs_partner;
	
	@XmlElement(name = "Success")
	private boolean Success;
	
	@XmlElement(name = "Issues")
	private List<Issues> Issues;
}
