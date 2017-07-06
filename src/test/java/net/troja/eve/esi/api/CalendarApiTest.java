/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package net.troja.eve.esi.api;


import java.util.List;

import org.junit.Before;
import org.junit.Test;

import net.troja.eve.esi.ApiException;
import static net.troja.eve.esi.api.GeneralApiTest.apiClient;
import net.troja.eve.esi.model.CharacterCalendarEventResponse;
import net.troja.eve.esi.model.CharacterCalendarResponse;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import org.junit.Ignore;

/**
 * API tests for CalendarApi
 */
public class CalendarApiTest extends GeneralApiTest {

    private final CalendarApi api = new CalendarApi();

    @Before
    public void setUp() {
        api.setApiClient(apiClient);
    }

    /**
     * List calendar event summaries
     *
     * Get 50 event summaries from the calendar. If no event ID is given, the
     * resource will return the next 50 chronological event summaries from now.
     * If an event ID is specified, it will return the next 50 chronological
     * event summaries from after that event. --- Alternate route:
     * &#x60;/v1/characters/{character_id}/calendar/&#x60; Alternate route:
     * &#x60;/legacy/characters/{character_id}/calendar/&#x60; Alternate route:
     * &#x60;/dev/characters/{character_id}/calendar/&#x60; --- This route is
     * cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarTest() throws ApiException {
        final Integer fromEvent = null;
        final List<CharacterCalendarResponse> response = api.getCharactersCharacterIdCalendar(characterId, DATASOURCE,
                fromEvent, null, null, null);

        assertThat(response.size(), greaterThan(0));
    }
    
    /**
     * Get an event
     *
     * Get all the information for a specific event --- Alternate route:
     * &#x60;/v3/characters/{character_id}/calendar/{event_id}/&#x60; Alternate
     * route: &#x60;/dev/characters/{character_id}/calendar/{event_id}/&#x60;
     * --- This route is cached for up to 5 seconds SSO Scope:
     * esi-calendar.read_calendar_events.v1
     *
     * @throws ApiException
     *             if the Api call fails
     */
    @Test
    public void getCharactersCharacterIdCalendarEventIdTest() throws ApiException {
        final List<CharacterCalendarResponse> calendar = api.getCharactersCharacterIdCalendar(characterId, DATASOURCE,
                null, null, null, null);

        final Integer eventId = calendar.get(0).getEventId();
        final CharacterCalendarEventResponse response = api.getCharactersCharacterIdCalendarEventId(characterId,
                eventId, DATASOURCE, null, null, null);

        assertThat(response.getEventId(), equalTo(eventId));
    }

    /**
     * Respond to an event
     *
     * Set your response status to an event  ---   SSO Scope: esi-calendar.respond_calendar_events.v1
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    @Ignore("Can't test put")
    public void putCharactersCharacterIdCalendarEventIdTest() throws ApiException {
    }
}
