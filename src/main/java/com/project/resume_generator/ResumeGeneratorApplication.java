package com.project.resume_generator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import picocli.CommandLine;

@SpringBootApplication
public class ResumeGeneratorApplication implements CommandLineRunner, ExitCodeGenerator {

    private final ResumeCommand resumeCommand;
    private int exitCode;

    public ResumeGeneratorApplication(ResumeCommand resumeCommand) {
        this.resumeCommand = resumeCommand;
    }

    @Override
    public void run(String... args) {
        exitCode = new CommandLine(resumeCommand).execute(args);
    }

    @Override
    public int getExitCode() {
        return exitCode;
    }

	public static void main(String[] args) {
		SpringApplication.run(ResumeGeneratorApplication.class, args);
	}

}
