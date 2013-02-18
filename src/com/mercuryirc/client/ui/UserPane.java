package com.mercuryirc.client.ui;

import com.mercuryirc.client.ui.misc.FontAwesome;
import javafx.geometry.Pos;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class UserPane extends VBox {

	private final ApplicationPane appPane;
	private ListView userList = new ListView();
	private UserButtonPane buttons = new UserButtonPane();

	public UserPane(ApplicationPane appPane) {
		this.appPane = appPane;
		setMinWidth(175);
		VBox.setVgrow(userList, Priority.ALWAYS);
		userList.setId("user-list");
		getChildren().addAll(userList, buttons);
	}

	private class UserButtonPane extends HBox {

		public UserButtonPane() {
			super(10);
			getStyleClass().add("dark-pane");
			setId("user-button-pane");
			setAlignment(Pos.CENTER);
			setMinHeight(65);
			setMaxHeight(65);
			getChildren().addAll(FontAwesome.createIconButton(FontAwesome.INFO), FontAwesome.createIconButton(FontAwesome.ENVELOPE), FontAwesome.createIconButton(FontAwesome.LEGAL));
		}

	}

}