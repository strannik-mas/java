package su.strannik.ex1;

import java.util.EventListener;

public interface TaskListener extends EventListener {
	public void start(TaskData ev);
	public void stop(TaskData ev);
}
