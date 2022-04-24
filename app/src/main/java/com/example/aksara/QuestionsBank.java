package com.example.aksara;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionList> jawaQuestions(){

        final List<QuestionList> questionsLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question2 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question3 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question4 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question5 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }
    private static List<QuestionList> sundaQuestions(){

        final List<QuestionList> questionsLists = new ArrayList<>();

        final QuestionList question1 = new QuestionList("Yang mana Nga?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question2 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question3 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question4 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");
        final QuestionList question5 = new QuestionList("Manakah Dha?", "ini", "yang ini",
                "mungkin ini", "coba ini", "ini", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);

        return questionsLists;
    }

    public static List<QuestionList> getQuestions(String selectedTopic){
        switch (selectedTopic){
            case "Aksara Jawa":
                return jawaQuestions();
            case "Aksara Sunda":
                return sundaQuestions();
            default:
                return jawaQuestions();
        }
    }
}
