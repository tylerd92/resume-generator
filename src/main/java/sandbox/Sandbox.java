package sandbox;

import com.project.resume_generator.model.Resume;
import com.project.resume_generator.util.ResumeTextConverter;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Sandbox {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("src/main/resources/testfile.json");

        // Map JSON directly to Resume
        Resume resume = objectMapper.readValue(jsonFile, Resume.class);

        try {
            ResumeTextConverter.saveToFile(resume, "src/main/resources/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
