package me.fanhua.uapi.task;

import me.fanhua.uapi.api.API;
import me.fanhua.uapi.gui.Gui;
import me.fanhua.uapi.manager.TaskManager;
import me.fanhua.uapi.user.User;
import me.fanhua.uapi.user.manager.UserGuiManager;

public class TaskOpenGui implements Runnable {
	
	public static void addTask(User user, Gui gui) {
		TaskManager.tick(new TaskOpenGui(user, gui));
	}
	
	private User user;
	private Gui gui;
	
	private TaskOpenGui(User user, Gui gui) {
		this.user = user;
		this.gui = gui;
	}
	
	public void run() {
		if (this.user.isOffline()) return;
		UserGuiManager manager = this.user.get(API.USER.GUI);
		if (!manager.hasGui()) manager.open(this.gui);
	}

}
