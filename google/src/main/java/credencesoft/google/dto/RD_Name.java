package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RD_Name")
@XmlAccessorType(XmlAccessType.FIELD)

public class RD_Name {
	@XmlElement(name = "RD_Name_Text")
	private List<RD_Name_Text> RD_Name_Text;

	public List<RD_Name_Text> getRD_Name_Text() {
		return RD_Name_Text;
	}

	public void setRD_Name_Text(List<RD_Name_Text> rD_Name_Text) {
		RD_Name_Text = rD_Name_Text;
	}

}
