package fr.wilda.quarkus;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

// AI service bean registration
@RegisterAiService
public interface OllamaAIService {
  
  // Context message
  @SystemMessage("You are an AI assistant.")  
  // Prompt customisation
  @UserMessage("Answer as best possible to the following question: {question}. The answer must be in a style of a virtual assistant and use emojis.")
  String askAQuestion(String question);
}
