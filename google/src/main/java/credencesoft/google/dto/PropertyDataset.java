package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PropertyDataset")
@XmlAccessorType(XmlAccessType.FIELD)

public class PropertyDataset {
	@XmlAttribute(name = "action")
	private String action="overlay";
	
	@XmlElement(name = "Property")
	private String Property;
	
	@XmlElement(name = "RoomData")
	private List<RoomData> RoomData;
	
	@XmlElement(name = "PackageData")
	private List<PackageData> PackageData;

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getProperty() {
		return Property;
	}

	public void setProperty(String property) {
		Property = property;
	}

	public List<RoomData> getRoomData() {
		return RoomData;
	}

	public void setRoomData(List<RoomData> roomData) {
		RoomData = roomData;
	}
	
}
