/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.snowball.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.snowball.model.*;

import com.amazonaws.protocol.json.*;

/**
 * ClusterListEntryMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterListEntryJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(ClusterListEntry clusterListEntry, StructuredJsonGenerator jsonGenerator) {

        if (clusterListEntry == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (clusterListEntry.getClusterId() != null) {
                jsonGenerator.writeFieldName("ClusterId").writeValue(clusterListEntry.getClusterId());
            }
            if (clusterListEntry.getClusterState() != null) {
                jsonGenerator.writeFieldName("ClusterState").writeValue(clusterListEntry.getClusterState());
            }
            if (clusterListEntry.getCreationDate() != null) {
                jsonGenerator.writeFieldName("CreationDate").writeValue(clusterListEntry.getCreationDate());
            }
            if (clusterListEntry.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(clusterListEntry.getDescription());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static ClusterListEntryJsonMarshaller instance;

    public static ClusterListEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterListEntryJsonMarshaller();
        return instance;
    }

}
