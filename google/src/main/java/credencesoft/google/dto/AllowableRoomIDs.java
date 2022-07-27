package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AllowableRoomIDs")
@XmlAccessorType(XmlAccessType.FIELD)
public class AllowableRoomIDs {
	@XmlElement(name = "AllowableRoomID")
	private String AllowableRoomID;

	public String getAllowableRoomID() {
		return AllowableRoomID;
	}

	public void setAllowableRoomID(String allowableRoomID) {
		AllowableRoomID = allowableRoomID;
	}

}
