package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RD_Description_Text")
@XmlAccessorType(XmlAccessType.FIELD)

public class PD_Description_Text {
	@XmlAttribute(name = "Package_Description")
	private String Package_Description;
	
	public String getPackage_Description() {
		return Package_Description;
	}

	public void setPackage_Description(String package_Description) {
		Package_Description = package_Description;
	}

	@XmlAttribute(name = "language")
	private String language="en";
}
