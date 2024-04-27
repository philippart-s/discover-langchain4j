package fr.wilda.quarkus;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;
import io.smallrye.mutiny.Multi;

// AI service bean registration
@RegisterAiService
public interface OllamaAIService {
  
  // Context message
  @SystemMessage("You are an AI assistant.")  
  // Prompt customisation
  @UserMessage("Answer as best possible to the following question: {question}. The answer must be in a style of a virtual assistant and use emoji.")
  String askAQuestion(String question);

  // Context message
  @SystemMessage("You are an AI assistant.")  
  // Prompt customisation
  @UserMessage("Answer as best possible to the following question: {question}. The answer must be in a style of a virtual assistant and use emoji.")
  // Multi use is enough to activate streaming mode
  Multi<String> askAQuestionSteramingMode(String question);

}
