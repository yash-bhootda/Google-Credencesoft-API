package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PD_Description")
@XmlAccessorType(XmlAccessType.FIELD)
public class PD_Description {
	
	@XmlElement(name = "PD_Description_Text")
	private List<PD_Description_Text> PD_Description_Text;

	public List<PD_Description_Text> getPD_Description_Text() {
		return PD_Description_Text;
	}

	public void setPD_Description_Text(List<PD_Description_Text> pD_Description_Text) {
		PD_Description_Text = pD_Description_Text;
	}

}
