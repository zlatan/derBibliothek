package org.kili.derBibliothek;

import static org.kili.derBibliothek.WebSocketConfiguration.*;

import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleAfterSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.hateoas.EntityLinks;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

/**
 * Created by zlatan on 14.05.16.
 */

@Component
@RepositoryEventHandler(Book.class)
public class EventHandler {
    private final SimpMessagingTemplate websocket;
    private final EntityLinks entityLinks;
    JsonObject innerObject = new JsonObject();


    @Autowired
    public EventHandler(SimpMessagingTemplate websocket, EntityLinks entityLinks) {
        this.websocket = websocket;
        this.entityLinks = entityLinks;
    }

    @HandleAfterCreate
    public void newBook(Book book) {
        innerObject.addProperty("ID", book.getId());
        this.websocket.convertAndSend(
                MESSAGE_PREFIX + "/newBook", innerObject.getAsJsonObject().toString());
    }

    @HandleAfterDelete
    public void deleteBook(Book book) {
        innerObject.addProperty("ID", book.getId());
        this.websocket.convertAndSend(
                MESSAGE_PREFIX + "/deleteBook", innerObject.getAsJsonObject().toString());
    }

    @HandleAfterSave
    public void updateBook(Book book) {
        innerObject.addProperty("ID", book.getId());
        this.websocket.convertAndSend(
                MESSAGE_PREFIX + "/updateBook", innerObject.getAsJsonObject().toString());
    }

}
