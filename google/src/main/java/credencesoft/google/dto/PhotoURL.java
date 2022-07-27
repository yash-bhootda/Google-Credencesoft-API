package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PhotoURL")
@XmlAccessorType(XmlAccessType.FIELD)

public class PhotoURL {
	@XmlElement(name = "Caption")
	private List<Caption> Caption;
	
	public List<Caption> getCaption() {
		return Caption;
	}

	public void setCaption(List<Caption> caption) {
		Caption = caption;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	@XmlElement(name = "URL")
	private String URL;

}
