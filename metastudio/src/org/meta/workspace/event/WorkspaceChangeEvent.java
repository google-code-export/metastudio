/*
 * WorkspaceChangeEvent.java
 *
 * Created on April 29, 2004, 6:32 AM
 */

package org.meta.workspace.event;

/**
 * Event fired when an Workspace changes its state.
 *
 * @author  V.Ganesh
 * @version 2.0 (Part of MeTA v2.0)
 */
public class WorkspaceChangeEvent extends java.util.EventObject {
    
    /**
     * Holds value of property message.
     */
    private String message;
    
    /** Creates a new instance of WorkspaceChangeEvent */
    public WorkspaceChangeEvent(Object source) {
        super(source);
        
        message = "";
    }
    
    /**
     * Getter for property message.
     * @return Value of property message.
     */
    public String getMessage() {
        return this.message;
    }
    
    /**
     * Setter for property message.
     * @param message New value of property message.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Returns a string representation of the event object. 
     *
     * @return  a string representation of the object.
     */
    public String toString() {
        return message;
    }
    
} // end of class WorkspaceChangeEvent
