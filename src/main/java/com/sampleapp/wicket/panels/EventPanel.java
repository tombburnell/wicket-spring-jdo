/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sampleapp.wicket.panels;

import com.sampleapp.data.dataobjects.Event;
import com.sampleapp.data.dataobjects.ThreadItem;
import org.apache.wicket.markup.html.basic.*;
import org.apache.wicket.markup.html.list.ListItem;

/**
 *
 * @author tom
 */
public class EventPanel extends ThreadItemPanel {
	
	public EventPanel(String id, ListItem<ThreadItem> item) {
		super(id,item);

		Event event = (Event) item.getModelObject();

		add(new Label("title", event.getTitle() ));
		add(new Label("location", event.getLocation() ));

	}


}
