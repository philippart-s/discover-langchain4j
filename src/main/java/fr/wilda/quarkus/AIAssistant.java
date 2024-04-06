package fr.wilda.quarkus;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

// Endpoint root path
@Path("hal9000")                                       
public class AIAssistant {

  // AI Service injection to use it later
  @Inject                                             
  OllamaAIService ollamaAIService;

  // ask resource exposition with POST method
  @Path("ask")                                        
  @POST                                               
  public String ask(String question) {
    // Call the Mistral AI chat model
    return ollamaAIService.askAQuestion(question);    
  }
}
