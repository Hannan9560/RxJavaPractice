package com.betechme.rxjavapractice;

import java.util.ArrayList;

class ModelClass {

    private String question;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String rightAnswer;
    private String description;


    public ModelClass() {
    }

    private ModelClass(String question, String optionA, String optionB, String optionC, String optionD, String rightAnswer, String description) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.rightAnswer = rightAnswer;
        this.description = description;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getRightAnswer() {
        return rightAnswer;
    }

    public void setRightAnswer(String rightAnswer) {
        this.rightAnswer = rightAnswer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /*BCS 40*/
    public ArrayList<ModelClass> get_40_preli() {
        ArrayList<ModelClass> mcqmodelClasses = new ArrayList<>();
        mcqmodelClasses.add(new ModelClass("Question", "Option a", "Oprion B", "Option C", "Option D", "Right answert", "Description"));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        return mcqmodelClasses;
    }

    /*BCSE 30*/

    public ArrayList<ModelClass> get_30_preli() {
        ArrayList<ModelClass> mcqmodelClasses = new ArrayList<>();
        mcqmodelClasses.add(new ModelClass("Question", "Option a", "Oprion B", "Option C", "Option D", "Right answert", "Description"));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        mcqmodelClasses.add(new ModelClass("", "", "", "", "", "", ""));
        return mcqmodelClasses;
    }
}
