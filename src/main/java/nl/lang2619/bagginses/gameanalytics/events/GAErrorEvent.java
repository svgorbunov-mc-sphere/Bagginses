/**
 * (C) 2015 NPException
 */
package nl.lang2619.bagginses.gameanalytics.events;

import com.google.gson.annotations.SerializedName;
import nl.lang2619.bagginses.gameanalytics.Analytics;


/**
 * @author NPException
 *
 */
public class GAErrorEvent extends GAEvent {

	public enum Severity {
		critical,
		error,
		warning,
		info,
		debug
	}

	@SerializedName("message")
	private final String message;

	@SerializedName("severity")
	private final String severity;

	public GAErrorEvent(Analytics an, Severity severity, String message) {
		super(an);
		this.severity = severity.name();
		this.message = message;
	}

	@Override
	public String category() {
		return "error";
	}
}
