package credencesoft.google.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Refundable")
@XmlAccessorType(XmlAccessType.FIELD)
public class Refundable {
	
	@XmlAttribute(name = "available")
	private boolean available;
	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getRefundable_until_days() {
		return refundable_until_days;
	}

	public void setRefundable_until_days(int refundable_until_days) {
		this.refundable_until_days = refundable_until_days;
	}

	public String getRefundable_until_time() {
		return refundable_until_time;
	}

	public void setRefundable_until_time(String refundable_until_time) {
		this.refundable_until_time = refundable_until_time;
	}

	@XmlAttribute(name = "refundable_until_days")
	private int refundable_until_days;
	
	@XmlAttribute(name = "refundable_until_time")
	private String refundable_until_time;

}
