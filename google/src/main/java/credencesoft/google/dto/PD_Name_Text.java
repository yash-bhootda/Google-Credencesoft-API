package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PD_Name_Text")
@XmlAccessorType(XmlAccessType.FIELD)
public class PD_Name_Text {
	@XmlAttribute(name = "Package_Name")
	private String Package_Name;
	
	public String getPackage_Name() {
		return Package_Name;
	}

	public void setPackage_Name(String package_Name) {
		Package_Name = package_Name;
	}

	@XmlAttribute(name = "language")
	private String language="en";

}
