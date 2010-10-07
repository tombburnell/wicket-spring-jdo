/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sampleapp.wicket.panels;

import com.sampleapp.data.dao.interfaces.ThreadItemDao;
import com.sampleapp.data.dataobjects.ThreadItem;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.markup.html.AjaxFallbackLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.spring.injection.annot.SpringBean;

/**
 *
 * @author tom
 */
public class ThreadItemPanel extends Panel {
	@SpringBean
	ThreadItemDao threadItemDao;

	//public ThreadItemPanel(String id, final ThreadItem threadItem) {
	public ThreadItemPanel(String id, final ListItem<ThreadItem> item) {
		super(id);

//		add(new Label("title", event.getTitle()));
//		add(new Label("location", event.getLocation()));


		add(new AjaxFallbackLink("deleteLink") {

			private static final long serialVersionUID = 1L;

			public void onClick(AjaxRequestTarget target) {
//				ThreadItem threadItem = item.getModelObject();

//				threadItemDao.delete(//threadItem);
//				threadItemDao.load(threadItem.getId())
//				);


				//target.addComponent(wmc);
				onClickDelete(item,target);
				//info("Deleted");

			}
		});

	}
//
	public void onClickDelete (ListItem<ThreadItem> item, AjaxRequestTarget target) {
		System.out.println("Does nothing");
	}
}
