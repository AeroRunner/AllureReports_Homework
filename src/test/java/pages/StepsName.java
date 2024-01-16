package pages;

public class StepsName {
    UserData data = new UserData();
    public String step1 = "Open GitHub home page";
    public String step2 = "Click on search field";
    public String step3 = "Sending a search request: "+data.repository;
    public String step4 = "Select the found page: "+data.repository;
    public String step5 = "Go to the section 'Issues'";
    public String step6 = "Checking for a issue "+data.issue;
}
