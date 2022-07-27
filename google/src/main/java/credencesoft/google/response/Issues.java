package credencesoft.google.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Issues")
@XmlAccessorType(XmlAccessType.FIELD)

public class Issues {
	@XmlElement(name = "Issue")
	private List<Issue> Issue;

}
