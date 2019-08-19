package calliopeIntegration.session;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SessionResponse {

	@JsonProperty("data")
	private SessionData sessionData;
	@JsonProperty("message")
	private String message;
	@JsonProperty("status")
	private String status;

	@JsonProperty("data")
	public SessionData getData() {
		return sessionData;
	}

	@JsonProperty("data")
	public void setData(SessionData sessionData) {
		this.sessionData = sessionData;
	}

	@JsonProperty("message")
	public String getMessage() {
		return message;
	}

	@JsonProperty("message")
	public void setMessage(String message) {
		this.message = message;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\ndata:");
		builder.append(sessionData);
		builder.append(", \nmessage:");
		builder.append(message);
		builder.append(", \nstatus:");
		builder.append(status);
		builder.append("\n}");
		return builder.toString();
	}

}
