/**
 * DaoEventObjectify.java, 28.7.2011 16:03:53 
 */
package ugportal.dao.objectify;

import java.util.Date;
import java.util.List;

import ugportal.dao.DaoEvent;
import ugportal.model.Event;
import ugportal.model.EventType;
import ugportal.model.User;

import com.googlecode.objectify.util.DAOBase;

/**
 * @author Tomas
 */
public class DaoEventObjectify extends DAOBase implements DaoEvent {

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#getById(java.lang.Long)
     */
    @Override
    public Event getById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#getByDatas(ugportal.model.EventType,
     *      java.util.Date, ugportal.model.User)
     */
    @Override
    public List<Event> getByDatas(EventType eventType, Date date, User autor) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#put(ugportal.model.Event)
     */
    @Override
    public void put(Event event) {
        // TODO Auto-generated method stub

    }

    /**
     * {@inheritDoc}
     * 
     * @see ugportal.dao.DaoEvent#delete(ugportal.model.Event)
     */
    @Override
    public void delete(Event event) {
        // TODO Auto-generated method stub

    }

}
