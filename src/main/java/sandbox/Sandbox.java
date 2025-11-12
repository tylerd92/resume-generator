package sandbox;

import tools.jackson.databind.JsonNode;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class Sandbox {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new File("src/main/resources/testfile.json"));
        String objective = jsonNode.get("objective").asText();
        System.out.println("Objective: " + objective);



    }
}
