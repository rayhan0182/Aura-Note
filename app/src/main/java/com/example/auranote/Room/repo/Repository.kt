package com.example.auranote.Room.repo
import com.example.auranote.BuildConfig
import com.example.auranote.Room.service.User_service
import com.example.auranote.dao.NoteDao
import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.generationConfig

class Repository(

    private var noteDao: NoteDao

): User_service {

    override suspend fun insert_data(add_note: String) {

      val configure = generationConfig{

          responseMimeType = "application/json"

      }


        val generativeModel = GenerativeModel(
            modelName = "gemini-1.5-flash",
            apiKey = BuildConfig.GEMINI_API_KEY,
            generationConfig = configure
        )

        try {

            val aiprompt = """
                You are a smart note-taking assistant. Analyze the user's raw text note provided below.
            Generate a short, relevant, and catchy 'title'.
            Clean up, format, and organize the raw text to create a structured 'content'.
            
            Return the output strictly as a JSON object with two keys: "title" and "content".
            Do not include any explanations or markdown formatting outside the JSON.
            
            User's Raw Note:
            $add_note
            """.trimIndent()


        }catch (e: Exception){


        }



    }
}