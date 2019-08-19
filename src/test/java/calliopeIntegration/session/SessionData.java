package calliopeIntegration.session;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "duration",
    "platform",
    "browser",
    "browser_version",
    "device",
    "status_ind",
    "session_id",
    "build_name",
    "console_logs_url",
    "network_logs_url",
    "command_logs_url",
    "selenium_logs_url",
    "video_url",
    "screenshot_url"
})
public class SessionData {

    @JsonProperty("name")
    private String name;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("browser")
    private String browser;
    @JsonProperty("browser_version")
    private String browserVersion;
    @JsonProperty("device")
    private String device;
    @JsonProperty("status_ind")
    private String statusInd;
    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("build_name")
    private String buildName;
    @JsonProperty("console_logs_url")
    private String consoleLogsUrl;
    @JsonProperty("network_logs_url")
    private String networkLogsUrl;
    @JsonProperty("command_logs_url")
    private String commandLogsUrl;
    @JsonProperty("selenium_logs_url")
    private String seleniumLogsUrl;
    @JsonProperty("video_url")
    private String videoUrl;
    @JsonProperty("screenshot_url")
    private String screenshotUrl;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @JsonProperty("platform")
    public String getPlatform() {
        return platform;
    }

    @JsonProperty("platform")
    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @JsonProperty("browser")
    public String getBrowser() {
        return browser;
    }

    @JsonProperty("browser")
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @JsonProperty("browser_version")
    public String getBrowserVersion() {
        return browserVersion;
    }

    @JsonProperty("browser_version")
    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    @JsonProperty("device")
    public String getDevice() {
        return device;
    }

    @JsonProperty("device")
    public void setDevice(String device) {
        this.device = device;
    }

    @JsonProperty("status_ind")
    public String getStatusInd() {
        return statusInd;
    }

    @JsonProperty("status_ind")
    public void setStatusInd(String statusInd) {
        this.statusInd = statusInd;
    }

    @JsonProperty("session_id")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("session_id")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @JsonProperty("build_name")
    public String getBuildName() {
        return buildName;
    }

    @JsonProperty("build_name")
    public void setBuildName(String buildName) {
        this.buildName = buildName;
    }

    @JsonProperty("console_logs_url")
    public String getConsoleLogsUrl() {
        return consoleLogsUrl;
    }

    @JsonProperty("console_logs_url")
    public void setConsoleLogsUrl(String consoleLogsUrl) {
        this.consoleLogsUrl = consoleLogsUrl;
    }

    @JsonProperty("network_logs_url")
    public String getNetworkLogsUrl() {
        return networkLogsUrl;
    }

    @JsonProperty("network_logs_url")
    public void setNetworkLogsUrl(String networkLogsUrl) {
        this.networkLogsUrl = networkLogsUrl;
    }

    @JsonProperty("command_logs_url")
    public String getCommandLogsUrl() {
        return commandLogsUrl;
    }

    @JsonProperty("command_logs_url")
    public void setCommandLogsUrl(String commandLogsUrl) {
        this.commandLogsUrl = commandLogsUrl;
    }

    @JsonProperty("selenium_logs_url")
    public String getSeleniumLogsUrl() {
        return seleniumLogsUrl;
    }

    @JsonProperty("selenium_logs_url")
    public void setSeleniumLogsUrl(String seleniumLogsUrl) {
        this.seleniumLogsUrl = seleniumLogsUrl;
    }

    @JsonProperty("video_url")
    public String getVideoUrl() {
        return videoUrl;
    }

    @JsonProperty("video_url")
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    @JsonProperty("screenshot_url")
    public String getScreenshotUrl() {
        return screenshotUrl;
    }

    @JsonProperty("screenshot_url")
    public void setScreenshotUrl(String screenshotUrl) {
        this.screenshotUrl = screenshotUrl;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\nname=");
		builder.append(name);
		builder.append(",\nduration=");
		builder.append(duration);
		builder.append(",\nplatform=");
		builder.append(platform);
		builder.append(",\nbrowser=");
		builder.append(browser);
		builder.append(",\nbrowserVersion=");
		builder.append(browserVersion);
		builder.append(",\ndevice=");
		builder.append(device);
		builder.append(",\nstatusInd=");
		builder.append(statusInd);
		builder.append(",\nsessionId=");
		builder.append(sessionId);
		builder.append(",\nbuildName=");
		builder.append(buildName);
		builder.append(",\nconsoleLogsUrl=");
		builder.append(consoleLogsUrl);
		builder.append(",\nnetworkLogsUrl=");
		builder.append(networkLogsUrl);
		builder.append(",\ncommandLogsUrl=");
		builder.append(commandLogsUrl);
		builder.append(",\nseleniumLogsUrl=");
		builder.append(seleniumLogsUrl);
		builder.append(",\nvideoUrl=");
		builder.append(videoUrl);
		builder.append(",\nscreenshotUrl=");
		builder.append(screenshotUrl);
		builder.append("\n}");
		return builder.toString();
	}

}
