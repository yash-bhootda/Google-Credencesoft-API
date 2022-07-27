package credencesoft.google.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Caption")
@XmlAccessorType(XmlAccessType.FIELD)

public class Caption {
	@XmlElement(name = "Caption_Text")
	private List<Caption_Text> Caption_Text;

	public List<Caption_Text> getCaption_Text() {
		return Caption_Text;
	}

	public void setCaption_Text(List<Caption_Text> caption_Text) {
		Caption_Text = caption_Text;
	}

}
