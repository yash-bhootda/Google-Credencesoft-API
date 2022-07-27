package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RD_Description_Text")
@XmlAccessorType(XmlAccessType.FIELD)
public class RD_Description_Text {
	@XmlAttribute(name = "Room_Description")
	private String Room_Description;
	
	public String getRoom_Description() {
		return Room_Description;
	}

	public void setRoom_Description(String room_Description) {
		Room_Description = room_Description;
	}

	@XmlAttribute(name = "language")
	private String language="en";

}
