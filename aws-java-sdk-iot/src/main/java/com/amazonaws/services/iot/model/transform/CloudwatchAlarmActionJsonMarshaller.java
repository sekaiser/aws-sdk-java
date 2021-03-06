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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.json.*;

/**
 * CloudwatchAlarmActionMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloudwatchAlarmActionJsonMarshaller {

    /**
     * Marshall the given parameter object, and output to a SdkJsonGenerator
     */
    public void marshall(CloudwatchAlarmAction cloudwatchAlarmAction, StructuredJsonGenerator jsonGenerator) {

        if (cloudwatchAlarmAction == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            jsonGenerator.writeStartObject();

            if (cloudwatchAlarmAction.getRoleArn() != null) {
                jsonGenerator.writeFieldName("roleArn").writeValue(cloudwatchAlarmAction.getRoleArn());
            }
            if (cloudwatchAlarmAction.getAlarmName() != null) {
                jsonGenerator.writeFieldName("alarmName").writeValue(cloudwatchAlarmAction.getAlarmName());
            }
            if (cloudwatchAlarmAction.getStateReason() != null) {
                jsonGenerator.writeFieldName("stateReason").writeValue(cloudwatchAlarmAction.getStateReason());
            }
            if (cloudwatchAlarmAction.getStateValue() != null) {
                jsonGenerator.writeFieldName("stateValue").writeValue(cloudwatchAlarmAction.getStateValue());
            }

            jsonGenerator.writeEndObject();
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }
    }

    private static CloudwatchAlarmActionJsonMarshaller instance;

    public static CloudwatchAlarmActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CloudwatchAlarmActionJsonMarshaller();
        return instance;
    }

}
