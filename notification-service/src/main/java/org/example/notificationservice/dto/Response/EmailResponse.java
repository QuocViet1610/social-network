package org.example.notificationservice.dto.Response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmailResponse {
    private String emailTo;
    private String emailContent;
}
