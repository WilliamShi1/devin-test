package com.example.aliyundemo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import lombok.Data;

@Configuration
@ConfigurationProperties(prefix = "aws.ec2")
@Data
public class AwsDeploymentConfig {
    private String host;
    private String sshUsername;
    private String sshKey;
}
