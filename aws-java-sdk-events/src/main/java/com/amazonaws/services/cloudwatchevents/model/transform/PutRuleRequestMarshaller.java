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
package com.amazonaws.services.cloudwatchevents.model.transform;

import java.io.ByteArrayInputStream;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.cloudwatchevents.model.*;
import com.amazonaws.transform.Marshaller;

import com.amazonaws.protocol.json.*;

/**
 * PutRuleRequest Marshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutRuleRequestMarshaller implements Marshaller<Request<PutRuleRequest>, PutRuleRequest> {

    private final SdkJsonMarshallerFactory protocolFactory;

    public PutRuleRequestMarshaller(SdkJsonMarshallerFactory protocolFactory) {
        this.protocolFactory = protocolFactory;
    }

    public Request<PutRuleRequest> marshall(PutRuleRequest putRuleRequest) {

        if (putRuleRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        Request<PutRuleRequest> request = new DefaultRequest<PutRuleRequest>(putRuleRequest, "AmazonCloudWatchEvents");
        request.addHeader("X-Amz-Target", "AWSEvents.PutRule");

        request.setHttpMethod(HttpMethodName.POST);

        request.setResourcePath("");

        try {
            final StructuredJsonGenerator jsonGenerator = protocolFactory.createGenerator();

            jsonGenerator.writeStartObject();

            if (putRuleRequest.getName() != null) {
                jsonGenerator.writeFieldName("Name").writeValue(putRuleRequest.getName());
            }
            if (putRuleRequest.getScheduleExpression() != null) {
                jsonGenerator.writeFieldName("ScheduleExpression").writeValue(putRuleRequest.getScheduleExpression());
            }
            if (putRuleRequest.getEventPattern() != null) {
                jsonGenerator.writeFieldName("EventPattern").writeValue(putRuleRequest.getEventPattern());
            }
            if (putRuleRequest.getState() != null) {
                jsonGenerator.writeFieldName("State").writeValue(putRuleRequest.getState());
            }
            if (putRuleRequest.getDescription() != null) {
                jsonGenerator.writeFieldName("Description").writeValue(putRuleRequest.getDescription());
            }
            if (putRuleRequest.getRoleArn() != null) {
                jsonGenerator.writeFieldName("RoleArn").writeValue(putRuleRequest.getRoleArn());
            }

            jsonGenerator.writeEndObject();

            byte[] content = jsonGenerator.getBytes();
            request.setContent(new ByteArrayInputStream(content));
            request.addHeader("Content-Length", Integer.toString(content.length));
            request.addHeader("Content-Type", protocolFactory.getContentType());
        } catch (Throwable t) {
            throw new SdkClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

}
