package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Caption_Text")
@XmlAccessorType(XmlAccessType.FIELD)

public class Caption_Text {
	@XmlAttribute(name = "Photo_Description")
	private String Photo_Description;
	
	public String getPhoto_Description() {
		return Photo_Description;
	}

	public void setPhoto_Description(String photo_Description) {
		Photo_Description = photo_Description;
	}

	@XmlAttribute(name = "language")
	private String language="en";

}
