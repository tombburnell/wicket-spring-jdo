package com.sampleapp.data.dataobjects;

import com.sampleapp.visitor.IThreadItemVisitor;
import java.util.ArrayList;
import java.util.Collection;
import javax.jdo.annotations.Inheritance;
import javax.jdo.annotations.InheritanceStrategy;
import javax.jdo.annotations.Join;
import javax.jdo.annotations.PersistenceCapable;

/**
 * @author Richard Wilkinson - richard.wilkinson@jweekend.com
 *
 */
@PersistenceCapable
@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
public class Blog extends ThreadItem {
	private static final long serialVersionUID = 3959377496669050427L;


	private String title;

	//private Collection<ThreadItem> thread = new ArrayList<ThreadItem>();
//	@OneToMany
	@Join
	private ArrayList<ThreadItem> thread;

	public Blog() {
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Blog other = (Blog) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (getTitle() == null) {
			if (other.getTitle() != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return String.format("Blog [id=%s, title=%s]", id, getTitle());
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	 public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the thread
	 */ 
	 public ArrayList<ThreadItem> getThread() {
		return thread;
	}

	/**
	 * @param thread the thread to set
	 */ public void setThread(ArrayList<ThreadItem> thread) {
		this.thread = thread;
	}

	public void accept(IThreadItemVisitor visitor) {
        visitor.visit(this);
	}
}
