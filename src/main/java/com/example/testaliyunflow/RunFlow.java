package com.example.testaliyunflow;

import com.aliyuncs.devops_rdc.model.v20200303.ExecutePipelineRequest;
import com.aliyuncs.devops_rdc.model.v20200303.ExecutePipelineResponse;
import com.aliyuncs.profile.DefaultProfile;

public class RunFlow {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile(
                "cn-hangzhou",          // 地域ID
                "sssss",      // RAM账号的AccessKey ID:
                "ssssssssssssss"); // RAM账号Access Key Secret
        ExecutePipelineRequest executePipelineRequest = new ExecutePipelineRequest();
        executePipelineRequest.setSysEndpoint("api-devops.aliyuncs.com");
        executePipelineRequest.setOrgId("5ebbc0408dsasa1232s12b59d58347");
        long pipelineId = 100365411l;
        executePipelineRequest.setPipelineId(pipelineId);
        ExecutePipelineResponse executePipelineResponse
                = client.getAcsResponse(executePipelineRequest);
    }
}
