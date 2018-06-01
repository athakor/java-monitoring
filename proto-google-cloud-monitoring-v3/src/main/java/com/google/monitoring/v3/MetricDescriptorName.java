/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.monitoring.v3;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class MetricDescriptorName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/metricDescriptors/{metric_descriptor=**}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String metricDescriptor;

  public String getProject() {
    return project;
  }

  public String getMetricDescriptor() {
    return metricDescriptor;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MetricDescriptorName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    metricDescriptor = Preconditions.checkNotNull(builder.getMetricDescriptor());
  }

  public static MetricDescriptorName of(String project, String metricDescriptor) {
    return newBuilder()
      .setProject(project)
      .setMetricDescriptor(metricDescriptor)
      .build();
  }

  public static String format(String project, String metricDescriptor) {
    return newBuilder()
      .setProject(project)
      .setMetricDescriptor(metricDescriptor)
      .build()
      .toString();
  }

  public static MetricDescriptorName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MetricDescriptorName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("metric_descriptor"));
  }

  public static List<MetricDescriptorName> parseList(List<String> formattedStrings) {
    List<MetricDescriptorName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MetricDescriptorName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (MetricDescriptorName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("metricDescriptor", metricDescriptor);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "metric_descriptor", metricDescriptor);
  }

  /** Builder for MetricDescriptorName. */
  public static class Builder {

    private String project;
    private String metricDescriptor;

    public String getProject() {
      return project;
    }

    public String getMetricDescriptor() {
      return metricDescriptor;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setMetricDescriptor(String metricDescriptor) {
      this.metricDescriptor = metricDescriptor;
      return this;
    }

    private Builder() {
    }

    private Builder(MetricDescriptorName metricDescriptorName) {
      project = metricDescriptorName.project;
      metricDescriptor = metricDescriptorName.metricDescriptor;
    }

    public MetricDescriptorName build() {
      return new MetricDescriptorName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MetricDescriptorName) {
      MetricDescriptorName that = (MetricDescriptorName) o;
      return (this.project.equals(that.project))
          && (this.metricDescriptor.equals(that.metricDescriptor));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= metricDescriptor.hashCode();
    return h;
  }
}
