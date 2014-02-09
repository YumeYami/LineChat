package Message;

import java.security.Timestamp;

public class Message {
	private String type;
	private String text;
	private String clientID;
	private String groupID;
	private Timestamp time;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getClientID() {
		return clientID;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public String getGroupID() {
		return groupID;
	}

	public void setGroupID(String groupID) {
		this.groupID = groupID;
	}

	public Timestamp getTime() {
		return time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Message(String type, String text, String clientID, String groupID,
			Timestamp time) {
		super();
		this.type = type;
		this.text = text;
		this.clientID = clientID;
		this.groupID = groupID;
		this.time = time;
	}

}
