package credencesoft.google.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Issue")
@XmlAccessorType(XmlAccessType.FIELD)
public class Issue {
	@XmlAttribute(name = "code")
	private String code;
	
	@XmlAttribute(name = "status")
	private String status;
	
	@XmlElement(name = "description")
	private String description;

}
