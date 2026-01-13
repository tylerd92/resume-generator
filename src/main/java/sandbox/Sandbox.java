package sandbox;

import com.project.resume_generator.Resume;
import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class Sandbox {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/testfile.json");

        // Map JSON directly to Resume
        Resume resume = objectMapper.readValue(jsonFile, Resume.class);

        // Example: access fields
        System.out.println(resume);


    }
}
