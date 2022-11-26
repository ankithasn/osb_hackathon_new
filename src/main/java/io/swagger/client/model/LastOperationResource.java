/*
 * Open Service Broker API
 * The Open Service Broker API defines an HTTP(S) interface between Platforms and Service Brokers.
 *
 * OpenAPI spec version: master - might contain changes that are not yet released
 * Contact: open-service-broker-api@googlegroups.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * LastOperationResource
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T09:02:38.710821+05:30[Asia/Kolkata]")
public class LastOperationResource {
  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    IN_PROGRESS("in progress"),
    SUCCEEDED("succeeded"),
    FAILED("failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static StateEnum fromValue(String input) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return StateEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("instance_usable")
  private Boolean instanceUsable = null;

  @SerializedName("update_repeatable")
  private Boolean updateRepeatable = null;

  public LastOperationResource state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @Schema(required = true, description = "")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public LastOperationResource description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LastOperationResource instanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
    return this;
  }

   /**
   * Get instanceUsable
   * @return instanceUsable
  **/
  @Schema(description = "")
  public Boolean isInstanceUsable() {
    return instanceUsable;
  }

  public void setInstanceUsable(Boolean instanceUsable) {
    this.instanceUsable = instanceUsable;
  }

  public LastOperationResource updateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
    return this;
  }

   /**
   * Get updateRepeatable
   * @return updateRepeatable
  **/
  @Schema(description = "")
  public Boolean isUpdateRepeatable() {
    return updateRepeatable;
  }

  public void setUpdateRepeatable(Boolean updateRepeatable) {
    this.updateRepeatable = updateRepeatable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastOperationResource lastOperationResource = (LastOperationResource) o;
    return Objects.equals(this.state, lastOperationResource.state) &&
        Objects.equals(this.description, lastOperationResource.description) &&
        Objects.equals(this.instanceUsable, lastOperationResource.instanceUsable) &&
        Objects.equals(this.updateRepeatable, lastOperationResource.updateRepeatable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(state, description, instanceUsable, updateRepeatable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastOperationResource {\n");
    
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    instanceUsable: ").append(toIndentedString(instanceUsable)).append("\n");
    sb.append("    updateRepeatable: ").append(toIndentedString(updateRepeatable)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
