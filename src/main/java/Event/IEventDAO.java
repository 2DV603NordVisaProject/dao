package Event;

import java.util.Date;
import java.util.List;

public interface IEventDAO {

    void createEvent(Event event);          // Create event
    Event getEvent(String eventId);         // Get a single event
    void deleteEvent(String eventId);       // Delete event
    void updateEvent(Event event);          // Update event
    List<Event> getEvents(int searchRadius); // Get events within a specific radius
    List<Event> getEvents(Date fromDate, Date toDate); // Get event within specific dates
}
