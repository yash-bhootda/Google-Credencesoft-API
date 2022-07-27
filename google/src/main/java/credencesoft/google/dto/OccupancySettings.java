package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OccupancySettings")
@XmlAccessorType(XmlAccessType.FIELD)
public class OccupancySettings {
	@XmlElement(name = "MinOccupancy")
	private int MinOccupancy;
	
	public int getMinOccupancy() {
		return MinOccupancy;
	}

	public void setMinOccupancy(int minOccupancy) {
		MinOccupancy = minOccupancy;
	}

	public int getMinAge() {
		return MinAge;
	}

	public void setMinAge(int minAge) {
		MinAge = minAge;
	}

	@XmlElement(name = "MinAge")
	private int MinAge;
	
}
