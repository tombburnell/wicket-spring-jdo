/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sampleapp.data.dataobjects;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;

/**
 *
 * @author tom
 */
//@Inheritance(strategy=InheritanceStrategy.SUBCLASS_TABLE)
//@Inheritance(strategy=InheritanceStrategy.NEW_TABLE)
@PersistenceCapable(identityType=IdentityType.APPLICATION)
public abstract class ThreadItem extends DomainObject {
	private static final long serialVersionUID = 1L;


}
