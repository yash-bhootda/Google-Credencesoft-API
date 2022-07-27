package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RoomData")
@XmlAccessorType(XmlAccessType.FIELD)

public class RoomData {
	@XmlAttribute(name = "RoomID")
	private String RoomID;
	
	@XmlElement(name = "RD_Name")
	private List<RD_Name> RD_Name;
	
	@XmlElement(name = "RD_Description")
	private List<RD_Description> RD_Description;
	
	@XmlElement(name = "AllowablePackageIDs")
	private List<AllowablePackageIDs> AllowablePackageIDs;
	
	@XmlElement(name = "Capacity")
	private int Capacity;
	
	@XmlElement(name = "AdultCapacity")
	private int AdultCapacity;
	
	@XmlElement(name = "ChildCapacity")
	private int ChildCapacity;
	
	@XmlElement(name = "OccupancySettings")
	private List<OccupancySettings> OccupancySettings;
	
	@XmlElement(name = "PhotoURL")
	private List<PhotoURL> PhotoURL;
	
	
	
	

}
