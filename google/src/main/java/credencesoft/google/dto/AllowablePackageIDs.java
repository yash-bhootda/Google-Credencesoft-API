package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AllowablePackageIDs")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllowablePackageIDs {
	@XmlElement(name = "AllowablePackageID")
	private String AllowablePackageID;

	public String getAllowablePackageID() {
		return AllowablePackageID;
	}

	public void setAllowablePackageID(String allowablePackageID) {
		AllowablePackageID = allowablePackageID;
	}
}
