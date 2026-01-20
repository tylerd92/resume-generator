package com.project.resume_generator;

import com.project.resume_generator.model.Resume;
import com.project.resume_generator.util.ResumeTextConverter;
import org.springframework.stereotype.Component;
import picocli.CommandLine;
import tools.jackson.databind.ObjectMapper;

import java.util.concurrent.Callable;

@Component
@CommandLine.Command(name = "resumeCommand")
public class ResumeCommand implements Callable <Integer> {
    ObjectMapper objectMapper = new ObjectMapper();
    @CommandLine.Option(names = "--jsonFile", description = "json file path", required = true)
    String jsonFile;

    @CommandLine.Option(names = "--filePath", description = "File path to save text file")
    String txtFilePath;

    public Integer call() throws Exception {
        Resume resume = objectMapper.readValue(jsonFile, Resume.class);
        ResumeTextConverter.saveToFile(resume, txtFilePath);
        return 0;
    }
}
