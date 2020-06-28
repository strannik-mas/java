package su.strannik.ex1;

import java.util.Calendar;
import java.util.EventObject;

@SuppressWarnings("serial")
public class TaskData extends EventObject {
	private String name;
	private String date;

	public TaskData(Object source, String name) {
		super(source);
		this.name = name;
		this.date = Calendar.getInstance().getTime().toString();
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

}
