package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }

    public int countWords(String word){
        if(word == null || word.isEmpty()){
            return 0;
        }
        String[] wordsArr = word.split(" ");
        return (wordsArr == null) ? 0 : wordsArr.length;
    }

    public void print(){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        System.out.println("Greetings: "+list.get(0));
    }

    public static void main (String[] args) {
        System.out.println ("Starting Application");
        Application app = new Application();
        //.gitignore will ignore the maven related folder -> not push them on github
        //ex. target folder (created by maven)

        app.print();
        int count = app.countWords("I have four words");
        System.out.println("Words: "+count);
    }
}