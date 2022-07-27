package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RD_Name_Text")
@XmlAccessorType(XmlAccessType.FIELD)

public class RD_Name_Text {
	@XmlAttribute(name = "Room_Name")
	private String Room_Name;
	
	@XmlAttribute(name = "language")
	private String language="en";
	
	public String getRoom_Name() {
		return Room_Name;
	}

	public void setRoom_Name(String room_Name) {
		Room_Name = room_Name;
	}

	

}
