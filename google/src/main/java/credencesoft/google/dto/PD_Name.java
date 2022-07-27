package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PD_Name")
@XmlAccessorType(XmlAccessType.FIELD)

public class PD_Name {
	@XmlElement(name = "PD_Name_Text")
	private List<PD_Name_Text> PD_Name_Text;

	public List<PD_Name_Text> getPD_Name_Text() {
		return PD_Name_Text;
	}

	public void setPD_Name_Text(List<PD_Name_Text> pD_Name_Text) {
		PD_Name_Text = pD_Name_Text;
	}

}
