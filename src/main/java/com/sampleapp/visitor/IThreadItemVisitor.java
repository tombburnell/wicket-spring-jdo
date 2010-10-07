/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sampleapp.visitor;

import com.sampleapp.data.dataobjects.Blog;
import com.sampleapp.data.dataobjects.Comment;
import com.sampleapp.data.dataobjects.Event;

/**
 *
 * @author tom
 */
public interface IThreadItemVisitor {
    void visit(Blog blog);
    void visit(Comment comment);
    void visit(Event event);
}
