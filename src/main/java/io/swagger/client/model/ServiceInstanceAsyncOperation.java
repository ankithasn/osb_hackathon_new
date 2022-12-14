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
import io.swagger.client.model.ServiceInstanceMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ServiceInstanceAsyncOperation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-11-26T09:02:38.710821+05:30[Asia/Kolkata]")
public class ServiceInstanceAsyncOperation {
  @SerializedName("dashboard_url")
  private String dashboardUrl = null;

  @SerializedName("operation")
  private String operation = null;

  @SerializedName("metadata")
  private ServiceInstanceMetadata metadata = null;

  public ServiceInstanceAsyncOperation dashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
    return this;
  }

   /**
   * Get dashboardUrl
   * @return dashboardUrl
  **/
  @Schema(description = "")
  public String getDashboardUrl() {
    return dashboardUrl;
  }

  public void setDashboardUrl(String dashboardUrl) {
    this.dashboardUrl = dashboardUrl;
  }

  public ServiceInstanceAsyncOperation operation(String operation) {
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @Schema(description = "")
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }

  public ServiceInstanceAsyncOperation metadata(ServiceInstanceMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public ServiceInstanceMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ServiceInstanceMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceInstanceAsyncOperation serviceInstanceAsyncOperation = (ServiceInstanceAsyncOperation) o;
    return Objects.equals(this.dashboardUrl, serviceInstanceAsyncOperation.dashboardUrl) &&
        Objects.equals(this.operation, serviceInstanceAsyncOperation.operation) &&
        Objects.equals(this.metadata, serviceInstanceAsyncOperation.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dashboardUrl, operation, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceInstanceAsyncOperation {\n");
    
    sb.append("    dashboardUrl: ").append(toIndentedString(dashboardUrl)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
