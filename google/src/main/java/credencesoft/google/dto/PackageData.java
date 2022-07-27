package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PackageData")
@XmlAccessorType(XmlAccessType.FIELD)

public class PackageData {
	
	@XmlElement(name = "PackageID")
	private String PackageID;
	
	@XmlElement(name = "PD_Name")
	private List<PD_Name> PD_Name;
	
	@XmlElement(name = "PD_Description")
	private List<PD_Description> PD_Description;
	
	@XmlElement(name = "AllowableRoomIDs")
	private List<AllowableRoomIDs> AllowableRoomIDs;
	
	@XmlElement(name = "Refundable")
	private List<Refundable> Refundable;
	
	@XmlElement(name = "BreakfastIncluded")
	private boolean BreakfastIncluded;
	
	@XmlElement(name = "InternetIncluded")
	private boolean InternetIncluded;
	
	@XmlElement(name = "ParkingIncluded")
	private boolean ParkingIncluded;
	
	public String getPackageID() {
		return PackageID;
	}

	public void setPackageID(String packageID) {
		PackageID = packageID;
	}

	public List<PD_Name> getPD_Name() {
		return PD_Name;
	}

	public void setPD_Name(List<PD_Name> pD_Name) {
		PD_Name = pD_Name;
	}

	public List<PD_Description> getPD_Description() {
		return PD_Description;
	}

	public void setPD_Description(List<PD_Description> pD_Description) {
		PD_Description = pD_Description;
	}

	public List<AllowableRoomIDs> getAllowableRoomIDs() {
		return AllowableRoomIDs;
	}

	public void setAllowableRoomIDs(List<AllowableRoomIDs> allowableRoomIDs) {
		AllowableRoomIDs = allowableRoomIDs;
	}

	public List<Refundable> getRefundable() {
		return Refundable;
	}

	public void setRefundable(List<Refundable> refundable) {
		Refundable = refundable;
	}

	public boolean isBreakfastIncluded() {
		return BreakfastIncluded;
	}

	public void setBreakfastIncluded(boolean breakfastIncluded) {
		BreakfastIncluded = breakfastIncluded;
	}

	public boolean isInternetIncluded() {
		return InternetIncluded;
	}

	public void setInternetIncluded(boolean internetIncluded) {
		InternetIncluded = internetIncluded;
	}

	public boolean isParkingIncluded() {
		return ParkingIncluded;
	}

	public void setParkingIncluded(boolean parkingIncluded) {
		ParkingIncluded = parkingIncluded;
	}


	
}
