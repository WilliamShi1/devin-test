package com.example.aliyundemo.service;

import com.example.aliyundemo.model.FileMetadata;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mock.web.MockMultipartFile;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.core.sync.RequestBody;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AwsStorageServiceTest {
    @Mock
    private S3Client s3Client;

    @InjectMocks
    private AwsStorageService storageService;

    @Test
    void uploadFile_ShouldUploadToS3() throws Exception {
        MockMultipartFile file = new MockMultipartFile(
            "file", "test.txt", "text/plain", "test content".getBytes()
        );

        FileMetadata result = storageService.uploadFile(file);
        verify(s3Client).putObject(any(PutObjectRequest.class), any(RequestBody.class));
    }
}
