package com.sampleapp.data.dao.jdo;

import com.sampleapp.data.dao.interfaces.ThreadItemDao;
import com.sampleapp.data.dataobjects.ThreadItem;

/**
 * @author Richard Wilkinson - richard.wilkinson@jweekend.com
 *
 */
public class ThreadItemDaoJDO extends BaseDaoJDO<ThreadItem> implements ThreadItemDao {

	public ThreadItemDaoJDO() {
		super(ThreadItem.class);
	}

	public ThreadItem copy(ThreadItem o) {
		throw new UnsupportedOperationException("You can't copy an abstract class bozo!.");
	}



}
