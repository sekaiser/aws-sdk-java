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
package com.amazonaws.services.simpleworkflow.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.simpleworkflow.model.*;

import com.amazonaws.protocol.json.*;

/**
 * StartTimerFailedEventAttributesMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartTimerFailedEventAttributesJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(StartTimerFailedEventAttributes startTimerFailedEventAttributes, StructuredJsonGenerator jsonGenerator) {

        if (startTimerFailedEventAttributes == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (startTimerFailedEventAttributes.getTimerId() != null) {
                jsonGenerator.writeFieldName("timerId").writeValue(startTimerFailedEventAttributes.getTimerId());
            }
            if (startTimerFailedEventAttributes.getCause() != null) {
                jsonGenerator.writeFieldName("cause").writeValue(startTimerFailedEventAttributes.getCause());
            }
            if (startTimerFailedEventAttributes.getDecisionTaskCompletedEventId() != null) {
                jsonGenerator.writeFieldName("decisionTaskCompletedEventId").writeValue(startTimerFailedEventAttributes.getDecisionTaskCompletedEventId());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static StartTimerFailedEventAttributesJsonMarshaller instance;

    public static StartTimerFailedEventAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new StartTimerFailedEventAttributesJsonMarshaller();
        return instance;
    }

}
