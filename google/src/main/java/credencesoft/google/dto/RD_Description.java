package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RD_Description")
@XmlAccessorType(XmlAccessType.FIELD)
public class RD_Description {
	
	@XmlElement(name = "RD_Description_Text")
	private List<RD_Description_Text> RD_Name_Description;

	public List<RD_Description_Text> getRD_Name_Description() {
		return RD_Name_Description;
	}

	public void setRD_Name_Description(List<RD_Description_Text> rD_Name_Description) {
		RD_Name_Description = rD_Name_Description;
	}

}
