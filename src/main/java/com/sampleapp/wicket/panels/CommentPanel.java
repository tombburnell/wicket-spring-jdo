/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sampleapp.wicket.panels;

import com.sampleapp.data.dataobjects.Comment;
import com.sampleapp.data.dataobjects.ThreadItem;
import org.apache.wicket.markup.html.basic.*;
import org.apache.wicket.markup.html.list.ListItem;

/**
 *
 * @author tom
 */
public class CommentPanel extends ThreadItemPanel {
	
	//public CommentPanel(String id, Comment comment) {
//		super(id,comment);
	public CommentPanel(String id, ListItem<ThreadItem> item) {
		super(id,item);

		Comment comment = (Comment) item.getModelObject();

		add(new Label("title", comment.getTitle() ));

	}


}
