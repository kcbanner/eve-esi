/*
 * EVE Swagger Interface
 * An OpenAPI for EVE Online
 *
 * The version of the OpenAPI document: 1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package net.troja.eve.esi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.troja.eve.esi.model.PlanetLink;
import net.troja.eve.esi.model.PlanetPin;
import net.troja.eve.esi.model.PlanetRoute;
import java.io.Serializable;

/**
 * 200 ok object
 */
@ApiModel(description = "200 ok object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CharacterPlanetResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    public static final String SERIALIZED_NAME_LINKS = "links";
    @SerializedName(SERIALIZED_NAME_LINKS)
    private List<PlanetLink> links = new ArrayList<>();

    public static final String SERIALIZED_NAME_PINS = "pins";
    @SerializedName(SERIALIZED_NAME_PINS)
    private List<PlanetPin> pins = new ArrayList<>();

    public static final String SERIALIZED_NAME_ROUTES = "routes";
    @SerializedName(SERIALIZED_NAME_ROUTES)
    private List<PlanetRoute> routes = new ArrayList<>();

    public CharacterPlanetResponse() {
    }

    public CharacterPlanetResponse links(List<PlanetLink> links) {

        this.links = links;
        return this;
    }

    public CharacterPlanetResponse addLinksItem(PlanetLink linksItem) {
        this.links.add(linksItem);
        return this;
    }

    /**
     * links array
     * 
     * @return links
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "links array")
    public List<PlanetLink> getLinks() {
        return links;
    }

    public void setLinks(List<PlanetLink> links) {
        this.links = links;
    }

    public CharacterPlanetResponse pins(List<PlanetPin> pins) {

        this.pins = pins;
        return this;
    }

    public CharacterPlanetResponse addPinsItem(PlanetPin pinsItem) {
        this.pins.add(pinsItem);
        return this;
    }

    /**
     * pins array
     * 
     * @return pins
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "pins array")
    public List<PlanetPin> getPins() {
        return pins;
    }

    public void setPins(List<PlanetPin> pins) {
        this.pins = pins;
    }

    public CharacterPlanetResponse routes(List<PlanetRoute> routes) {

        this.routes = routes;
        return this;
    }

    public CharacterPlanetResponse addRoutesItem(PlanetRoute routesItem) {
        this.routes.add(routesItem);
        return this;
    }

    /**
     * routes array
     * 
     * @return routes
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "routes array")
    public List<PlanetRoute> getRoutes() {
        return routes;
    }

    public void setRoutes(List<PlanetRoute> routes) {
        this.routes = routes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CharacterPlanetResponse characterPlanetResponse = (CharacterPlanetResponse) o;
        return Objects.equals(this.links, characterPlanetResponse.links)
                && Objects.equals(this.pins, characterPlanetResponse.pins)
                && Objects.equals(this.routes, characterPlanetResponse.routes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(links, pins, routes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CharacterPlanetResponse {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
        sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
