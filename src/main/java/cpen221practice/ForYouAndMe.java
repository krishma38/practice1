package cpen221practice;

public class ForYouAndMe {
    public String youandme(String name) {

        String result = " ";

        if (name == null){
            result = "One for you, one for me.";
        }

        else{
            result = "One for " + name + ", one for me.";
        }

        return result;

    }
}

 // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");