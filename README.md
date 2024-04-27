# discover-langchain4j

This repository is the result of my tests of using LLMs with langchain4j via Quarkus extension quarkus-langchain4j.  
The exemples are simple to only focus on the necessary code.  
The API used are threw Ollama.

The [AIAssistant](./src/main/java/fr/wilda/quarkus/AIAssistant.java) is the main entry point to use the coded services.  
The main resource is `hal9000` and each of samples is exposed to a specific resource.

Here is the list of the examples:
  - simple chat bot with Mistral 7B: [OllamaAIService](./src/main/java/fr/wilda/quarkus/OllamaAIService.java), exposed route `hal9000/ask`