package Event;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    private IEventDAO dao = new EventDAO();

    @RequestMapping("/event/{id}")
    String getEvent(@PathVariable String id) {
        return dao.getEvent(id).toString();
    }
}
