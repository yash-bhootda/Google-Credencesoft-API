package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ARITransaction")
@XmlAccessorType(XmlAccessType.FIELD)
public class ARITransaction {
	@XmlAttribute(name = "timeStamp")
	private String timeStamp;
	
	@XmlAttribute(name = "tr_id")
	private String tr_id;
	
	@XmlAttribute(name = "partner")
	private String partner;
	
	@XmlElement(name = "PropertyDataset")
	private List<PropertyDataset> PropertyDataset;
	
	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getTr_id() {
		return tr_id;
	}

	public void setTr_id(String tr_id) {
		this.tr_id = tr_id;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public List<PropertyDataset> getPropertyDataset() {
		return PropertyDataset;
	}

	public void setPropertyDataset(List<PropertyDataset> propertyDataset) {
		PropertyDataset = propertyDataset;
	}


	
}
